/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.dao;

import java.util.List;
import com.jdbc.tutorial.entity.Email;

/**
 *
 * @author asiro
 */
public interface EmailDAO {
    public void addEmail(Email e);
    public void updateEmail(Email e);
    public Email getEmailById(int id);
    public void removeEmail(int id);
    public List<Email> listEmail();    
}
