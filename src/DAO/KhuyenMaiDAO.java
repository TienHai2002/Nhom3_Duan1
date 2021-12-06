package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhuyenMai;

public class KhuyenMaiDAO extends ShoesSysDAO<KhuyenMai, String> {

    String SQL_Insert = "INSERT INTO dbo.KhuyenMai (MaKM, MaNV, TenKM, NgayTao, GhiChu, TrangThai)  VALUES (?,?,?,?,?,1)";
    String SQL_Update = "UPDATE dbo.KhuyenMai SET MaNV=?, TenKM=?, GiaTri=?, NgayTao=?, GhiChu=? WHERE MaKM=?";
    String SQL_VoHieuHoa = "UPDATE dbo.KhuyenMai SET TrangThai=0 WHERE MaKM = ?";
    String SQL_SelectALL = "SELECT * FROM dbo.KhuyenMai";
    String SQL_SelectID = "SELECT * FROM dbo.KhuyenMai WHERE MaKM=?";

    @Override
    public void insert(KhuyenMai entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert,
                    entity.getMaKM(), entity.getMaNV(), entity.getTenKM(),
                    entity.getNgayTao(), entity.getGhiChu());
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(KhuyenMai entity) {
        try {
            helper.JdbcHelper.update(SQL_Update,
                    entity.getMaNV(), entity.getTenKM(), entity.getNgayTao(),
                    entity.getGhiChu(), entity.getMaKM());
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void vohieuhoa(String id) {
        try {
            helper.JdbcHelper.update(SQL_VoHieuHoa, id);
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<KhuyenMai> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public KhuyenMai selectById(String id) {
        List<KhuyenMai> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<KhuyenMai> selectBySql(String sql, Object... args) {
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                KhuyenMai entity = new KhuyenMai();
                entity.setMaKM(rs.getString("MaKM"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTenKM(rs.getString("TenKM"));
                entity.setNgayTao(rs.getString("NgayTao"));
                entity.setGhiChu(rs.getString("GhiChu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
