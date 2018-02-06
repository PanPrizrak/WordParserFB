/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.daoimpl;

import com.jdbc.tutorial.dao.EmailDAO;
import com.jdbc.tutorial.entity.Email;

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
public class EmailDAOImpl implements EmailDAO{
    
    private static final Logger logger = LoggerFactory.getLogger(EmailDAOImpl.class);
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addEmail(Email e) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(e);
        tx.commit();
        session.close();
        logger.info("!!!Email saved succesfully, Email Details="+e+"!!!");
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Email> listEmail() {
        Session session = this.sessionFactory.openSession();
        List<Email> emailList = session.createQuery("from Email").list();
        for (Email e: emailList) {
            logger.info("!!!Email List::" + e + "!!!");
        }
        session.close();
        return emailList;
    }
    
    @Override
    public void updateEmail(Email e){
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        session.update(e);
        session.getTransaction().commit();
        logger.info("!!!Email updated successfully, Email details" + e + "!!!");
    }
    
    @Override
    public Email getEmailById(int id){
        Session session = this.sessionFactory.getCurrentSession();
        Email e = (Email) session.load(Email.class, new Integer(id));
        logger.info("!!!Email loaded successfully, Email details=" + e +"!!!");
        return e;
    }
    
    @Override
    public void removeEmail(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Email e = (Email) session.load(Email.class, new Integer(id));
        if (null != e){
            session.delete(e);
        }
        session.getTransaction().commit();
        logger.info("!!! Email Deleted successfully, email details = " + e + "!!!");
    }
}
