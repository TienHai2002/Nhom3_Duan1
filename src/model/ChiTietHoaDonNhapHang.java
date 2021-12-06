package model;

public class ChiTietHoaDonNhapHang {

    private String maHDNhapHang;
    private String maSP;
    private double giaNhap;
    private int soLuong;

    public ChiTietHoaDonNhapHang(String maHDNhapHang, String maSP, double giaNhap, int soLuong) {
        this.maHDNhapHang = maHDNhapHang;
        this.maSP = maSP;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
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
}
