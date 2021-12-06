package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> SelectThongKeNgay() {
        String sql = "SELECT * FROM \n"
                + "(\n"
                + "(SELECT B.NgayThanhToan, SUM(A.SoLuong*A.DonGia) AS 'TienBan' \n"
                + "FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.HoaDonThanhToan B ON B.MaHDThanhToan = A.MaHDThanhToan\n"
                + "GROUP BY B.NgayThanhToan) C FULL JOIN (SELECT B.NgayNhapHang, SUM(A.SoLuong*A.GiaNhap) AS 'TienNhap' \n"
                + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.HoaDonNhapHang B ON B.MaHDNhapHang = A.MaHDNhapHang\n"
                + "GROUP BY B.NgayNhapHang) D ON D.NgayNhapHang = C.NgayThanhToan\n"
                + ")";
        String tongtien[] = {"NgayThanhToan", "TienBan", "NgayNhapHang", "TienNhap"};
        return getListOfArray(sql, tongtien);
    }

    public List<Object[]> SelectThongKeThang() {
        String sql = "SELECT * FROM \n"
                + "(\n"
                + "(SELECT MONTH(B.NgayThanhToan) AS 'Thang', SUM(A.SoLuong*A.DonGia) AS 'TienBan' \n"
                + "FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.HoaDonThanhToan B ON B.MaHDThanhToan = A.MaHDThanhToan\n"
                + "GROUP BY MONTH(B.NgayThanhToan)) C FULL JOIN (SELECT MONTH(B.NgayNhapHang) AS 'Tháng', SUM(A.SoLuong*A.GiaNhap) AS 'TienNhap' \n"
                + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.HoaDonNhapHang B ON B.MaHDNhapHang = A.MaHDNhapHang\n"
                + "GROUP BY MONTH(B.NgayNhapHang)) D ON D.Tháng = C.Thang\n"
                + ")";
        String tongtien[] = {"Thang", "TienBan", "Tháng", "TienNhap"};
        return getListOfArray(sql, tongtien);
    }

    public List<Object[]> SelectThongKeNam() {
        String sql = "SELECT * FROM \n"
                + "(\n"
                + "(SELECT YEAR(B.NgayThanhToan) AS 'Năm', SUM(A.SoLuong*A.DonGia) AS 'TienBan' \n"
                + "FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.HoaDonThanhToan B ON B.MaHDThanhToan = A.MaHDThanhToan\n"
                + "GROUP BY YEAR(B.NgayThanhToan)) C FULL JOIN (SELECT YEAR(B.NgayNhapHang) AS 'Năm', SUM(A.SoLuong*A.GiaNhap) AS 'TienNhap' \n"
                + "FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.HoaDonNhapHang B ON B.MaHDNhapHang = A.MaHDNhapHang\n"
                + "GROUP BY YEAR(B.NgayNhapHang)) D ON D.Năm = C.Năm\n"
                + ")";
        String tongtien[] = {"Năm", "TienBan", "Năm", "TienNhap"};
        return getListOfArray(sql, tongtien);
    }
}
