package model;

public class KhachHang {

    private String maKH;
    private String tenKH;
    private String sDT;
    private String Email;
    private String ngaySinh;
    private boolean gioiTinh;
    private int diemThuong;
    private String maNV;

    public KhachHang(String maKH, String tenKH, String sDT, String Email, String ngaySinh, boolean gioiTinh, int diemThuong, String maNV) {

        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sDT = sDT;
        this.Email = Email;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemThuong = diemThuong;
        this.maNV = maNV;
    }

    public KhachHang() {
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getDiemThuong() {
        return diemThuong;
    }

    public void setDiemThuong(int diemThuong) {
        this.diemThuong = diemThuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

}
