package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietHoaDonNhapHang;

public class ChiTietHoaDonNhapHangDAO extends ShoesSysDAO<ChiTietHoaDonNhapHang, String> {

    String SQL_Insert = "INSERT INTO dbo.ChiTietHoaDonNhapHang (MaHDThanhToan,MaSanPham,DonGia,SoLuong,KhuyenMai,TrangThai) VALUES (?,?,?,?,?,1)";
    String SQL_Update = "";
    String SQL_VoHieuHoa = "UPDATE dbo.ChiTietHoaDonThanhToan SET TrangThai=0 WHERE MaHDThanhToan=? AND MaSanPham=?";
    String SQL_SelectALL = "SELECT A.MaHDNhapHang, A.MaSP, B.TenSanPham, C.TenThuongHieu, A.GiaNhap, A.SoLuong, D.NgayNhapHang, D.MaNV, D.MaNCC\n"
            + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.SanPham B ON B.MaSP = A.MaSP \n"
            + "JOIN dbo.ThuongHieu C ON C.MaThuongHieu = B.MaThuongHieu\n"
            + "JOIN dbo.HoaDonNhapHang D ON D.MaHDNhapHang = A.MaHDNhapHang";
    String SQL_SelectID = "SELECT * FROM dbo.ChiTietHoaDonThanhToan WHERE MaHDThanhToan=? AND MaSanPham=?";

    @Override
    public void insert(ChiTietHoaDonNhapHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                entity.setTenSP(rs.getString("TenSanPham"));
                entity.setThuongHieu(rs.getString("TenThuongHieu"));
                entity.setGiaNhap(rs.getDouble("GiaNhap"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setNgayNhap(rs.getString("NgayNhapHang"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMaNCC(rs.getString("MaNCC"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<ChiTietHoaDonNhapHang> selectPage(String mancc, int index) {
        String sql = "SELECT A.MaHDNhapHang, A.MaSP, B.TenSanPham, C.TenThuongHieu, A.GiaNhap, A.SoLuong, D.NgayNhapHang, D.MaNV, D.MaNCC\n"
                + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.SanPham B ON B.MaSP = A.MaSP \n"
                + "JOIN dbo.ThuongHieu C ON C.MaThuongHieu = B.MaThuongHieu\n"
                + "JOIN dbo.HoaDonNhapHang D ON D.MaHDNhapHang = A.MaHDNhapHang\n"
                + "WHERE D.MaNCC=?\n"
                + "ORDER BY A.MaSP OFFSET ? * 5 ROWS FETCH NEXT 5 ROWS ONLY";
        return this.selectBySql(sql, mancc, index);
    }

}
