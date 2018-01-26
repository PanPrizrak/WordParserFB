/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.dao;

import java.util.List;

/**
 *
 * @author asiro
 */


import com.jdbc.tutorial.entity.Person;

public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public Person getPersonById(int id);
	public void removePerson(int id);
	public List<Person> listPerson();
	
}
