package br.edu.ifpb.jpa.entidades;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("Pessoa Jurídica")
public class PessoaJuridica extends Cliente{

    private long cnpj;
    private String razaoSocial;
    private BigDecimal faturamento;

    public BigDecimal getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(BigDecimal faturamento) {
        this.faturamento = faturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
