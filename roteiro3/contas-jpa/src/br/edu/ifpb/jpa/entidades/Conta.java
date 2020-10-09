package br.edu.ifpb.jpa.entidades;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import br.edu.ifpb.jpa.entidades.embeddables.ContaId;

@Entity
public class Conta {

	@EmbeddedId
	private ContaId id;

	@ManyToMany(mappedBy = "contas")
	private Cliente[] titulares;
	
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

	public Cliente[] getTitulares() {
		return titulares;
	}

	public void setTitulares(Cliente[] titulares) {
		this.titulares = titulares;
	}

}
