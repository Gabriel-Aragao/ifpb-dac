package br.edu.ifpb.jpa.dao;

import br.edu.ifpb.jpa.entidades.Conta;
import br.edu.ifpb.jpa.entidades.Movimentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MovimentacaoDAO {
    private EntityManagerFactory emf;

    public MovimentacaoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void adiciona(Movimentacao movimentacao) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(movimentacao);
        em.getTransaction().commit();

        em.close();


    }
}
