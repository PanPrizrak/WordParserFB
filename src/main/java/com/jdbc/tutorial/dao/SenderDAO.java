/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.dao;

import java.util.List;
import com.jdbc.tutorial.entity.Sender;

/**
 *
 * @author asiro
 */
public interface SenderDAO {
    
    public void addSender(Sender s);
    public void updateSender(Sender s);
    public Sender getSenderById(int id);
    public void removeSender(int id);
    public List<Sender> listSender();
    
}
