/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.main;

import ui.toolbar.ToolbarPanel3;
import ui.toolbar.ToolbarPanel2;
import ui.toolbar.ToolbarPanel1;
import dao.UserDAO;
import entity.CongViec;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ui.main.category.Category;
import ui.dialog.SettingDialog;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.Timer;
import ui.dialog.LoginJDialog;
import ui.dialog.UserJDialog;
import utils.Auth;
import utils.MsgBox;
import utils.SaveLogin;
import utils.XImage;
import utils.XLanguage;

/**
 *
 * @author ductr
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    String bundlePath;
    ResourceBundle resourceBundle;

    public MainFrame() {
        initComponents();
        init();
    }

    void init() {
        setLocationRelativeTo(null);
        setIconImage(XImage.getAppIcon());
        setTitle("WAREHOUSE MANAGEMENT SYSTEM");
        ToolbarPanel1 t1 = new ToolbarPanel1();
        t1.gBtnSetting.addMouseListener(ml);
        t1.gBtnUser.addMouseListener(ml);
        t1.gBtnLogout.addMouseListener(ml);
        selectToolBarPanel(t1);
        // openLogin();
        txtStaff.setText(Auth.user.getName());
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblTime.setText(format.format(new Date()));

            }
        }).start();
        setLanguage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        toolbarPanel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnSystem = new javax.swing.JButton();
        btnFunction = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtStaff = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("WAREHOUSE MANAGEMENT SYSTEM");

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/atime_20px.png"))); // NOI18N
        lblTime.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 102, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1633 - Copy.jpg"))); // NOI18N
        mainPanel.add(jLabel3, "card2");

        toolbarPanel.setLayout(new java.awt.CardLayout());

        jToolBar1.setRollover(true);

        btnSystem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/geography_25px.png"))); // NOI18N
        btnSystem.setText("H??? Th???ng");
        btnSystem.setFocusable(false);
        btnSystem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSystem.setMargin(new java.awt.Insets(5, 0, 5, 20));
        btnSystem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSystem);

        btnFunction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFunction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings_25px.png"))); // NOI18N
        btnFunction.setText("Ch???c N??ng");
        btnFunction.setFocusable(false);
        btnFunction.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFunction.setMargin(new java.awt.Insets(5, 20, 5, 20));
        btnFunction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFunctionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFunction);

        btnHelp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home_25px.png"))); // NOI18N
        btnHelp.setText("Tr??? Gi??p");
        btnHelp.setFocusable(false);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHelp.setMargin(new java.awt.Insets(5, 20, 5, 20));
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHelp);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("XIN CH??O:");

        txtStaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(toolbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toolbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemActionPerformed
        // TODO add your handling code here:
        btnHeThongAction();
    }//GEN-LAST:event_btnSystemActionPerformed
    void btnHeThongAction() {
        ToolbarPanel1 t1 = new ToolbarPanel1();
        t1.gBtnSetting.addMouseListener(ml);
        t1.gBtnLogout.addMouseListener(ml);
        t1.gBtnUser.addMouseListener(ml);
        selectToolBarPanel(t1);
    }
    private void btnFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFunctionActionPerformed
        // TODO add your handling code here:
        btnChucNangAction();
    }//GEN-LAST:event_btnFunctionActionPerformed
    void btnChucNangAction() {
        ToolbarPanel2 t2 = new ToolbarPanel2();
        t2.gBtnCategory.addMouseListener(ml);
        t2.gBtnDesk.addMouseListener(ml);
        t2.gBtnProduct.addMouseListener(ml);
        t2.gBtnInvoice.addMouseListener(ml);
        t2.gBtnExport.addMouseListener(ml);
        t2.gBtnReport.addMouseListener(ml);
        selectToolBarPanel(t2);
    }
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
        btnTroGiupAction();
    }//GEN-LAST:event_btnHelpActionPerformed
    void btnTroGiupAction() {
        ToolbarPanel3 t3 = new ToolbarPanel3();
        selectToolBarPanel(t3);
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFunction;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSystem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel toolbarPanel;
    private javax.swing.JLabel txtStaff;
    // End of variables declaration//GEN-END:variables
    private void selectMainPanel(JPanel p) {
        mainPanel.removeAll();
        mainPanel.add(p);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void selectToolBarPanel(JPanel p) {
        toolbarPanel.removeAll();
        toolbarPanel.add(p);
        toolbarPanel.repaint();
        toolbarPanel.revalidate();
    }
    MouseListener ml = new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            JButton b = (JButton) e.getComponent();
            String name = b.getName();
            MainShelves ms = new MainShelves();
            ms.jList1.addMouseListener(ml2);
            switch (name) {
                case "category":
                    selectMainPanel(new Category());
                    break;
                case "desk":
                    ms.gBtnRefresh.addMouseListener(ml);
                    selectMainPanel(ms);
                    break;
                case "setting":
                    if (Auth.isManager()) {
                        new SettingDialog(MainFrame.this, true).setVisible(true);
                    } else {
                        MsgBox.alert(null, "B???n kh??ng c?? quy???n thi???t l???p");
                    }
                    break;
                case "product":
                    selectMainPanel(new ProductPanel());
                    break;
                case "invoice":
                    selectMainPanel(new InvoicePanel());
                    break;
                case "user":
                    UserJDialog u = new UserJDialog(null, true);
                    u.setForm(new UserDAO().selectByStaff(Auth.user.getId()));
                    u.setVisible(true);
                    break;
                case "export":
                    selectMainPanel(new ExportPanel());
                    break;
                case "report":
                    selectMainPanel(new ReportPanel());
                    break;
                case "logOut":
                    logOut();
                    break;
                case "btnRefresh":
                    selectMainPanel(ms);
                    break;
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };

    private void logOut() {
        Auth.user = null;
        SaveLogin.writeFile("", "");
        txtStaff.setText("Ch??a ????ng nh???p");
        this.dispose();
        LoginJDialog l = new LoginJDialog(null, true);
        //l.setStatus();
        l.setVisible(true);
        //txtStaff.setText(Auth.user.getName());
        //MainFrame.this.dispose();
    }
    MouseListener ml2 = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getClickCount() == 2) {
                JList j = (JList) e.getComponent();
                if (j.getSelectedIndex() == -1) {
                    return;
                }
                CongViec cv = (CongViec) j.getSelectedValue();
                String name = cv.getName();
                InvoicePanel ip = new InvoicePanel();
                switch (name) {
                    case "no":
                        ip.setStatus(true, 0);
                        ip.fillTable();
                        selectMainPanel(ip);
                        break;
                    case "xacNhan":
                        ip.setStatus(false, 1);
                        ip.fillTable();
                        selectMainPanel(ip);
                        break;
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    };

    private void setLanguage() {
        String lang = XLanguage.language;
        if (lang.equalsIgnoreCase("vi")) {
            bundlePath = "config.main-vi";
            resourceBundle = ResourceBundle.getBundle(bundlePath, new Locale("vi-VN"));
            return;
        }
        bundlePath = "config.main-en";
        resourceBundle = ResourceBundle.getBundle(bundlePath, new Locale("en-EN"));
        jLabel4.setText(resourceBundle.getString("jLabel4"));
        btnSystem.setText(resourceBundle.getString("btnSystem"));
        btnFunction.setText(resourceBundle.getString("btnFunction"));
        btnHelp.setText(resourceBundle.getString("btnHelp"));
    }
}
