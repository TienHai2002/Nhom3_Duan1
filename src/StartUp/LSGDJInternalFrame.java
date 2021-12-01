package StartUp;

import DAO.ChiTietHoaDonThanhToanDAO;
import DAO.HoaDonThanhToanDAO;
import DAO.KhachHangDAO;
import helper.DateHelper;
import helper.MsgBoxHelper;
import helper.currency;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ChiTietHoaDonThanhToan;
import model.HoaDonThanhToan;

public class LSGDJInternalFrame extends javax.swing.JInternalFrame {

    HoaDonThanhToanDAO daott = new HoaDonThanhToanDAO();
    ChiTietHoaDonThanhToanDAO daoct = new ChiTietHoaDonThanhToanDAO();
    KhachHangDAO daokh = new KhachHangDAO();
    int row = -1;
    int row1 = -1;
    int index = 0;

    public LSGDJInternalFrame(Color color) {
        initComponents();
        init();
        pn2.setBackground(color);
        pn1.setBackground(color);
        pn3.setBackground(color);
        pn4.setBackground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn5 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pn1 = new javax.swing.JPanel();
        pn3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnPreHD = new javax.swing.JButton();
        btnNextHD = new javax.swing.JButton();
        lblChiSoHD = new javax.swing.JLabel();
        btnXuatHD = new javax.swing.JButton();
        DCNgayBD = new com.toedter.calendar.JDateChooser();
        DCNgayKetThuc = new com.toedter.calendar.JDateChooser();
        btnLoc = new javax.swing.JButton();
        pn2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        pn4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDiemThuong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNgayThanhToan = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDiemDoi = new javax.swing.JTextField();
        btnTraHang = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setTitle("ShoesSys StartUp - Lịch Sử Giao Dịch");

        pn5.setBackground(new java.awt.Color(255, 204, 204));

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn1.setBackground(new java.awt.Color(0, 153, 102));

        pn3.setBackground(new java.awt.Color(0, 153, 102));
        pn3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ngày Bắt Đầu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày Kết Thúc");

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "Ngày Thanh Toán", "Điểm Thưởng", "Đổi Điểm", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        btnPreHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreHD.setText("<<");
        btnPreHD.setEnabled(false);
        btnPreHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreHDActionPerformed(evt);
            }
        });

        btnNextHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextHD.setText(">>");
        btnNextHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextHDActionPerformed(evt);
            }
        });

        lblChiSoHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoHD.setText("1");

        btnXuatHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXuatHD.setText("Xuất hóa đơn");
        btnXuatHD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
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
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                            .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DCNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DCNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLoc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnPreHD)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoHD)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextHD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(DCNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DCNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreHD)
                    .addComponent(btnNextHD)
                    .addComponent(lblChiSoHD)
                    .addComponent(btnXuatHD))
                .addContainerGap())
        );

        tabs.addTab("Danh Sách Thanh Toán", pn1);

        pn2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mã Hóa Đơn");

        txtMaHoaDon.setEditable(false);
        txtMaHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mã Khách Hàng");

        txtMaKhachHang.setEditable(false);
        txtMaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn4.setBackground(new java.awt.Color(255, 204, 204));
        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Màu", "Size", "Đơn Giá", "Số Lượng", "Khuyến Mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Mã Nhân Viên");

        txtMaNhanVien.setEditable(false);
        txtMaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Điểm Thưởng");

        txtDiemThuong.setEditable(false);
        txtDiemThuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Ngày Thanh Toán");

        txtNgayThanhToan.setEditable(false);
        txtNgayThanhToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtGhiChu.setEditable(false);
        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Ghi Chú");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tổng Tiền");

        txtTongTien.setEditable(false);
        txtTongTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Điểm Đổi");

        txtDiemDoi.setEditable(false);
        txtDiemDoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTraHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTraHang.setText("Trả Hàng");
        btnTraHang.setEnabled(false);
        btnTraHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtMaHoaDon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTraHang)
                            .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiemDoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNgayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemDoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTraHang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Chi Tiết Thanh Toán", pn2);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Lịch Sử Giao Dịch");

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(215, 215, 215))
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        this.fillTableHD(0);
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblHoaDon.getSelectedRow();
            this.editHD();
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        this.row = tblSanPham.getSelectedRow();
        this.editSP();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnNextHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextHDActionPerformed
        nextPageHD();
        lblChiSoHD.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextHDActionPerformed

    private void btnPreHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreHDActionPerformed
        prePageHD();
        lblChiSoHD.setText(index + 1 + "");
    }//GEN-LAST:event_btnPreHDActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        int ngaybd;
        int ngaykt;
        if (DCNgayBD.getDate() == null) {
            ngaybd = 100101;
        } else {
            ngaybd = Integer.parseInt(DateHelper.toString(DCNgayBD.getDate(), "yyMMdd"));
        }
        if (DCNgayKetThuc.getDate() == null) {
            ngaykt = 990101;
        } else {
            ngaykt = Integer.parseInt(DateHelper.toString(DCNgayKetThuc.getDate(), "yyMMdd"));
        }
        if (ngaykt < ngaybd) {
            MsgBoxHelper.alert(this, "Ngày kết thúc phải nằm sau ngày bắt đầu !!");
            return;
        } else {
            fillTableHD(0);
            lblChiSoHD.setText(1 + "");
            btnNextHD.setEnabled(true);
            btnPreHD.setEnabled(false);
        }
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnTraHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraHangActionPerformed
        row = tblSanPham.getSelectedRow();
        row1 = tblHoaDon.getSelectedRow();
        if (tblSanPham.getRowCount() == 1) {
            if (tblSanPham.getValueAt(row, 5).toString().equals("1")) {
                traHang2(txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                truDiem(txtMaKhachHang.getText());
                voHieuHoa(txtMaHoaDon.getText());
                clearForm();
                fillTableHD(0);
            } else {
                int value = Integer.parseInt(MsgBoxHelper.prompt(this, "Xin mời nhập số lượng sản phẩm cần trả !!"));
                if (value > Integer.parseInt(tblSanPham.getValueAt(row, 5).toString())) {
                    MsgBoxHelper.alert(this, "Số lượng trả hàng không hợp lệ !!");
                } else if (value == Integer.parseInt(tblSanPham.getValueAt(row, 5).toString())) {
                    traHang2(txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                    truDiem(txtMaKhachHang.getText());
                    voHieuHoa(txtMaHoaDon.getText());
                    clearForm();
                    fillTableHD(0);
                } else {
                    traHang1(value, txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                    DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
                    mol.setRowCount(0);
                    try {
                        String mahd = tblHoaDon.getValueAt(row1, 0).toString();
                        List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
                        for (ChiTietHoaDonThanhToan ct : listct) {
                            Object[] row = {ct.getMaSP(), ct.getTenSP(), ct.getMau(), ct.getSize(), currency.toCurrency(ct.getDonGia()),
                                ct.getSoLuong(), ct.getKhuyenMai()};
                            mol.addRow(row);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
                    }
                    List<Double> tiensp = new ArrayList<>();
                    double thanhtoan = 0;
                    for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                        tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
                        thanhtoan = thanhtoan + tiensp.get(i);
                    }
                    txtTongTien.setText(currency.toCurrency(thanhtoan));
                }
            }
        } else {
            if (tblSanPham.getValueAt(row, 5).toString().equals("1")) {
                traHang2(txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
                mol.setRowCount(0);
                try {
                    String mahd = tblHoaDon.getValueAt(row1, 0).toString();
                    List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
                    for (ChiTietHoaDonThanhToan ct : listct) {
                        Object[] row = {ct.getMaSP(), ct.getTenSP(), ct.getMau(), ct.getSize(), currency.toCurrency(ct.getDonGia()),
                            ct.getSoLuong(), ct.getKhuyenMai()};
                        mol.addRow(row);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
                }
                List<Double> tiensp = new ArrayList<>();
                double thanhtoan = 0;
                for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                    tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
                    thanhtoan = thanhtoan + tiensp.get(i);
                }
                txtTongTien.setText(currency.toCurrency(thanhtoan));
            } else {
                int value = Integer.parseInt(MsgBoxHelper.prompt(this, "Xin mời nhập số lượng sản phẩm cần trả !!"));
                if (value > Integer.parseInt(tblSanPham.getValueAt(row, 5).toString())) {
                    MsgBoxHelper.alert(this, "Số lượng trả hàng không hợp lệ !!");
                } else if (value == Integer.parseInt(tblSanPham.getValueAt(row, 5).toString())) {
                    traHang2(txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                    DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
                    mol.setRowCount(0);
                    try {
                        String mahd = tblHoaDon.getValueAt(row1, 0).toString();
                        List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
                        for (ChiTietHoaDonThanhToan ct : listct) {
                            Object[] row = {ct.getMaSP(), ct.getTenSP(), ct.getMau(), ct.getSize(), currency.toCurrency(ct.getDonGia()),
                                ct.getSoLuong(), ct.getKhuyenMai()};
                            mol.addRow(row);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
                    }
                    List<Double> tiensp = new ArrayList<>();
                    double thanhtoan = 0;
                    for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                        tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
                        thanhtoan = thanhtoan + tiensp.get(i);
                    }
                    txtTongTien.setText(currency.toCurrency(thanhtoan));
                } else {
                    traHang1(value, txtMaHoaDon.getText(), tblSanPham.getValueAt(row, 0).toString());
                    DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
                    mol.setRowCount(0);
                    try {
                        String mahd = tblHoaDon.getValueAt(row1, 0).toString();
                        List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
                        for (ChiTietHoaDonThanhToan ct : listct) {
                            Object[] row = {ct.getMaSP(), ct.getTenSP(), ct.getMau(), ct.getSize(), currency.toCurrency(ct.getDonGia()),
                                ct.getSoLuong(), ct.getKhuyenMai()};
                            mol.addRow(row);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
                    }
                    List<Double> tiensp = new ArrayList<>();
                    double thanhtoan = 0;
                    for (int i = 0; i < tblSanPham.getRowCount(); i++) {
                        tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
                        thanhtoan = thanhtoan + tiensp.get(i);
                    }
                    txtTongTien.setText(currency.toCurrency(thanhtoan));
                }
            }
        }
    }//GEN-LAST:event_btnTraHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCNgayBD;
    private com.toedter.calendar.JDateChooser DCNgayKetThuc;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnNextHD;
    private javax.swing.JButton btnPreHD;
    private javax.swing.JButton btnTraHang;
    private javax.swing.JButton btnXuatHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChiSoHD;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDiemDoi;
    private javax.swing.JTextField txtDiemThuong;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtNgayThanhToan;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
    void init() {
        tabs.setSelectedIndex(0);
        this.fillTableHD(0);
        lblChiSoHD.setText(index + 1 + "");
        this.row = -1;
        editSP();
    }

    List<HoaDonThanhToan> listtt;

    void fillTableHD(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblHoaDon.getModel();
        mol.setRowCount(0);
        try {
            String key = txtTimKiem.getText();
            String ngaybd = "";
            String ngaykt = "";
            if (DCNgayBD.getDate() == null) {
                ngaybd = "19000101";
            } else {
                ngaybd = DateHelper.toString(DCNgayBD.getDate(), "yyyy-MM-dd");
            }
            if (DCNgayKetThuc.getDate() == null) {
                ngaykt = "21000101";
            } else {
                ngaykt = DateHelper.toString(DCNgayKetThuc.getDate(), "yyyy-MM-dd");
            }
            List<HoaDonThanhToan> listtt = daott.selectPage(key, ngaybd, ngaykt, index);
            for (HoaDonThanhToan tt : listtt) {
                Object[] row = {tt.getMaHDThanhToan(), tt.getMaKH(), tt.getMaNV(),
                    tt.getNgayThanhToan(), tt.getDiemThuong(), tt.getDoiDiem(), tt.getGhiChu()};
                mol.addRow(row);
            }
            lblChiSoHD.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void editHD() {
        String matt = tblHoaDon.getValueAt(row, 0).toString();
        HoaDonThanhToan tt = daott.selectById(matt);
        setFormTT(tt);
        tabs.setSelectedIndex(1);
    }

    void setFormTT(HoaDonThanhToan tt) {
        row = tblHoaDon.getSelectedRow();
        txtMaHoaDon.setText(tt.getMaHDThanhToan());
        txtMaKhachHang.setText(tt.getMaKH());
        txtMaNhanVien.setText(tt.getMaNV());
        txtDiemThuong.setText(tt.getDiemThuong() + "");
        txtNgayThanhToan.setText(tt.getNgayThanhToan());
        txtDiemDoi.setText(tt.getDoiDiem() + "");
        DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
        mol.setRowCount(0);
        try {
            String mahd = tblHoaDon.getValueAt(row, 0).toString();
            List<ChiTietHoaDonThanhToan> listct = daoct.selectPage(mahd);
            for (ChiTietHoaDonThanhToan ct : listct) {
                Object[] row = {ct.getMaSP(), ct.getTenSP(), ct.getMau(), ct.getSize(), currency.toCurrency(ct.getDonGia()),
                    ct.getSoLuong(), ct.getKhuyenMai()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
        List<Double> tiensp = new ArrayList<>();
        double thanhtoan = 0;
        for (int i = 0; i < tblSanPham.getRowCount(); i++) {
            tiensp.add(currency.toInt(tblSanPham.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblSanPham.getValueAt(i, 6).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblSanPham.getValueAt(i, 5).toString()));
            thanhtoan = thanhtoan + tiensp.get(i);
        }
        txtTongTien.setText(currency.toCurrency(thanhtoan));
    }

    void editSP() {
        boolean edit = (this.row >= 0);
        btnTraHang.setEnabled(edit);
    }

    List<HoaDonThanhToan> list = daott.selectAll();
    double count = (list.size() / 15);

    void updatePageHD() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (tblHoaDon.getRowCount() <= 13);
        btnNextHD.setEnabled(page && !lpage);
        btnPreHD.setEnabled(page && !fpage);
    }

    void prePageHD() {
        if (index > 0) {
            index--;
            fillTableHD(index);
            updatePageHD();
        }
    }

    void nextPageHD() {
        if (index < count) {
            index++;
            fillTableHD(index);
            updatePageHD();
        }
    }

    void traHang1(int soluong, String mact, String masp) {
        try {
            daoct.traHang1(soluong, mact, masp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void traHang2(String mact, String masp) {
        try {
            daoct.traHang2(mact, masp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void clearForm() {
        txtMaHoaDon.setText("");
        txtMaKhachHang.setText("");
        txtMaNhanVien.setText("");
        txtNgayThanhToan.setText("");
        txtDiemDoi.setText("");
        txtDiemThuong.setText("");
        txtTongTien.setText("");
        txtGhiChu.setText("");
        DefaultTableModel mol = (DefaultTableModel) tblSanPham.getModel();
        mol.setRowCount(0);
    }

    void truDiem(String makh) {
        try {
            daokh.truDiem(makh);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void voHieuHoa(String mahd){
        try {
            daott.vohieuhoa(mahd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
