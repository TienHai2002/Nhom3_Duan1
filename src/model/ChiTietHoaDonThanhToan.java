package model;

public class ChiTietHoaDonThanhToan {

    private String maHD;
    private String maSP;
    private String tenSP;
    private String mau;
    private int size;
    private double donGia;
    private int soLuong;
    private String khuyenMai;

    public ChiTietHoaDonThanhToan(String maHD, String maSP, String tenSP, String mau, int size, double donGia, int soLuong, String khuyenMai) {
        this.maHD = maHD;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.mau = mau;
        this.size = size;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.khuyenMai = khuyenMai;
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

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
}
