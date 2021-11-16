/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author ductr
 */
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author ductr
 */
public class MsgBox {
    public static void alert(Component parent,String msg){
        JOptionPane.showMessageDialog(parent, msg,"Hệ thống quản lý kho hàng",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(Component parent,String msg){
        int result = JOptionPane.showConfirmDialog(parent, msg,
                "Hệ thống quản lý kho hàng",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    public static String prompt(Component parent, String msg){
        return JOptionPane.showInputDialog(parent, msg,
                "Hệ thống quản lý kho hàng",JOptionPane.INFORMATION_MESSAGE);
    }
}