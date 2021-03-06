/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.entity;

import java.sql.JDBCType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.engine.VersionValue;




/**
 *
 * @author asiro
 */
@Entity
@Table(name="email")
public class Email {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="e_id")
    private int id;
    
    @Column(name="e_email")
    private String email;
    
    @Column(name="e_sender_id",nullable = true)
    private Integer sender_id;
    
    @Column(name="e_recipient_id",nullable = true)
    private Integer recipient_id;

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

    public Integer getSender_id() {
        return sender_id;
    }

    public void setSender_id(Integer sender_id) {
        this.sender_id = sender_id;
    }

    public Integer getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(Integer recipient_id) {
        this.recipient_id = recipient_id;
    }

    @Override
    public String toString() {
        return "Email{" + "id=" + id + ", email=" + email + ", sender_id=" + sender_id + ", recipient_id=" + recipient_id + '}';
    }
}
