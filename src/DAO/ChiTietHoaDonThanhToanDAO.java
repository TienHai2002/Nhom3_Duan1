package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChiTietHoaDonThanhToan;

public class ChiTietHoaDonThanhToanDAO extends ShoesSysDAO<ChiTietHoaDonThanhToan, String> {

    String SQL_Insert = "INSERT INTO dbo.ChiTietHoaDonThanhToan (MaHDThanhToan,MaSanPham,DonGia,SoLuong,KhuyenMai,TrangThai) VALUES (?,?,?,?,?,1)";
    String SQL_Update = "";
    String SQL_VoHieuHoa = "UPDATE dbo.ChiTietHoaDonThanhToan SET TrangThai=0 WHERE MaHDThanhToan=? AND MaSanPham=?";
    String SQL_SelectALL = "SELECT * FROM dbo.ChiTietHoaDonThanhToan";
    String SQL_SelectID = "SELECT * FROM dbo.ChiTietHoaDonThanhToan WHERE MaHDThanhToan=? AND MaSanPham=?";

    @Override
    public void insert(ChiTietHoaDonThanhToan entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert,
                    entity.getMaHD(), entity.getMaSP(), entity.getDonGia(), entity.getSoLuong(), entity.getKhuyenMai());
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonThanhToanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ChiTietHoaDonThanhToan entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vohieuhoa(String id) {
        try {
            helper.JdbcHelper.update(SQL_VoHieuHoa, id);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonThanhToanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<ChiTietHoaDonThanhToan> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public ChiTietHoaDonThanhToan selectById(String id) {
        List<ChiTietHoaDonThanhToan> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<ChiTietHoaDonThanhToan> selectBySql(String sql, Object... args) {
        List<ChiTietHoaDonThanhToan> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                ChiTietHoaDonThanhToan entity = new ChiTietHoaDonThanhToan();
                entity.setMaHD(rs.getString("MaHDThanhToan"));
                entity.setMaSP(rs.getString("MaSanPham"));
                entity.setTenSP(rs.getString("TenSanPham"));
                entity.setMau(rs.getString("Mau"));
                entity.setSize(rs.getInt("Size"));
                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setKhuyenMai(rs.getString("MaKM"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<ChiTietHoaDonThanhToan> selectPage(String mahd) {
        String sql = "SELECT A.MaHDThanhToan, A.MaSanPham, B.TenSanPham, B.Mau, B.Size, A.DonGia, A.SoLuong, B.MaKM\n"
                + "FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.SanPham B ON B.MaSP = A.MaSanPham\n"
                + "WHERE A.MaHDThanhToan=? AND A.TrangThai=1\n"
                + "ORDER BY A.MaSanPham";
        return this.selectBySql(sql, mahd);
    }

    public void traHang1(int soluong, String mahdct, String masp) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.ChiTietHoaDonThanhToan SET SoLuong=SoLuong-? WHERE MaHDThanhToan=? AND MaSanPham=?",
                    soluong, mahdct, masp);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonThanhToanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void traHang2(String mahdct, String masp) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.ChiTietHoaDonThanhToan SET TrangThai=0 WHERE MaHDThanhToan=? AND MaSanPham=?",
                    mahdct, masp);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonThanhToanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
