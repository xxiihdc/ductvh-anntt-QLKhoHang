/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui.dialog;

import dao.ProductDAO;
import dao.ProductGroupDAO;
import dao.ProductTypeDAO;
import dao.ProductUnitDAO;
import dao.VendorDAO;
import entity.Product;
import entity.ProductGroup;
import entity.ProductType;
import entity.ProductUnit;
import entity.Vendor;
import java.io.File;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import utils.Currency;
import utils.MsgBox;
import utils.XImage;

/**
 *
 * @author ductr
 */
public class ProductDialog extends javax.swing.JDialog {

    /**
     * Creates new form ProductDialog
     */
    final String DEFAULT_IMG = "fpl.png";

    public ProductDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    void init() {
        bgrStatus.add(rdoDangKinhDoanh);
        bgrStatus.add(rdoDungKD);
        setLocationRelativeTo(null);
        fillComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrStatus = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cbxProductGroup = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbxPT = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        cbxVendor = new javax.swing.JComboBox<>();
        rdoDangKinhDoanh = new javax.swing.JRadioButton();
        rdoDungKD = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        cbxUnit = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông Tin Sản Phẩm");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã sản phẩm:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tên sản phẩm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nhóm sản phẩm:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Loại sản phẩm:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nhà sản xuất:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Đơn vị tính:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Trạng thái:");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbxProductGroup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxProductGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_30px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_30px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cbxPT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_30px.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbxVendor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxVendor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rdoDangKinhDoanh.setSelected(true);
        rdoDangKinhDoanh.setText("Đang kinh doanh");

        rdoDungKD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoDungKD.setText("Ngừng kinh doanh");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Hình ảnh");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Thông số kỹ thuật:");

        lblImg.setBackground(new java.awt.Color(255, 255, 255));
        lblImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImgMousePressed(evt);
            }
        });

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane1.setViewportView(txtNote);

        jButton6.setBackground(new java.awt.Color(255, 153, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_30px.png"))); // NOI18N
        jButton6.setText("Lưu & Thêm mới");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 153, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pin_in_circle_30px.png"))); // NOI18N
        jButton7.setText("Lưu & Thoát");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_30px.png"))); // NOI18N
        jButton8.setText("Thoát");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        cbxUnit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_30px.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Đơn giá:");

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButton6)
                .addGap(57, 57, 57)
                .addComponent(jButton7)
                .addGap(86, 86, 86)
                .addComponent(jButton8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(rdoDangKinhDoanh)
                        .addGap(18, 18, 18)
                        .addComponent(rdoDungKD)
                        .addGap(282, 282, 282))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxVendor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxProductGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxPT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtName)
                                    .addComponent(txtID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(78, 78, 78)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cbxProductGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbxVendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(cbxUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoDungKD)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoDangKinhDoanh)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ProductDAO dao = new ProductDAO();
        if (valid()) {
            if (dao.hasID(txtID.getText())) {
                update();
                clearForm();
            } else {
                insert();
                clearForm();
            }

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new ProductGroupDialog(null, true).setVisible(true);
        fillComboBoxPG();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new ProductTypeDialog(null, true).setVisible(true);
        fillCbxPT();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new VendorDialog(null, true).setVisible(true);
        fillCbxVendor();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new ProductUnitDialog(null, true).setVisible(true);
        fillCbxPU();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lblImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            JFileChooser open = new JFileChooser();
            int option = open.showOpenDialog(null);
            if (option != 1) {
                File file = open.getSelectedFile();
                XImage.saveImg(file);
                ImageIcon icon;
                try {
                    icon = XImage.readImg(file.getName());
                    lblImg.setIcon(icon);
                    lblImg.setName(file.getName());
                } catch (Exception ex) {
                    MsgBox.alert(null, "Định dạng file không hợp lệ");
                }
                //MsgBox.alert(this, file.getName());
            }
        }
    }//GEN-LAST:event_lblImgMousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ProductDAO dao = new ProductDAO();
        if (valid()) {
            if (dao.hasID(txtID.getText())) {
                update();
                this.dispose();
            } else {
                insert();
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        // TODO add your handling code here:
        String price = txtPrice.getText();
        if (price.length() == 0) {
            return;
        }
        char c = price.charAt(price.length() - 1);
        String price2 = price.substring(0, price.length() - 2);
        price2 = price2.replaceAll("\\.", "");
        txtPrice.setText(price2);
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!Character.isDigit(k)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // TODO add your handling code here:
        String id = txtID.getText();
        Product p = new ProductDAO().selectByID(id);
        if (p != null) {
            boolean b = MsgBox.confirm(null, "San pham nay da co ban co muon chinh sua");
            if (b) {
                setForm(p);
            } else {
                txtID.setText("");
                txtID.requestFocus();
            }
        }
    }//GEN-LAST:event_txtIDFocusLost

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
            java.util.logging.Logger.getLogger(ProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductDialog dialog = new ProductDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgrStatus;
    private javax.swing.JComboBox<String> cbxPT;
    private javax.swing.JComboBox<String> cbxProductGroup;
    private javax.swing.JComboBox<String> cbxUnit;
    private javax.swing.JComboBox<String> cbxVendor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JRadioButton rdoDangKinhDoanh;
    private javax.swing.JRadioButton rdoDungKD;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void fillComboBox() {
        fillComboBoxPG();
        fillCbxPT();
        fillCbxVendor();
        fillCbxPU();
    }

    private void fillComboBoxPG() {
        ProductGroupDAO dao = new ProductGroupDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxProductGroup.getModel();
        model.removeAllElements();
        List<ProductGroup> list = dao.selectAll();
        for (ProductGroup p : list) {
            model.addElement(p);
        }
    }

    private void fillCbxPT() {
        ProductTypeDAO dao = new ProductTypeDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxPT.getModel();
        model.removeAllElements();
        List<ProductType> list = dao.selectAll();
        for (ProductType p : list) {
            model.addElement(p);
        }
    }

//    private void fillCbxSup() {
//        SupplierDAO dao = new SupplierDAO();
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxSupplier.getModel();
//        model.removeAllElements();
//        List<Supplier> list = dao.selectAll();
//        for (Supplier p : list) {
//            model.addElement(p);
//        }
//    }
    private void fillCbxVendor() {
        VendorDAO dao = new VendorDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxVendor.getModel();
        model.removeAllElements();
        List<Vendor> list = dao.selectAll();
        for (Vendor p : list) {
            model.addElement(p);
        }
    }

    private void fillCbxPU() {
        ProductUnitDAO dao = new ProductUnitDAO();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbxUnit.getModel();
        model.removeAllElements();
        List<ProductUnit> list = dao.selectAll();
        for (ProductUnit p : list) {
            model.addElement(p);
        }
    }

    private boolean valid() {
        String msg = "";
        String reID = "[a-zA-Z0-9]{1,7}";
        if (!txtID.getText().trim().matches(reID)) {
            msg += "ID chỉ bao gồm chữ cái và số, dưới 7 ký tự";
        }
        if (txtName.getText().length() == 0) {
            msg += "\n Tên sản phẩm không được rỗng";
        }
        if (txtPrice.getText().length() == 0) {
            msg += "\n Giá sản phẩm không được rỗng";
        }
        if (msg.length() > 0) {
            MsgBox.alert(null, msg);
            return false;
        }
        return true;
    }

    private void update() {
        Product p = getForm();
        new ProductDAO().update(p);
    }

    private void clearForm() {
        Product p = new Product();
        p.setImage(DEFAULT_IMG);
        setForm(p);
        txtID.setEnabled(true);
    }

    private void insert() {
        new ProductDAO().insert(getForm());
    }

    public void setForm(Product p) {
        txtID.setText(p.getId());
        txtID.setEnabled(false);
        txtName.setText(p.getName());
        cbxProductGroup.setSelectedItem(new ProductGroupDAO().selectByID(p.getProductGroupID() + ""));
        cbxPT.setSelectedItem(new ProductTypeDAO().selectByID(p.getProductTypeID() + ""));
        cbxUnit.setSelectedItem(new ProductUnitDAO().selectByID(p.getProductUnitID()));
        cbxVendor.setSelectedItem(new VendorDAO().selectByID(p.getVendorID()));
        txtNote.setText(p.getNote());
        if (p.isStatus()) {
            rdoDangKinhDoanh.setSelected(true);
        } else {
            rdoDungKD.setSelected(true);
        }
        String img;
        img = p.getImage() + "";
        if (img.equalsIgnoreCase("null")) {
            img = DEFAULT_IMG;
        }
        lblImg.setIcon(XImage.readImg(img));
        lblImg.setToolTipText(img);
        txtPrice.setText(Currency.getCurrency(p.getPrice()));
    }

    private Product getForm() {
        Product p = new Product();
        p.setId(txtID.getText());
        p.setImage(lblImg.getName());
        p.setName(txtName.getText());
        p.setNote(txtNote.getText());
        ProductGroup pg = (ProductGroup) cbxProductGroup.getSelectedItem();
        p.setProductGroupID(pg.getId());
        ProductType pt = (ProductType) cbxPT.getSelectedItem();
        p.setProductTypeID(pt.getId());
        ProductUnit pu = (ProductUnit) cbxUnit.getSelectedItem();
        p.setProductUnitID(pu.getId());
        p.setStatus(rdoDangKinhDoanh.isSelected());
        Vendor v = (Vendor) cbxVendor.getSelectedItem();
        p.setVendorID(v.getId());
        String price = txtPrice.getText().trim();
        if (price.endsWith("đ")) {
            p.setPrice(Currency.getDouble(price));
        } else {
            p.setPrice(Double.parseDouble(price));
        }
        //p.setPrice(Double.parseDouble(txtPrice.getText()));
        return p;
    }
}
