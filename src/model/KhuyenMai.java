package model;

public class KhuyenMai {

    private String maKM;
    private String maNV;
    private String tenKM;
    private String ngayTao;
    private String ghiChu;
    private boolean trangThai;

    public KhuyenMai(String maKM, String maNV, String tenKM, String ngayTao, String ghiChu, boolean trangThai) {
        this.maKM = maKM;
        this.maNV = maNV;
        this.tenKM = tenKM;
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
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

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
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

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
