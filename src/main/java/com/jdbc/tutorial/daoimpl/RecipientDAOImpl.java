/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.daoimpl;

import com.jdbc.tutorial.entity.Recipient;
import com.jdbc.tutorial.dao.RecipientDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author asiro
 */
public class RecipientDAOImpl implements RecipientDAO{

    private static final Logger logger = LoggerFactory.getLogger(RecipientDAOImpl.class);
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addRecipient(Recipient r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(r);
        tx.commit();
        session.close();
        logger.info("!!!Recipient saved successfully, recipient details = " + r + "!!!");
    }

    @Override
    public void updateRecipient(Recipient r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction().begin();
        session.update(r);
        session.getTransaction().commit();
        logger.info("!!!Recipient updated succesfully, recipient details = " + r + "!!!");
    }

    @Override
    public Recipient getRecipientById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        Recipient r = (Recipient) session.load(Recipient.class, new Integer(id));
        logger.info("!!!Recipient loaded succesfully, recipient details = " + r + "!!!");
        return r;
    }

    @Override
    public void removeRecipient(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Recipient r = (Recipient) session.load(Recipient.class, new Integer(id));
        if (null != r){
            session.delete(r);
        }
        session.getTransaction().commit();
        logger.info("!!!Recipient deleted succesfully, recipient details = " + r + "!!!");
    }
    
    @SuppressWarnings("uncheked")
    @Override
    public List<Recipient> listRecipient() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.openSession();
        List<Recipient> recipientList = session.createQuery("from Recipient").list();
        for (Recipient r : recipientList){
            logger.info("!!!Recipient List::" + r);
        }
        session.close();
        return recipientList;
    }
    
}
