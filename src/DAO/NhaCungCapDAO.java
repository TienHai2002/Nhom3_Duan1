package DAO;

import model.NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhaCungCapDAO extends ShoesSysDAO<NhaCungCap, String> {

    String SQL_Insert = "INSERT INTO dbo.NhaCungCap (MaNCC, TenNCC, DiaChi, SDT, Email, TrangThai)  VALUES (?,?,?,?,?,1)";
    String SQL_Update = "UPDATE dbo.NhaCungCap SET TenNCC=?, DiaChi=?, SDT=?, Email=? WHERE MaNCC=?";
    String SQL_VoHieuHoa = "UPDATE dbo.NhaCungCap SET TrangThai=0 WHERE MaNCC = ?";
    String SQL_SelectALL = "SELECT * FROM dbo.NhaCungCap WHERE TrangThai=1";
    String SQL_SelectID = "SELECT * FROM dbo.NhaCungCap WHERE MaNCC=?";

    @Override
    public void insert(NhaCungCap entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert, entity.getMaNCC(), entity.getTenNCC(), entity.getDiaChi(), entity.getsDT(), entity.getEmail());
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NhaCungCap entity) {
        try {
            helper.JdbcHelper.update(SQL_Update, entity.getTenNCC(), entity.getDiaChi(), entity.getsDT(), entity.getEmail(), entity.getMaNCC());
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void vohieuhoa(String id) {
        try {
            helper.JdbcHelper.update(SQL_VoHieuHoa, id);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<NhaCungCap> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public NhaCungCap selectById(String id) {
        List<NhaCungCap> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<NhaCungCap> selectBySql(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhaCungCap entity = new NhaCungCap();
                entity.setMaNCC(rs.getString("MaNCC"));
                entity.setTenNCC(rs.getString("TenNCC"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setsDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<NhaCungCap> selectPage(int index) {
        String sql = "SELECT * FROM dbo.NhaCungCap WHERE TrangThai = 1\n"
                + "ORDER BY MaNCC OFFSET ? * 5 ROWS FETCH NEXT 5 ROWS ONLY;";
        return this.selectBySql(sql, index);
    }

    public List<NhaCungCap> selectPageTrash(int index) {
        String sql = "SELECT * FROM dbo.NhaCungCap WHERE TrangThai = 0\n"
                + "ORDER BY MaNCC OFFSET ? * 10 ROWS FETCH NEXT 10 ROWS ONLY;";
        return this.selectBySql(sql, index);
    }
    
    public void khoiphuc(String id) {
        try {
            helper.JdbcHelper.update("UPDATE dbo.NhaCungCap SET TrangThai=1 WHERE MaNCC = ?", id);
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<NhaCungCap> selectAllTrash() {
        return this.selectBySql("SELECT * FROM dbo.NhaCungCap WHERE TrangThai=0");
    }
}
