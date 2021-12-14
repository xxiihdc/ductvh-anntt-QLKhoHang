/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 *
 * @author ductr
 */
public class XLanguage {

    public static String toUtf(String hex) {
        if (hex.startsWith("(hex)")) {
            hex = hex.substring(5);
            ByteBuffer buff = ByteBuffer.allocate(hex.length() / 2);
            for (int i = 0; i < hex.length(); i += 2) {
                buff.put((byte) Integer.parseInt(hex.substring(i, i + 2), 16));
            }
            buff.rewind();
            Charset cs = Charset.forName("UTF-8");
            CharBuffer cb = cs.decode(buff);
            return cb.toString();
        }
        return hex;
    }
    public static String language = "vi";
}
