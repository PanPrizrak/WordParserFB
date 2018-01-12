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


import com.jdbc.tutorial.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
