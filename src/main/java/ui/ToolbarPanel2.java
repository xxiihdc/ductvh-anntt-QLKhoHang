/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author ductr
 */
public class ToolbarPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form toolbarPanel2
     */
    public ToolbarPanel2() {
        initComponents();
        init();
    }
    void init(){
        btnCategory.setName("category");
        btnDesk.setName("desk");
        btnProduct.setName("product");
        btnInvoice.setName("invoice");
        btnExport.setName("export");
        btnReport.setName("report");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDesk = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnCategory = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnProduct = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnInvoice = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnExport = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnReport = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();

        jToolBar1.setRollover(true);

        btnDesk.setBackground(new java.awt.Color(255, 204, 153));
        btnDesk.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnDesk.setForeground(new java.awt.Color(255, 51, 0));
        btnDesk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/office_64px.png"))); // NOI18N
        btnDesk.setText("Bàn Làm Việc");
        btnDesk.setFocusable(false);
        btnDesk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDesk.setMargin(new java.awt.Insets(5, 20, 5, 20));
        btnDesk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDesk);
        jToolBar1.add(jSeparator1);

        btnCategory.setBackground(new java.awt.Color(255, 153, 102));
        btnCategory.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCategory.setForeground(new java.awt.Color(255, 51, 0));
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu_64px.png"))); // NOI18N
        btnCategory.setText("Danh Mục");
        btnCategory.setFocusable(false);
        btnCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategory.setMargin(new java.awt.Insets(5, 20, 5, 20));
        btnCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCategory);
        jToolBar1.add(jSeparator2);

        btnProduct.setBackground(new java.awt.Color(255, 153, 102));
        btnProduct.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(255, 51, 0));
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product_64px.png"))); // NOI18N
        btnProduct.setText("Sản Phẩm");
        btnProduct.setFocusable(false);
        btnProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduct.setMargin(new java.awt.Insets(5, 20, 5, 20));
        btnProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProduct);
        jToolBar1.add(jSeparator3);

        btnInvoice.setBackground(new java.awt.Color(255, 153, 102));
        btnInvoice.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnInvoice.setForeground(new java.awt.Color(255, 51, 0));
        btnInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/invoice_64px.png"))); // NOI18N
        btnInvoice.setText("Hóa Đơn");
        btnInvoice.setFocusable(false);
        btnInvoice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInvoice.setMargin(new java.awt.Insets(5, 20, 5, 20));
        btnInvoice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnInvoice);
        jToolBar1.add(jSeparator4);

        btnExport.setBackground(new java.awt.Color(255, 153, 102));
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 51, 0));
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/warehouse_64px.png"))); // NOI18N
        btnExport.setText("Xuất Kho");
        btnExport.setFocusable(false);
        btnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExport.setMargin(new java.awt.Insets(5, 20, 5, 20));
        btnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnExport);
        jToolBar1.add(jSeparator5);

        btnReport.setBackground(new java.awt.Color(255, 153, 102));
        btnReport.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 51, 0));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Business Report_64px.png"))); // NOI18N
        btnReport.setText("Thống Kê");
        btnReport.setFocusable(false);
        btnReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReport.setMargin(new java.awt.Insets(5, 20, 5, 20));
        btnReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnReport);
        jToolBar1.add(jSeparator6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCategory;
    public javax.swing.JButton btnDesk;
    public javax.swing.JButton btnExport;
    public javax.swing.JButton btnInvoice;
    public javax.swing.JButton btnProduct;
    public javax.swing.JButton btnReport;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
