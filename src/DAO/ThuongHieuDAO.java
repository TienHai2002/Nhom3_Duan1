package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ThuongHieu;

public class ThuongHieuDAO extends ShoesSysDAO<ThuongHieu, String>{

    String SQL_Insert = "INSERT INTO dbo.ThuongHieu (MaThuongHieu, TenThuongHieu, TrangThai)  VALUES (?,?,1)";
    String SQL_Update = "UPDATE dbo.ThuongHieu SET TenThuongHieu=? WHERE MaThuongHieu=?";
    String SQL_VoHieuHoa = "UPDATE dbo.ThuongHieu SET TrangThai=0 WHERE MaThuongHieu = ?";
    String SQL_SelectALL = "SELECT * FROM dbo.ThuongHieu WHERE TrangThai=1";
    String SQL_SelectID = "SELECT * FROM dbo.ThuongHieu WHERE MaThuongHieu=?";
    
    @Override
    public void insert(ThuongHieu entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert, entity.getMaThuongHieu(), entity.getTenThuongHieu());
        } catch (SQLException ex) {
            Logger.getLogger(ThuongHieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ThuongHieu entity) {
        try {
            helper.JdbcHelper.update(SQL_Update, entity.getTenThuongHieu(), entity.getMaThuongHieu());
        } catch (SQLException ex) {
            Logger.getLogger(ThuongHieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void vohieuhoa(String id) {
        try {
            helper.JdbcHelper.update(SQL_VoHieuHoa, id);
        } catch (SQLException ex) {
            Logger.getLogger(ThuongHieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<ThuongHieu> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public ThuongHieu selectById(String id) {
        List<ThuongHieu> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<ThuongHieu> selectBySql(String sql, Object... args) {
        List<ThuongHieu> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                ThuongHieu entity = new ThuongHieu();
                entity.setMaThuongHieu(rs.getString("MaThuongHieu"));
                entity.setTenThuongHieu(rs.getString("TenThuongHieu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<ThuongHieu> selectPage(int index) {
        String sql = "SELECT * FROM dbo.ThuongHieu\n" +
                     "ORDER BY MaThuongHieu OFFSET ? * 5 ROWS FETCH NEXT 5 ROWS ONLY;";
        return this.selectBySql(sql, index);
    }
    
}
