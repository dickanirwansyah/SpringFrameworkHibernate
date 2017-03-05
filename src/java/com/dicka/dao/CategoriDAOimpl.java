/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.dao;

import com.dicka.entities.Categories;
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
@Repository("categoriDAO")
public class CategoriDAOimpl implements CategoriDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Categories> getFindAll() {
     //proses findall
     sessionFactory.getCurrentSession();
     Query query=sessionFactory.getCurrentSession()
             .createQuery("SELECT c FROM Categories c");
     return query.list();
    }

    @Override
    public Categories getFindById(String id) {
      sessionFactory.getCurrentSession();
        Query query=sessionFactory.getCurrentSession()
                .createQuery("SELECT c FROM Categories c WHERE c.idcategoris=:idcategoris");
        query.setParameter("idcategoris", id);
        return (Categories) query.uniqueResult();
    }

    @Override
    public void Simpan(Categories categories) {
     //proses simpan
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(categories);
        transaction.commit();
        session.close();
    }

    @Override
    public void Ubah(Categories categories) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(categories);
        transaction.commit();
        session.close();
    }

    @Override
    public void Hapus(Categories categories) {
       Session session=sessionFactory.openSession();
       Transaction transaction=session.beginTransaction();
       session.delete(categories);
       transaction.commit();
       session.close();
    }

    @Override
    public String setAutoNumber() {
     return "null";
      
    }


}
