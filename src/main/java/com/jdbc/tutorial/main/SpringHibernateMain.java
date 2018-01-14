/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.tutorial.dao.PersonDAO;
import com.jdbc.tutorial.form.formPerson;
import com.jdbc.tutorial.model.Person;

/**
 *
 * @author asiro
 */
public class SpringHibernateMain {

    public static void main(String[] args) {

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        /*PersonDAO personDAO = context.getBean(PersonDAO.class);

        Person person = new Person();
        person.setName("Pankaj");
        person.setCountry("India");

        personDAO.addPerson(person);

        System.out.println("Person::" + person);

        List<Person> list = personDAO.listPerson();

        for (Person p : list) {
            System.out.println("Person List::" + p);
        }
        //close resources
        context.close();*/
        formPerson f = new formPerson();
        f.setVisible(true);
    }
}
