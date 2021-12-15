package ui.dialog;

import dao.ExportDAO;
import dao.ExportDetailsDAO;
import dao.ProductBatchDAO;
import dao.ShelvesDetailsDAO;
import entity.Export;
import entity.ExportDetails;
import entity.ProductBatch;
import entity.ShelvesDetails;
import entity.Supplier;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;
import utils.Auth;
import utils.Currency;
import utils.MsgBox;
import utils.Xdate;

/**
 *
 * @author ductr
 */
public class ExportDialog extends javax.swing.JDialog {

    /**
     * Creates new form ExportDialog
     */
    boolean add = true;
    DefaultTableModel model;
    List<ProductBatch> lst;
    ExportDAO dao = new ExportDAO();
    ProductBatchDAO bdao = new ProductBatchDAO();
    ShelvesDetailsDAO sdao = new ShelvesDetailsDAO();

    public ExportDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    void init() {
        setTitle("Quản lý xuất kho");
        setLocationRelativeTo(null);
        fillList();
        txtID.setText("(Phiếu mới)");
        Date date = new Date();
        String sDate = Xdate.toString(date, "dd-MM-yyyy");
        txtDate.setText(sDate);
        txtStaff.setText(Auth.user.getId());
        model = (DefaultTableModel) tblProduct.getModel();
        lst = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStaff = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        txtSoSP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã Phiếu");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ngày Tạo:");

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nhân Viên:");

        txtStaff.setEditable(false);
        txtStaff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Diễn Giải:");

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane1.setViewportView(txtNote);

        txtSoSP.setEditable(false);
        txtSoSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSoSPKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Tổng Số Lượng");

        txtSum.setEditable(false);
        txtSum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Số sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(29, 29, 29))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(50, 50, 50)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtSoSP)
                    .addComponent(txtStaff))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6))
                    .addComponent(txtSum, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtSoSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_30px.png"))); // NOI18N
        jButton5.setText("THÊM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tblProduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sản Phẩm", "Ngày Nhập Kho", "Số Lượng", "Đơn Giá Nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduct.setRowHeight(30);
        tblProduct.setRowMargin(5);
        tblProduct.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblProductPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tblProduct);

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_30px.png"))); // NOI18N
        jButton6.setText("XÓA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(290, 290, 290))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_30px.png"))); // NOI18N
        jButton1.setText("LƯU DỮ LIỆU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print_30px.png"))); // NOI18N
        jButton2.setText("IN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/power_off_button_30px.png"))); // NOI18N
        jButton3.setText("THOÁT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh_30px.png"))); // NOI18N
        jButton4.setText("LÀM MỚI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSoSPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoSPKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!Character.isDigit(k)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSoSPKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        addProduct();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            addProduct();
        }
    }//GEN-LAST:event_jList1MousePressed

    private void tblProductPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblProductPropertyChange
        // TODO add your handling code here:
        if ("tableCellEditor".equals(evt.getPropertyName())) {
            if (tblProduct.isEditing()) {
            } else {
                int row = tblProduct.getSelectedRow();
                String quantity = tblProduct.getValueAt(row, 2) + "";
                if (quantity.length() == 0) {
                    tblProduct.setValueAt(1, row, 2);
                    fillDetails();
                    return;
                }
                for (int i = 0; i < quantity.length(); i++) {
                    if (!Character.isDigit(quantity.charAt(i))) {
                        MsgBox.alert(null, "Nhập số");
                        tblProduct.setValueAt(1, row, 2);
                        fillDetails();
                        return;
                    }
                }
                if (Integer.parseInt(quantity) <= 0) {
                    MsgBox.alert(null, ">0");
                    tblProduct.setValueAt(1, row, 2);
                    fillDetails();
                    return;
                }
                int q = Integer.parseInt(quantity);
                if (q > lst.get(row).getQuantity()) {
                    tblProduct.setValueAt(lst.get(row).getQuantity(), row, 2);
                    fillDetails();
                    return;
                }
                fillDetails();
            }
        }
    }//GEN-LAST:event_tblProductPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (lst.isEmpty()) {
            return;
        }
        if (!add) {
            return;
        }
        Export e = new Export(Integer.parseInt(txtSoSP.getText()), Integer.parseInt(txtSum.getText()),
                txtStaff.getText());
        e.setDate(new Date());
        e.setNote(txtNote.getText());
        dao.insert(e);
        getExportDetails();
        add = false;
        MsgBox.alert(null, "Phiếu xuất kho đã được lưu");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (!add) {
            return;
        }
        int row = tblProduct.getSelectedRow();
        if (row == -1) {
            return;
        }
        if (lst.isEmpty()) {
            return;
        }
        lst.remove(row);
        model.removeRow(tblProduct.getSelectedRow());
        model.fireTableDataChanged();
        fillDetails();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        print();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ExportDialog dialog = new ExportDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<ProductBatch> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtSoSP;
    private javax.swing.JTextField txtStaff;
    private javax.swing.JTextField txtSum;
    // End of variables declaration//GEN-END:variables

    private void fillList() {
        ProductBatchDAO dao = new ProductBatchDAO();
        List<ProductBatch> lst = dao.selectAll();
        DefaultListModel<ProductBatch> model = new DefaultListModel<>();
        for (int i = 0; i < lst.size(); i++) {
            model.add(i, lst.get(i));
        }
        jList1.setModel(model);
    }

    private void addProduct() {
        if (!add) {
            MsgBox.alert(null, "Không thể chỉnh sửa phiếu xuất kho cũ");
            return;
        }
        ProductBatch p = jList1.getSelectedValue();
        if (p != null) {
            DefaultListModel modelList = (DefaultListModel) jList1.getModel();
            int selectedIndex = jList1.getSelectedIndex();
            if (selectedIndex != -1) {
                modelList.remove(selectedIndex);
            }
            Object[] row = new Object[]{
                p.getProductName(),
                Xdate.toString(p.getEnteredDate(), "dd-MM-yyyy"), 1,
                Currency.getCurrency(p.getPrice())
            };
            lst.add(p);
            model.addRow(row);
            fillDetails();
        }
    }

    private void fillDetails() {
        txtSoSP.setText(tblProduct.getRowCount() + "");
        int sum = 0;
        for (int i = 0; i < tblProduct.getRowCount(); i++) {
            sum += Integer.parseInt(tblProduct.getValueAt(i, 2) + "");
        }
        txtSum.setText(sum + "");
    }

    private void getExportDetails() {
        ExportDetailsDAO edao = new ExportDetailsDAO();
        int id = dao.getLastID();
        for (int i = 0; i < tblProduct.getRowCount(); i++) {
            ExportDetails e = new ExportDetails(id, lst.get(i).getId(),
                    Integer.parseInt(tblProduct.getValueAt(i, 2) + ""));
            edao.insert(e);
            updateQuantity(e.getBatchId(), e.getQuantity());
        }
    }

    private void updateQuantity(int batchID, int quantity) {
        int q = quantity;
        ProductBatch p = bdao.selectByID(batchID + "");
        if (p.getQuantity() == quantity) {
            sdao.deleteByBatch(batchID);
            bdao.delete(batchID + "");
        } else {
            bdao.updateQuantity(batchID, quantity);
            List<ShelvesDetails> list = sdao.selectListByBatch(batchID);
            for (ShelvesDetails s : list) {
                int sQuantity = s.getQuantity();
                int temp = q - sQuantity;
                if (temp == 0) {
                    sdao.delete(s.getId() + "");
                    break;
                } else if (temp > 0) {
                    sdao.delete(s.getId() + "");
                    q = temp;
                } else if (temp < 0) {
                    s.setQuantity(s.getQuantity() - q);
                    sdao.update(s);
                    break;
                }
            }
        }
    }

    public void setForm(Export e) {
        txtID.setText(e.getId() + "");
        txtDate.setText(Xdate.toString(e.getDate(), "dd-MM-yyyy"));
        txtNote.setText(e.getNote());
        txtSoSP.setText(e.getTotalProduct() + "");
        txtSum.setText(e.getTotalQuantity() + "");
        fillTable(e.getId());
        add = false;
        tblProduct.setEnabled(add);
    }

    private void fillTable(int id) {
        ExportDetailsDAO dao = new ExportDetailsDAO();
        List<ExportDetails> list = dao.selectByHoaDon(id);
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        model.setRowCount(0);
        for (ExportDetails s : list) {
            Object[] row = new Object[]{
                s.getName(), Xdate.toString(s.getDate(), "dd-MM-yyyy"),
                s.getQuantity(), Currency.getCurrency(s.getPrice())
            };
            model.addRow(row);
        }
    }

    private void clearForm() {
        add = true;
        tblProduct.setEnabled(add);
        fillList();
        model.setRowCount(0);
        txtID.setText("Phiếu mới");
        txtSoSP.setText("");
        txtStaff.setText(Auth.user.getId());
        txtSum.setText("");
        txtDate.setText(Xdate.toString(new Date(), "dd-MM-yyyy"));
        txtNote.setText("");
    }

    private void print() {
        try {
            String date = txtDate.getText();
            XWPFDocument document = new XWPFDocument();
            String time = java.time.LocalDateTime.now() + "";
            time = time.replaceAll(":", "");
            String path = "src\\main\\resources\\docs";
            String title = "xuatkho" + time + ".docx";
            FileOutputStream o = new FileOutputStream(new File(path, title));
            XWPFParagraph paragraph = document.createParagraph();
            paragraph.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun paragraphOneRunOne = paragraph.createRun();
            paragraphOneRunOne.setBold(true);
            paragraphOneRunOne.setFontSize(30);
            paragraphOneRunOne.setText("PHIẾU XUẤT KHO");
            paragraphOneRunOne.addBreak();
            XWPFRun run2 = paragraph.createRun();
            run2.setText("Ngày " + date.substring(0, 2) + " Tháng " + date.substring(3, 5) + " Năm " + date.substring(6));
            run2.addBreak();

            XWPFParagraph paragraph2 = document.createParagraph();

            XWPFRun run7 = paragraph2.createRun();
            run7.setText("Ghi chú: " + txtNote.getText());

            XWPFTable table = document.createTable();
            XWPFTableRow tableRowOne = table.getRow(0);

            CTTblWidth width = table.getCTTbl().addNewTblPr().addNewTblW();
            width.setType(STTblWidth.DXA);
            width.setW(BigInteger.valueOf(9072));

            String[] header = {"SẢN PHẨM", "NGÀY NHẬP KHO", "SỐ LƯỢNG", "ĐƠN GIÁ NHẬP"};
            for (int i = 0; i < header.length; i++) {
                XWPFTableCell cell;
                if (i == 0) {
                    cell = tableRowOne.getCell(0);
                } else {
                    cell = tableRowOne.createCell();
                }
                cell.removeParagraph(0);
                XWPFParagraph cellPara = cell.addParagraph();
                XWPFRun cellRun = cellPara.createRun();
                cellRun.setText(header[i]);
                cell.setColor("3498db");
                cellPara.setAlignment(ParagraphAlignment.CENTER);
                cell.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
                cellRun.setBold(true);
            }
            for (int i = 0; i < tblProduct.getRowCount(); i++) {
                XWPFTableRow tableRow = table.createRow();
                tableRow.getCell(0).setText(tblProduct.getValueAt(i, 0) + "");
                tableRow.getCell(1).setText(tblProduct.getValueAt(i, 1) + "");
                tableRow.getCell(2).setText(tblProduct.getValueAt(i, 2) + "");
                tableRow.getCell(3).setText(tblProduct.getValueAt(i, 3) + "");
            }

            XWPFParagraph paragraph3 = document.createParagraph();
            XWPFRun run8 = paragraph3.createRun();
            run8.addBreak();
            run8.addBreak();
            run8.addBreak();
            run8.setText("Số sản phẩm: " + txtSoSP.getText());
            run8.addBreak();
            run8.setText("Tổng số lượng: " + txtSum.getText());
            run8.addBreak();
            run8.setText("Nhân viên:" + txtStaff.getText());
            run8.addBreak();
            run8.addBreak();
            run8.addBreak();
            run8.addBreak();
            run8.setText("Ký xác nhận");
            run8.setBold(true);
            run8.addTab();
            run8.addTab();
            run8.addTab();
            run8.addTab();
            run8.addTab();
            run8.addTab();
            run8.addTab();
            run8.addTab();
            run8.addTab();
            run8.addTab();
            paragraph3.setAlignment(ParagraphAlignment.RIGHT);
            document.write(o);
            o.close();
            File file = new File(path, title);
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
