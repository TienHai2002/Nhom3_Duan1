package model;

public class KhuyenMai {

    private String maKM;
    private String maNV;
    private String maSP;
    private String tenKM;
    private String giaTriKM;
    private String ngayTao;
    private String ghiChu;

    public KhuyenMai(String maKM, String maNV, String maSP, String tenKM, String giaTriKM, String ngayTao, String ghiChu) {
        this.maKM = maKM;
        this.maNV = maNV;
        this.maSP = maSP;
        this.tenKM = tenKM;
        this.giaTriKM = giaTriKM;
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
    }

    public KhuyenMai() {
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public String getGiaTriKM() {
        return giaTriKM;
    }

    public void setGiaTriKM(String giaTriKM) {
        this.giaTriKM = giaTriKM;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
