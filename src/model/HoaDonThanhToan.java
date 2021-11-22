package model;

public class HoaDonThanhToan {

    private String maHDThanhToan;
    private String maKH;
    private String maNV;
    private String ngayThanhToan;
    private int diemThuong;
    private String ghiChu;

    public HoaDonThanhToan(String maHDThanhToan, String maKH, String maNV, String ngayThanhToan, int diemThuong, String ghiChu) {
        this.maHDThanhToan = maHDThanhToan;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayThanhToan = ngayThanhToan;
        this.diemThuong = diemThuong;
        this.ghiChu = ghiChu;
    }

    public HoaDonThanhToan() {
    }

    public String getMaHDThanhToan() {
        return maHDThanhToan;
    }

    public void setMaHDThanhToan(String maHDThanhToan) {
        this.maHDThanhToan = maHDThanhToan;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public int getDiemThuong() {
        return diemThuong;
    }

    public void setDiemThuong(int diemThuong) {
        this.diemThuong = diemThuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
