package model;

public class HoaDonNhapHang {

    private String maHDNhapHang;
    private String maNV;
    private String maNCC;
    private String ngayNhapHang;
    private String ghiChu;

    public HoaDonNhapHang(String maHDNhapHang, String maNV, String maNCC, String ngayNhapHang, String ghiChu) {
        this.maHDNhapHang = maHDNhapHang;
        this.maNV = maNV;
        this.maNCC = maNCC;
        this.ngayNhapHang = ngayNhapHang;
        this.ghiChu = ghiChu;
    }

    public HoaDonNhapHang() {
    }

    public String getMaHDNhapHang() {
        return maHDNhapHang;
    }

    public void setMaHDNhapHang(String maHDNhapHang) {
        this.maHDNhapHang = maHDNhapHang;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getNgayNhapHang() {
        return ngayNhapHang;
    }

    public void setNgayNhapHang(String ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
