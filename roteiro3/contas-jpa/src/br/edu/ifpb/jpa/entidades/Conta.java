package br.edu.ifpb.jpa.entidades;

public class Conta {

	private Integer id;
	private Cliente[] titulares;
//	private String banco;
	private String agencia;
	private String conta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



//	public String getBanco() {
//		return banco;
//	}
//
//	public void setBanco(String banco) {
//		this.banco = banco;
//	}

	public Cliente[] getTitulares() {
		return titulares;
	}

	public void setTitulares(Cliente[] titulares) {
		this.titulares = titulares;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


}
