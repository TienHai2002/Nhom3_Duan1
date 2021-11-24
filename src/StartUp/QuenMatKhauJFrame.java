package StartUp;

import DAO.NhanVienDAO;
import model.NhanVien;
import helper.MsgBoxHelper;
import java.awt.Color;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;

public class QuenMatKhauJFrame extends javax.swing.JFrame {

    NhanVienDAO dao = new NhanVienDAO();

    public QuenMatKhauJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setColorHuy(JButton Huy) {
        Huy.setBackground(Color.red);
    }

    public void setColorTT(JButton TT) {
        TT.setBackground(Color.blue);
    }

    public void resetColor(JButton A) {
        A.setBackground(new Color(240, 240, 240));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtMaXacNhan = new javax.swing.JTextField();
        btnGuiMa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblThongBao = new javax.swing.JLabel();
        lblChuaCoMa = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        btnTiepTuc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Nhân Viên");

        txtMaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quên Mật Khẩu");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã Xác Nhận", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtMaXacNhan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaXacNhan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGuiMa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuiMa.setText("Gửi Mã Xác Nhận");
        btnGuiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiMaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Vui lòng kiểm tra email để xem tin nhắn văn bản có mã. Mã của bạn có 6 ký tự.");

        lblThongBao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnGuiMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lblThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnGuiMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        lblChuaCoMa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblChuaCoMa.setForeground(new java.awt.Color(0, 102, 255));
        lblChuaCoMa.setText("Bạn chưa có mã ?");
        lblChuaCoMa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChuaCoMaMouseClicked(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHuyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHuyMouseExited(evt);
            }
        });
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnTiepTuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTiepTuc.setText("Tiếp Tục");
        btnTiepTuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiepTucMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiepTucMouseExited(evt);
            }
        });
        btnTiepTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepTucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtEmail)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblChuaCoMa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTiepTuc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChuaCoMa)
                    .addComponent(btnTiepTuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiMaActionPerformed
        GuiMa();
    }//GEN-LAST:event_btnGuiMaActionPerformed

    private void lblChuaCoMaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChuaCoMaMouseClicked
        if (MsgBoxHelper.confirm(this, "Bạn chắn chắn muốn nhận lại mã ?")) {
            ChuaCoMa();
        }
    }//GEN-LAST:event_lblChuaCoMaMouseClicked

    private void btnHuyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseEntered
        setColorHuy(btnHuy);
    }//GEN-LAST:event_btnHuyMouseEntered

    private void btnHuyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseExited
        resetColor(btnHuy);
    }//GEN-LAST:event_btnHuyMouseExited

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
        new DangNhapJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnTiepTucMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiepTucMouseEntered
        setColorTT(btnTiepTuc);
    }//GEN-LAST:event_btnTiepTucMouseEntered

    private void btnTiepTucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiepTucMouseExited
        resetColor(btnTiepTuc);
    }//GEN-LAST:event_btnTiepTucMouseExited

    private void btnTiepTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepTucActionPerformed
        TiepTuc();
    }//GEN-LAST:event_btnTiepTucActionPerformed

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
            java.util.logging.Logger.getLogger(QuenMatKhauJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMatKhauJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuiMa;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnTiepTuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChuaCoMa;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtMaXacNhan;
    // End of variables declaration//GEN-END:variables
    void GuiMa() {
        Random rd = new Random();
        int x = rd.nextInt(898765) + 101234;
        String maNV = txtMaNhanVien.getText();
        String email = txtEmail.getText();
        NhanVien nhanVien = dao.selectById(maNV);
        if (nhanVien == null) {
            MsgBoxHelper.alert(this, "Mã Nhân Viên không hợp lệ !!");
            return;
        } else if (!email.equals(nhanVien.getEmail())) {
            MsgBoxHelper.alert(this, "Email kia không phải của nhân viên " + maNV + " !!");
            return;
        } else {
            try {
                dao.updateMaXacNhan(x + "", maNV);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Properties p = new Properties();
                p.put("mail.smtp.auth", "true");
                p.put("mail.smtp.starttls.enable", "true");
                p.put("mail.smtp.host", "smtp.gmail.com");
                p.put("mail.smtp.port", 587);
                p.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
                //----------------------------
                String accountName = "shoessys8888@gmail.com";
                String accountPassword = "Hyuk2002@";
                Session session = Session.getInstance(p, new javax.mail.Authenticator() {
                    @Override
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(accountName, accountPassword);
                    }
                });
                //----------------------------
                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress("shoessys8888@gmail.com"));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(txtEmail.getText()));
                    message.setSubject(x + " là mã xác nhận ShoesSys của bạn");
                    message.setText("Xin chào " + maNV + ",\n\n"
                            + "Có phải bạn đã quên mật khẩu ShoesSys phải không ?\n"
                            + x + " là mã đặt lại mật khẩu ShoesSys của bạn !!");
                    Transport.send(message);
                } catch (Exception e) {
                }
            } catch (Exception e) {
            }
        }
        MsgBoxHelper.alert(this, "Vui lòng kiểm tra email !!");
        lblThongBao.setText("Chúng tôi đã gửi cho bạn mã đến: " + email);
    }

    void ChuaCoMa() {
        Random rd = new Random();
        int x = rd.nextInt(898765) + 101234;
        String maNV = txtMaNhanVien.getText();
        String email = txtEmail.getText();
        NhanVien nhanVien = dao.selectById(maNV);
        if (nhanVien == null) {
            MsgBoxHelper.alert(this, "Mã Nhân Viên không hợp lệ !!");
            return;
        } else if (!email.equals(nhanVien.getEmail())) {
            MsgBoxHelper.alert(this, "Email kia không phải của nhân viên " + maNV + " !!");
            return;
        } else {
            try {
                dao.updateMaXacNhan(x + "", maNV);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Properties p = new Properties();
                p.put("mail.smtp.auth", "true");
                p.put("mail.smtp.starttls.enable", "true");
                p.put("mail.smtp.host", "smtp.gmail.com");
                p.put("mail.smtp.port", 587);
                p.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
                //----------------------------
                String accountName = "shoessys8888@gmail.com";
                String accountPassword = "Hyuk2002@";
                Session session = Session.getInstance(p, new javax.mail.Authenticator() {
                    @Override
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(accountName, accountPassword);
                    }
                });
                //----------------------------
                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress("shoessys8888@gmail.com"));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(txtEmail.getText()));
                    message.setSubject(x + " là mã xác nhận ShoesSys của bạn");
                    message.setText("Xin chào " + maNV + ",\n\n"
                            + "Có phải bạn đã quên mật khẩu ShoesSys phải không ?\n"
                            + x + " là mã đặt lại mật khẩu ShoesSys của bạn !!");
                    Transport.send(message);
                } catch (Exception e) {
                }
            } catch (Exception e) {
            }
        }
        MsgBoxHelper.alert(this, "Đã gửi lại mã xác nhận !!\nVui lòng kiểm tra email !!");
        lblThongBao.setText("Chúng tôi đã gửi lại cho bạn một mã khác đến: " + email);
    }

    void TiepTuc() {
        String maNV = txtMaNhanVien.getText();
        String email = txtEmail.getText();
        String MaXN = txtMaXacNhan.getText();
        NhanVien nhanVien = dao.selectById(maNV);
        if (!MaXN.equals(nhanVien.getMaXacNhan())){
            MsgBoxHelper.alert(this, "Mã Xác Nhận không hợp lệ !!");
        } else {
            MsgBoxHelper.alert(this, "Xác nhận thành công");
            dao.updateMaXacNhan(null, maNV);
            this.dispose();
            new LayMatKhauJDialog(this, true, maNV).setVisible(true);
        }
    }
}
