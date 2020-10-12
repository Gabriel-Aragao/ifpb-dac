package br.edu.ifpb.jpa.entidades;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.*;

import br.edu.ifpb.jpa.entidades.enums.TipoMovimentacao;

@Entity
public class Movimentacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private double valor;
	private Date data;
	private Time hora;
	@OneToOne
	private Conta conta;
	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipo;
	@ElementCollection(targetClass=String.class)
	private List<String> categorias;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}


	public List<String> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}
}
