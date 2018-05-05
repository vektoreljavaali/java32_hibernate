/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vt.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
//@Table(name = "musteritablosu") 

@Table
@Entity
public class tblmusteri implements Serializable {
 
    @Id
    @SequenceGenerator(name = "tblmusteri_sq",sequenceName = "tblmusteri_id_seq",
            initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "tblmusteri_sq")
    private int id;
    @Column(length = 50)
    private String ad;
    @Column(length = 50)
    private String soyad;
    @Column(length = 11)
    private String tc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
    
    
    
}
