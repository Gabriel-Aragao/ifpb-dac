package br.edu.ifpb.jpa.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("Pessoa Física")
public class PessoaFisica extends Cliente{

    private Long cpf;
    private String profissao;
    private BigDecimal renda;


}
