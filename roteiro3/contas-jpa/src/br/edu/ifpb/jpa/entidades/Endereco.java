package br.edu.ifpb.jpa.entidades;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	@NotNull
	private String rua;
	@NotNull
	@Column(length = 10)
	private String numero;
	@NotNull
	@Column(length = 100)
	private String bairro;
	@NotNull
	@Column( length = 8)
	private String cep;
	@NotNull
	@Column(length = 100)
	private String cidade;
	@NotNull
	@Column(length = 30)
	private String estado;
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
