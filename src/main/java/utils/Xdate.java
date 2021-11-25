/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ductr
 */
public class Xdate {
     static SimpleDateFormat formater = new SimpleDateFormat();
     public static Date toDate(String date,String pattern){
         try {
             Date d =  new SimpleDateFormat(pattern).parse(date);
//             formater.applyPattern(pattern);
//             return formater.parse(date);
             return d;
         } catch (ParseException ex) {
             throw new RuntimeException(ex);
         }  
     }
     public static String toString(Date date, String pattern){
         formater.applyPattern(pattern);
         return formater.format(date);
     }
     public static Date addDays(Date date, long days){
         date.setTime(date.getTime()+days*24*60*60*1000);
         return date;
     }
}
