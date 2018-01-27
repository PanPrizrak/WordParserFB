/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.daoimpl;

import com.jdbc.tutorial.dao.LetterDAO;
import com.jdbc.tutorial.entity.Letter;

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
public class LetterDAOImpl implements LetterDAO{
    
    private static final Logger logger = LoggerFactory.getLogger(LetterDAOImpl.class);
    
    private SessionFactory sessionFactory;

    @Override
    public void addLetter(Letter l) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(l);
        tx.commit();
        session.close();
        logger.info("!!!Letter saved successfully, letter details=" + l + "!!!");
    }

    @Override
    public void updateLetter(Letter l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    @Override
    public Letter getLetterById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Letter l = (Letter) session.load(Letter.class,new Integer(id));
        logger.info("!!!Letter loaded successfully, letter details = " + l + "!!!");
        return l;
    }

    @Override
    public void removeLetter(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Letter l = (Letter) session.load(Letter.class, new Integer(id));
        if (null != l){
            session.delete(l);
        }
        session.getTransaction().commit();
        logger.info("!!! Letter deleted successfully, letter details = " + l + "!!!");
    }

    @Override
    public List<Letter> listLetter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        List<Letter> letterList = session.createQuery("from letter").list();
        for (Letter l : letterList){
            logger.info("!!!Letter List::" + l + "!!!");
        }
        session.close();
        return letterList;
    }
    
}
