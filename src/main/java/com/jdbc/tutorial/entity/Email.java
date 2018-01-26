/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author asiro
 */
@Entity
@Table(name="email")
public class Email {
    
    @Id
    @Column(name="e_id")
    private int id;
    
    @Column(name="e_email")
    private String email;
    
    @Column(name="e_sender_id")
    private int sender_id;
    
    @Column(name="e_recipient_id")
    private int recipient_id;

    public Email() {
    }

    public Email(int id, String email, int sender_id, int recipient_id) {
        this.id = id;
        this.email = email;
        this.sender_id = sender_id;
        this.recipient_id = recipient_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public int getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(int recipient_id) {
        this.recipient_id = recipient_id;
    }

    @Override
    public String toString() {
        return "Email{" + "id=" + id + ", email=" + email + ", sender_id=" + sender_id + ", recipient_id=" + recipient_id + '}';
    }
    
    
}
