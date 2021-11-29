package StartUp;

public class ThongKeJInternalFrame extends javax.swing.JInternalFrame {

    public ThongKeJInternalFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pn1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTongDoanhThu = new javax.swing.JTable();
        pn2 = new javax.swing.JPanel();
        cboThoiGianDT = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtLoiNhuanDT = new javax.swing.JTextField();
        btnPreDT = new javax.swing.JButton();
        lblChiSoDT = new javax.swing.JLabel();
        btnNextDT = new javax.swing.JButton();
        btnPieDT = new javax.swing.JButton();
        btnBarDT = new javax.swing.JButton();
        btnQueryDT = new javax.swing.JButton();
        pn3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBanHang = new javax.swing.JTable();
        btnPreBH = new javax.swing.JButton();
        lblChiSoBH = new javax.swing.JLabel();
        btnNextBH = new javax.swing.JButton();
        btnQueryBH = new javax.swing.JButton();
        btnBarBH = new javax.swing.JButton();
        btnPieBH = new javax.swing.JButton();
        txtLoiNhuanBH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pn4 = new javax.swing.JPanel();
        cboThoigianBH = new javax.swing.JComboBox<>();
        pn5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNhapHang = new javax.swing.JTable();
        btnPreNH = new javax.swing.JButton();
        lblChiSoNH = new javax.swing.JLabel();
        btnNextNH = new javax.swing.JButton();
        btnQueryNH = new javax.swing.JButton();
        btnBarNH = new javax.swing.JButton();
        btnPieNH = new javax.swing.JButton();
        txtLoiNhuanNH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pn6 = new javax.swing.JPanel();
        cboThoiGianNH = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Thống Kê");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblTongDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Thời Gian", "Tiền Bán Hàng", "Tiền Nhập Hàng", "Tổng Doanh Thu"
            }
        ));
        jScrollPane1.setViewportView(tblTongDoanhThu);

        pn2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời Gian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboThoiGianDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThoiGianDT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThoiGianDT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThoiGianDT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Lợi Nhuận");

        txtLoiNhuanDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnPreDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPreDT.setText("<<");

        lblChiSoDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoDT.setText("1");

        btnNextDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNextDT.setText(">>");

        btnPieDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPieDT.setText("Pie Chart");

        btnBarDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBarDT.setText("Bar Chart");

        btnQueryDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQueryDT.setText("Query Chart");

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(txtLoiNhuanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPieDT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBarDT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQueryDT)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPreDT)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoDT)
                .addGap(18, 18, 18)
                .addComponent(btnNextDT)
                .addGap(268, 268, 268))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreDT)
                    .addComponent(lblChiSoDT)
                    .addComponent(btnNextDT))
                .addGap(18, 18, 18)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoiNhuanDT, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(btnPieDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBarDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQueryDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Tổng Doanh Thu", pn1);

        tblBanHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblBanHang);

        btnPreBH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPreBH.setText("<<");

        lblChiSoBH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoBH.setText("1");

        btnNextBH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNextBH.setText(">>");

        btnQueryBH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQueryBH.setText("Query Chart");

        btnBarBH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBarBH.setText("Bar Chart");

        btnPieBH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPieBH.setText("Pie Chart");

        txtLoiNhuanBH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Lợi Nhuận");

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời Gian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboThoigianBH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThoigianBH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThoigianBH, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThoigianBH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                        .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(txtLoiNhuanBH, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPieBH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBarBH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnQueryBH)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                        .addComponent(btnPreBH)
                        .addGap(18, 18, 18)
                        .addComponent(lblChiSoBH)
                        .addGap(18, 18, 18)
                        .addComponent(btnNextBH)
                        .addGap(260, 260, 260))))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreBH)
                    .addComponent(lblChiSoBH)
                    .addComponent(btnNextBH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoiNhuanBH)
                            .addComponent(btnPieBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBarBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQueryBH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        tabs.addTab("Doanh Thu Bán Hàng", pn3);

        tblNhapHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblNhapHang);

        btnPreNH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPreNH.setText("<<");

        lblChiSoNH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoNH.setText("1");

        btnNextNH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNextNH.setText(">>");

        btnQueryNH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQueryNH.setText("Query Chart");

        btnBarNH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBarNH.setText("Bar Chart");

        btnPieNH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPieNH.setText("Pie Chart");

        txtLoiNhuanNH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Lợi Nhuận");

        pn6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời Gian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboThoiGianNH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThoiGianNH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pn6Layout = new javax.swing.GroupLayout(pn6);
        pn6.setLayout(pn6Layout);
        pn6Layout.setHorizontalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThoiGianNH, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn6Layout.setVerticalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboThoiGianNH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addComponent(txtLoiNhuanNH, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPieNH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBarNH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQueryNH)))
                .addContainerGap())
            .addGroup(pn5Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnPreNH)
                .addGap(18, 18, 18)
                .addComponent(lblChiSoNH)
                .addGap(18, 18, 18)
                .addComponent(btnNextNH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreNH)
                    .addComponent(lblChiSoNH)
                    .addComponent(btnNextNH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoiNhuanNH)
                            .addComponent(btnPieNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBarNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQueryNH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        tabs.addTab("Doanh Thu Nhập Hàng", pn5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarBH;
    private javax.swing.JButton btnBarDT;
    private javax.swing.JButton btnBarNH;
    private javax.swing.JButton btnNextBH;
    private javax.swing.JButton btnNextDT;
    private javax.swing.JButton btnNextNH;
    private javax.swing.JButton btnPieBH;
    private javax.swing.JButton btnPieDT;
    private javax.swing.JButton btnPieNH;
    private javax.swing.JButton btnPreBH;
    private javax.swing.JButton btnPreDT;
    private javax.swing.JButton btnPreNH;
    private javax.swing.JButton btnQueryBH;
    private javax.swing.JButton btnQueryDT;
    private javax.swing.JButton btnQueryNH;
    private javax.swing.JComboBox<String> cboThoiGianDT;
    private javax.swing.JComboBox<String> cboThoiGianNH;
    private javax.swing.JComboBox<String> cboThoigianBH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblChiSoBH;
    private javax.swing.JLabel lblChiSoDT;
    private javax.swing.JLabel lblChiSoNH;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JPanel pn6;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblBanHang;
    private javax.swing.JTable tblNhapHang;
    private javax.swing.JTable tblTongDoanhThu;
    private javax.swing.JTextField txtLoiNhuanBH;
    private javax.swing.JTextField txtLoiNhuanDT;
    private javax.swing.JTextField txtLoiNhuanNH;
    // End of variables declaration//GEN-END:variables
}
