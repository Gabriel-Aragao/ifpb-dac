package br.edu.ifpb.jpa.dao;

import br.edu.ifpb.jpa.entidades.Cliente;
import br.edu.ifpb.jpa.entidades.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ClienteDAO {
    private EntityManagerFactory emf;

    public ClienteDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void adiciona(Cliente cliente) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();

        em.close();


    }
}
