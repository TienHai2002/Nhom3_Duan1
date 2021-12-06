package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDonNhapHang;

public class HoaDonNhapHangDAO extends ShoesSysDAO<HoaDonNhapHang, String>{

    String SQL_Insert = "INSERT INTO dbo.HoaDonNhapHang (MaHDNhapHang, MaNV, MaNCC, NgayNhapHang, GhiChu)  VALUES (?,?,?,?,?)";
    String SQL_Update = "UPDATE dbo.HoaDonNhapHang SET MaNV=?, MaNCC=?, NgayNhapHang=?, GhiChu=? WHERE MaHDNhapHang=?";
    String SQL_VoHieuHoa = "";
    String SQL_SelectALL = "SELECT * FROM dbo.HoaDonNhapHang";
    String SQL_SelectID = "SELECT * FROM dbo.HoaDonNhapHang WHERE MaHDNhapHang=?";
    
    @Override
    public void insert(HoaDonNhapHang entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert,
                    entity.getMaHDNhapHang(), entity.getMaNV(), entity.getMaNCC(), entity.getNgayNhapHang(), entity.getGhiChu());
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonNhapHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(HoaDonNhapHang entity) {
        try {
            helper.JdbcHelper.update(SQL_Update,
                    entity.getMaNV(), entity.getMaNCC(), entity.getNgayNhapHang(), entity.getGhiChu(), entity.getMaHDNhapHang());
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonNhapHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void vohieuhoa(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDonNhapHang> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public HoaDonNhapHang selectById(String id) {
        List<HoaDonNhapHang> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<HoaDonNhapHang> selectBySql(String sql, Object... args) {
        List<HoaDonNhapHang> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                HoaDonNhapHang entity = new HoaDonNhapHang();
                entity.setMaHDNhapHang(rs.getString("MaHDNhapHang"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMaNCC(rs.getString("MaNCC"));
                entity.setNgayNhapHang(rs.getString("NgayNhapHang"));
                entity.setGhiChu(rs.getString("GhiChu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public HoaDonNhapHang selectNCC(String mancc) {
        List<HoaDonNhapHang> list = this.selectBySql("SELECT * FROM dbo.HoaDonNhapHang WHERE MaNCC=?\n", mancc);
        return list.isEmpty() ? null : list.get(0);
    }
    
//    public List<HoaDonNhapHang> selectNhapHang(String mancc, int index) {
//        String sql = "SELECT * FROM dbo.HoaDonNhapHang\n"
//                + "WHERE MaNCC=?\n"
//                + "ORDER BY MaHDNhapHang OFFSET ? * 5 ROWS FETCH NEXT 5 ROWS ONLY";
//        return this.selectBySql(sql, mancc, index);
//    }
}
