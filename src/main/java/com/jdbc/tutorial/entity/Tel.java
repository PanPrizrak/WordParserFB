/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author asiro
 */

@Entity
@Table (name = "tel")
public class Tel {
    
    @Id
    @Column (name = "t_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column (name = "t_tel")
    private String tel;
    
    @Column(name="t_sender_id",nullable = true)
    private Integer sender_id;
    
    @Column(name="t_recipient_id",nullable = true)
    private Integer recipient_id;

    public Tel() {
    }

    public Tel(int id, String tel, Integer sender_id, Integer recipient_id) {
        this.id = id;
        this.tel = tel;
        this.sender_id = sender_id;
        this.recipient_id = recipient_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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
        return "Tel{" + "id=" + id + ", tel=" + tel + ", sender_id=" + sender_id + ", recipient_id=" + recipient_id + '}';
    }
    
}
