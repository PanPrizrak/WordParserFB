/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.daoimpl;

import com.jdbc.tutorial.dao.SenderDAO;
import com.jdbc.tutorial.entity.Sender;

import java.util.List;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author asiro
 */
public class SenderDAOImpl implements SenderDAO {

    private static final Logger logger = LoggerFactory.getLogger(SenderDAOImpl.class);
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addSender(Sender s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(s);
        tx.commit();
        session.close();
        logger.info("!!!Sendere saved succesfully, sender details = " + s + "!!!");
    }

    @Override
    public void updateSender(Sender s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        session.update(s);
        session.getTransaction().commit();
        logger.info("!!!Sender update siccesfully, sender details = " + s + "!!!");
    }

    @Override
    public Sender getSenderById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Sender s = (Sender) session.load(Sender.class, new Integer(id));
        //JOptionPane.showMessageDialog(null,s.toString());
        //
        logger.info("!!!Sender loaded succesfully, sender details = " + s + "!!!");
       /*load() не достает объект из базы - он просто создает класс-обертку (proxy), 
        которая в случае первого обращения к ней будет делать запрос в БД. 
        Get же делает запрос сразу. Об этом есть в Hibernate Tutorial.
        В твоем случае ты создаешь proxy, однако сразу после этого закрываешь сессию, 
        соответственно запрос к БД уже не сделать и выбрасывается исключение. 
        Поэтому либо нужно использовать get() либо hibernate session должна 
        быть все еще открыта когда обращаешься к полям неинициализированной прокси.
        */
        session.getTransaction().commit();
        return s;
    }

    @Override
    public void removeSender(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Sender s = (Sender) session.load(Sender.class, new Integer(id));
        if (null != s){
            session.delete(s);
        }
        session.getTransaction().commit();
        logger.info("!!!Sender deletes succesfully, sender details = " + s + "!!!");
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Sender> listSender() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.openSession();
        List<Sender> senderList = session.createQuery("from Sender").list();
        for (Sender s : senderList){
            logger.info("!!!Sender List::" + s);
        }
        session.close();
        return senderList;
    }
    
}
