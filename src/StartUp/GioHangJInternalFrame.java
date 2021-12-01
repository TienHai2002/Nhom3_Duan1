package StartUp;

import DAO.ChiTietHoaDonThanhToanDAO;
import DAO.HoaDonThanhToanDAO;
import DAO.KhachHangDAO;
import DAO.MauSPDAO;
import DAO.SanPhamDAO;
import DAO.SizeSPDAO;
import DAO.ThuongHieuDAO;
import helper.DateHelper;
import helper.MsgBoxHelper;
import helper.ShareHelper;
import helper.currency;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.ChiTietHoaDonThanhToan;
import model.HoaDonThanhToan;
import model.KhachHang;
import model.MauSanPham;
import model.SanPham;
import model.SizeSanPham;
import model.ThuongHieu;

public class GioHangJInternalFrame extends javax.swing.JInternalFrame {

    SanPhamDAO daosp = new SanPhamDAO();
    ThuongHieuDAO daoth = new ThuongHieuDAO();
    MauSPDAO daomau = new MauSPDAO();
    SizeSPDAO daosize = new SizeSPDAO();
    KhachHangDAO daokh = new KhachHangDAO();
    HoaDonThanhToanDAO daohd = new HoaDonThanhToanDAO();
    ChiTietHoaDonThanhToanDAO daoct = new ChiTietHoaDonThanhToanDAO();

    int index = 0;
    int index1 = 0;
    int row = -1;
    int soluong = 1;
    int dong;
    int check;
    int a;

    public GioHangJInternalFrame() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pn2 = new javax.swing.JPanel();
        btnThemVaoGio = new javax.swing.JButton();
        pn3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        pn4 = new javax.swing.JPanel();
        cboMau = new javax.swing.JComboBox<>();
        pn5 = new javax.swing.JPanel();
        cboSize = new javax.swing.JComboBox<>();
        pn6 = new javax.swing.JPanel();
        cboGia = new javax.swing.JComboBox<>();
        pn7 = new javax.swing.JPanel();
        txtSoLuong = new javax.swing.JTextField();
        btnTang = new javax.swing.JButton();
        btnGiam = new javax.swing.JButton();
        pn8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        pn9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnPreSP = new javax.swing.JButton();
        lblChiSoSP = new javax.swing.JLabel();
        btnNextSP = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cboThuongHieu = new javax.swing.JComboBox<>();
        btnXoa = new javax.swing.JButton();
        pn10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBangSP = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtTienThanhToan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDiemThuong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTongThanhToan = new javax.swing.JTextField();
        btnInHoaDon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDiemDangCo = new javax.swing.JTextField();
        cboDoiDiem = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pn11 = new javax.swing.JPanel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        DCNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Giỏ Hàng");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnThemVaoGio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThemVaoGio.setText("Thêm vào giỏ hàng");
        btnThemVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioActionPerformed(evt);
            }
        });

        pn3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Màu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboMau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMau.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMauItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pn5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Size", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSizeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pn6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giá", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboGia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGiaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pn6Layout = new javax.swing.GroupLayout(pn6);
        pn6.setLayout(pn6Layout);
        pn6Layout.setHorizontalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cboGia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn6Layout.setVerticalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pn7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số lượng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.setText("1");
        txtSoLuong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoLuongFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pn7Layout = new javax.swing.GroupLayout(pn7);
        pn7.setLayout(pn7Layout);
        pn7Layout.setHorizontalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pn7Layout.setVerticalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnTang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTang.setText("+");
        btnTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangActionPerformed(evt);
            }
        });

        btnGiam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGiam.setText("-");
        btnGiam.setEnabled(false);
        btnGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamActionPerformed(evt);
            }
        });

        pn8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Thương Hiệu", "Màu", "Size", "Đơn Giá", "Số Lượng", "Khuyến Mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGioHang);

        javax.swing.GroupLayout pn8Layout = new javax.swing.GroupLayout(pn8);
        pn8.setLayout(pn8Layout);
        pn8Layout.setHorizontalGroup(
            pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        pn8Layout.setVerticalGroup(
            pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pn9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Thương Hiệu", "Màu", "Size", "Giá", "Số Lượng", "Khuyến Mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tblSanPham);

        btnPreSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreSP.setText("<<");
        btnPreSP.setEnabled(false);
        btnPreSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreSPActionPerformed(evt);
            }
        });

        lblChiSoSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoSP.setText("1");

        btnNextSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextSP.setText(">>");
        btnNextSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn9Layout = new javax.swing.GroupLayout(pn9);
        pn9.setLayout(pn9Layout);
        pn9Layout.setHorizontalGroup(
            pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(pn9Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(btnPreSP)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoSP)
                .addGap(18, 18, 18)
                .addComponent(btnNextSP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn9Layout.setVerticalGroup(
            pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn9Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreSP)
                    .addComponent(lblChiSoSP)
                    .addComponent(btnNextSP)))
        );

        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thương Hiệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboThuongHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThuongHieu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThuongHieuItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThuongHieu, 0, 188, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThuongHieu)
        );

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(pn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(pn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addComponent(btnThanhToan)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGiam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTang)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemVaoGio)
                        .addGap(62, 62, 62))))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(pn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnThanhToan)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnThemVaoGio))
                        .addGap(14, 14, 14))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTang)
                            .addComponent(btnGiam)))
                    .addComponent(pn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tabs.addTab("Danh Sách", pn2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mã Hóa Đơn");

        txtMaHoaDon.setEditable(false);
        txtMaHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mã Nhân Viên");

        txtMaNhanVien.setEditable(false);
        txtMaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mã Khách Hàng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tên Khách Hàng");

        txtMaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblBangSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Màu", "Size", "Đơn Giá", "Khuyến Mãi", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblBangSP);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tiền Thanh Toán");

        txtTienThanhToan.setEditable(false);
        txtTienThanhToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Đổi Điểm");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Điểm Thưởng");

        txtDiemThuong.setEditable(false);
        txtDiemThuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tổng Thanh Toán");

        txtTongThanhToan.setEditable(false);
        txtTongThanhToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnInHoaDon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnInHoaDon.setText("In Hóa Đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Số Điện Thoại");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCheck.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Điểm đang có:");

        txtDiemDangCo.setEditable(false);
        txtDiemDangCo.setText("0");

        cboDoiDiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboDoiDiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDoiDiem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDoiDiemItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giới Tính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNu.setText("Nữ");

        javax.swing.GroupLayout pn11Layout = new javax.swing.GroupLayout(pn11);
        pn11.setLayout(pn11Layout);
        pn11Layout.setHorizontalGroup(
            pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn11Layout.createSequentialGroup()
                .addComponent(rdoNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(rdoNu)
                .addGap(2, 2, 2))
        );
        pn11Layout.setVerticalGroup(
            pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn11Layout.createSequentialGroup()
                .addGroup(pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Ngày Sinh");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Ghi Chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane4.setViewportView(txtGhiChu);

        javax.swing.GroupLayout pn10Layout = new javax.swing.GroupLayout(pn10);
        pn10.setLayout(pn10Layout);
        pn10Layout.setHorizontalGroup(
            pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(pn10Layout.createSequentialGroup()
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn10Layout.createSequentialGroup()
                                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtTongThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pn10Layout.createSequentialGroup()
                                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTienThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(26, 26, 26)
                                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDiemDangCo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboDoiDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn10Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInHoaDon)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(pn10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn10Layout.createSequentialGroup()
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn10Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pn10Layout.createSequentialGroup()
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn10Layout.createSequentialGroup()
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(pn10Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn10Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pn10Layout.createSequentialGroup()
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(pn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))
                    .addGroup(pn10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        pn10Layout.setVerticalGroup(
            pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn10Layout.createSequentialGroup()
                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaHoaDon)
                    .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn10Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(3, 3, 3)
                        .addComponent(txtEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn10Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn10Layout.createSequentialGroup()
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboDoiDiem)
                            .addComponent(txtDiemDangCo)
                            .addComponent(txtTienThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiemThuong)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnInHoaDon))
                            .addComponent(txtTongThanhToan, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(91, 91, 91))
                    .addGroup(pn10Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabs.addTab("Hóa Đơn", pn10);

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(330, 330, 330))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        fillTableSP(0);
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnPreSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreSPActionPerformed
        prePageSP();
        lblChiSoSP.setText(index + 1 + "");
    }//GEN-LAST:event_btnPreSPActionPerformed

    private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
        nextPageSP();
        lblChiSoSP.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextSPActionPerformed

    private void btnGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamActionPerformed
        giamSL();
        txtSoLuong.setText(soluong + "");
    }//GEN-LAST:event_btnGiamActionPerformed

    private void btnTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangActionPerformed
        tangSL();
        txtSoLuong.setText(soluong + "");
    }//GEN-LAST:event_btnTangActionPerformed

    private void btnThemVaoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioActionPerformed
        dong = tblSanPham.getSelectedRow();
        if (dong >= 0) {
            int j = 0;
            if (tblGioHang.getRowCount() == 0) {
                themGioHang();
            } else {
                for (int i = 0; i < tblGioHang.getRowCount(); i++) {
                    if (tblSanPham.getValueAt(dong, 0).equals(tblGioHang.getValueAt(i, 0))) {
                        int soluong = Integer.parseInt(txtSoLuong.getText()) + Integer.parseInt(tblGioHang.getValueAt(i, 6).toString());
                        if (soluong > Integer.parseInt(tblSanPham.getValueAt(dong, 6).toString())) {
                            MsgBoxHelper.alert(this, "Số lượng hàng còn ít, mời bạn giảm số lượng !!");
                            txtSoLuong.requestFocus();
                            txtSoLuong.setText("1");
                            return;
                        } else {
                            tblGioHang.setValueAt(soluong, i, 6);
                            j++;
                            txtSoLuong.setText("1");
                        }
                    }
                }
                if (j == 0) {
                    themGioHang();
                }
            }
        } else {
            MsgBoxHelper.alert(this, "Mời bạn chọn sản phẩm !!");
            return;
        }
    }//GEN-LAST:event_btnThemVaoGioActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        thanhToan();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void txtSoLuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongFocusLost
        checkSoLuong();
    }//GEN-LAST:event_txtSoLuongFocusLost

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xoaSP();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        checkSDT();
    }//GEN-LAST:event_btnCheckActionPerformed

    private void cboDoiDiemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDoiDiemItemStateChanged
        if (cboDoiDiem.getItemCount() > 1) {
            if (Integer.parseInt(cboDoiDiem.getSelectedItem().toString()) <= Integer.parseInt(txtDiemDangCo.getText())) {
                checkDiemThuong();
//                return;
            } else {
                MsgBoxHelper.alert(this, "Điểm thưởng không đủ để đổi !!");
                cboDoiDiem.setSelectedIndex(0);
//                return;
            }
        }
    }//GEN-LAST:event_cboDoiDiemItemStateChanged

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        checkFormKH();
        if (check == 1) {
            insertKhachHang();
            insertHoaDon();
            for (int i = 0; i < tblBangSP.getRowCount(); i++) {
                insertHDChiTiet(i);
            }
            for (int i = 0; i < tblBangSP.getRowCount(); i++) {
                capNhatSoLuong(i);
            }
            fillTableSP(0);
            tabs.setSelectedIndex(0);
            lblChiSoSP.setText(1+"");
            btnPreSP.setEnabled(false);
            btnNextSP.setEnabled(true);
            clearForm();
            MsgBoxHelper.alert(this, "Xuất hóa đơn thành công !!");
        }
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void cboThuongHieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThuongHieuItemStateChanged
        if (cboThuongHieu.getItemCount() > 1) {
            fillTableSP(0);
        }
    }//GEN-LAST:event_cboThuongHieuItemStateChanged

    private void cboMauItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMauItemStateChanged
        if (cboMau.getItemCount() > 1) {
            fillTableSP(0);
        }
    }//GEN-LAST:event_cboMauItemStateChanged

    private void cboSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSizeItemStateChanged
        if (cboSize.getItemCount() > 1) {
            fillTableSP(0);
        }
    }//GEN-LAST:event_cboSizeItemStateChanged

    private void cboGiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGiaItemStateChanged
        if (cboGia.getItemCount() > 1) {
            fillTableSP(0);
        }
    }//GEN-LAST:event_cboGiaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCNgaySinh;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnGiam;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnNextSP;
    private javax.swing.JButton btnPreSP;
    private javax.swing.JButton btnTang;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemVaoGio;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboDoiDiem;
    private javax.swing.JComboBox<String> cboGia;
    private javax.swing.JComboBox<String> cboMau;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JComboBox<String> cboThuongHieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblChiSoSP;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn10;
    private javax.swing.JPanel pn11;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JPanel pn6;
    private javax.swing.JPanel pn7;
    private javax.swing.JPanel pn8;
    private javax.swing.JPanel pn9;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblBangSP;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDiemDangCo;
    private javax.swing.JTextField txtDiemThuong;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTienThanhToan;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongThanhToan;
    // End of variables declaration//GEN-END:variables
    void init() {
//        this.setResizable(false);
        tabs.setSelectedIndex(0);
        fillComboBoxThuongHieu();
        fillComboBoxMau();
        fillComboBoxSize();
        fillComboBoxGia();
        this.fillTableSP(0);
//        chonThuongHieu();
        lblChiSoSP.setText(index + 1 + "");
//        this.row = -1;
//        updateStatus();
        DefaultTableModel mol_tbl = (DefaultTableModel) tblGioHang.getModel();
        mol_tbl.setRowCount(0);
        cboDoiDiem.removeAllItems();
        cboDoiDiem.addItem("0");
        cboDoiDiem.addItem("1000");
        cboDoiDiem.addItem("2000");
        cboDoiDiem.addItem("5000");
        cboDoiDiem.addItem("10000");
        cboDoiDiem.setSelectedIndex(0);
    }

    List<SanPham> listsp;
    List<ThuongHieu> listth;
    List<MauSanPham> listmau;
    List<SizeSanPham> listsize;
    List<KhachHang> listkh;
    List<HoaDonThanhToan> listhd;

    void fillComboBoxThuongHieu() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboThuongHieu.getModel();
        mol_cbo.removeAllElements();
        listth = daoth.selectAll();
        cboThuongHieu.addItem("ALL");
        for (ThuongHieu th : listth) {
            mol_cbo.addElement(th.getMaThuongHieu() + "-" + th.getTenThuongHieu());
        }
    }

    void fillComboBoxMau() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboMau.getModel();
        mol_cbo.removeAllElements();
        listmau = daomau.selectAll();
        cboMau.addItem("ALL");
        for (MauSanPham mau : listmau) {
            mol_cbo.addElement(mau.getTenMau());
        }
    }

    void fillComboBoxSize() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboSize.getModel();
        mol_cbo.removeAllElements();
        listsize = daosize.selectAll();
        cboSize.addItem("ALL");
        for (SizeSanPham sz : listsize) {
            mol_cbo.addElement(sz.getSize());
        }
    }

    void fillComboBoxGia() {
        cboGia.removeAllItems();
        cboGia.addItem("ALL");
        cboGia.addItem("0-500K");
        cboGia.addItem("500K-1M");
        cboGia.addItem("1M-2M");
        cboGia.addItem(">2M");
    }

    void fillTableSP(int index) {
        DefaultTableModel mol_tbl = (DefaultTableModel) tblSanPham.getModel();
        mol_tbl.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            String thuonghieu = "";
            String mau = "";
            String size = "";
            String giamin = "";
            String giamax = "";
            if (cboThuongHieu.getSelectedItem() == "ALL") {
                thuonghieu = "";
            } else {
                thuonghieu = listth.get(cboThuongHieu.getSelectedIndex() - 1).getMaThuongHieu();
            }
            if (cboMau.getSelectedItem() == "ALL") {
                mau = "";
            } else {
                mau = listmau.get(cboMau.getSelectedIndex() - 1).getTenMau();
            }
            if (cboSize.getSelectedItem() == "ALL") {
                size = "";
            } else {
                size = listsize.get(cboSize.getSelectedIndex() - 1).getSize() + "";
            }
            if (cboGia.getSelectedItem() == "ALL") {
                giamin = "0";
                giamax = "500000000";
            } else if (cboGia.getSelectedItem() == "0-500K") {
                giamin = "0";
                giamax = "500000";
            } else if (cboGia.getSelectedItem() == "500K-1M") {
                giamin = "500001";
                giamax = "1000000";
            } else if (cboGia.getSelectedItem() == "1M-2M") {
                giamin = "1000000";
                giamax = "2000000";
            } else {
                giamin = "2000001";
                giamax = "500000000";
            }
            List<SanPham> list = daosp.selectPage2(thuonghieu, mau, size, giamin, giamax, keyword, index);
            for (SanPham sp : list) {
                Object[] row = {sp.getMaSP(), sp.getTenSP(), sp.getMaThuongHieu(), sp.getMau(), sp.getSize(),
                    currency.toCurrency(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()};
                mol_tbl.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    List<SanPham> list = daosp.selectAll();
    double count = (list.size() / 6);

    void updatePageSP() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (tblSanPham.getRowCount() <= 4);
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
        if (index < count) {
            index++;
            fillTableSP(index);
            updatePageSP();
        }
    }

    void updateSL() {
        boolean count = (this.soluong >= 1);
        boolean fcount = (this.soluong == 1);
        btnGiam.setEnabled(count && !fcount);
    }

    void giamSL() {
        if (soluong > 1) {
            soluong--;
            updateSL();
        }
    }

    void tangSL() {
        soluong++;
        updateSL();
    }

    void themGioHang() {
        dong = tblSanPham.getSelectedRow();
        DefaultTableModel mol_tbl = (DefaultTableModel) tblGioHang.getModel();
        try {
            if (Integer.parseInt(txtSoLuong.getText()) > Integer.parseInt(tblSanPham.getValueAt(dong, 6).toString())) {
                MsgBoxHelper.alert(this, "Số lượng vượt quá so với số hàng !!");
                txtSoLuong.setText("1");
                return;
            } else {
                Object[] row = {tblSanPham.getValueAt(dong, 0), tblSanPham.getValueAt(dong, 1), tblSanPham.getValueAt(dong, 2),
                    tblSanPham.getValueAt(dong, 3), tblSanPham.getValueAt(dong, 4), tblSanPham.getValueAt(dong, 5),
                    txtSoLuong.getText(), tblSanPham.getValueAt(dong, 7)};
                mol_tbl.addRow(row);
                txtSoLuong.setText("1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void xoaSP() {
        dong = tblGioHang.getSelectedRow();
        DefaultTableModel mol_tbl = (DefaultTableModel) tblGioHang.getModel();
        mol_tbl.removeRow(dong);
    }

    void checkSoLuong() {
        int dongSP = tblSanPham.getSelectedRow() - 1;
        try {
            int a = Integer.parseInt(tblSanPham.getValueAt(dongSP, 6).toString());
            int soluong = Integer.parseInt(txtSoLuong.getText());
            if (soluong < 1) {
                MsgBoxHelper.alert(this, "Số lượng không được nhỏ hơn 1 !!");
                txtSoLuong.setText("1");
                return;
            } else {
                soluong = Integer.parseInt(txtSoLuong.getText());
                updateSL();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Số lượng phải là số !!");
            txtSoLuong.setText("1");
            return;
        }
    }

    void thanhToan() {
        tabs.setSelectedIndex(1);
        String kytu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String chuoi1 = "";
        String chuoi2 = "";
        int soluong = 6;
        Random rd = new Random();
        char[] text1 = new char[soluong];
        char[] text2 = new char[soluong];
        for (int i = 0; i < soluong; i++) {
            text1[i] = kytu.charAt(rd.nextInt(kytu.length()));
        }
        for (int i = 0; i < text1.length; i++) {
            chuoi1 += text1[i];
        }
        HoaDonThanhToan hd = daohd.selectById(DateHelper.toString(new java.util.Date(), "yyMMdd") + chuoi1);
        if (hd != null) {
            for (int i = 0; i < soluong; i++) {
                text1[i] = kytu.charAt(rd.nextInt(kytu.length()));
            }
            for (int i = 0; i < text1.length; i++) {
                chuoi1 += text1[i];
            }
            txtMaHoaDon.setText(DateHelper.toString(new java.util.Date(), "yyMMdd") + chuoi1);
            txtMaNhanVien.setText(ShareHelper.user.getMaNV());
            DefaultTableModel mol_tbl = (DefaultTableModel) tblBangSP.getModel();
            mol_tbl.setRowCount(0);
            for (int i = 0; i < tblGioHang.getRowCount(); i++) {
                Object[] row = {tblGioHang.getValueAt(i, 0), tblGioHang.getValueAt(i, 1), tblGioHang.getValueAt(i, 3),
                    tblGioHang.getValueAt(i, 4), tblGioHang.getValueAt(i, 5), tblGioHang.getValueAt(i, 7), tblGioHang.getValueAt(i, 6)};
                mol_tbl.addRow(row);
            }
            txtDiemThuong.setText("100");
            List<Double> tiensp = new ArrayList<>();
            double thanhtoan = 0;
            for (int i = 0; i < tblBangSP.getRowCount(); i++) {
                tiensp.add(currency.toInt(tblBangSP.getValueAt(i, 4).toString()) * (100 - (Double.parseDouble(tblBangSP.getValueAt(i, 5).toString().substring(0, 2)))) / 100);
                thanhtoan = thanhtoan + tiensp.get(i);
            }
            txtTienThanhToan.setText(currency.toCurrency(thanhtoan));
            txtTongThanhToan.setText(currency.toCurrency(thanhtoan));
        } else {
            for (int i = 0; i < soluong; i++) {
                text2[i] = kytu.charAt(rd.nextInt(kytu.length()));
            }
            for (int i = 0; i < text1.length; i++) {
                chuoi2 += text2[i];
            }
            txtMaHoaDon.setText(DateHelper.toString(new java.util.Date(), "yyMMdd") + chuoi2);
            txtMaNhanVien.setText(ShareHelper.user.getMaNV());
            DefaultTableModel mol_tbl = (DefaultTableModel) tblBangSP.getModel();
            mol_tbl.setRowCount(0);
            for (int i = 0; i < tblGioHang.getRowCount(); i++) {
                Object[] row = {tblGioHang.getValueAt(i, 0), tblGioHang.getValueAt(i, 1), tblGioHang.getValueAt(i, 3),
                    tblGioHang.getValueAt(i, 4), tblGioHang.getValueAt(i, 5), tblGioHang.getValueAt(i, 7), tblGioHang.getValueAt(i, 6)};
                mol_tbl.addRow(row);
            }
            txtDiemThuong.setText("100");
            List<Double> tiensp = new ArrayList<>();
            double thanhtoan = 0;
            for (int i = 0; i < tblBangSP.getRowCount(); i++) {
                tiensp.add(currency.toInt(tblBangSP.getValueAt(i, 4).toString()) * ((100 - (Double.parseDouble(tblBangSP.getValueAt(i, 5).toString().substring(0, 2)))) / 100) * Integer.parseInt(tblBangSP.getValueAt(i, 6).toString()));
                thanhtoan = thanhtoan + tiensp.get(i);
            }
            txtTienThanhToan.setText(currency.toCurrency(thanhtoan));
            txtTongThanhToan.setText(currency.toCurrency(thanhtoan));
        }
    }

    void checkDiemThuong() {
        if (cboDoiDiem.getSelectedItem().equals("0")) {
            txtTongThanhToan.setText(txtTienThanhToan.getText());
        } else if (cboDoiDiem.getSelectedItem().equals("1000")) {
            if (currency.toInt(txtTienThanhToan.getText()) > 500000) {
                txtTongThanhToan.setText(currency.toCurrency(currency.toInt(txtTienThanhToan.getText()) - 500000));
            } else {
                txtTienThanhToan.setText("0");
            }
        } else if (cboDoiDiem.getSelectedItem().equals("2000")) {
            if (currency.toInt(txtTienThanhToan.getText()) > 1000000) {
                txtTongThanhToan.setText(currency.toCurrency(currency.toInt(txtTienThanhToan.getText()) - 1000000));
            } else {
                txtTienThanhToan.setText("0");
            }
        } else if (cboDoiDiem.getSelectedItem().equals("5000")) {
            if (currency.toInt(txtTienThanhToan.getText()) > 3000000) {
                txtTongThanhToan.setText(currency.toCurrency(currency.toInt(txtTienThanhToan.getText()) - 3000000));
            } else {
                txtTienThanhToan.setText("0");
            }
        } else {
            if (currency.toInt(txtTienThanhToan.getText()) > 7000000) {
                txtTongThanhToan.setText(currency.toCurrency(currency.toInt(txtTienThanhToan.getText()) - 7000000));
            } else {
                txtTienThanhToan.setText("0");
            }
        }
    }

    void checkSDT() {
        try {
            KhachHang kh = daokh.selectBySDT(txtSDT.getText());
            if (kh != null) {
                txtMaKhachHang.setText(kh.getMaKH());
                txtTenKH.setText(kh.getTenKH());
                txtEmail.setText(kh.getEmail());
                rdoNam.setSelected(kh.isGioiTinh());
                rdoNu.setSelected(!kh.isGioiTinh());
                DCNgaySinh.setDate(DateHelper.toDate(kh.getNgaySinh(), "yyyy-MM-dd"));
                txtDiemDangCo.setText(kh.getDiemThuong() + "");
            } else {
                MsgBoxHelper.alert(this, "Không tìm thấy khách hàng !!");
                txtDiemDangCo.setText("0");
                cboDoiDiem.setSelectedIndex(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    HoaDonThanhToan getFormHD() {
        HoaDonThanhToan hd = new HoaDonThanhToan();
        hd.setMaHDThanhToan(txtMaHoaDon.getText());
        hd.setMaKH(txtMaKhachHang.getText());
        hd.setMaNV(txtMaNhanVien.getText());
        hd.setNgayThanhToan(DateHelper.toString(new java.util.Date(), "yyyy/MM/dd"));
        hd.setDiemThuong(Integer.parseInt(txtDiemThuong.getText()));
        hd.setDoiDiem(Integer.parseInt(cboDoiDiem.getSelectedItem().toString()));
        hd.setGhiChu(txtGhiChu.getText());
        return hd;
    }

    void insertHoaDon() {
        HoaDonThanhToan hd = getFormHD();
        try {
            daohd.insert(hd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    KhachHang getFormKH() {
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtMaKhachHang.getText());
        kh.setTenKH(txtTenKH.getText());
        kh.setGioiTinh(rdoNam.isSelected());
        kh.setGioiTinh(!rdoNu.isSelected());
        kh.setNgaySinh(DateHelper.toString(DCNgaySinh.getDate(), "yyyy-MM-dd"));
        kh.setsDT(txtSDT.getText());
        kh.setEmail(txtEmail.getText());
        kh.setDiemThuong(Integer.parseInt(txtDiemThuong.getText()));
        kh.setMaNV(ShareHelper.user.getMaNV());
        return kh;
    }

    void insertKhachHang() {
        KhachHang kh = getFormKH();
        KhachHang kh1 = daokh.selectById(txtMaKhachHang.getText());
        if (kh1 == null) {
            try {
                daokh.insert(kh);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                daokh.congDiem((Integer.parseInt(txtDiemDangCo.getText()) + 100), txtMaKhachHang.getText());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void checkFormKH() {
        if (txtMaKhachHang.getText().length() == 0) {
            MsgBoxHelper.alert(this, "Mã khách hàng không được để trống !!");
            txtMaKhachHang.requestFocus();
            check = 0;
            return;
        } else if (txtMaKhachHang.getText().length() > 10) {
            MsgBoxHelper.alert(this, "Mã khách hàng quá dài (<= 10 kí tự) !!");
            txtMaKhachHang.requestFocus();
            check = 0;
            return;
        } else if (txtTenKH.getText().length() == 0) {
            MsgBoxHelper.alert(this, "Tên khách hàng không được để trống !!");
            txtTenKH.requestFocus();
            check = 0;
            return;
        } else if (txtTenKH.getText().length() > 50) {
            MsgBoxHelper.alert(this, "Tên khách hàng quá dài !!");
            txtTenKH.requestFocus();
            check = 0;
            return;
        } else if (txtTenKH.getText().matches("[a-zA-Z ]+")) {
            MsgBoxHelper.alert(this, "Tên khách hàng không được chưa số !!");
            txtTenKH.requestFocus();
            check = 0;
            return;
        } else if (!txtSDT.getText().matches("^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$")) {
            MsgBoxHelper.alert(this, "Số Điện Thoại không đúng định dạng !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        } else if (txtSDT.getText().length() == 0) {
            MsgBoxHelper.alert(this, "Số Điện Thoại không được để trống !!");
            txtSDT.requestFocus();
            check = 0;
            return;
        } else {
            check = 1;
        }
    }
    
    void capNhatSoLuong(int b){
        try {
            daosp.capNhatSoLuong(Integer.parseInt(tblBangSP.getValueAt(b, 6).toString()), tblBangSP.getValueAt(b, 0).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    ChiTietHoaDonThanhToan getFormCT(int a) {
        ChiTietHoaDonThanhToan ct = new ChiTietHoaDonThanhToan();
        ct.setMaHD(txtMaHoaDon.getText());
        ct.setMaSP(tblBangSP.getValueAt(a, 0).toString());
        ct.setTenSP(tblBangSP.getValueAt(a, 1).toString());
        ct.setMau(tblBangSP.getValueAt(a, 2).toString());
        ct.setSize(Integer.parseInt(tblBangSP.getValueAt(a, 3).toString()));
        ct.setDonGia(currency.toInt(tblBangSP.getValueAt(a, 4).toString()));
        ct.setSoLuong(Integer.parseInt(tblBangSP.getValueAt(a, 6).toString()));
        ct.setKhuyenMai(tblBangSP.getValueAt(a, 5).toString());
        return ct;
    }

    void insertHDChiTiet(int a) {
        ChiTietHoaDonThanhToan cthd = getFormCT(a);
        try {
            daoct.insert(cthd);
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Xuất hóa đơn thất bại !!");
        }
    }

    void clearForm() {
        DefaultTableModel mol_tbl = (DefaultTableModel) tblGioHang.getModel();
        mol_tbl.setRowCount(0);
        txtMaHoaDon.setText("");
        txtMaNhanVien.setText("");
        txtMaKhachHang.setText("");
        txtSDT.setText("");
        txtTenKH.setText("");
        txtEmail.setText("");
        DCNgaySinh.setDate(null);
        DefaultTableModel mol_tbl1 = (DefaultTableModel) tblBangSP.getModel();
        mol_tbl1.setRowCount(0);
        txtTienThanhToan.setText("");
        txtDiemDangCo.setText("0");
        cboDoiDiem.setSelectedIndex(0);
        txtGhiChu.setText("");
        txtDiemThuong.setText("");
        txtTongThanhToan.setText("");
    }

}
