package DAO;

import model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienDAO extends ShoesSysDAO<NhanVien, String> {

    String SQL_Insert = "INSERT INTO dbo.NhanVien (MaNV, TenNV, MatKhau, DiaChi, SDT, Email, NgaySinh, GioiTinh, AnhNV, TrangThai, VaiTro, MaXacNhan)  VALUES (?,?,'1',?,?,?,?,?,?,1,?,null)";
    String SQL_Update = "UPDATE dbo.NhanVien SET TenNV=?, DiaChi=?, SDT=?, Email=?, NgaySinh=?, GioiTinh=?, AnhNV=?, VaiTro=? WHERE MaNV=?";
    String SQL_VoHieuHoa = "UPDATE dbo.NhanVien SET TrangThai=0 WHERE MaNV = ?";
    String SQL_SelectALL = "SELECT * FROM dbo.NhanVien";
    String SQL_SelectID = "SELECT * FROM dbo.NhanVien WHERE MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        try {
             helper.JdbcHelper.update(SQL_Insert,
                    entity.getMaNV(), entity.getTenNV(), entity.getDiaChi(), entity.getsDT(), entity.getEmail(),
                    entity.getNgaySinh(), entity.isGioiTinh(), entity.getAnhNV(), entity.isVaiTro());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
             helper.JdbcHelper.update(SQL_Update,
                    entity.getTenNV(), entity.getDiaChi(), entity.getsDT(), entity.getEmail(),
                    entity.getNgaySinh(), entity.isGioiTinh(), entity.getAnhNV(), entity.isVaiTro(), entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void vohieuhoa(String id) {
        try {
             helper.JdbcHelper.update(SQL_VoHieuHoa, id);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs =  helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setsDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setNgaySinh(rs.getString("NgaySinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setAnhNV(rs.getString("AnhNV"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setMaXacNhan(rs.getString("MaXacNhan"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateMaXacNhan(String MaXacNhan, String MaNV) {
        try {
             helper.JdbcHelper.update("UPDATE dbo.NhanVien SET MaXacNhan = ? WHERE MaNV = ?",
                    MaXacNhan, MaNV);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMatKhau(String MatKhau, String MaNV) {
        try {
             helper.JdbcHelper.update("UPDATE dbo.NhanVien SET MatKhau = ? WHERE MaNV = ?",
                    MatKhau, MaNV);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<NhanVien> selectPage(int index) {
        String sql = "SELECT * FROM dbo.NhanVien WHERE TrangThai = 1\n"
                + "ORDER BY MaNV OFFSET ? * 10 ROWS FETCH NEXT 10 ROWS ONLY;";
        return this.selectBySql(sql, index);
    }

}
