/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.dao;

import java.util.List;
import com.jdbc.tutorial.entity.Tel;

/**
 *
 * @author asiro
 */
public interface TelDAO {
    
    public void addTell(Tel t);
    public void updateTel(Tel t);
    public Tel getTelById(int id);
    public void removeTel(int id);
    public void searchField();
    public List<Tel> listTel();
    
}
