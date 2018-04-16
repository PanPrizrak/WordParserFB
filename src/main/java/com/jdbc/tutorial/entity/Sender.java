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
@Table (name = "sender")
public class Sender {
    
    @Id
    @Column(name = "s_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column (name = "s_ved")
    private String ved;
    
    @Column (name = "s_name_s")
    private String name;
    
    @Column (name = "s_adres")
    private String adres;
    
    @Column (name = "s_rs")
    private String rs;
    
    @Column (name = "s_bank")
    private String bank;
    
    @Column (name = "s_kodbank")
    private String kodbank;
    
    @Column (name = "s_unp")
    private int unp;

    public Sender() {
    }

    public Sender(int id, String ved, String name, String adres, String rs, String bank, String kodbank, int unp) {
        this.id = id;
        this.ved = ved;
        this.name = name;
        this.adres = adres;
        this.rs = rs;
        this.bank = bank;
        this.kodbank = kodbank;
        this.unp = unp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVed() {
        return ved;
    }

    public void setVed(String ved) {
        this.ved = ved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getKodbank() {
        return kodbank;
    }

    public void setKodbank(String kodbank) {
        this.kodbank = kodbank;
    }

    public int getUnp() {
        return unp;
    }

    public void setUnp(int unp) {
        this.unp = unp;
    }

    @Override
    public String toString() {
        return "Sender{" + "id=" + id + ", ved=" + ved + ", name=" + name + ", adres=" + adres + ", rs=" + rs + ", bank=" + bank + ", kodbank=" + kodbank + ", unp=" + unp + '}';
    }
    
    public String toSender(){
        return ved + " \n" + name + " \n" + adres + " " + rs + " \n" + bank + " " + kodbank + " " + unp;
    }   
    
}
