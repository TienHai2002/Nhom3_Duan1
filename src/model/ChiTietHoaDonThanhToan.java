package model;

public class ChiTietHoaDonThanhToan {

    private String maHD;
    private String maSP;
    private double donGia;
    private int soLuong;
    private String khuyenMai;
    private boolean trangThai;

    public ChiTietHoaDonThanhToan(String maHD, String maSP, double donGia, int soLuong, String khuyenMai, boolean trangThai) {
        this.maHD = maHD;
        this.maSP = maSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.khuyenMai = khuyenMai;
        this.trangThai = trangThai;
    }

    public ChiTietHoaDonThanhToan() {
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(String khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
