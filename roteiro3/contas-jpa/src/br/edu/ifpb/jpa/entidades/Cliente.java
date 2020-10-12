package br.edu.ifpb.jpa.entidades;

import com.sun.istack.NotNull;


import javax.persistence.*;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Column(length = 100)
	private String nome;
	@NotNull
	@Column(length = 30)
	private String telefone;
	@Embedded
	@NotNull
	private Endereco endereco;
	
	@ManyToMany
	@JoinColumns({
			@JoinColumn(name = "conta_id"),
			@JoinColumn(name = "agencia_id")
	})
	@JoinTable(name="CONTAS_TITULARES")
	private List<Conta> contas;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
