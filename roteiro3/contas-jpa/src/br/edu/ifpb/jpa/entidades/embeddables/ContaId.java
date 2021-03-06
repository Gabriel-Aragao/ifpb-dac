package br.edu.ifpb.jpa.entidades.embeddables;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ContaId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String agencia;
	private String conta;
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	

}
