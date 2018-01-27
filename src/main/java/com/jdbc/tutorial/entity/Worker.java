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
@Table (name = "worker")
public class Worker {
    
    @Id
    @Column (name = "w_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column (name = "w_position")
    private String position;
    
    @Column (name = "W_name")
    private String name;
    
    @Column (name = "w_sname")
    private String sname;
    
    @Column (name = "w_patronymic")
    private String patronymic;
    
    @Column (name = "w_recipient_id")
    private int recipient_id;

    public Worker() {
    }

    public Worker(int id, String position, String name, String sname, String patronymic, int recipient_id) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.sname = sname;
        this.patronymic = patronymic;
        this.recipient_id = recipient_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(int recipient_id) {
        this.recipient_id = recipient_id;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", position=" + position + ", name=" + name + ", sname=" + sname + ", patronymic=" + patronymic + ", recipient_id=" + recipient_id + '}';
    }
    
}
