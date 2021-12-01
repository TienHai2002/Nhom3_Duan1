package StartUp;

import DAO.KhachHangDAO;
import DAO.NhaCungCapDAO;
import DAO.NhanVienDAO;
import DAO.SanPhamDAO;
import helper.MsgBoxHelper;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import model.NhaCungCap;
import model.NhanVien;
import model.SanPham;

public class ThungRacJInternalFrame extends javax.swing.JInternalFrame {

    NhanVienDAO daonv = new NhanVienDAO();
    KhachHangDAO daokh = new KhachHangDAO();
    NhaCungCapDAO daoncc = new NhaCungCapDAO();
    SanPhamDAO daosp = new SanPhamDAO();
    int rownv = -1;
    int rowkh = -1;
    int rowncc = -1;
    int rowsp = -1;
    int index = 0;

    public ThungRacJInternalFrame(Color color) {
        initComponents();
        init();
        pn1.setBackground(color);
        pn2.setBackground(color);
        pn3.setBackground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        pn1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachNV = new javax.swing.JTable();
        lblChiSoNV = new javax.swing.JLabel();
        btnNextNV = new javax.swing.JButton();
        btnPreNV = new javax.swing.JButton();
        btnKhoiPhucNV = new javax.swing.JButton();
        pn2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachKH = new javax.swing.JTable();
        lblChiSoKH = new javax.swing.JLabel();
        btnNextKH = new javax.swing.JButton();
        btnPreKH = new javax.swing.JButton();
        btnKhoiPhucKH = new javax.swing.JButton();
        pn3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhSachNCC = new javax.swing.JTable();
        btnPreNCC = new javax.swing.JButton();
        lblChiSoNCC = new javax.swing.JLabel();
        btnNextNCC = new javax.swing.JButton();
        btnKhoiPhucNCC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnKhoiPhucSP = new javax.swing.JButton();
        lblChiSoSP = new javax.swing.JLabel();
        btnPreSP = new javax.swing.JButton();
        btnNextSP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setTitle("ShoesSys StartUp - Dữ Liệu Bỏ");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblDanhSachNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Số ĐT", "Ngày Sinh", "Giới Tính", "Vai Trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDanhSachNV);

        lblChiSoNV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoNV.setText("1");

        btnNextNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextNV.setText(">>");
        btnNextNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextNVActionPerformed(evt);
            }
        });

        btnPreNV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreNV.setText("<<");
        btnPreNV.setEnabled(false);
        btnPreNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreNVActionPerformed(evt);
            }
        });

        btnKhoiPhucNV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnKhoiPhucNV.setText("Khôi Phục");
        btnKhoiPhucNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(btnPreNV)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoNV)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(btnKhoiPhucNV)))
                .addContainerGap())
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreNV)
                    .addComponent(lblChiSoNV)
                    .addComponent(btnNextNV)
                    .addComponent(btnKhoiPhucNV))
                .addContainerGap())
        );

        tabs.addTab("Nhân Viên", pn1);

        tblDanhSachKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "SĐT", "Email", "Ngày Sinh", "Giới Tính", "Điểm", "Mã NV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDanhSachKH);

        lblChiSoKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoKH.setText("1");

        btnNextKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextKH.setText(">>");
        btnNextKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextKHActionPerformed(evt);
            }
        });

        btnPreKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreKH.setText("<<");
        btnPreKH.setEnabled(false);
        btnPreKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreKHActionPerformed(evt);
            }
        });

        btnKhoiPhucKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnKhoiPhucKH.setText("Khôi Phục");
        btnKhoiPhucKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnPreKH)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoKH)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(btnKhoiPhucKH)))
                .addContainerGap())
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreKH)
                    .addComponent(lblChiSoKH)
                    .addComponent(btnNextKH)
                    .addComponent(btnKhoiPhucKH))
                .addContainerGap())
        );

        tabs.addTab("Khách Hàng", pn2);

        tblDanhSachNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa Chỉ", "SĐT", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDanhSachNCC);

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

        btnKhoiPhucNCC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnKhoiPhucNCC.setText("Khôi Phục");
        btnKhoiPhucNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucNCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPreNCC)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoNCC)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextNCC)
                        .addGap(99, 99, 99)
                        .addComponent(btnKhoiPhucNCC)))
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreNCC)
                    .addComponent(lblChiSoNCC)
                    .addComponent(btnNextNCC)
                    .addComponent(btnKhoiPhucNCC))
                .addContainerGap())
        );

        tabs.addTab("Nhà Cung Cấp", pn3);

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Thương Hiệu", "Giá Bán", "Số Lượng", "Khuyến Mãi", "Chi Tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblSanPham);

        btnKhoiPhucSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnKhoiPhucSP.setText("Khôi Phục");
        btnKhoiPhucSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucSPActionPerformed(evt);
            }
        });

        lblChiSoSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoSP.setText("1");

        btnPreSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreSP.setText("<<");
        btnPreSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreSPActionPerformed(evt);
            }
        });

        btnNextSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextSP.setText(">>");
        btnNextSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPreSP)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoSP)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextSP)
                        .addGap(104, 104, 104)
                        .addComponent(btnKhoiPhucSP)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhoiPhucSP)
                    .addComponent(lblChiSoSP)
                    .addComponent(btnPreSP)
                    .addComponent(btnNextSP))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        tabs.addTab("Sản Phẩm", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Dữ Liệu Bỏ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhoiPhucNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucNCCActionPerformed
        khoiPhucNCC();
    }//GEN-LAST:event_btnKhoiPhucNCCActionPerformed

    private void btnKhoiPhucKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucKHActionPerformed
        khoiPhucKH();
    }//GEN-LAST:event_btnKhoiPhucKHActionPerformed

    private void btnKhoiPhucNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucNVActionPerformed
        khoiPhucNV();
    }//GEN-LAST:event_btnKhoiPhucNVActionPerformed

    private void btnPreNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreNVActionPerformed
        prePageNV();
    }//GEN-LAST:event_btnPreNVActionPerformed

    private void btnNextNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextNVActionPerformed
        nextPageNV();
    }//GEN-LAST:event_btnNextNVActionPerformed

    private void btnPreKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreKHActionPerformed
        prePageKH();
    }//GEN-LAST:event_btnPreKHActionPerformed

    private void btnNextKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextKHActionPerformed
        nextPageKH();
    }//GEN-LAST:event_btnNextKHActionPerformed

    private void btnPreNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreNCCActionPerformed
        prePageNCC();
    }//GEN-LAST:event_btnPreNCCActionPerformed

    private void btnNextNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextNCCActionPerformed
        nextPageNCC();
    }//GEN-LAST:event_btnNextNCCActionPerformed

    private void btnPreSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreSPActionPerformed
        prePageSP();
    }//GEN-LAST:event_btnPreSPActionPerformed

    private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
        nextPageSP();
    }//GEN-LAST:event_btnNextSPActionPerformed

    private void btnKhoiPhucSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucSPActionPerformed
        khoiPhucSP();
    }//GEN-LAST:event_btnKhoiPhucSPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKhoiPhucKH;
    private javax.swing.JButton btnKhoiPhucNCC;
    private javax.swing.JButton btnKhoiPhucNV;
    private javax.swing.JButton btnKhoiPhucSP;
    private javax.swing.JButton btnNextKH;
    private javax.swing.JButton btnNextNCC;
    private javax.swing.JButton btnNextNV;
    private javax.swing.JButton btnNextSP;
    private javax.swing.JButton btnPreKH;
    private javax.swing.JButton btnPreNCC;
    private javax.swing.JButton btnPreNV;
    private javax.swing.JButton btnPreSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblChiSoKH;
    private javax.swing.JLabel lblChiSoNCC;
    private javax.swing.JLabel lblChiSoNV;
    private javax.swing.JLabel lblChiSoSP;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhSachKH;
    private javax.swing.JTable tblDanhSachNCC;
    private javax.swing.JTable tblDanhSachNV;
    private javax.swing.JTable tblSanPham;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setResizable(false);
        tabs.setSelectedIndex(0);
        fillTableNV(0);
        fillTableKH(0);
        fillTableNCC(0);
        lblChiSoNV.setText(index + 1 + "");
        lblChiSoKH.setText(index + 1 + "");
        lblChiSoNCC.setText(index + 1 + "");
//        this.row = -1;
//        updateStatus();
    }

    void fillTableNV(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSachNV.getModel();
        mol.setRowCount(0);
        try {
            List<NhanVien> list = daonv.selectPageTrash(index);
            for (NhanVien nv : list) {
                Object[] row = {nv.getMaNV(), nv.getTenNV(), nv.getsDT(), nv.getNgaySinh(),
                    nv.isGioiTinh() ? "Nam" : "Nữ", nv.isVaiTro() ? "Quản Lý" : "Nhân Viên"};
                mol.addRow(row);
            }
            lblChiSoNV.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void fillTableKH(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSachKH.getModel();
        mol.setRowCount(0);
        try {
            List<KhachHang> listkh = daokh.selectPageTrash(index);
            for (KhachHang kh : listkh) {
                Object[] row = {kh.getMaKH(), kh.getTenKH(), kh.getsDT(), kh.getEmail(), kh.getNgaySinh(),
                    kh.isGioiTinh() ? "Nam" : "Nữ", kh.getDiemThuong(), kh.getMaNV()};
                mol.addRow(row);
            }
            lblChiSoKH.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void fillTableNCC(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSachNCC.getModel();
        mol.setRowCount(0);
        try {
            List<NhaCungCap> listncc = daoncc.selectPageTrash(index);
            for (NhaCungCap ncc : listncc) {
                Object[] row = {ncc.getMaNCC(), ncc.getTenNCC(), ncc.getDiaChi(), ncc.getsDT(), ncc.getEmail()};
                mol.addRow(row);
            }
            lblChiSoNCC.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }
    
    void fillTableSP(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSachNCC.getModel();
        mol.setRowCount(0);
        try {
            List<SanPham> listsp = daosp.selectPageTrash(index);
            for (SanPham sp : listsp) {
                Object[] row = {sp.getMaSP(), sp.getTenSP(), sp.getMaThuongHieu(), sp.getDonGia(), sp.getSoLuong(),
                sp.getMaKM(), sp.getChiTiet()};
                mol.addRow(row);
            }
            lblChiSoSP.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void khoiPhucNV() {
        try {
            rownv = tblDanhSachNV.getSelectedRow();
            daonv.khoiphuc(tblDanhSachNV.getValueAt(rownv, 0).toString());
            this.fillTableNV(0);
            MsgBoxHelper.alert(this, "Khôi Phục thành công !!");
            lblChiSoNV.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Khôi Phục thất bại !!");
        }
    }

    void khoiPhucKH() {
        try {
            rowkh = tblDanhSachKH.getSelectedRow();
            daokh.khoiphuc(tblDanhSachKH.getValueAt(rowkh, 0).toString());
            this.fillTableKH(0);
            MsgBoxHelper.alert(this, "Khôi Phục thành công !!");
            lblChiSoKH.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Khôi Phục thất bại !!");
        }
    }

    void khoiPhucNCC() {
        try {
            rowncc = tblDanhSachNCC.getSelectedRow();
            daoncc.khoiphuc(tblDanhSachNCC.getValueAt(rowncc, 0).toString());
            this.fillTableNCC(0);
            MsgBoxHelper.alert(this, "Khôi Phục thành công !!");
            lblChiSoNCC.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Khôi Phục thất bại !!");
        }
    }
    
    void khoiPhucSP() {
        try {
            rowsp = tblSanPham.getSelectedRow();
            daosp.khoiphuc(tblSanPham.getValueAt(rowsp, 0).toString());
            this.fillTableSP(0);
            MsgBoxHelper.alert(this, "Khôi Phục thành công !!");
            lblChiSoSP.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Khôi Phục thất bại !!");
        }
    }
    List<NhanVien> listnv = daonv.selectAllTrash();
    double countNV = (listnv.size() / 10);

    void updatePageNV() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (this.index == Math.round(countNV));
        btnNextNV.setEnabled(page && !lpage);
        btnPreNV.setEnabled(page && !fpage);
    }

    void prePageNV() {
        if (index > 0) {
            index--;
            fillTableNV(index);
            updatePageNV();
        }
    }

    void nextPageNV() {
        if (index < countNV) {
            index++;
            fillTableNV(index);
            updatePageNV();
        }
    }

    List<KhachHang> listkh = daokh.selectAllTrash();
    double countKH = (listkh.size() / 10);

    void updatePageKH() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (this.index == Math.round(countKH));
        btnNextKH.setEnabled(page && !lpage);
        btnPreKH.setEnabled(page && !fpage);
    }

    void prePageKH() {
        if (index > 0) {
            index--;
            fillTableKH(index);
            updatePageKH();
        }
    }

    void nextPageKH() {
        if (index < countKH) {
            index++;
            fillTableKH(index);
            updatePageKH();
        }
    }
    
    List<NhaCungCap> listncc = daoncc.selectAllTrash();
    double countNCC = (listncc.size() / 10);

    void updatePageNCC() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (this.index == Math.round(countNCC));
        btnNextNCC.setEnabled(page && !lpage);
        btnPreNCC.setEnabled(page && !fpage);
    }

    void prePageNCC() {
        if (index > 0) {
            index--;
            fillTableNCC(index);
            updatePageNCC();
        }
    }

    void nextPageNCC() {
        if (index < countNCC) {
            index++;
            fillTableNCC(index);
            updatePageNCC();
        }
    }
    
    List<SanPham> listsp = daosp.selectAllTrash();
    double countSP = (listsp.size() / 15);

    void updatePageSP() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (this.index == Math.round(countSP));
        btnNextSP.setEnabled(page && !lpage);
        btnPreSP.setEnabled(page && !fpage);
    }

    void prePageSP() {
        if (index > 0) {
            index--;
            fillTableSP(index);
            updatePageSP();
        }
    }

    void nextPageSP() {
        if (index < countSP) {
            index++;
            fillTableSP(index);
            updatePageSP();
        }
    }
}
