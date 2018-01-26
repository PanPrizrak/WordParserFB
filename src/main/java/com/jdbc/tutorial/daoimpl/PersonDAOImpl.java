/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.daoimpl;

import com.jdbc.tutorial.dao.PersonDAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jdbc.tutorial.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author asiro
 */
public class PersonDAOImpl implements PersonDAO {

    private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPerson(Person p) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
        logger.info("!!!Person saved successfully, Person Details=" + p);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> listPerson() {
        Session session = this.sessionFactory.openSession();
        List<Person> personList = session.createQuery("from Person").list();
        for (Person p : personList) {
            logger.info("!!!Person List::" + p);
        }
        session.close();
        return personList;
    }

    @Override
    public void updatePerson(Person p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        session.update(p);
        session.getTransaction().commit();
        logger.info("!!!Person updated successfully, Person Details=" + p);
    }

    @Override
    public Person getPersonById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Person p = (Person) session.load(Person.class, new Integer(id));
        logger.info("Person loaded successfully, Person details=" + p);
        return p;
    }

    @Override
    public void removePerson(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Person p = (Person) session.load(Person.class, new Integer(id));
        if (null != p) {
            session.delete(p);
        }
        session.getTransaction().commit();
        logger.info("Person deleted successfully, person details=" + p);
    }

}
