/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.daoimpl;

import com.jdbc.tutorial.entity.Worker;
import com.jdbc.tutorial.dao.WorkerDAO;

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
public class WorkerDAOImpl implements WorkerDAO {
    
    private static final Logger logger = LoggerFactory.getLogger(WorkerDAOImpl.class);
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addWorker(Worker w) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(w);
        tx.commit();
        session.close();
        logger.info("!!!Worker saved succesfully, worker details = " + w + "!!!");
    }

    @Override
    public void updateWorker(Worker w) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction().begin();
        session.update(w);
        session.getTransaction().commit();
        logger.info("!!!Worker updated succesfully, worker details = " + w + "!!!");
    }

    @Override
    public Worker getWorkerById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        Worker w = (Worker) session.load(Worker.class, new Integer(id));
        logger.info("!!!Worker loaded successfully, worker detail = " + w + "!!!");
        return w;
        
    }

    @Override
    public void removeWorker(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Worker w = (Worker) session.load(Worker.class, new Integer(id));
        if (null != w){
            session.delete(w);
        }
        session.getTransaction().commit();
        logger.info("!!!Worker deleted successfully,worker details = " + w + "!!!");
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Worker> listWorker() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Session session = this.sessionFactory.openSession();
        List<Worker> workerList = session.createQuery("from Worker").list();
        for (Worker w : workerList){
            logger.info("!!!Worker List::" + w + "!!!");
        }
        session.close();
        return workerList;
    }
    
}
