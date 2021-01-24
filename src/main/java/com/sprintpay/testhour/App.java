/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprintpay.testhour;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author mansour
 */
public class App {
    public static void main(String[] args) {
        Date date = new Date();
//        SimpleDateFormat formater = null;
//        formater = new SimpleDateFormat("h:m a");
//        long h = date.getTime()/60;
//        LocalDateTime lt;
//        lt = new LocalDateTimeStringConverter()
//        System.out.println("heure H:"+date.getHours()+"m:"+date.getMinutes());
         Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        int h = date.getHours();
        System.out.println("H"+h);
//        int h = cal.split(":");
//   String d = fmt.format("%tT",cal).toString();
    String str = "Faouzi";
        Map map = new HashMap();
        Runnable runnable = ()-> {
            map.put("a", str);
            System.out.println("before"+map.toString());
//            Thread.currentThread().interrupt();
            map.put("c", "c");
            map.put("d", "d");
            System.out.println("after"+map.toString());
        };
        Thread t = new Thread(runnable);
        t.start();
        
        Map m = new HashMap();
        m.put("mola","malo");
        m.put("bolo", "bala");
         Thread thr = new Thread(()-> 
         {  System.err.println(" ok"+m.toString());
        });
    thr.start();
}
       
    }
    
    
   
