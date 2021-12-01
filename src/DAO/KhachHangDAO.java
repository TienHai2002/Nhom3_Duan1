package DAO;

import model.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDAO extends ShoesSysDAO<KhachHang, String> {

    String SQL_Insert = "INSERT INTO dbo.KhachHang (MaKH, TenKH, SDT, Email, NgaySinh, GioiTinh, TichDiem, MaNV, TrangThai)  VALUES (?,?,?,?,?,?,?,?,1)";
    String SQL_Update = "UPDATE dbo.KhachHang SET TenKH=?, SDT=?, Email=?, NgaySinh=?, GioiTinh=?, MaNV=? WHERE MaKH=?";
    String SQL_Vohieuhoa = "UPDATE dbo.KhachHang SET TrangThai=0 WHERE MaKH = ?";
    String SQL_SelectALL = "SELECT * FROM dbo.KhachHang";
    String SQL_SelectID = "SELECT * FROM dbo.KhachHang WHERE MaKH=?";

    @Override
    public void insert(KhachHang entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert, entity.getMaKH(), entity.getTenKH(), entity.getsDT(), entity.getEmail(),
                    entity.getNgaySinh(), entity.isGioiTinh(), entity.getDiemThuong(), entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(KhachHang entity) {
        try {
            helper.JdbcHelper.update(SQL_Update, entity.getTenKH(), entity.getsDT(), entity.getEmail(),
                    entity.getNgaySinh(), entity.isGioiTinh(), entity.getMaNV(), entity.getMaKH());
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void vohieuhoa(String id) {
        try {
            helper.JdbcHelper.update(SQL_Vohieuhoa, id);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setsDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setNgaySinh(rs.getString("NgaySinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDiemThuong(rs.getInt("TichDiem"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<KhachHang> selectPage(String keyword, int index) {
        String sql = "SELECT * FROM dbo.KhachHang WHERE TrangThai = 1 AND TenKH LIKE ?\n"
                + "ORDER BY MaKH OFFSET ? * 10 ROWS FETCH NEXT 10 ROWS ONLY;";
        return this.selectBySql(sql, "%" + keyword +"%", index);
    }

    public List<KhachHang> selectPageTrash(int index) {
        String sql = "SELECT * FROM dbo.KhachHang WHERE TrangThai = 0\n"
                + "ORDER BY MaKH OFFSET ? * 10 ROWS FETCH NEXT 10 ROWS ONLY;";
        return this.selectBySql(sql, index);
    }

    public void khoiphuc(String id) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.KhachHang SET TrangThai=1 WHERE MaKH = ?", id);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<KhachHang> selectAllTrash() {
        return this.selectBySql("SELECT * FROM dbo.KhachHang WHERE TrangThai=0");
    }

    public KhachHang selectBySDT(String id) {
        List<KhachHang> list = this.selectBySql("SELECT * FROM dbo.KhachHang WHERE SDT=?", id);
        return list.isEmpty() ? null : list.get(0);
    }
    
    public void congDiem(int diem, String id) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.KhachHang SET TichDiem=? WHERE MaKH = ?", diem, id);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void truDiem(String id) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.KhachHang SET TichDiem=TichDiem-100 WHERE MaKH = ?", id);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
