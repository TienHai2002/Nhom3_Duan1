package StartUp;

import DAO.ChiTietHoaDonNhapHangDAO;
import DAO.NhaCungCapDAO;
import model.NhaCungCap;
import helper.MsgBoxHelper;
import helper.currency;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.ChiTietHoaDonNhapHang;

public class NhaCungCapJInternalFrame extends javax.swing.JInternalFrame {

    NhaCungCapDAO dao = new NhaCungCapDAO();
    ChiTietHoaDonNhapHangDAO daohd = new ChiTietHoaDonNhapHangDAO();
    int row = -1;
    int index = 0;
    int index1 = 0;
    int check;

    public NhaCungCapJInternalFrame(Color color) {
        initComponents();
        init();
        pn2.setBackground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn2 = new javax.swing.JPanel();
        txtMaNCC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnVoHieuHoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        pn3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnPreNCC = new javax.swing.JButton();
        lblChiSoNCC = new javax.swing.JLabel();
        btnNextNCC = new javax.swing.JButton();
        pn4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnPreSP = new javax.swing.JButton();
        btnNextSP = new javax.swing.JButton();
        lblChiSoSP = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("ShoesSys StartUp - Quản Lí Nhà Cung Cấp");

        pn1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Nhà Cung Cấp");

        txtMaNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã Nhà Cung Cấp");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Địa Chỉ");

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("SĐT");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tên Nhà Cung Cấp");

        txtTenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Email");

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnVoHieuHoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVoHieuHoa.setText("Vô Hiệu Hóa");
        btnVoHieuHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoHieuHoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPre.setText("<<");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        pn3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhà Cung Cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa Chỉ", "Số Điện Thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSach);

        btnPreNCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreNCC.setText("<<");
        btnPreNCC.setEnabled(false);
        btnPreNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreNCCActionPerformed(evt);
            }
        });

        lblChiSoNCC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoNCC.setText("1");

        btnNextNCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextNCC.setText(">>");
        btnNextNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextNCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addGroup(pn3Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnPreNCC)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoNCC)
                .addGap(18, 18, 18)
                .addComponent(btnNextNCC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreNCC)
                    .addComponent(btnNextNCC)
                    .addComponent(lblChiSoNCC)))
        );

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Thương Hiệu", "Mã SP", "Tên SP", "Giá Nhập", "Ngày Nhập", "Số Lượng", "Nhân Viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        btnPreSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreSP.setText("<<");
        btnPreSP.setEnabled(false);
        btnPreSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreSPActionPerformed(evt);
            }
        });

        btnNextSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextSP.setText(">>");
        btnNextSP.setEnabled(false);
        btnNextSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSPActionPerformed(evt);
            }
        });

        lblChiSoSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoSP.setText("1");

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(pn4Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnPreSP)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoSP)
                .addGap(18, 18, 18)
                .addComponent(btnNextSP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPreSP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNextSP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblChiSoSP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaNCC))
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail))
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast)
                    .addComponent(btnNext)
                    .addComponent(btnPre)
                    .addComponent(btnFirst))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreNCCActionPerformed
        prePage();
        lblChiSoNCC.setText(index + 1 + "");
    }//GEN-LAST:event_btnPreNCCActionPerformed

    private void btnNextNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextNCCActionPerformed
        nextPage();
        lblChiSoNCC.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextNCCActionPerformed

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSach.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDanhSachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        checkFormInsert();
        if (check == 1) {
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        checkFormUpdate();
        if (check == 1) {
            update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnVoHieuHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoHieuHoaActionPerformed
        vohieuhoa();
    }//GEN-LAST:event_btnVoHieuHoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        prev();
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreSPActionPerformed
        prePageSP();
        lblChiSoSP.setText(index1 + 1 + "");
    }//GEN-LAST:event_btnPreSPActionPerformed

    private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
        nextPageSP();
        lblChiSoSP.setText(index1 + 1 + "");
    }//GEN-LAST:event_btnNextSPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextNCC;
    private javax.swing.JButton btnNextSP;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnPreNCC;
    private javax.swing.JButton btnPreSP;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnVoHieuHoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChiSoNCC;
    private javax.swing.JLabel lblChiSoSP;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setResizable(false);
        this.fillTable(0);
        lblChiSoNCC.setText(1 + "");
        this.row = -1;
        this.updateStatus();

        TableColumnModel mol = tblDanhSach.getColumnModel();
        mol.getColumn(0).setMaxWidth(70);
        mol.getColumn(1).setMaxWidth(170);
        mol.getColumn(2).setMaxWidth(120);
        mol.getColumn(3).setMaxWidth(100);
        mol.getColumn(4).setMaxWidth(110);
        tblDanhSach.setColumnModel(mol);
    }

    void fillTable(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSach.getModel();
        mol.setRowCount(0);
        try {
            List<NhaCungCap> listncc = dao.selectPage(index);
            for (NhaCungCap ncc : listncc) {
                Object[] row = {ncc.getMaNCC(), ncc.getTenNCC(), ncc.getDiaChi(), ncc.getsDT(), ncc.getEmail()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void fillTableSP(int index1) {
        row = tblDanhSach.getSelectedRow();
        DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
        mol.setRowCount(0);
        try {
            String maNCC = tblDanhSach.getValueAt(row, 0).toString();
            List<ChiTietHoaDonNhapHang> listhd = daohd.selectPage(maNCC, index1);
            for (ChiTietHoaDonNhapHang hd : listhd) {
                Object[] row = {hd.getThuongHieu(), hd.getMaSP(), hd.getTenSP(), currency.toCurrency(hd.getGiaNhap()), hd.getNgayNhap(),
                    hd.getSoLuong(), hd.getMaNV()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    List<NhaCungCap> list = dao.selectAll();
    double count = (list.size() / 5);

    void updatePage() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (tblDanhSach.getRowCount() <= 3);
        btnNextNCC.setEnabled(page && !lpage);
        btnPreNCC.setEnabled(page && !fpage);
    }

    void prePage() {
        if (index > 0) {
            index--;
            fillTable(index);
            updatePage();
        }
    }

    void nextPage() {
        if (index < count) {
            index++;
            fillTable(index);
            updatePage();
        }
    }

    List<ChiTietHoaDonNhapHang> listhd = daohd.selectAll();
    double countSP = (listhd.size() / 5);

    void updatePageSP() {
        boolean page = (this.index1 >= 0);
        boolean fpage = (this.index1 == 0);
        boolean lpage = (tblSanPham.getRowCount() <= 3);
        btnNextSP.setEnabled(page && !lpage);
        btnPreSP.setEnabled(page && !fpage);
    }

    void prePageSP() {
        if (index1 > 0) {
            index1--;
            fillTableSP(index1);
            updatePageSP();
        }
    }

    void nextPageSP() {
        if (index1 < countSP) {
            index1++;
            fillTableSP(index1);
            updatePageSP();
        }
    }

    void setForm(NhaCungCap ncc) {
        txtMaNCC.setText(ncc.getMaNCC());
        txtTenNCC.setText(ncc.getTenNCC());
        txtDiaChi.setText(ncc.getDiaChi());
        txtSDT.setText(ncc.getsDT());
        txtEmail.setText(ncc.getEmail());
    }

    NhaCungCap getForm() {
        NhaCungCap ncc = new NhaCungCap();
        ncc.setMaNCC(txtMaNCC.getText());
        ncc.setTenNCC(txtTenNCC.getText());
        ncc.setDiaChi(txtDiaChi.getText());
        ncc.setsDT(txtSDT.getText());
        ncc.setEmail(txtEmail.getText());
        return ncc;
    }

    void clearForm() {
        txtMaNCC.setText("");
        txtTenNCC.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
        mol.setRowCount(0);
        btnNextSP.setEnabled(false);
        btnPreSP.setEnabled(false);
        index1 = 1;
        lblChiSoSP.setText(index1 + "");
        this.row = -1;
        this.updateStatus();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDanhSach.getRowCount() - 1);
        //trạng thái form
        txtMaNCC.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnVoHieuHoa.setEnabled(edit);
        //trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPre.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void insert() {
        NhaCungCap ncc = getForm();
        try {
            dao.insert(ncc);
            this.fillTable(0);
            lblChiSoNCC.setText(1 + "");
            btnPreNCC.setEnabled(false);
            btnNextNCC.setEnabled(true);
            this.clearForm();
            MsgBoxHelper.alert(this, "Thêm mới thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Thêm mới thất bại !!");
        }
    }

    void update() {
        NhaCungCap ncc = getForm();
        try {
            dao.update(ncc);
            this.fillTable(0);
            lblChiSoNCC.setText(1 + "");
            btnPreNCC.setEnabled(false);
            btnNextNCC.setEnabled(true);
            MsgBoxHelper.alert(this, "Sửa thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Sửa thất bại !!");
        }
    }

    void vohieuhoa() {
        String mancc = txtMaNCC.getText();
        if (MsgBoxHelper.confirm(this, "Bạn thực sự muốn vô hiệu hóa nhà cung cấp này ?")) {
            try {
                dao.vohieuhoa(mancc);
                fillTable(0);
                lblChiSoNCC.setText(1 + "");
                btnPreNCC.setEnabled(false);
                btnNextNCC.setEnabled(true);
                clearForm();
                MsgBoxHelper.alert(this, "Vô hiệu hóa thành công !!");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBoxHelper.alert(this, "Vô hiệu hóa thất bại !!");
            }
        }
    }

    void edit() {
        String mancc = (String) tblDanhSach.getValueAt(row, 0);
        NhaCungCap ncc = dao.selectById(mancc);
        setForm(ncc);
        fillTableSP(0);
        updatePageSP();
        updateStatus();
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblDanhSach.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblDanhSach.getRowCount() - 1;
        this.edit();
    }

    void checkFormInsert() {
        NhaCungCap ncc = dao.selectById(txtMaNCC.getText());
        if (ncc != null) {
            MsgBoxHelper.alert(this, "Mã nhà cung cấp đã tồn tại !!");
            txtMaNCC.requestFocus();
            check = 0;
            return;
        } else if (txtMaNCC.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống mã nhà cung cấp !!");
            txtMaNCC.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtTenNCC.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống tên nhà cung cấp !!");
            txtTenNCC.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtSDT.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống số điện thoại nhà cung cấp !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
    }

    void checkFormUpdate() {
        NhaCungCap ncc = dao.selectById(txtMaNCC.getText());
        if (ncc == null) {
            MsgBoxHelper.alert(this, "Mã nhà cung cấp không tồn tại !!");
            txtMaNCC.requestFocus();
            check = 0;
            return;
        } else if (txtMaNCC.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống mã nhà cung cấp !!");
            txtMaNCC.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtTenNCC.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống tên nhà cung cấp !!");
            txtTenNCC.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
        if (txtSDT.getText().equals("")) {
            MsgBoxHelper.alert(this, "Không để trống số điện thoại nhà cung cấp !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
    }
}
