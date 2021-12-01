package StartUp;

import DAO.NhanVienDAO;
import model.NhanVien;
import helper.ShareHelper;
import helper.MsgBoxHelper;
import java.awt.Color;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.awt.Font;
import java.util.prefs.Preferences;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DangNhapJDialog extends javax.swing.JDialog {
    public Preferences pref = Preferences.userRoot().node("Remember");
    ImageIcon poster = new ImageIcon("src/icon/poster.gif");
    ImageIcon logo = new ImageIcon("src/icon/logo_2.png");
    ImageIcon show = new ImageIcon("src/icon/show.png");
    ImageIcon unshow = new ImageIcon("src/icon/unshow.png");
    NhanVienDAO dao = new NhanVienDAO();
    
    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        String user = null;
        if(pref.get("Tên Đăng Nhập", user) == null) {
            txtTenDangNhap2.setText("Tên Đăng Nhập");
        } else {
            user = pref.get("Tên Đăng Nhập", user);
            txtTenDangNhap2.setText(user);
            txtTenDangNhap2.setForeground(Color.BLACK);
        }
        String pass = null;
        if(pref.get("Mật Khẩu", pass) == null) {
            txtMatKhau.setText("Mật Khẩu");
        } else {
            pass = pref.get("Mật Khẩu", pass);
            txtMatKhau.setText(pass);
            txtMatKhau.setEchoChar('*');
            txtMatKhau.setForeground(Color.BLACK);
            lblShow.setIcon(unshow);
            return;
        }
    }

    public void addPlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(new Color(204, 204, 255));
    }

    public void removePlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }

    public void setColorLB(JLabel LB) {
        LB.setForeground(new Color(204,204,0));
    }

    public void resetColorLB(JLabel LB) {
        LB.setForeground(Color.BLACK);
    }
    
    public void setColorBTN(JButton Log) {
        Log.setBackground(new Color(0,0,204));
    }

    public void resetColorBTN(JButton Log) {
        Log.setBackground(new Color(51,102,255));
    }
    
    public void setColorBTNE(JButton Ex) {
        Ex.setBackground(new Color(204,0,0));
    }

    public void resetColorBTNE(JButton Ex) {
        Ex.setBackground(new Color(255,51,51));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        pn2 = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        Remember = new javax.swing.JCheckBox();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblQuenMatKhau = new javax.swing.JLabel();
        pn3 = new javax.swing.JPanel();
        txtTenDangNhap2 = new javax.swing.JTextField();
        pn4 = new javax.swing.JPanel();
        txtMatKhau = new javax.swing.JPasswordField();
        lblShow = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnSlide = new javax.swing.JPanel();
        lblPoster = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ShoesSys StartUp - Đăng Nhập");
        setAutoRequestFocus(false);

        pn1.setBackground(new java.awt.Color(204, 255, 255));
        pn1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pn2.setBackground(new java.awt.Color(255, 255, 255));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_2.png"))); // NOI18N

        Remember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Remember.setText("Nhớ mật khẩu");

        btnDangNhap.setBackground(new java.awt.Color(51, 102, 255));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseExited(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 51, 51));
        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThoatMouseExited(evt);
            }
        });
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblQuenMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        lblQuenMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuenMatKhau.setText("Quên mật khẩu ?");
        lblQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseExited(evt);
            }
        });

        pn3.setBackground(new java.awt.Color(255, 255, 255));
        pn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtTenDangNhap2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenDangNhap2.setForeground(new java.awt.Color(204, 204, 255));
        txtTenDangNhap2.setText("Tên Đăng Nhập");
        txtTenDangNhap2.setBorder(null);
        txtTenDangNhap2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenDangNhap2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenDangNhap2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(txtTenDangNhap2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtTenDangNhap2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn4.setBackground(new java.awt.Color(255, 255, 255));
        pn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(204, 204, 255));
        txtMatKhau.setText("Mật Khẩu");
        txtMatKhau.setBorder(null);
        txtMatKhau.setEchoChar('\u0000');
        txtMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusLost(evt);
            }
        });

        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblShow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblQuenMatKhau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Remember)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Remember)
                .addGap(18, 18, 18)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuenMatKhau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnSlide.setBackground(new java.awt.Color(204, 255, 255));
        pnSlide.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblPoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/poster.gif"))); // NOI18N

        javax.swing.GroupLayout pnSlideLayout = new javax.swing.GroupLayout(pnSlide);
        pnSlide.setLayout(pnSlideLayout);
        pnSlideLayout.setHorizontalGroup(
            pnSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSlideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnSlideLayout.setVerticalGroup(
            pnSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSlideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSlide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseClicked
        quenMatKhau();
    }//GEN-LAST:event_lblQuenMatKhauMouseClicked

    private void lblQuenMatKhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseEntered
        setColorLB(lblQuenMatKhau);
    }//GEN-LAST:event_lblQuenMatKhauMouseEntered

    private void lblQuenMatKhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseExited
        resetColorLB(lblQuenMatKhau);
    }//GEN-LAST:event_lblQuenMatKhauMouseExited

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        txtTenDangNhap2.setBackground(white);
        txtMatKhau.setBackground(white);
        if (Remember.isSelected()) {
            if (txtTenDangNhap2.getText().trim().length() > 0) {
                if (txtMatKhau.getPassword().length > 0) {
                    dangnhap();
                } else {
                    txtMatKhau.setBackground(pink);
                    MsgBoxHelper.alert(this, "Không được để trống mật khẩu");
                }
            } else {
                txtTenDangNhap2.setBackground(pink);
                MsgBoxHelper.alert(this, "Không được để trống tên đăng nhập");
            }
        }else{
            dangnhap();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        ketthuc();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        setColorBTN(btnDangNhap);
    }//GEN-LAST:event_btnDangNhapMouseEntered

    private void btnDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseExited
        resetColorBTN(btnDangNhap);
    }//GEN-LAST:event_btnDangNhapMouseExited

    private void btnThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseEntered
        setColorBTNE(btnThoat);
    }//GEN-LAST:event_btnThoatMouseEntered

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited
        resetColorBTNE(btnThoat);
    }//GEN-LAST:event_btnThoatMouseExited

    private void txtTenDangNhap2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenDangNhap2FocusGained
        if (txtTenDangNhap2.getText().equals("Tên Đăng Nhập")) {
            txtTenDangNhap2.setText(null);
            txtTenDangNhap2.requestFocus();
            removePlaceHolderStyle(txtTenDangNhap2);
        }
    }//GEN-LAST:event_txtTenDangNhap2FocusGained

    private void txtTenDangNhap2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenDangNhap2FocusLost
        if (txtTenDangNhap2.getText().length() == 0) {
            addPlaceHolderStyle(txtTenDangNhap2);
            txtTenDangNhap2.setText("Tên Đăng Nhập");
        }
    }//GEN-LAST:event_txtTenDangNhap2FocusLost

    private void txtMatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusGained
        if (txtMatKhau.getText().equals("Mật Khẩu")) {
            txtMatKhau.setText(null);
            txtMatKhau.requestFocus();
            txtMatKhau.setEchoChar('*');
            removePlaceHolderStyle(txtMatKhau);
            lblShow.setIcon(unshow);
        } else {
//            txtMatKhau.setEchoChar('*');
            lblShow.setIcon(unshow);
        }
    }//GEN-LAST:event_txtMatKhauFocusGained

    private void txtMatKhauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusLost
        if (txtMatKhau.getText().length() == 0) {
            addPlaceHolderStyle(txtMatKhau);
            txtMatKhau.setText("Mật Khẩu");
            txtMatKhau.setEchoChar('\u0000');
            lblShow.setIcon(null);
        } else {
            lblShow.setIcon(null);
        }
    }//GEN-LAST:event_txtMatKhauFocusLost

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        if (lblShow.getIcon() == null) {
            return;
        } else if (lblShow.getIcon() == show) {
            lblShow.setIcon(unshow);
            txtMatKhau.setEchoChar('*');
            return;
        } else if (lblShow.getIcon() == unshow) {
            lblShow.setIcon(show);
            txtMatKhau.setEchoChar('\u0000');
            return;
        }
    }//GEN-LAST:event_lblShowMouseClicked

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
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox Remember;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblPoster;
    private javax.swing.JLabel lblQuenMatKhau;
    private javax.swing.JLabel lblShow;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pnSlide;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap2;
    // End of variables declaration//GEN-END:variables
    private void init() {
        this.setLocationRelativeTo(null);
//        this.setIconImage(XImage.getAppIcon());
        this.setResizable(false);
        txtMatKhau.setEchoChar('\u0000');
        lblIcon.setIcon(logo);
        lblPoster.setIcon(poster);
    }
    void dangnhap(){
        String manv = txtTenDangNhap2.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        try {
            NhanVien nhanVien = dao.selectById(manv);
            if (nhanVien != null) { // nếu manv đúng
                String matKhau2 = nhanVien.getMatKhau();
                if (matKhau.equalsIgnoreCase(matKhau2)) { // nếu mật khẩu đúng
                    pref.put("Tên Đăng Nhập", manv);
                    pref.put("Mật Khẩu", matKhau);
                    ShareHelper.user = nhanVien;
                    MsgBoxHelper.alert(this, "Đăng nhập thành công!");
                    this.dispose();
                } else {
                    MsgBoxHelper.alert(this, "Sai mật khẩu!");
                }
            } else {
                MsgBoxHelper.alert(this, "Sai tên đăng nhập!");
            }
        } catch (Exception e) {
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void ketthuc(){
        if(MsgBoxHelper.confirm(this, "Bạn muốn kết thúc ứng dụng ?")){
            System.exit(0);
        }
    }
    
    void quenMatKhau(){
        this.dispose();
        new QuenMatKhauJFrame().setVisible(true);
    }
}
