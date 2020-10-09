package br.edu.ifpb.jpa.entidades;

import com.sun.istack.NotNull;


import javax.persistence.*;


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
	@JoinTable(
	  name = "CONTAS_TITULARES", 
	  joinColumns = @JoinColumn(name = "cliente_id"), 
	  inverseJoinColumns = @JoinColumn(name = "conta_id"))
	private Conta[] contas;
	
	
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
	public Conta[] getContas() {
		return contas;
	}
	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

}
