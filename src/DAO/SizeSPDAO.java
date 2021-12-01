package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SizeSanPham;

public class SizeSPDAO extends ShoesSysDAO<SizeSanPham, String>{

    String SQL_Insert = "INSERT INTO dbo.Size (Size) VALUES (?)";
    String SQL_Update = "";
    String SQL_VoHieuHoa = "";
    String SQL_SelectALL = "SELECT * FROM dbo.Size";
    String SQL_SelectID = "";
    
    @Override
    public void insert(SizeSanPham entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert, entity.getSize());
        } catch (SQLException ex) {
            Logger.getLogger(SizeSPDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(SizeSanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vohieuhoa(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SizeSanPham> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public SizeSanPham selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<SizeSanPham> selectBySql(String sql, Object... args) {
        List<SizeSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                SizeSanPham entity = new SizeSanPham();
                entity.setSize(rs.getInt("Size"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
