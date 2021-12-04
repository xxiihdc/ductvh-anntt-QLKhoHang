/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.FileWriter;

/**
 *
 * @author ductr
 */
public class SaveLogin {
    public static void writeFile(String id,String pass){
        try {
            FileWriter fw = new FileWriter("src\\login.txt");
            fw.write(id+"\r\n");
            fw.write(MD5.getMD5(pass));
            fw.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
