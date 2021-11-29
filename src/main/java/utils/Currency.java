/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ductr
 */
public class Currency {

    public static String getCurrency(double salary) {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyF = NumberFormat.getCurrencyInstance(localeVN);
        String luong = currencyF.format(salary);
        return luong;
    }

    public static double getDouble(String amout) {
        if (amout.length() < 2) {
            return 0;
        } else {
            String s1 = amout.substring(0, amout.length() - 2);
            String s2 = s1.replaceAll("\\.", "");
            return Double.parseDouble(s2);
        }

    }
}
