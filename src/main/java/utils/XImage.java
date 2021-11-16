/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author ductr
 */
public class XImage {
      public static Image getAppIcon(){
        URL url = XImage.class.getResource("/icon/fpt.png");
        return new ImageIcon(url).getImage(); 
    }
    public static boolean saveImg(File src){
        File dst = new File("src\\main\\resources\\portrait",src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();//tao thu muc
        }
        try{
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public static ImageIcon readImg(String path){
        
       File src = new File("src\\main\\resources\\portrait",path);
       ImageIcon icon = new ImageIcon(src.getAbsolutePath());
       return icon;
    }
}
