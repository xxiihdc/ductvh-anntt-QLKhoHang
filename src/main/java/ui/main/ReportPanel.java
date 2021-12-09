/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.main;

import dao.ReportDAO;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ductr
 */
public class ReportPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportPanel
     */
    ReportDAO dao = new ReportDAO();

    public ReportPanel() {
        initComponents();
        init();

    }

    void init() {
        //  selectMainPanel(mainPanel1, jScrollPane1);
        makeChartTonKho();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        mainPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpnPhanLoai = new javax.swing.JPanel();
        jscrNhomSP = new javax.swing.JScrollPane();
        jscrLoaiSP = new javax.swing.JScrollPane();
        jpnNcc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jscrInvoice = new javax.swing.JScrollPane();
        cbxYear = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        cbxYearExport = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxMonth = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống Kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tồn Kho", mainPanel1);

        jscrNhomSP.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jscrLoaiSP.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpnPhanLoaiLayout = new javax.swing.GroupLayout(jpnPhanLoai);
        jpnPhanLoai.setLayout(jpnPhanLoaiLayout);
        jpnPhanLoaiLayout.setHorizontalGroup(
            jpnPhanLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPhanLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscrNhomSP, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnPhanLoaiLayout.setVerticalGroup(
            jpnPhanLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPhanLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnPhanLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addComponent(jscrNhomSP))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Phân Loại SP", jpnPhanLoai);

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpnNccLayout = new javax.swing.GroupLayout(jpnNcc);
        jpnNcc.setLayout(jpnNccLayout);
        jpnNccLayout.setHorizontalGroup(
            jpnNccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
        );
        jpnNccLayout.setVerticalGroup(
            jpnNccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mua Hàng NCC", jpnNcc);

        jscrInvoice.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxYear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CHỌN NĂM:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbxYear, 0, 1014, Short.MAX_VALUE))
                    .addComponent(jscrInvoice))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxYear)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Hóa Đơn", jPanel1);

        jScrollPane3.setBackground(new java.awt.Color(255, 153, 153));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Năm:");

        cbxYearExport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Tháng:");

        cbxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxYearExport, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(590, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxYearExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Xuất Kho", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        int index = jTabbedPane1.getSelectedIndex();
        switch (index) {
            case 0:
                makeChartTonKho();
                break;
            case 2:
                makeChartNCC();
                break;
            case 1:
                makeChartPL();
                break;
            case 3:
                fillComboBox();
                makeChartInvoice();
                break;
            case 4:
                fillCbxExport();
                break;
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged
    void selectMainPanel(JPanel main, Component p) {
        main.removeAll();
        main.add(p);
        main.repaint();
        main.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxMonth;
    private javax.swing.JComboBox<String> cbxYear;
    private javax.swing.JComboBox<String> cbxYearExport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnNcc;
    private javax.swing.JPanel jpnPhanLoai;
    private javax.swing.JScrollPane jscrInvoice;
    private javax.swing.JScrollPane jscrLoaiSP;
    private javax.swing.JScrollPane jscrNhomSP;
    private javax.swing.JPanel mainPanel1;
    // End of variables declaration//GEN-END:variables

    private void makeChartTonKho() {
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        List<String[]> data = dao.getTonKho();
        for (String[] s : data) {
            dcd.setValue(Integer.parseInt(s[1]), "Sản Phẩm", s[0]);
        }
        JFreeChart jchart = ChartFactory.createBarChart("Biểu đồ hàng tồn kho",
                "Sản Phẩm", "Số Lượng", dcd, PlotOrientation.VERTICAL, true,
                true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        int width = 1100;
        if (data.size() > 22) {
            width = data.size() * 50;
        }
        ChartPanel cpn = new ChartPanel(jchart, width, 450, 500, 450, 10000, 450, true, true, true, true, true, true, true);
        jScrollPane1.getViewport().add(cpn);

    }

    private void makeChartNCC() {

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        List<String[]> data = dao.getNCC();
        for (String[] s : data) {
            dcd.setValue(Double.parseDouble(s[1]), "Sản Phẩm", s[0]);
        }
        JFreeChart jchart = ChartFactory.createBarChart("Biểu đồ mua hàng NCC",
                "Nhà Cung Cấp", "Số Lượng", dcd, PlotOrientation.VERTICAL, true,
                true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        int width = 1100;
        if (data.size() > 22) {
            width = data.size() * 50;
        }
        ChartPanel cpn = new ChartPanel(jchart, width, 450, 500, 450, 10000, 450, true, true, true, true, true, true, true);
        jScrollPane2.getViewport().add(cpn);
    }

    private void makeChartPL() {
        List<String[]> nhomSP = dao.getGroup();
        DefaultPieDataset pie = new DefaultPieDataset();
        for (String[] s : nhomSP) {
            pie.setValue(s[0], Integer.parseInt(s[1]));
        }
        JFreeChart chart = ChartFactory.createPieChart("Nhóm sản phẩm", pie, true, true, true);
        ChartPanel cpn = new ChartPanel(chart, 550, 450, 500, 450, 10000, 450, true, true, true, true, true, true, true);
        jscrNhomSP.getViewport().add(cpn);

        List<String[]> loaiSP = dao.getType();
        DefaultPieDataset pie2 = new DefaultPieDataset();
        for (String[] s : loaiSP) {
            pie2.setValue(s[0], Integer.parseInt(s[1]));
        }
        JFreeChart chart2 = ChartFactory.createPieChart("Loại sản phẩm", pie2, true, true, true);
        ChartPanel cpn2 = new ChartPanel(chart2, 600, 450, 500, 450, 10000, 450, true, true, true, true, true, true, true);
        jscrLoaiSP.getViewport().add(cpn2);
    }

    private void makeChartInvoice() {
        //int i = Integer.parseInt(cbxYear.getSelectedItem()+""); 
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        List<String[]> data = dao.getInvoice(Integer.parseInt(cbxYear.getSelectedItem() + ""));
        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = 0; i < month.length; i++) {
            if (data.isEmpty()) {
                dcd.setValue(0, "Tổng Tiền", "Tháng " + (i + 1));
            } else {
                int count = 0;
                for (int j = 0; j < data.size(); j++) {
                    if (month[i] == Integer.parseInt(data.get(j)[0])) {
                        dcd.setValue(Double.parseDouble(data.get(j)[1]), "Tổng Tiền", "Tháng " + data.get(j)[0]);
                        data.remove(data.get(j));
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    dcd.setValue(0, "Tổng Tiền", "Tháng " + (i + 1));
                }
            }

        }
        JFreeChart jchart = ChartFactory.createBarChart("Tổng Tiền Hóa Đơn Theo Tháng Trong Năm " + cbxYear.getSelectedItem(),
                "Tháng", "Tổng Tiền", dcd, PlotOrientation.VERTICAL, true,
                true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        int width = 1100;
        ChartPanel cpn = new ChartPanel(jchart, width, 350, 500, 350, 10000, 350, true, true, true, true, true, true, true);
        jscrInvoice.getViewport().add(cpn);
    }

    private void fillComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxYear.getModel();
        model.removeAllElements();
        List<Integer> list = dao.selectYear();
        for (Integer cd : list) {
            model.addElement(cd);
        }
    }

    private void makeChartExport() {
        Integer year = (Integer) cbxYearExport.getSelectedItem();
        Integer month = (Integer) cbxMonth.getSelectedItem();
        if (year == null || month == null) {
            return;
        }
        List<String[]> data = dao.getExport(year, month);
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        for (String[] s : data) {
            dcd.setValue(Integer.parseInt(s[1]), "Sản Phẩm", s[0]);
            JFreeChart jchart = ChartFactory.createBarChart
        ("Biểu đồ xuất kho tháng " + month +" năm "+ year,
                    "Sản Phẩm", "Số Lượng", dcd, PlotOrientation.VERTICAL, true,
                    true, false);
            CategoryPlot plot = jchart.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.BLACK);
            int width = 1100;
            if (data.size() > 22) {
                width = data.size() * 50;
            }
            ChartPanel cpn = new ChartPanel(jchart, width, 450, 500, 450, 10000, 450, true, true, true, true, true, true, true);
            jScrollPane3.getViewport().add(cpn);
        }
    }

    private void fillCbxExport() {
        List<Integer> lst = dao.selectYearExport();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxYearExport.getModel();
        model.removeAllElements();
        for (Integer i : lst) {
            model.addElement(i);
        }
        fillCbxMonth();
    }

    private void fillCbxMonth() {
        Integer year = (Integer) cbxYearExport.getSelectedItem();
        if (year == null) {
            return;
        }
        List<Integer> lst = dao.selectMonth(year);
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxMonth.getModel();
        model.removeAllElements();
        for (Integer i : lst) {
            model.addElement(i);
        }
        makeChartExport();
    }
}
