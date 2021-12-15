/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.main;

import dao.InvoiceDAO;
import dao.SupplierDAO;
import entity.Invoice;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import ui.dialog.InvoiceDetailsDialog;
import utils.Currency;
import utils.MsgBox;
import utils.XLanguage;
import utils.Xdate;

/**
 *
 * @author ductr
 */
public class InvoicePanel extends javax.swing.JPanel {

    /**
     * Creates new form InvoicePanel
     */
    InvoiceDAO dao = new InvoiceDAO();
    String bundlePath;
    ResourceBundle resourceBundle;

    public InvoicePanel() {
        initComponents();
        init();
    }

    void init() {
        txtDateFrom.setDateFormatString("dd-MM-yyyy");
        txtDateTo.setDateFormatString("dd-MM-yyyy");
        setLanguage();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jToolBar2 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblRecord = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtDateTo = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtDateFrom = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbxStatus = new javax.swing.JComboBox<>();
        checkboxNo = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lý Hóa Đơn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jToolBar2.setRollover(true);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rewind_button_round_40px.png"))); // NOI18N
        jButton4.setToolTipText("Đầu tiên");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMargin(new java.awt.Insets(2, 10, 2, 20));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/prev.png"))); // NOI18N
        jButton5.setToolTipText("Lùi");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton5);

        lblRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRecord.setText("Hoai duc");
        jToolBar2.add(lblRecord);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next_page_40px.png"))); // NOI18N
        jButton6.setToolTipText("Tiến");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        jButton7.setToolTipText("Cuối cùng");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMargin(new java.awt.Insets(2, 20, 2, 0));
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton7);

        txtDateTo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Từ ngày:");

        txtDateFrom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Đến ngày:");

        tblInvoice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ngày Tạo", "Nhà Cung Cấp", "Giảm Giá", "Tổng Tiền", "Tổng Nợ", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInvoice.setRowHeight(30);
        tblInvoice.setRowMargin(5);
        tblInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblInvoiceMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblInvoice);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Trạng Thái:");

        cbxStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Chờ xác nhận", "Đã xác nhận", "Đã hủy" }));

        checkboxNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkboxNo.setText("Chỉ hóa đơn nợ NCC");
        checkboxNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkboxNo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkboxNo))
                    .addComponent(txtDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jToolBar1.setRollover(true);
        jToolBar1.setMargin(new java.awt.Insets(0, 5, 0, 5));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new_copy_30px.png"))); // NOI18N
        jButton1.setToolTipText("Thêm");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(2, 5, 2, 20));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick_box_30px.png"))); // NOI18N
        jButton3.setToolTipText("Sửa");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh_30px.png"))); // NOI18N
        jButton8.setToolTipText("Làm mới");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_30px.png"))); // NOI18N
        jButton9.setToolTipText("Xóa");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMargin(new java.awt.Insets(2, 20, 2, 0));
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton9);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_40px.png"))); // NOI18N
        btnSearch.setText("TÌM");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new InvoiceDetailsDialog(null, true).setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblInvoiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceMousePressed
        // TODO add your handling code here:
        int row = tblInvoice.getSelectedRow();
        if (row == - 1) {
            return;
        }
        if (evt.getClickCount() == 2) {
            String id = (tblInvoice.getValueAt(tblInvoice.getSelectedRow(), 0) + "");
            InvoiceDetailsDialog i = new InvoiceDetailsDialog(null, true);
            Invoice iv = dao.selectByID(id);
            i.setForm(iv);
            i.setVisible(true);
        } else if (evt.getClickCount() == 1) {
            lblRecord.setText((row + 1) + "/" + tblInvoice.getRowCount());
        }
    }//GEN-LAST:event_tblInvoiceMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        txtDateFrom.setDate(null);
        txtDateTo.setDate(null);
        cbxStatus.setSelectedIndex(0);
        fillTable();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void checkboxNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxNoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row = tblInvoice.getSelectedRow();
        if (row == - 1) {
            return;
        }
        String id = tblInvoice.getValueAt(row, 0) + "";
        Invoice i = dao.selectByID(id);
        InvoiceDetailsDialog idd = new InvoiceDetailsDialog(null, true);
        idd.setForm(i);
        idd.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        MsgBox.alert(null, "Bạn không thể");
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JCheckBox checkboxNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JTable tblInvoice;
    private com.toedter.calendar.JDateChooser txtDateFrom;
    private com.toedter.calendar.JDateChooser txtDateTo;
    // End of variables declaration//GEN-END:variables

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblInvoice.getModel();
        if (XLanguage.language.equalsIgnoreCase("en")) {
            String[] head = {"ID", "Created date", "Supplier", "Discount", "Amount", "Debt", "Status"};
            model.setColumnIdentifiers(head);
        }
        model.setRowCount(0);
        List<Invoice> lst;
        Date d1 = txtDateFrom.getDate();
        Date d2 = txtDateTo.getDate();
        int index = cbxStatus.getSelectedIndex();
        boolean no = checkboxNo.isSelected();
        if (d1 == null && d2 == null && index == 0 && !no) {
            lst = dao.selectAll();
        } else {
            String d1s, d2s;
            if (d1 != null) {
                d1s = Xdate.toString(d1, "yyyy-MM-dd");
            } else {
                d1s = "1990-01-01";
            }
            if (d2 != null) {
                d2s = Xdate.toString(d2, "yyyy-MM-dd");
            } else {
                d2s = Xdate.toString(new Date(), "yyyy-MM-dd");
            }
            lst = dao.selectByDate(d1s, d2s, index, no);
        }
        SupplierDAO sdao = new SupplierDAO();
        for (Invoice s : lst) {
            int id = s.getSupplierID();
            String status;
            switch (s.getStatus()) {
                case 0:
                    status = XLanguage.toUtf(resourceBundle.getString("status1"));
                    break;
                case 1:
                    status = XLanguage.toUtf(resourceBundle.getString("status2"));
                    break;
                default:
                    status = XLanguage.toUtf(resourceBundle.getString("status3"));
                    break;
            }
            String name = sdao.selectByID(id + "").getName();
            Object[] row = new Object[]{
                s.getId(),
                Xdate.toString(s.getCreateDate(), "dd-MM-yyyy"),
                name,
                Currency.getCurrency(s.getDiscount()),
                Currency.getCurrency(s.getAmount()),
                Currency.getCurrency(s.getDebt()),
                status
            };
            model.addRow(row);
        }
        lblRecord.setText("0/" + tblInvoice.getRowCount());
    }

    public void setStatus(boolean status, int index) {
        checkboxNo.setSelected(status);
        cbxStatus.setSelectedIndex(index);
    }

    private void setLanguage() {
        String lang = XLanguage.language;
        if (lang.equalsIgnoreCase("vi")) {
            bundlePath = "config.invoice-vi";
            resourceBundle = ResourceBundle.getBundle(bundlePath, new Locale("vi-VN"));
            return;
        }
        bundlePath = "config.invoice-en";
        resourceBundle = ResourceBundle.getBundle(bundlePath, new Locale("en-EN"));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice Management", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 18)));
        jLabel1.setText(resourceBundle.getString("dateFrom"));
        jLabel2.setText(resourceBundle.getString("dateTo"));
        jLabel3.setText(resourceBundle.getString("status"));
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxStatus.getModel();
        model.removeAllElements();
        model.addElement(resourceBundle.getString("status0"));
        model.addElement(resourceBundle.getString("status1"));
        model.addElement(resourceBundle.getString("status2"));
        model.addElement(resourceBundle.getString("status3"));
        btnSearch.setText(resourceBundle.getString("btnSearch"));
        checkboxNo.setText(resourceBundle.getString("cbx"));
    }
}
