/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vt.Runner;

import com.vt.Models.tblmusteri;
import com.vt.Util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vektorel
 */
public class runnerHB {
    
    
    public static void main(String[] args) {

// -------------- KAYIT İŞLEMLERİ ---------------------        
//        Session ss = NewHibernateUtil.getSessionFactory().openSession();
//        Transaction tt = ss.beginTransaction();
//        tblmusteri m = new tblmusteri();
//        m.setAd("Muhammet3");
//        m.setSoyad("HOCA3");
//        m.setTc("22222222115");
//        ss.save(m);
//        tt.commit();
//        ss.close();
        

          Session ss = NewHibernateUtil.getSessionFactory().openSession();
          Criteria cr = ss.createCriteria(tblmusteri.class);
          
          List<tblmusteri> liste = cr.list();
          
          for(tblmusteri item : liste){
          
              System.out.println("id...:"+ item.getId());
              System.out.println("Ad...:"+ item.getAd());
              System.out.println("soyad...:"+ item.getSoyad());
              System.out.println("-----------------------------------");
          }

          ss.close();
        
        
        
    }
    
}















