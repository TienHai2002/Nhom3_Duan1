package model;

public class ChiTietHoaDonThanhToan {

    private String maHDChiTiet;
    private String maHD;
    private String maKM;
    private String maSP;
    private double donGia;
    private int soLuong;
    private String voucher;

    public ChiTietHoaDonThanhToan(String maHDChiTiet, String maHD, String maKM, String maSP, double donGia, int soLuong, String voucher) {
        this.maHDChiTiet = maHDChiTiet;
        this.maHD = maHD;
        this.maKM = maKM;
        this.maSP = maSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.voucher = voucher;
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

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
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

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

}
