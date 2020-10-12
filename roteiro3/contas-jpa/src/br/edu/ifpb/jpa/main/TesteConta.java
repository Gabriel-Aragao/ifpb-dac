package br.edu.ifpb.jpa.main;

import br.edu.ifpb.jpa.dao.ClienteDAO;
import br.edu.ifpb.jpa.dao.ContaDAO;
import br.edu.ifpb.jpa.dao.MovimentacaoDAO;
import br.edu.ifpb.jpa.entidades.*;
import br.edu.ifpb.jpa.entidades.embeddables.ContaId;
import br.edu.ifpb.jpa.entidades.enums.TipoConta;
import br.edu.ifpb.jpa.entidades.enums.TipoMovimentacao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

public class TesteConta {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("financas");
		ClienteDAO cleinteDAO = new ClienteDAO(emf);
		ContaDAO contaDAO = new ContaDAO(emf);
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO(emf);


		ContaId contaId1 = new ContaId();
		contaId1.setAgencia("1101");
		contaId1.setConta("001-0");

		Conta conta1 = new Conta();
		conta1.setId(contaId1);
		conta1.setTipo(TipoConta.CONTA_CORRENTE);
		contaDAO.adiciona(conta1);

		ContaId contaId2 = new ContaId();
		contaId2.setAgencia("1201");
		contaId2.setConta("001-0");

		Conta conta2 = new Conta();
		conta2.setId(contaId2);
		conta2.setTipo(TipoConta.CONTA_POUPANCA);
		contaDAO.adiciona(conta2);
		Endereco end1 = new Endereco();
		end1.setRua("rua1");
		end1.setNumero("1");
		end1.setBairro("centro");
		end1.setCep("00000000");
		end1.setCidade("Sao Paulo");
		end1.setEstado("SP");

		PessoaFisica fulano = new PessoaFisica();

		fulano.setNome("FULANO");
		fulano.setTelefone("+00 99 999-9999");
		fulano.setEndereco(end1);
		fulano.setCpf(32145687L);
		fulano.setProfissao("Trader");
		fulano.setRenda(BigDecimal.valueOf(8000));
		fulano.setContas(Arrays.asList(new Conta[]{conta2}));
		cleinteDAO.adiciona(fulano);

		PessoaFisica beltrano = new PessoaFisica();

		beltrano.setNome("BELTRANO");
		beltrano.setTelefone("+00 99 000-9999");
		beltrano.setEndereco(end1);
		beltrano.setCpf(32144317912L);
		beltrano.setProfissao("Trader");
		beltrano.setRenda(BigDecimal.valueOf(15000));
		beltrano.setContas(Arrays.asList(new Conta[]{conta2}));
		cleinteDAO.adiciona(beltrano);


		PessoaJuridica sicrano = new PessoaJuridica();

		sicrano.setNome("SICRANO S.A.");
		sicrano.setTelefone("+00 99 999-9999");
		sicrano.setEndereco(end1);
		sicrano.setCnpj(1245678900l);
		sicrano.setRazaoSocial("SICRANO SOLUÇÕES");
		sicrano.setFaturamento(BigDecimal.valueOf(900000));
		sicrano.setContas(Arrays.asList(new Conta[]{conta1}));
		cleinteDAO.adiciona(sicrano);


		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setConta(conta2);
		movimentacao1.setData(new Date(1602531270673l));
		movimentacao1.setHora(new Time(1602531270673l));
		movimentacao1.setValor(3500.55);
		movimentacao1.setTipo(TipoMovimentacao.CREDITO);
		movimentacao1.setCategorias(Arrays.asList(new String[]{"SALÁRIO"}));

		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setConta(conta2);
		movimentacao2.setData(new Date(1602532270673l));
		movimentacao2.setHora(new Time(1602532270673l));
		movimentacao2.setValor(412.95);
		movimentacao2.setTipo(TipoMovimentacao.DEBITO);
		movimentacao2.setCategorias(Arrays.asList(new String[]{"SUPERMERCADO"}));

		Movimentacao movimentacao3 = new Movimentacao();
		movimentacao3.setConta(conta2);
		movimentacao3.setData(new Date(1602532370673l));
		movimentacao3.setHora(new Time(1602532370673l));
		movimentacao3.setValor(121.45);
		movimentacao3.setTipo(TipoMovimentacao.DEBITO);
		movimentacao3.setCategorias(Arrays.asList(new String[]{"FARMÁCIA"}));



		movimentacaoDAO.adiciona(movimentacao1);
		movimentacaoDAO.adiciona(movimentacao2);
		movimentacaoDAO.adiciona(movimentacao3);



	}
}
