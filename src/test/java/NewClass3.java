
import dao.ReportDAO;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ductr
 */
public class NewClass3 {
    public static void main(String[] args) {
        ReportDAO dao = new ReportDAO();
        List<String[]> lst = dao.getTonKho();
        for(int i =0;i<lst.size();i++){
            System.out.print(lst.get(i)[0]);
        }
    }
}
