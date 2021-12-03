
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ductr
 */
public class NewClass4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Blank Document
        // XWPFDocument document = new XWPFDocument(); 
        //Write the Document in file system
            FileOutputStream out = new FileOutputStream(new File("fontstyle.docx"));
        //create paragraph
//      XWPFParagraph paragraph = document.createParagraph();
//      paragraph.setAlignment(ParagraphAlignment.CENTER);
//        
//      //Set Bold an Italic
//      XWPFRun paragraphOneRunOne = paragraph.createRun();
//      paragraphOneRunOne.setBold(true);
//      paragraphOneRunOne.setItalic(true);
//      paragraphOneRunOne.setFontSize(30);
//      
//      paragraphOneRunOne.setText("HÓA ĐƠN BÁN HÀNG");
//      paragraphOneRunOne.addBreak();
//        
//      //Set text Position
//      XWPFRun paragraphOneRunTwo = paragraph.createRun();
//      paragraphOneRunTwo.setText("Font Style two");
//      paragraphOneRunTwo.setTextPosition(100);
// 
//      //Set Strike through and Font Size and Subscript
//      XWPFParagraph paragraph2 = document.createParagraph();
//      XWPFRun paragraphOneRunThree = paragraph2.createRun();
//      paragraphOneRunThree.setStrike(true);
//      paragraphOneRunThree.setFontSize(20);
//      paragraphOneRunThree.setSubscript(VerticalAlign.SUBSCRIPT);
//      paragraphOneRunThree.setText(" Different Font Styles");
//        
//      document.write(out);
//      out.close();
//      System.out.println("fontstyle.docx written successully");

        XWPFDocument doc = new XWPFDocument();
        XWPFTable table = doc.createTable(1, 2);
        table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(6000));
        table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(2000));
        table.getRow(0).getCell(0).setText("1A");
        table.getRow(0).getCell(1).setText("1B");
        XWPFTableRow newrow = table.createRow();
        newrow.getCell(0).setText("2A");
        newrow.getCell(1).setText("2B");
        doc.write(out);
        out.close();
    }
}
