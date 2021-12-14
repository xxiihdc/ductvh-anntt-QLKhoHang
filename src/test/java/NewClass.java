
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ductr
 */


//hex str to utf 8
public class NewClass {

    public static void main(String[] args) {
        String hex = "(hex)686fc3a06920c491e1bba963";   
        hex = hex.substring(5);
// AAA
        ByteBuffer buff = ByteBuffer.allocate(hex.length() / 2);
        for (int i = 0; i < hex.length(); i += 2) {
            buff.put((byte) Integer.parseInt(hex.substring(i, i + 2), 16));
        }
        buff.rewind();
        Charset cs = Charset.forName("UTF-8");                              // BBB
        CharBuffer cb = cs.decode(buff);                                    // BBB
        System.out.println(cb.toString());;
    }
}
