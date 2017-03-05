/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.dao;

import com.dicka.entities.Product;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dicka
 */
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<Product> getFindAll() {
        //proses findall 
      return sessionFactory.getCurrentSession()
              .createCriteria(Product.class)
              .list();
    }

    @Override
    public Product getFindById(String id) {
      
        sessionFactory.getCurrentSession();
        Query query=sessionFactory.getCurrentSession()
                .createQuery("SELECT p FROM Product p WHERE p.idproduct=:idproduct");
        query.setParameter("idproduct", id);
        return (Product) query.uniqueResult();
    }

    @Override
    public void SimpanProduct(Product product) {
        //proses Simpan-Product
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    @Override
    public void UpdateProduct(Product product) {
      //proses Update-Product
      Session session=sessionFactory.openSession();
      Transaction transaction=session.beginTransaction();
      session.update(product);
      transaction.commit();
      session.close();
    }

    @Override
    public void DeleteProduct(Product product) {
        //proses delete-product
       Session session=sessionFactory.openSession();
       Transaction transaction=session.beginTransaction();
       session.delete(product);
       transaction.commit();
       session.close();
    }

    @Override
    public String setAuto() {
      String id="";
        try {
            for(Product p : getFindAll()){
                id=p.getIdproduct();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
}
