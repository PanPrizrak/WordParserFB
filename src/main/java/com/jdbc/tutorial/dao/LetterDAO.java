/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.dao;

import java.util.List;
import com.jdbc.tutorial.entity.Letter;

/**
 *
 * @author asiro
 */
public interface LetterDAO {
    
    public void addLetter(Letter l);
    public void updateLetter(Letter l);
    public Letter getLetterById(int id);
    public void removeLetter(int id);
    public List<Letter> listLetter();
    
}
