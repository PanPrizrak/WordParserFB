/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.daoimpl;

import com.jdbc.tutorial.entity.Tel;
import com.jdbc.tutorial.dao.TelDAO;

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
public class TelDAOImpl implements TelDAO {
    
    private static final Logger logger = LoggerFactory.getLogger(TelDAOImpl.class);
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addTell(Tel t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(t);
        session.close();
        logger.info("!!!Tel saved succesfully, tel details = " + t + "!!!");
    }

    @Override
    public void updateTel(Tel t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        session.update(t);
        session.getTransaction().commit();
        logger.info("!!!Tel updated succesfully, tel detail = " + t + "!!!");
    }

    @Override
    public Tel getTelById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        Tel t = (Tel) session.load(Tel.class, new Integer(id));
        logger.info("!!!Tel loaded succesfully, details tel = " + t + "!!!");
        return t;
    }

    @Override
    public void removeTel(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Tel t = (Tel) session.load(Tel.class, new Integer(id));
        if (null != t){
            session.delete(t);
        }
        session.getTransaction().commit();
        logger.info("!!!Tel deleted succesfully, tel deteils = " + t + "!!!");
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Tel> listTel() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.openSession();
        List<Tel> telList = session.createQuery("from Tel").list();
        for (Tel t : telList){
            logger.info("!!!Tel List::" + t);
        }
        session.close();
        return telList;
    }
    
}
