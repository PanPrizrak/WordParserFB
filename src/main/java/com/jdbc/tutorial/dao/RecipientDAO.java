/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.dao;

import java.util.List;
import com.jdbc.tutorial.entity.Recipient;

/**
 *
 * @author asiro
 */
public interface RecipientDAO {
    
    public void addRecipient(Recipient r);
    public void updateRecipient(Recipient r);
    public Recipient getRecipientById(int id);
    public void removeRecipient(int id);
    public List<Recipient> listRecipient();
    
}
