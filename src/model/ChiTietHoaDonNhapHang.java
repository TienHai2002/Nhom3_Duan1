package model;

public class ChiTietHoaDonNhapHang {

    private String maHDNhapHang;
    private String maSP;
    private String tenSP;
    private String thuongHieu;
    private double giaNhap;
    private int soLuong;
    private String ngayNhap;
    private String maNV;
    private String maNCC;

    public ChiTietHoaDonNhapHang(String maHDNhapHang, String maSP, String tenSP, String thuongHieu, double giaNhap, int soLuong, String ngayNhap, String maNV, String maNCC) {
        this.maHDNhapHang = maHDNhapHang;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.thuongHieu = thuongHieu;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
        this.maNV = maNV;
        this.maNCC = maNCC;
    }

    public ChiTietHoaDonNhapHang() {
    }

    public String getMaHDNhapHang() {
        return maHDNhapHang;
    }

    public void setMaHDNhapHang(String maHDNhapHang) {
        this.maHDNhapHang = maHDNhapHang;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
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

}
