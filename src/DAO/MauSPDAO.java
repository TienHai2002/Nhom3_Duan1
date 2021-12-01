package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MauSanPham;

public class MauSPDAO extends ShoesSysDAO<MauSanPham, String>{

    String SQL_Insert = "INSERT INTO dbo.MauSac (TenMau) VALUES (?)";
    String SQL_Update = "";
    String SQL_VoHieuHoa = "";
    String SQL_SelectALL = "SELECT * FROM dbo.MauSac";
    String SQL_SelectID = "";
    
    @Override
    public void insert(MauSanPham entity) {
        try {
            helper.JdbcHelper.update(SQL_Insert, entity.getTenMau());
        } catch (SQLException ex) {
            Logger.getLogger(MauSPDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(MauSanPham entity) {
    }

    @Override
    public void vohieuhoa(String id) {
    }

    @Override
    public List<MauSanPham> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public MauSanPham selectById(String id) {
        List<MauSanPham> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<MauSanPham> selectBySql(String sql, Object... args) {
        List<MauSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = helper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                MauSanPham entity = new MauSanPham();
                entity.setTenMau(rs.getString("TenMau"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
