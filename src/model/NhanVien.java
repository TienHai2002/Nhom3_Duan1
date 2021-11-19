package model;

public class NhanVien {

    private String maNV;
    private String tenNV;
    private String matKhau;
    private String diaChi;
    private String sDT;
    private String Email;
    private String ngaySinh;
    private boolean gioiTinh;
    private String anhNV;
    private boolean trangThai;
    private boolean vaiTro;
    private String maXacNhan;

    public NhanVien(String maNV, String tenNV, String matKhau, String diaChi, String sDT, String Email, String ngaySinh, boolean gioiTinh, String anhNV, boolean trangThai, boolean vaiTro, String maXacNhan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.Email = Email;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.anhNV = anhNV;
        this.trangThai = trangThai;
        this.vaiTro = vaiTro;
        this.maXacNhan = maXacNhan;
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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

    public String getAnhNV() {
        return anhNV;
    }

    public void setAnhNV(String anhNV) {
        this.anhNV = anhNV;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getMaXacNhan() {
        return maXacNhan;
    }

    public void setMaXacNhan(String maXacNhan) {
        this.maXacNhan = maXacNhan;
    }

}
