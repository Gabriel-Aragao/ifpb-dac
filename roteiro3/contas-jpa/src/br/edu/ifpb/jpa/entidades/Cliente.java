package br.edu.ifpb.jpa.entidades;

public class Cliente {
	private String nome;
	private String telefone;
	private Endereco endereco;
	private Conta[] contas;
	
	
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
