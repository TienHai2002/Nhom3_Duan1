package model;

public class ChiTietHoaDonThanhToan {

    private String maHDChiTiet;
    private String maHD;
    private String maSP;
    private double donGia;
    private int soLuong;
    private int doiDiem;

    public ChiTietHoaDonThanhToan(String maHDChiTiet, String maHD, String maSP, double donGia, int soLuong, int doiDiem) {
        this.maHDChiTiet = maHDChiTiet;
        this.maHD = maHD;
        this.maSP = maSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.doiDiem = doiDiem;
    }

    public ChiTietHoaDonThanhToan() {
    }

    public String getMaHDChiTiet() {
        return maHDChiTiet;
    }

    public void setMaHDChiTiet(String maHDChiTiet) {
        this.maHDChiTiet = maHDChiTiet;
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

    public int getDoiDiem() {
        return doiDiem;
    }

    public void setDoiDiem(int doiDiem) {
        this.doiDiem = doiDiem;
    }

}
