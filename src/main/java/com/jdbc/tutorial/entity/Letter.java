/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.tutorial.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author asiro
 */
@Entity
@Table (name = "letter")
public class Letter {
    @Id
    @Column (name = "l_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column (name = "l_sender_id")
    private int sender_id;
    
    @Column (name = "l_recipient_id")
    private int recipient_id;
    
    @Column (name = "l_data")
    @Temporal (value = TemporalType.DATE)
    private Date data;
    
    @Column (name = "l_number")
    private int number;
    
    @Column (name = "l_subject")
    private String subject;
    
    @Column (name = "l_message")
    private String message;
    
    @Column (name = "l_worker_id")
    private int worker_id;
    
    @Column (name = "l_executor")
    private String executor;

    public Letter() {
    }

    public Letter(int id, int sender_id, int recipient_id, Date data, int number, String subject, String message, int worker_id, String executor) {
        this.id = id;
        this.sender_id = sender_id;
        this.recipient_id = recipient_id;
        this.data = data;
        this.number = number;
        this.subject = subject;
        this.message = message;
        this.worker_id = worker_id;
        this.executor = executor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    @Override
    public String toString() {
        return "Letter{" + "id=" + id + ", sender_id=" + sender_id + ", recipient_id=" + recipient_id + ", data=" + data + ", number=" + number + ", subject=" + subject + ", message=" + message + ", worker_id=" + worker_id + ", executor=" + executor + '}';
    }
    
}
