/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Producto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Usuario
 */
public class ProductoDao {
    

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public ProductoDao() {
    }

    

    public Producto addProducts(Producto producto) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(producto);
        return producto;
    }

    public List<Producto> getAllProducts() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Producto> productoList = session.createQuery("from producto").list();
        return productoList;
    }

    public Producto getProduct(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Producto producto = (Producto) session.load(Producto.class, new Integer(id));
        return producto;
    }

    public void deleteProduct(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Producto p = (Producto) session.load(Producto.class, new Integer(id));
        if (null != p) {
            session.delete(p);
        }
    }

    public void updateProduct(Producto producto) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(producto);
    }
    
}
