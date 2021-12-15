/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dialog;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import dao.StaffDAO;
import dao.UserDAO;
import entity.Staff;
import entity.User;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import ui.main.AdminDashboard;
import ui.main.MainFrame;
import utils.Auth;
import utils.MD5;
import utils.MsgBox;
import utils.SaveLogin;
import utils.XLanguage;

/**
 *
 * @author ductr
 */
public class LoginJDialog extends javax.swing.JDialog {

    /**
     * Creates new form LoginJDialog
     */
    String bundlePath;
    ResourceBundle resourceBundle;
    Properties properties = new Properties();

    public LoginJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    void init() {
        setLocationRelativeTo(null);
        txtPassword.setText("123");
        setTitle("Đăng nhập hệ thống");
        txtUserName.setForeground(new Color(58, 65, 65));
        setLanguage();
        setTheme();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForm = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPw = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        cbSaveLogin = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser.setText("Tên đăng nhập:");

        txtUserName.setText("Tên đăng nhập");
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });

        lblPw.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPw.setText("Mật khẩu:");

        txtPassword.setText("123456");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chevron_right_20px.png"))); // NOI18N
        btnLogin.setText("ĐĂNG NHẬP");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_30px.png"))); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        cbSaveLogin.setText("Ghi nhớ đăng nhập");
        cbSaveLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaveLoginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Secure.png"))); // NOI18N

        lblAdmin.setForeground(new java.awt.Color(0, 0, 255));
        lblAdmin.setText("Đăng nhập bằng tài khoản admin.");
        lblAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAdminMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPw)
                            .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlFormLayout.createSequentialGroup()
                                    .addComponent(cbSaveLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(132, 132, 132))
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlFormLayout.createSequentialGroup()
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAdmin)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblPw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFormLayout.createSequentialGroup()
                                .addComponent(cbSaveLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdmin)
                .addContainerGap())
        );

        getContentPane().add(pnlForm, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
        if (txtUserName.getText().equalsIgnoreCase("Tên đăng nhập")
                || txtUserName.getText().equalsIgnoreCase("User name")) {
            txtUserName.setText("");
            txtUserName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        if (txtUserName.getText().trim().equals("")
                || txtUserName.getText().trim().equalsIgnoreCase("Tên đăng nhập")) {
            txtUserName.setText("Tên đăng nhập");
            txtUserName.setForeground(new Color(58, 65, 65));
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void cbSaveLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaveLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSaveLoginActionPerformed

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            login();
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            login();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void lblAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMousePressed
        // TODO add your handling code here:
        String id = txtUserName.getText();
        String pass = new String(txtPassword.getPassword());
        if (id.equals("admin")) {
            try {
//                FileReader reader = new 
//        FileReader("src\\main\\resources\\config\\config.properties");
                //Properties properties = new Properties();
                //properties.load(reader);
                String pw = properties.getProperty("pass");
               // reader.close();
                if (pw.equalsIgnoreCase(MD5.getMD5(pass))) {
                    this.dispose();
                    new AdminDashboard().setVisible(true);
                } else {//sai mk admin
                    MsgBox.alert(null,XLanguage.toUtf(resourceBundle.getString("msg1")));
                }
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_lblAdminMousePressed

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
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginJDialog dialog = new LoginJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                if (!dialog.openLogin()) {
                    dialog.setVisible(true);
                };

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbSaveLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblPw;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void login() {
        StaffDAO dao = new StaffDAO();
        String id = txtUserName.getText();
        String pass = new String(txtPassword.getPassword());
        UserDAO udao = new UserDAO();
        User u = udao.selectByID(txtUserName.getText());
        if (u == null) {//sai ten dn
            MsgBox.alert(btnExit, XLanguage.toUtf(resourceBundle.getString("msg2")));
            return;
        }
        if (!u.getPassword().equalsIgnoreCase(pass)) {//sai mk
            MsgBox.alert(null, XLanguage.toUtf(resourceBundle.getString("msg3")));
            return;
        }
        Staff s = dao.selectByID(u.getId());
        if (!s.isStatus()) {//nghi viec
            MsgBox.alert(null,XLanguage.toUtf(resourceBundle.getString("msg4")));
            return;
        }
        this.dispose();
        Auth.user = s;
        if (cbSaveLogin.isSelected()) {
            SaveLogin.writeFile(id, pass);
        }
        new MainFrame().setVisible(true);
    }

    public void setStatus() {
        lblAdmin.setEnabled(false);
    }

    public boolean openLogin() {
        try {
            FileReader fr = new FileReader("src\\login.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            line = br.readLine();
            if (!line.equalsIgnoreCase("null")) {
                UserDAO dao = new UserDAO();
                User nv = dao.selectByID(line);
                String pass = MD5.getMD5(nv.getPassword());
                String passLine = br.readLine();
                fr.close();
                if (passLine.equalsIgnoreCase(pass)) {
                    Staff s = new StaffDAO().selectByID(nv.getId());
                    Auth.user = s;
                    new MainFrame().setVisible(true);
                    LoginJDialog.this.dispose();
                    return true;
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    private void setLanguage() {
        try {
            FileReader reader = new FileReader("src\\main\\resources\\config\\config.properties");
            properties.load(reader);
            String lang = properties.getProperty("lang");
            reader.close();
            if (lang.equalsIgnoreCase("vi")) {
                bundlePath = "config.login-vi";
                resourceBundle = ResourceBundle.getBundle(bundlePath, new Locale("vi-VN"));
                //MsgBox.alert(btnExit, XLanguage.toUtf(resourceBundle.getString("msg2")));
            } else {
                bundlePath = "config.login-en";
                XLanguage.language = "en";
                resourceBundle = ResourceBundle.getBundle(bundlePath, new Locale("en-EN"));
                lblUser.setText(XLanguage.toUtf(resourceBundle.getString("username")));
                txtUserName.setText(XLanguage.toUtf(resourceBundle.getString("usernameText")));
                lblPw.setText(XLanguage.toUtf(resourceBundle.getString("pw")));
                cbSaveLogin.setText(XLanguage.toUtf(resourceBundle.getString("saveLogin")));
                lblAdmin.setText(XLanguage.toUtf(resourceBundle.getString("loginForAdmin")));
                btnLogin.setText(XLanguage.toUtf(resourceBundle.getString("btnLogin")));
                btnExit.setText(XLanguage.toUtf(resourceBundle.getString("btnExit")));
                this.setTitle(XLanguage.toUtf(resourceBundle.getString("title")));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setTheme() {
        try {
            String theme = properties.getProperty("theme");
            if (theme.equalsIgnoreCase("dark")) {
                UIManager.setLookAndFeel(new FlatNordIJTheme());
                SwingUtilities.updateComponentTreeUI(this);
                this.pack();
            } else {
                UIManager.setLookAndFeel(new FlatArcOrangeIJTheme());
                SwingUtilities.updateComponentTreeUI(this);
                this.pack();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
