CREATE DATABASE QuanLiBanGiay
GO 

USE QuanLiBanGiay
GO

CREATE TABLE LoaiSanPham(
MaThuongHieu VARCHAR(10) PRIMARY KEY,
TenThuongHieu NVARCHAR(20) NOT NULL,
TrangThai BIT NOT NULL,
);

INSERT INTO LoaiSanPham(MaThuongHieu, TenThuongHieu,TrangThai) VALUES
('TH001', N'Adidas', 1),
('TH002', N'Nike', 1),
('TH003', N'Dincox', 1),
('TH004', N'Puma', 1),
('TH005', N'Vans', 1);

CREATE TABLE NhanVien(
MaNV VARCHAR(10) PRIMARY KEY,
TenNV NVARCHAR(50) NOT NULL,
MatKhau VARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
SDT VARCHAR(15) NOT NULL,
Email VARCHAR(50) NOT NULL,
NgaySinh DATE NOT NULL,
GioiTinh BIT NOT NULL,
AnhNV VARCHAR(30) NOT NULL,
TrangThai BIT NOT NULL,
VaiTro BIT NOT NULL,
MaXacNhan VARCHAR(6) NULL,
);

INSERT INTO dbo.NhanVien VALUES
('PH17245', N'Nguyễn Bá Hà', 'baha123', N'Hà Nội', '0325878373', 'hanbph17245@fpt.edu.vn', '20020516', 1, 'baha123.jpg', 1, 1, NULL),
('PH17417', N'Nguyễn Phú Quang', 'quang123', N'Hà Nội', '0936352884', 'quangnpph17417@fpt.edu.vn', '20021004', 1, 'quang123.jpg', 1, 1, NULL),
('PH17481', N'Nguyễn Công Trường', 'truong123', N'Hà Nội', '0964853798', 'truongncph17481@fpt.edu.vn', '20020722', 1, 'truong123.jpg', 1, 1, NULL),
('PH18383', N'Nguyễn Văn Huy', 'vanhuy123', N'Hà Nội', '0338327433', 'huynvph18383@fpt.edu.vn', '20020222', 1, 'vanhuy123.jpg', 1, 1, NULL),
('PH17446', N'Nguyễn Tiến Hải', 'tienhai123', N'Hà Nội', '0347766383', 'haintph17446@fpt.edu.vn', '20021223', 1, 'tienhai123.jpg', 1, 1, NULL);

CREATE TABLE MauSac(
MaMau VARCHAR(10) PRIMARY KEY,
TenMau NVARCHAR(20) NOT NULL,
);

INSERT INTO dbo.MauSac(MaMau, TenMau) VALUES
('F3F418', N'Vàng'),
('0000FF', N'Xanh Nước'),
('00FF00', N'Xanh Lá'),
('FF0000', N'Đỏ'),
('000000', N'Đen'),
('FFFFFF', N'Trắng');

CREATE TABLE Size(
Size INT PRIMARY KEY,
);

INSERT INTO dbo.Size(Size) VALUES
(36),
(37),
(38),
(39),
(40),
(41),
(42),
(43),
(44);

CREATE TABLE SanPham(
MaSP VARCHAR(10) PRIMARY KEY,
MaThuongHieu VARCHAR(10) NOT NULL,
TenSanPham NVARCHAR(50) NOT NULL,
GiaBan MONEY NOT NULL,
SoLuong INT NOT NULL,
MaMau VARCHAR(10) NOT NULL,
Size INT NOT NULL,
AnhSP VARCHAR(30) NOT NULL,
ChiTiet NVARCHAR(50) NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaMau) REFERENCES dbo.MauSac(MaMau),
FOREIGN KEY (Size) REFERENCES dbo.Size(Size),
FOREIGN KEY (MaThuongHieu) REFERENCES dbo.LoaiSanPham(MaThuongHieu),
);

INSERT INTO SanPham(MaSP,MaThuongHieu,TenSanPham,GiaBan,SoLuong,AnhSP,ChiTiet,TrangThai) VALUES
('SP001', 'TH001', N'UltraBoost 21', 5000000, 5, 'sp001.png', NULL,0),
('SP002', 'TH001', N'Alphabounce', 3000000, 10, 'sp002.png', NULL,0),
('SP003', 'TH001', N'ZX 1K Boost', 2500000, 10, 'sp003.png', NULL,0),
('SP004', 'TH002', N'Nike Revolution 5 Nam', 1790000, 15, 'sp004.png', NULL,0),
('SP005', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 10, 'sp005.png', NULL,0),
('SP006', 'TH002', N'Nike Air Zoom Structure 24', 3390000, 10, 'sp006.png', NULL,0),
('SP007', 'TH003', N'E03 Grey', 455000, 20, 'sp007.png', NULL,0),
('SP008', 'TH003', N'D07 TAN-WHT', 344000, 20, 'sp008.png', NULL,0),
('SP009', 'TH003', N'D21 KHAKI WASH', 350000, 20, 'sp009.png', NULL,0),
('SP010', 'TH004', N'Puma Ralph Sampson', 1770000, 10, 'sp010.png', NULL,0),
('SP011', 'TH004', N'Puma Caracal Suede', 1770000, 10, 'sp011.png', NULL,0),
('SP012', 'TH004', N'Puma Clyde Stitch', 1990000, 10, 'sp012.png', NULL,0),
('SP013', 'TH005', N'Vans Caro', 350000, 30, 'sp013.png', NULL,0),
('SP014', 'TH005', N'Vans Old Skool', 640000, 20, 'sp014.png', NULL,0),
('SP015', 'TH005', N'Vans Retro Sport', 640000, 20, 'sp015.png', NULL,0);

CREATE TABLE NhaCungCap(
MaNCC VARCHAR(10) PRIMARY KEY,
TenNCC NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
SDT VARCHAR(15) NOT NULL,
Email VARCHAR(50) NOT NULL,
TrangThai BIT NOT NULL,
);

INSERT INTO NhaCungCap (MaNCC,TenNCC,DiaChi,SDT,Email,TrangThai) VALUES
('NCC011', N'Công ty Bình Tiên', N'Hải Dương', '0989237456', 'binhtien@gmail.com', 1),
('NCC022', N'Công ty giày da Xuân Hồng', N'Nam Định', '0979273458', 'xhong1@gmail.com', 1),
('NCC033', N'Công ty giày da Bắc Ninh', N'Bắc Ninh', '0234785985', 'bninh23@gmail.com', 1),
('NCC044', N'Công ty giày da Thái Bình', N'Thái Bình', '0934879289', 'tbinh2@gmail.com', 1),
('NCC055', N'Công ty giày da Lào Cai', N'Lào Cai', '0927781923', 'lcai@gmail.com', 1),
('NCC066', N'Công ty giày da Phú Thọ', N'Phú Thọ', '0909278111', 'ptho@gmail.com', 1),
('NCC077', N'Công ty giày da Quang Hà', N'Hà Nội', '0998476791', 'qha@gmail.com', 1),
('NCC088', N'Công ty giày da Trường Hải', N'Hà Nội', '0901923833', 'trhai@gmail.com', 1),
('NCC099', N'Công ty giày da Huy Hùng', N'Nam Định', '0902898737', 'hhung@gmail.com', 1),
('NCC101', N'Công ty giày da Kim Tiến', N'Hà Nam', '0909237123', 'ktien@gmail.com', 1);

CREATE TABLE KhachHang(
MaKH VARCHAR(10) PRIMARY KEY,
TenKH NVARCHAR(50) NOT NULL,
SDT VARCHAR(15) NOT NULL,
Email VARCHAR(50) NOT NULL,
NgaySinh DATE NOT NULL,
GioiTinh BIT NOT NULL,
TichDiem INT NOT NULL,
MaNV VARCHAR(10) NOT NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaNV) REFERENCES dbo.NhanVien(MaNV),
);

INSERT INTO KhachHang(MaKH,TenKH,SDT,Email,NgaySinh,GioiTinh,TichDiem,MaNV,TrangThai) VALUES
('KH001', N'Nguyễn Xuân Diệu', '0999888767', 'xdieu111@gmail.com', '19900228', 0, 300, 'PH17245', 1),
('KH002', N'Trần Quang Minh', '0990234545', 'quangminh12@gmail.com', '19950321', 1, 500, 'PH17245', 0),
('KH003', N'Định Thị Quỳnh', '0998563258', 'quynhdinh26@gmail.com', '19920522', 0, 400, 'PH17245', 0),
('KH004', N'Đặng Quang Đoàn', '0925398765', 'dangdoan22@gmail.com', '19930128', 1, 200, 'PH17245', 0),
('KH005', N'Ngô Hà Duy', '0909486254', 'haduy22@gmail.com', '19900220', 1, 300, 'PH17245', 0),
('KH006', N'Bùi Thị Duyên', '0902455322', 'duyen09@gmail.com', '19911109', 0, 1100, 'PH17245', 0),
('KH007', N'Đoàn Văn Trung', '0905683454', 'trung12@gmail.com', '19950810', 1, 900, 'PH17245', 0),
('KH008', N'Ngô Thùy Linh', '0909737175', 'linh08@gmail.com', '20000215', 0, 300, 'PH17245', 0),
('KH009', N'Nguyễn Nam Thành', '0903668233', 'thanh001@gmail.com', '19990209', 1, 100, 'PH17245', 0),
('KH010', N'Đinh Văn Tùng', '0992863432', 'tung88@gmail.com', '19980909', 1, 600, 'PH17245', 0);

CREATE TABLE KhuyenMai(
MaKM VARCHAR(10) PRIMARY KEY,
MaNV VARCHAR(10) NOT NULL,
TenKM NVARCHAR(30) NOT NULL,
GiaTri VARCHAR(5) NOT NULL,
NgayTao DATE NOT NULL,
NgayBatDau DATE NOT NULL,
NgayKetThuc DATE NOT NULL,
GhiChu NVARCHAR(50) NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaNV) REFERENCES dbo.NhanVien(MaNV),
);

INSERT INTO KhuyenMai (MaKM,MaNV,TenKM,GiaTri,NgayTao,NgayBatDau,NgayKetThuc,GhiChu,TrangThai) VALUES
('KM001', 'PH17245', N'Mừng Tết Dương Lịch', '10%', '20202812', '20210101', '20210102', NULL, 0),
('KM002', 'PH18383', N'Khai Xuân 2021', '30%', '20210207', '20210209', '20210212', NULL, 0),
('KM003', 'PH17481', N'Ngày Lễ Tình Nhân', '10%', '20210213', '20210214', '20210215', NULL, 0),
('KM004', 'PH17446', N'Quốc Tế Phụ Nữ', '20%', '20210307', '20210308', '20210309', NULL, 0),
('KM005', 'PH17245', N'Giỗ Tổ Hùng Vương', '10%', '20210419', '20210421','20210422', NULL, 0),
('KM006', 'PH17481', N'Hè Về Rực Rỡ', '20%', '20210518', '20210519', '20210525', NULL, 0),
('KM007', 'PH18383', N'Mừng Thiếu Nhi', '20%', '20210529', '20210601', '20210603', NULL, 0),
('KM008', 'PH17446', N'Tết Trung Thu', '10%', '20210919', '20210921', '20210923', NULL, 0),
('KM009', 'PH18383', N'Nhà Giáo Việt Nam', '10%', '20211118', '20211120', '20211121', NULL, 1);

CREATE TABLE HoaDonThanhToan(
MaHDThanhToan VARCHAR(10) PRIMARY KEY,
MaKhachHang VARCHAR(10) NOT NULL,
MaNhanVien VARCHAR(10) NOT NULL,
NgayThanhToan DATE NOT NULL,
DiemThuong INT NOT NULL,
GhiChu NVARCHAR(50) NULL,

FOREIGN KEY (MaKhachHang) REFERENCES dbo.KhachHang(MaKH),
FOREIGN KEY (MaNhanVien) REFERENCES dbo.NhanVien(MaNV),
);

insert into HoaDonThanhToan (MaHDThanhToan,MaKhachHang,MaNhanVien,NgayThanhToan,DiemThuong,GhiChu) values
('MHD001', 'KH001', 'PH18383', '20211115', 100, NULL),
('MHD002', 'KH002', 'PH18383', '20211115', 100, NULL),
('MHD003', 'KH003', 'PH18383', '20211115', 100, NULL),
('MHD004', 'KH004', 'PH17417', '20211116', 100, NULL),
('MHD005', 'KH005', 'PH17417', '20211116', 100, NULL),
('MHD006', 'KH006', 'PH17417', '20211116', 100, NULL),
('MHD007', 'KH007', 'PH17245', '20211117', 100, NULL),
('MHD008', 'KH008', 'PH17245', '20211117', 100, NULL),
('MHD009', 'KH009', 'PH17245', '20211117', 100, NULL),
('MHD010', 'KH010', 'PH17481', '20211118', 100, NULL),
('MHD011', 'KH011', 'PH17481', '20211118', 100, NULL),
('MHD012', 'KH012', 'PH17481', '20211118', 100, NULL),
('MHD013', 'KH013', 'PH17446', '20211119', 100, NULL),
('MHD014', 'KH014', 'PH17446', '20211119', 100, NULL),
('MHD015', 'KH015', 'PH17446', '20211119', 100, NULL);

CREATE TABLE ChiTietHoaDonThanhToan(
MaHDChiTiet VARCHAR(10) PRIMARY KEY,
MaHDThanhToan VARCHAR(10) NOT NULL,
MaKhuyenMai VARCHAR(10) NOT NULL,
MaSanPham VARCHAR(10) NOT NULL,
DonGia MONEY NOT NULL,
SoLuong INT NOT NULL,

FOREIGN KEY (MaHDThanhToan) REFERENCES dbo.HoaDonThanhToan(MaHDThanhToan),
FOREIGN KEY (MaKhuyenMai) REFERENCES dbo.KhuyenMai(MaKM),
FOREIGN KEY (MaSanPham) REFERENCES dbo.SanPham(MaSP),
);
insert into ChiTietHoaDonThanhToan(MaHDChiTiet,MaHDThanhToan,MaKhuyenMai,MaSanPham,DonGia,SoLuong) values

('HDCT01', 'MHD01', 'KM02', 'SP001', 200000, 2),
('HDCT02', 'MHD02', 'KM01', 'SP002', 500000, 1),
('HDCT03', 'MHD03', 'KM06', 'SP003', 400000, 1),
('HDCT04', 'MHD04', 'KM08', 'SP009', 150000, 1),
('HDCT05', 'MHD05', 'KM05', 'SP005', 600000, 2);
CREATE TABLE HoaDonNhapHang(
MaHDNhapHang VARCHAR(10) PRIMARY KEY,
MaNV VARCHAR(10) NOT NULL,
MaNCC VARCHAR(10) NOT NULL,
NgayNhapHang DATE NOT NULL,
GhiChu NVARCHAR(50) NULL,

FOREIGN KEY (MaNV) REFERENCES dbo.NhanVien(MaNV),
FOREIGN KEY (MaNCC) REFERENCES dbo.NhaCungCap(MaNCC),
);
insert into HoaDonNhapHang (MaHDNhapHang,MaNV,MaNCC,NgayNhapHang,GhiChu) values
('MHDNH001', 'PH18383', 'NCC011', '20211010', NULL),
('MHDNH002', 'PH17245', 'NCC055', '20210910', NULL),
('MHDNH003', 'PH17417', 'NCC077', '20210815', NULL),
('MHDNH004', 'PH17481', 'NCC022', '20211022', NULL),
('MHDNH005', 'PH17446', 'NCC099', '20210902', NULL);

CREATE TABLE ChiTietHoaDonNhapHang(
MaHDNhapHang VARCHAR(10) NOT NULL,
MaSP VARCHAR(10) NOT NULL,
GiaNhap MONEY NOT NULL,
SoLuong INT NOT NULL,

PRIMARY KEY (MaHDNhapHang, MaSP),
);
insert into ChiTietHoaDonNhapHang(MaHDNhapHang,MaSP,GiaNhap,SoLuong) values
('MHDNH01','SP01',500000,20),
('MHDNH02','SP05',400000,20),
('MHDNH03','SP07',300000,20),
('MHDNH04','SP02',450000,20),
('MHDNH05','SP09',700000,10);

