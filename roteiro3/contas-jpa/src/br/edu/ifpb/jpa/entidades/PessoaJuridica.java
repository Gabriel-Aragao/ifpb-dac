package br.edu.ifpb.jpa.entidades;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("Pessoa Jurídica")
public class PessoaJuridica extends Cliente{

    private long cnpj;
    private String razaoSocial;
    private BigDecimal faturamento;
}
