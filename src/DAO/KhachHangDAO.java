package DAO;

import model.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDAO extends ShoesSysDAO<KhachHang, String> {

    String SQL_Insert = "INSERT INTO dbo.KhachHang (MaKH, TenKH, SDT, Email, NgaySinh, GioiTinh, TichDiem, MaNV, TrangThai)  VALUES (?,?,?,?,?,?,0,?,1)";
    String SQL_Update = "UPDATE dbo.KhachHang SET TenKH=?, SDT=?, Email=?, NgaySinh=?, GioiTinh=?, MaNV=? WHERE MaKH=?";
    String SQL_Delete = "DELETE FROM dbo.KhachHang WHERE MaKH=?";
    String SQL_SelectALL = "SELECT * FROM dbo.KhachHang";
    String SQL_SelectID = "SELECT * FROM dbo.KhachHang WHERE MaKH=?";

    @Override
    public void insert(KhachHang entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert, entity.getMaKH(), entity.getTenKH(), entity.getsDT(), entity.getEmail(), 
                    entity.getNgaySinh(), entity.isGioiTinh(), entity.getMaNV());
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
            ResultSet rs =  helper.JdbcHelper.query(sql, args);
            while(rs.next()){
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
    
    public List<KhachHang> selectPage(int index) {
        String sql = "SELECT * FROM dbo.KhachHang WHERE TrangThai = 1\n"
                + "ORDER BY MaKH OFFSET ? * 10 ROWS FETCH NEXT 10 ROWS ONLY;";
        return this.selectBySql(sql, index);
    }

}
