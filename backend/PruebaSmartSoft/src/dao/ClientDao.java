/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
public class ClientDao {


    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public ClientDao() {
    }

    public Cliente addClients(Cliente cliente) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(cliente);
        return cliente;
    }

    public List<Cliente> getAllClients() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Cliente> clienteList = session.createQuery("from cliente").list();
        return clienteList;
    }

    public Cliente getClients(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Cliente cliente = (Cliente) session.load(Cliente.class, new Integer(id));
        return cliente;
    }

    public void deleteClient(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Cliente p = (Cliente) session.load(Cliente.class, new Integer(id));
        if (null != p) {
            session.delete(p);
        }
    }

    public void updateClient(Cliente cliente) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(cliente);
    }

}
