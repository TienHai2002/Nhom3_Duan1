package StartUp;

import DAO.KhuyenMaiDAO;
import DAO.MauSPDAO;
import DAO.NhaCungCapDAO;
import DAO.SanPhamDAO;
import DAO.SizeSPDAO;
import DAO.ThuongHieuDAO;
import helper.MsgBoxHelper;
import helper.XImage;
import helper.currency;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.KhuyenMai;
import model.MauSanPham;
import model.NhaCungCap;
import model.SanPham;
import model.SizeSanPham;
import model.ThuongHieu;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class SanPhamJInternalFrame extends javax.swing.JInternalFrame {

    SanPhamDAO daosp = new SanPhamDAO();
    ThuongHieuDAO daoth = new ThuongHieuDAO();
    MauSPDAO daomau = new MauSPDAO();
    SizeSPDAO daosize = new SizeSPDAO();
    KhuyenMaiDAO daokm = new KhuyenMaiDAO();
    NhaCungCapDAO daoncc = new NhaCungCapDAO();
    int row = -1;
    int index = 0;
    int index1 = 0;

    public SanPhamJInternalFrame(Color color) {
        initComponents();
        init();
        pn2.setBackground(color);
        pn5.setBackground(color);
        pn3.setBackground(color);
        pn4.setBackground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pn2 = new javax.swing.JPanel();
        pn3 = new javax.swing.JPanel();
        cboThuongHieuDS = new javax.swing.JComboBox<>();
        pn4 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnPreDS = new javax.swing.JButton();
        lblChiSoDS = new javax.swing.JLabel();
        btnNextDS = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        pn5 = new javax.swing.JPanel();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChiTietSP = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnVoHieuHoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        cboThuongHieuCT = new javax.swing.JComboBox<>();
        cboMauSacCT = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboSizeCT = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboKhuyenMai = new javax.swing.JComboBox<>();
        cboNhaCungCap = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        pn6 = new javax.swing.JPanel();
        pn7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThuongHieu = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtMaThuongHieu = new javax.swing.JTextField();
        lblChiSoBS = new javax.swing.JLabel();
        btnNextBS = new javax.swing.JButton();
        btnPreBS = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtTenThuongHieu = new javax.swing.JTextField();
        btnThemTH = new javax.swing.JButton();
        btnSuaTH = new javax.swing.JButton();
        btnVoHieuHoaTH = new javax.swing.JButton();
        btnMoiTH = new javax.swing.JButton();
        pn8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtTenMau = new javax.swing.JTextField();
        btnThemMau = new javax.swing.JButton();
        cboMauBS = new javax.swing.JComboBox<>();
        pn9 = new javax.swing.JPanel();
        cboSizeBS = new javax.swing.JComboBox<>();
        txtSize = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnThemSize = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("ShoesSys StartUp - Quản Lí Sản Phẩm");

        pn1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sản Phẩm");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thương Hiệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboThuongHieuDS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThuongHieuDS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThuongHieuDS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThuongHieuDSItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboThuongHieuDS, 0, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThuongHieuDS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addContainerGap())
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem)
        );

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên Sản Phẩm", "Giá Bán", "Số Lượng", "Khuyến Mãi", "Chi Tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        btnPreDS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreDS.setText("<<");
        btnPreDS.setEnabled(false);
        btnPreDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreDSActionPerformed(evt);
            }
        });

        lblChiSoDS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoDS.setText("1");

        btnNextDS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextDS.setText(">>");
        btnNextDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextDSActionPerformed(evt);
            }
        });

        btnXuatExcel.setText("Xuất báo cáo");
        btnXuatExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatExcelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn2Layout.createSequentialGroup()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnPreDS)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoDS)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextDS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(btnXuatExcel)))
                .addContainerGap())
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreDS)
                    .addComponent(lblChiSoDS)
                    .addComponent(btnNextDS)
                    .addComponent(btnXuatExcel))
                .addContainerGap())
        );

        tabs.addTab("Danh Sách", pn2);

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ảnh Sản Phẩm");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Thương Hiệu");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mã Sản Phẩm");

        txtMaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tên Sản Phẩm");

        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số Lượng");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Giá Bán");

        txtGiaBan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Chi Tiết Sản Phẩm");

        txtChiTietSP.setColumns(20);
        txtChiTietSP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtChiTietSP.setRows(5);
        jScrollPane2.setViewportView(txtChiTietSP);

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnVoHieuHoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoHieuHoa.setText("Vô Hiệu Hóa");
        btnVoHieuHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoHieuHoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        cboThuongHieuCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThuongHieuCT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThuongHieuCT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboThuongHieuCTItemStateChanged(evt);
            }
        });

        cboMauSacCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboMauSacCT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Màu Sắc");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Size");

        cboSizeCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboSizeCT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Khuyến Mãi");

        cboKhuyenMai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboNhaCungCap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Nhà Cung Cấp");

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGiaBan)
                                    .addGroup(pn5Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 184, Short.MAX_VALUE))))
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(cboMauSacCT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cboSizeCT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(cboKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSP)
                                    .addComponent(cboNhaCungCap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pn5Layout.createSequentialGroup()
                                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel7))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(128, 128, 128)
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn5Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel4))
                                    .addComponent(cboThuongHieuCT, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboNhaCungCap)
                            .addComponent(cboThuongHieuCT, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(7, 7, 7)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboMauSacCT, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(cboSizeCT)
                            .addComponent(cboKhuyenMai))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabs.addTab("Chi Tiết", pn5);

        pn7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thương Hiệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblThuongHieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Thương Hiệu", "Tên Thương Hiệu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThuongHieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThuongHieuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblThuongHieu);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Mã Thương Hiệu");

        txtMaThuongHieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblChiSoBS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoBS.setText("1");

        btnNextBS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextBS.setText(">>");
        btnNextBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextBSActionPerformed(evt);
            }
        });

        btnPreBS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreBS.setText("<<");
        btnPreBS.setEnabled(false);
        btnPreBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreBSActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Tên Thương Hiệu");

        txtTenThuongHieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnThemTH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemTH.setText("Thêm");
        btnThemTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTHActionPerformed(evt);
            }
        });

        btnSuaTH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaTH.setText("Sửa");
        btnSuaTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTHActionPerformed(evt);
            }
        });

        btnVoHieuHoaTH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoHieuHoaTH.setText("Vô Hiệu Hóa");
        btnVoHieuHoaTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoHieuHoaTHActionPerformed(evt);
            }
        });

        btnMoiTH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMoiTH.setText("Mới");
        btnMoiTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiTHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn7Layout = new javax.swing.GroupLayout(pn7);
        pn7.setLayout(pn7Layout);
        pn7Layout.setHorizontalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn7Layout.createSequentialGroup()
                .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn7Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnPreBS)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoBS)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextBS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn7Layout.createSequentialGroup()
                        .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenThuongHieu)
                            .addGroup(pn7Layout.createSequentialGroup()
                                .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 155, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn7Layout.createSequentialGroup()
                        .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThemTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSuaTH, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVoHieuHoaTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMoiTH, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        pn7Layout.setVerticalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn7Layout.createSequentialGroup()
                .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemTH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMoiTH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoHieuHoaTH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblChiSoBS)
                                .addComponent(btnNextBS)
                                .addComponent(btnPreBS))
                            .addComponent(btnSuaTH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Màu Sắc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tên Màu");

        txtTenMau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnThemMau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemMau.setText("Thêm");
        btnThemMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMauActionPerformed(evt);
            }
        });

        cboMauBS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMauBS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMauBSItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pn8Layout = new javax.swing.GroupLayout(pn8);
        pn8.setLayout(pn8Layout);
        pn8Layout.setHorizontalGroup(
            pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn8Layout.createSequentialGroup()
                .addGroup(pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn8Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel16))
                    .addGroup(pn8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboMauBS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(txtTenMau, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnThemMau, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn8Layout.setVerticalGroup(
            pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn8Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMauBS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenMau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemMau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Size", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboSizeBS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSizeBS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSizeBSItemStateChanged(evt);
            }
        });

        txtSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Size");

        btnThemSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemSize.setText("Thêm");
        btnThemSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn9Layout = new javax.swing.GroupLayout(pn9);
        pn9.setLayout(pn9Layout);
        pn9Layout.setHorizontalGroup(
            pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn9Layout.createSequentialGroup()
                .addComponent(cboSizeBS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnThemSize)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn9Layout.setVerticalGroup(
            pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn9Layout.createSequentialGroup()
                .addGroup(pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboSizeBS)
                    .addGroup(pn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSize, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(btnThemSize)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn6Layout = new javax.swing.GroupLayout(pn6);
        pn6.setLayout(pn6Layout);
        pn6Layout.setHorizontalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
        );
        pn6Layout.setVerticalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn6Layout.createSequentialGroup()
                .addComponent(pn7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tabs.addTab("Bổ Sung", pn6);

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboThuongHieuDSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThuongHieuDSItemStateChanged
        if (cboThuongHieuDS.getItemCount() > 1) {
            chonThuongHieu();
        }
    }//GEN-LAST:event_cboThuongHieuDSItemStateChanged

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        this.fillTableSP(0);
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSach.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDanhSachMouseClicked

    private void btnPreDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreDSActionPerformed
        prePageDS();
        lblChiSoDS.setText(index + 1 + "");
    }//GEN-LAST:event_btnPreDSActionPerformed

    private void btnNextDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDSActionPerformed
        nextPageDS();
        lblChiSoDS.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextDSActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        chonAnh();
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void cboThuongHieuCTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboThuongHieuCTItemStateChanged
        
    }//GEN-LAST:event_cboThuongHieuCTItemStateChanged

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        if (checkFormSP()) {
            insert();
//        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
//        if (checkFormSP()) {
            update();
//        }
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

    private void tblThuongHieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThuongHieuMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblThuongHieu.getSelectedRow();
            this.editTH();
        }
    }//GEN-LAST:event_tblThuongHieuMouseClicked

    private void btnPreBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreBSActionPerformed
        prePageTH();
        lblChiSoBS.setText(index1 + 1 + "");
    }//GEN-LAST:event_btnPreBSActionPerformed

    private void btnNextBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextBSActionPerformed
        nextPageTH();
        lblChiSoBS.setText(index1 + 1 + "");
    }//GEN-LAST:event_btnNextBSActionPerformed

    private void btnThemTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTHActionPerformed
        insertTH();
    }//GEN-LAST:event_btnThemTHActionPerformed

    private void btnSuaTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTHActionPerformed
        updateTH();
    }//GEN-LAST:event_btnSuaTHActionPerformed

    private void btnMoiTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiTHActionPerformed
        clearFormTH();
    }//GEN-LAST:event_btnMoiTHActionPerformed

    private void btnVoHieuHoaTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoHieuHoaTHActionPerformed
        vohieuhoaTH();
    }//GEN-LAST:event_btnVoHieuHoaTHActionPerformed

    private void btnThemMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMauActionPerformed
        insertMau();
    }//GEN-LAST:event_btnThemMauActionPerformed

    private void cboSizeBSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSizeBSItemStateChanged
        if (cboSizeBS.getItemCount() > 1) {
            txtSize.setText(cboSizeBS.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cboSizeBSItemStateChanged

    private void btnThemSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSizeActionPerformed
        insertSize();
    }//GEN-LAST:event_btnThemSizeActionPerformed

    private void cboMauBSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMauBSItemStateChanged
        if (cboMauBS.getItemCount() > 1) {
            txtTenMau.setText(cboMauBS.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cboMauBSItemStateChanged

    private void btnXuatExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMouseClicked
       XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sản phẩm");

        XSSFRow row = null;
        Cell cell = null;

        row = sheet.createRow((short) 2);
        row.setHeight((short) 500);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("STT");
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Mã sản phẩm");
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Mã thương hiệu");
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Tên sản phẩm");
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Giá bán");
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Số lượng");
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Ảnh sản phẩm");
        cell = row.createCell(7, CellType.STRING);
        cell.setCellValue("Chi tiết");
        cell = row.createCell(8, CellType.STRING);
        cell.setCellValue("Trạng thái");

        if (list != null) {
            FileOutputStream fis = null;
            try {
                int s = list.size();
                for (int i = 0; i < s; i++) {
                    SanPham sp1 = list.get(i);
                    row = sheet.createRow((short) 4 + i);
                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(sp1.getMaSP());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(sp1.getMaThuongHieu());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(sp1.getTenSP());

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(sp1.getDonGia());

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(sp1.getSoLuong());

                    cell = row.createCell(6, CellType.STRING);
                    cell.setCellValue(sp1.getAnhSP());

                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue(sp1.getChiTiet());

                    cell = row.createCell(9, CellType.STRING);
                    cell.setCellValue(sp1.isTrangThai());
                }
                //save file
                File f = new File("src/sanpham.xlsx");
                fis = new FileOutputStream(f);
                workbook.write(fis);
                fis.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnXuatExcelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnMoiTH;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextBS;
    private javax.swing.JButton btnNextDS;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnPreBS;
    private javax.swing.JButton btnPreDS;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaTH;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMau;
    private javax.swing.JButton btnThemSize;
    private javax.swing.JButton btnThemTH;
    private javax.swing.JButton btnVoHieuHoa;
    private javax.swing.JButton btnVoHieuHoaTH;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JComboBox<String> cboKhuyenMai;
    private javax.swing.JComboBox<String> cboMauBS;
    private javax.swing.JComboBox<String> cboMauSacCT;
    private javax.swing.JComboBox<String> cboNhaCungCap;
    private javax.swing.JComboBox<String> cboSizeBS;
    private javax.swing.JComboBox<String> cboSizeCT;
    private javax.swing.JComboBox<String> cboThuongHieuCT;
    private javax.swing.JComboBox<String> cboThuongHieuDS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblChiSoBS;
    private javax.swing.JLabel lblChiSoDS;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JPanel pn6;
    private javax.swing.JPanel pn7;
    private javax.swing.JPanel pn8;
    private javax.swing.JPanel pn9;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTable tblThuongHieu;
    private javax.swing.JTextArea txtChiTietSP;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMaThuongHieu;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMau;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTenThuongHieu;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    void init() {
//        this.setResizable(false);
        tabs.setSelectedIndex(0);
        fillComboBoxThuongHieuDS();
        fillComboBoxThuongHieuCT();
        fillComboBoxMauSacCT();
        fillComboBoxMauSacBS();
        fillComboBoxNCC();
        fillComboBoxSizeCT();
        fillComboBoxSizeBS();
        fillComboBoxKhuyenMai();
        this.fillTableSP(0);
        this.fillTableTH(0);
        lblChiSoDS.setText(index + 1 + "");
        lblChiSoBS.setText(index1 + 1 + "");
        this.row = -1;
        updateStatus();
        
        TableColumnModel mol_ds = tblDanhSach.getColumnModel();
        mol_ds.getColumn(0).setMaxWidth(100);
        mol_ds.getColumn(1).setMaxWidth(210);
        mol_ds.getColumn(2).setMaxWidth(100);
        mol_ds.getColumn(3).setMaxWidth(90);
        mol_ds.getColumn(4).setMaxWidth(80);
        mol_ds.getColumn(5).setMaxWidth(80);
        tblDanhSach.setColumnModel(mol_ds);
    }

    List<SanPham> listsp;
    List<ThuongHieu> listth;
    List<MauSanPham> listmau;
    List<SizeSanPham> listsize;
    List<KhuyenMai> listkm;
    List<NhaCungCap> listncc;

    void chonThuongHieu() {
        ThuongHieu th = listth.get(cboThuongHieuDS.getSelectedIndex());
        fillTableSP(0);
        this.row = -1;
        tabs.setSelectedIndex(0);
    }

    void fillComboBoxThuongHieuDS() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboThuongHieuDS.getModel();
        mol_cbo.removeAllElements();
        listth = daoth.selectAll();
        for (ThuongHieu th : listth) {
            mol_cbo.addElement(th.getMaThuongHieu()+"-"+th.getTenThuongHieu());
        }
    }

    List<SanPham> list = daosp.selectAll();
    double count = (list.size() / 20);
    
    void fillTableSP(int index) {
        DefaultTableModel mol_tbl = (DefaultTableModel) tblDanhSach.getModel();
        mol_tbl.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<SanPham> list = daosp.selectPage(listth.get(cboThuongHieuDS.getSelectedIndex()).getMaThuongHieu(),keyword,index);
            for (SanPham sp : list) {
                Object[] row = {sp.getMaSP(), sp.getTenSP(), currency.toCurrency(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM(), sp.getChiTiet()};
                mol_tbl.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }
    
    void updatePageDS() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (tblDanhSach.getRowCount() <= 18);
        btnNextDS.setEnabled(page && !lpage);
        btnPreDS.setEnabled(page && !fpage);
    }

    void prePageDS() {
        if (index > 0) {
            index--;
            fillTableSP(index);
            updatePageDS();
        }
    }

    void nextPageDS() {
        if (index < count) {
            index++;
            fillTableSP(index);
            updatePageDS();
        }
    }

    void chonAnh() {
        JFileChooser jfc = new JFileChooser("C:\\Nhom3_Duan1\\src\\AnhSP");
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            BufferedImage img;
            try {
                img = ImageIO.read(file);
                Image dimg = img.getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(),
                        Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(dimg);
                lblHinhAnh.setIcon(imageIcon);

            } catch (IOException e) {
                e.printStackTrace();
            }
            XImage.save(file); //lưu hình vào thư mục logo
            ImageIcon icon = XImage.read(file.getName()); //đọc hình từ logo
            lblHinhAnh.setToolTipText(file.getName());
        }
    }
    
    void fillComboBoxThuongHieuCT() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboThuongHieuCT.getModel();
        mol_cbo.removeAllElements();
        listth = daoth.selectAll();
        for (ThuongHieu th : listth) {
            mol_cbo.addElement(th.getMaThuongHieu()+"-"+th.getTenThuongHieu());
        }
    }
    
    void fillComboBoxMauSacCT() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboMauSacCT.getModel();
        mol_cbo.removeAllElements();
        listmau = daomau.selectAll();
        for (MauSanPham mau : listmau) {
            mol_cbo.addElement(mau.getTenMau());
        }
    }
    
    void fillComboBoxSizeCT() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboSizeCT.getModel();
        mol_cbo.removeAllElements();
        listsize = daosize.selectAll();
        for (SizeSanPham sz : listsize) {
            mol_cbo.addElement(sz.getSize());
        }
    }
    
    void fillComboBoxMauSacBS() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboMauBS.getModel();
        mol_cbo.removeAllElements();
        listmau = daomau.selectAll();
        for (MauSanPham mau : listmau) {
            mol_cbo.addElement(mau.getTenMau());
        }
    }
    
    void fillComboBoxSizeBS() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboSizeBS.getModel();
        mol_cbo.removeAllElements();
        listsize = daosize.selectAll();
        for (SizeSanPham sz : listsize) {
            mol_cbo.addElement(sz.getSize());
        }
    }
    
    void fillComboBoxKhuyenMai() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboKhuyenMai.getModel();
        mol_cbo.removeAllElements();
        listkm = daokm.selectAll();
        for (KhuyenMai km : listkm) {
            mol_cbo.addElement(km.getMaKM());
        }
    }
    
    void fillComboBoxNCC() {
        DefaultComboBoxModel mol_cbo = (DefaultComboBoxModel) cboNhaCungCap.getModel();
        mol_cbo.removeAllElements();
        listncc = daoncc.selectAll();
        for (NhaCungCap ncc : listncc) {
            mol_cbo.addElement(ncc.getMaNCC());
        }
    }
    
    void setFormSP(SanPham sp) {
        int row = tblDanhSach.getSelectedRow()-1;
        txtMaSP.setText(sp.getMaSP());
        txtTenSP.setText(sp.getTenSP());
        txtSoLuong.setText(String.valueOf(sp.getSoLuong()));
        txtGiaBan.setText(currency.toCurrency(sp.getDonGia()));
        cboMauSacCT.setSelectedItem(sp.getMau());
        cboSizeCT.setSelectedItem(sp.getSize());
        cboKhuyenMai.setSelectedItem(sp.getMaKM());
        cboNhaCungCap.setSelectedItem(sp.getMaNCC());
        txtChiTietSP.setText(sp.getChiTiet());
        if (sp.getAnhSP()!= null) {
            lblHinhAnh.setToolTipText(sp.getAnhSP());
//            lblHinhAnh.setIcon(XImage.read(cd.getHinhAnh()));
            try {
                BufferedImage img;
                img = ImageIO.read(new File("C:\\Nhom3_Duan1\\src\\AnhSP", sp.getAnhSP()));
                Image dimg = img.getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(),
                        Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(dimg);
                lblHinhAnh.setIcon(imageIcon);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            lblHinhAnh.setIcon(null);
        }
    }

    SanPham getForm() {
        SanPham sp = new SanPham();
        sp.setMaThuongHieu(listth.get(cboThuongHieuCT.getSelectedIndex()).getMaThuongHieu());
        sp.setMaSP(txtMaSP.getText());
        sp.setTenSP(txtTenSP.getText());
        sp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        sp.setDonGia(Double.parseDouble(txtGiaBan.getText()));
        sp.setMau(cboMauSacCT.getSelectedItem().toString());
        sp.setSize(Integer.parseInt(cboSizeCT.getSelectedItem().toString()));
        sp.setMaKM(cboKhuyenMai.getSelectedItem().toString());
        sp.setMaNCC(cboNhaCungCap.getSelectedItem().toString());
        sp.setChiTiet(txtChiTietSP.getText());
        if (lblHinhAnh.getIcon() != null) {
            sp.setAnhSP(lblHinhAnh.getToolTipText());
        } else {
            sp.setAnhSP(null);
        }
        return sp;
    }

    void clearForm() {
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtSoLuong.setText("");
        txtGiaBan.setText("");
        txtChiTietSP.setText("");
        lblHinhAnh.setIcon(null);
        lblHinhAnh.setText("");
        this.row = -1;
        this.updateStatus();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDanhSach.getRowCount() - 1);
        //trạng thái form
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
        SanPham sp = getForm();
        try {
            daosp.insert(sp);
            this.fillTableSP(0);
            this.clearForm();
            MsgBoxHelper.alert(this, "Thêm mới thành công !!");
            lblChiSoDS.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Thêm mới thất bại !!");
        }
    }

    void update() {
        SanPham sp = getForm();
        try {
            daosp.update(sp);
            this.fillTableSP(0);
            MsgBoxHelper.alert(this, "Sửa thành công !!");
            lblChiSoDS.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Sửa thất bại !!");
        }
    }

    void vohieuhoa() {
        String masp = txtMaSP.getText();
        try {
            daosp.vohieuhoa(masp);
            this.fillTableSP(0);
            MsgBoxHelper.alert(this, "Vô hiệu thành công !!");
            clearForm();
            lblChiSoDS.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Vô hiệu thất bại !!");
        }
    }

    void edit() {
        String masp = tblDanhSach.getValueAt(row, 0).toString();
        SanPham sp = daosp.selectById(masp);
        setFormSP(sp);
        tabs.setSelectedIndex(1);
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
    
    void fillTableTH(int index1) {
        DefaultTableModel mol = (DefaultTableModel) tblThuongHieu.getModel();
        mol.setRowCount(0);
        try {
            List<ThuongHieu> list1 = daoth.selectPage(index1);
            for (ThuongHieu th : list1) {
                Object[] row = {th.getMaThuongHieu(), th.getTenThuongHieu()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }
    
    List<ThuongHieu> list1 = daoth.selectAll();
    double count1 = (list1.size() / 5);
    
    void updatePageTH() {
        boolean page = (this.index1 >= 0);
        boolean fpage = (this.index1 == 0);
        boolean lpage = (tblThuongHieu.getRowCount() <= 3);
        btnNextBS.setEnabled(page && !lpage);
        btnPreBS.setEnabled(page && !fpage);
    }

    void prePageTH() {
        if (index1 > 0) {
            index1--;
            fillTableTH(index1);
            updatePageTH();
        }
    }

    void nextPageTH() {
        if (index1 < count1) {
            index1++;
            fillTableTH(index1);
            updatePageTH();
        }
    }

    void setFormTH(ThuongHieu th) {
        int row = tblThuongHieu.getSelectedRow()-1;
        txtMaThuongHieu.setText(th.getMaThuongHieu());
        txtTenThuongHieu.setText(th.getTenThuongHieu());
    }

    ThuongHieu getFormTH() {
        ThuongHieu th = new ThuongHieu();
        th.setMaThuongHieu(txtMaThuongHieu.getText());
        th.setTenThuongHieu(txtTenThuongHieu.getText());
        return th;
    }

    void clearFormTH() {
        txtMaThuongHieu.setText("");
        txtTenThuongHieu.setText("");
        this.row = -1;
        this.updateStatusTH();
    }

    void updateStatusTH() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblThuongHieu.getRowCount() - 1);
        //trạng thái form
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnVoHieuHoa.setEnabled(edit);
    }

    void insertTH() {
        ThuongHieu th = getFormTH();
        try {
            daoth.insert(th);
            this.fillTableTH(0);
            this.clearFormTH();
            MsgBoxHelper.alert(this, "Thêm mới thành công !!");
            lblChiSoBS.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Thêm mới thất bại !!");
        }
    }

    void updateTH() {
        ThuongHieu th = getFormTH();
        try {
            daoth.update(th);
            this.fillTableTH(0);
            MsgBoxHelper.alert(this, "Sửa thành công !!");
            lblChiSoBS.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Sửa thất bại !!");
        }
    }

    void vohieuhoaTH() {
        String math = txtMaThuongHieu.getText();
        try {
            daoth.vohieuhoa(math);
            this.fillTableTH(0);
            MsgBoxHelper.alert(this, "Vô hiệu thành công !!");
            clearFormTH();
            lblChiSoBS.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Vô hiệu thất bại !!");
        }
    }

    void editTH() {
        String math = tblThuongHieu.getValueAt(row, 0).toString();
        ThuongHieu th = daoth.selectById(math);
        setFormTH(th);
        tabs.setSelectedIndex(2);
        updateStatusTH();
    }

    MauSanPham getFormMau() {
        MauSanPham mau = new MauSanPham();
        mau.setTenMau(txtTenMau.getText());
        return mau;
    }
 
    void insertMau() {
        MauSanPham mau = getFormMau();
        try {
            daomau.insert(mau);
            this.fillComboBoxMauSacBS();
            this.clearFormMau();
            MsgBoxHelper.alert(this, "Thêm mới thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Thêm mới thất bại !!");
        }
    }
    
    void clearFormMau() {
        txtTenMau.setText("");
    }
    
    SizeSanPham getFormSize() {
        SizeSanPham size = new SizeSanPham();
        size.setSize(Integer.parseInt(txtSize.getText()));
        return size;
    }
 
    void insertSize() {
        SizeSanPham size = getFormSize();
        try {
            daosize.insert(size);
            this.fillComboBoxSizeBS();
            this.clearFormSize();
            MsgBoxHelper.alert(this, "Thêm mới thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBoxHelper.alert(this, "Thêm mới thất bại !!");
        }
    }
    
    void clearFormSize() {
        txtSize.setText("");
    }
    
//    boolean checkFormSP() {
//        try {
//            List<SanPham> list = daosp.selectAll();
//            for (SanPham sp : list) {
//                if (txtMaSP.getText().equalsIgnoreCase(sp.getMaSP())) {
//                    MsgBoxHelper.alert(this, "Mã sản phẩm đã tồn tại");
//                    txtMaSP.requestFocus();
//                    return false;
//                }
//            }
//        } catch (Exception e) {
//        }
//        if (txtMaSP.getText().equals("")) {
//            MsgBoxHelper.alert(this, "Không để trống mã nhân viên !!");
//            txtMaSP.requestFocus();
//            return false;
//        } else if (txtTenSP.getText().equals("")) {
//            MsgBoxHelper.alert(this, "Không để trống tên sản phẩm !!");
//            txtTenSP.requestFocus();
//            return false;
//        } else if (!txtGiaBan.getText().equals("")) {
//            try {
//                Double giaban = Double.parseDouble(txtGiaBan.getText());
//            } catch (Exception e) {
//                MsgBoxHelper.alert(this, "Giá tiền phải là số !!");
//                txtGiaBan.requestFocus();
//                return false;
//            }
//        } else if (txtGiaBan.getText().equals("")) {
//            MsgBoxHelper.alert(this, "Giá tiền không được để trống !!");
//            txtGiaBan.requestFocus();
//            return false;
//        } else if (!txtSoLuong.getText().equals("")) {
//            try {
//                int soluong = Integer.parseInt(txtSoLuong.getText());
//            } catch (Exception e) {
//                MsgBoxHelper.alert(this, "Số lượng phải là số nguyên !!");
//                txtSoLuong.requestFocus();
//                return false;
//            }
//        } else if (txtSoLuong.getText().equals("")) {
//            MsgBoxHelper.alert(this, "Số lượng không được để trống !!");
//            txtSoLuong.requestFocus();
//            return false;
//        } else {
//            return true;
//        }
//    }
}
