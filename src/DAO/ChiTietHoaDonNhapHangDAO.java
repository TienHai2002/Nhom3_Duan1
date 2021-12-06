package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChiTietHoaDonNhapHang;

public class ChiTietHoaDonNhapHangDAO extends ShoesSysDAO<ChiTietHoaDonNhapHang, String> {

    String SQL_Insert = "INSERT INTO dbo.ChiTietHoaDonNhapHang (MaHDNhapHang,MaSP,GiaNhap,SoLuong) VALUES (?,?,?,?)";
    String SQL_Update = "";
    String SQL_VoHieuHoa = "";
    String SQL_SelectALL = "SELECT * FROM dbo.ChiTietHoaDonNhapHang";
    String SQL_SelectID = "SELECT * FROM dbo.ChiTietHoaDonNhapHang WHERE MaHDNhapHang=? AND MaSP=?";

    @Override
    public void insert(ChiTietHoaDonNhapHang entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert, entity.getMaHDNhapHang(), entity.getMaSP(), entity.getGiaNhap(), entity.getSoLuong());
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonNhapHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ChiTietHoaDonNhapHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vohieuhoa(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChiTietHoaDonNhapHang> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public ChiTietHoaDonNhapHang selectById(String id) {
        List<ChiTietHoaDonNhapHang> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<ChiTietHoaDonNhapHang> selectBySql(String sql, Object... args) {
        List<ChiTietHoaDonNhapHang> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                ChiTietHoaDonNhapHang entity = new ChiTietHoaDonNhapHang();
                entity.setMaHDNhapHang(rs.getString("MaHDNhapHang"));
                entity.setMaSP(rs.getString("MaSP"));
                entity.setGiaNhap(rs.getDouble("GiaNhap"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ChiTietHoaDonNhapHang selectByMa(String masp) {
        List<ChiTietHoaDonNhapHang> list = this.selectBySql("SELECT * FROM dbo.ChiTietHoaDonNhapHang\n"
                + "WHERE MaSP=?", masp);
        return list.isEmpty() ? null : list.get(0);
    }

    public ChiTietHoaDonNhapHang selectByMHD(String id) {
        List<ChiTietHoaDonNhapHang> list = this.selectBySql("SELECT * FROM dbo.ChiTietHoaDonNhapHang WHERE MaHDNhapHang=?", id);
        return list.isEmpty() ? null : list.get(0);
    }
}
