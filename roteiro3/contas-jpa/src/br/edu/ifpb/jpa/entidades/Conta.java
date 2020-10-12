package br.edu.ifpb.jpa.entidades;


import javax.persistence.*;

import br.edu.ifpb.jpa.entidades.embeddables.ContaId;
import br.edu.ifpb.jpa.entidades.enums.TipoConta;

import java.util.List;

@Entity
@Table(name = "CONTAS_TB")
public class Conta {

	@EmbeddedId
	private ContaId id;

	@ManyToMany(mappedBy = "contas")
	private List<Cliente> titulares;
	@Enumerated(EnumType.STRING)
	private TipoConta tipo;
	
//	private String banco;
//
//	public String getBanco() {
//		return banco;
//	}
//
//	public void setBanco(String banco) {
//		this.banco = banco;
//	}
	
	public ContaId getId() {
		return id;
	}

	public void setId(ContaId id) {
		this.id = id;
	}

	public List<Cliente> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<Cliente> titulares) {
		this.titulares = titulares;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
}
