package br.edu.ifpb.jpa.entidades.enums;

public enum TipoConta {
	CONTA_CORRENTE(1),	CONTA_POUPANCA(2), CONTA_SALARIO(3);
    
	private final int codigo;

    private TipoConta(int codigo) {
        this.codigo = codigo;
    }
}
