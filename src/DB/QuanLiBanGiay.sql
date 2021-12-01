CREATE DATABASE QuanLiBanGiay
GO 

USE QuanLiBanGiay
GO

CREATE TABLE ThuongHieu(
MaThuongHieu VARCHAR(10) PRIMARY KEY,
TenThuongHieu NVARCHAR(20) NOT NULL,
TrangThai BIT NOT NULL,
);

INSERT INTO ThuongHieu(MaThuongHieu, TenThuongHieu,TrangThai) VALUES
('TH001', N'Adidas', 1),
('TH002', N'Nike', 1),
('TH003', N'Dincox', 1),
('TH004', N'Puma', 1),
('TH005', N'Vans', 1);

CREATE TABLE NhanVien(
MaNV VARCHAR(10) PRIMARY KEY,
TenNV NVARCHAR(50) NOT NULL,
MatKhau VARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NULL,
SDT VARCHAR(15) NULL,
Email VARCHAR(50) NULL,
NgaySinh DATE NULL,
GioiTinh BIT NULL,
AnhNV VARCHAR(30) NULL,
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
TenMau NVARCHAR(20) PRIMARY KEY,
);

INSERT INTO dbo.MauSac(TenMau) VALUES
(N'Hồng'),
(N'Xanh Nước'),
(N'Đỏ'),
(N'Đen'),
(N'Trắng');

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

CREATE TABLE NhaCungCap(
MaNCC VARCHAR(10) PRIMARY KEY,
TenNCC NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NULL,
SDT VARCHAR(15) NULL,
Email VARCHAR(50) NULL,
TrangThai BIT NOT NULL,
);

INSERT INTO NhaCungCap (MaNCC,TenNCC,DiaChi,SDT,Email,TrangThai) VALUES
('NCC011', N'Công ty Bình Tiên', N'Hải Dương', '0989237456', 'binhtien@gmail.com', 1),
('NCC022', N'Công ty giày da Xuân Hồng', N'Nam Định', '0979273458', 'xhong1@gmail.com', 1),
('NCC033', N'Công ty giày da Bắc Ninh', N'Bắc Ninh', '0234785985', 'bninh23@gmail.com', 1),
('NCC044', N'Công ty giày da Thái Bình', N'Thái Bình', '0934879289', 'tbinh2@gmail.com', 1),
('NCC055', N'Công ty giày da Lào Cai', N'Lào Cai', '0927781923', 'lcai@gmail.com', 1);

CREATE TABLE KhuyenMai(
MaKM VARCHAR(10) PRIMARY KEY,
MaNV VARCHAR(10) NOT NULL,
TenKM NVARCHAR(30) NULL,
NgayTao DATE NULL,
GhiChu NVARCHAR(50) NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaNV) REFERENCES dbo.NhanVien(MaNV),
);

INSERT INTO KhuyenMai (MaKM,MaNV,TenKM,NgayTao,GhiChu,TrangThai) VALUES
('00%', 'PH17417', N'Không Khuyến Mãi', '20201220', NULL, 1),
('10%', 'PH17245', N'Khuyến Mãi 10%', '20201220', NULL, 1),
('20%', 'PH18383', N'Khuyến Mãi 20%', '20201220', NULL, 1),
('30%', 'PH17481', N'Khuyến Mãi 30%', '20201220', NULL, 1),
('40%', 'PH17446', N'Khuyến Mãi 40%', '20201220', NULL, 0),
('50%', 'PH17245', N'Khuyến Mãi 50%', '20201220', NULL, 0),
('60%', 'PH17481', N'Khuyến Mãi 60%', '20201220', NULL, 0),
('70%', 'PH18383', N'Khuyến Mãi 70%', '20201220', NULL, 0),
('80%', 'PH17446', N'Khuyến Mãi 80%', '20201220', NULL, 0),
('90%', 'PH18383', N'Khuyến Mãi 90%', '20201220', NULL, 0);

CREATE TABLE SanPham(
MaSP VARCHAR(10) PRIMARY KEY,
MaThuongHieu VARCHAR(10) NOT NULL,
TenSanPham NVARCHAR(50) NOT NULL,
GiaBan MONEY NOT NULL,
SoLuong INT NOT NULL,
Mau NVARCHAR(20) NOT NULL,
Size INT NOT NULL,
MaKM VARCHAR(10) NOT NULL,
MaNCC VARCHAR(10) NOT NULL,
AnhSP VARCHAR(30) NULL,
ChiTiet NVARCHAR(50) NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (Mau) REFERENCES dbo.MauSac(TenMau),
FOREIGN KEY (Size) REFERENCES dbo.Size(Size),
FOREIGN KEY (MaKM) REFERENCES dbo.KhuyenMai(MaKM),
FOREIGN KEY (MaThuongHieu) REFERENCES dbo.ThuongHieu(MaThuongHieu),
);

INSERT INTO SanPham(MaSP,MaThuongHieu,TenSanPham,GiaBan,SoLuong,Mau,Size,MaKM,MaNCC,AnhSP,ChiTiet,TrangThai) VALUES
('SP001TR40', 'TH001', N'UltraBoost 21', 5000000, 10, N'Trắng', 40, '10%', 'NCC011', 'sp001trang.png', NULL, 1),
('SP001TR41', 'TH001', N'UltraBoost 21', 5000000, 11, N'Trắng', 41, '10%', 'NCC011', 'sp001trang.png', NULL, 1),
('SP001TR42', 'TH001', N'UltraBoost 21', 5000000, 10, N'Trắng', 42, '10%', 'NCC011', 'sp001trang.png', NULL, 1),
('SP001DEN40', 'TH001', N'UltraBoost 21', 5000000, 10, N'Đen', 40, '10%', 'NCC011', 'sp001den.png', NULL, 1),
('SP001DEN41', 'TH001', N'UltraBoost 21', 5000000, 10, N'Đen', 41, '10%', 'NCC011', 'sp001den.png', NULL, 1),
('SP001DEN42', 'TH001', N'UltraBoost 21', 5000000, 10, N'Đen', 42, '10%', 'NCC011', 'sp001den.png', NULL, 1),
('SP002DEN36', 'TH001', N'Alphabounce', 3000000, 10, N'Đen', 36, '20%', 'NCC055', 'sp002den.png', NULL, 1),
('SP002DEN37', 'TH001', N'Alphabounce', 3000000, 10, N'Đen', 37, '20%', 'NCC055', 'sp002den.png', NULL, 1),
('SP002DEN38', 'TH001', N'Alphabounce', 3000000, 10, N'Đen', 38, '20%', 'NCC055', 'sp002den.png', NULL, 1),
('SP002DEN39', 'TH001', N'Alphabounce', 3000000, 11, N'Đen', 39, '20%', 'NCC055', 'sp002den.png', NULL, 1),
('SP002TR39', 'TH001', N'Alphabounce', 3000000, 11, N'Trắng', 39, '20%', 'NCC055', 'sp002trang.png', NULL, 1),
('SP002TR40', 'TH001', N'Alphabounce', 3000000, 11, N'Trắng', 40, '20%', 'NCC055', 'sp002trang.png', NULL, 1),
('SP002TR41', 'TH001', N'Alphabounce', 3000000, 11, N'Trắng', 41, '20%', 'NCC055', 'sp002trang.png', NULL, 1),
('SP003DEN41', 'TH001', N'ZX 1K Boost', 2500000, 11, N'Đen', 41, '10%', 'NCC022', 'sp003den.png', NULL, 1),
('SP003DEN42', 'TH001', N'ZX 1K Boost', 2500000, 12, N'Đen', 42, '10%', 'NCC022', 'sp003den.png', NULL, 1),
('SP003DEN43', 'TH001', N'ZX 1K Boost', 2500000, 10, N'Đen', 43, '10%', 'NCC022', 'sp003den.png', NULL, 1),
('SP003DEN44', 'TH001', N'ZX 1K Boost', 2500000, 10, N'Đen', 44, '10%', 'NCC022', 'sp003den.png', NULL, 1),
('SP003TR41', 'TH001', N'ZX 1K Boost', 2500000, 12, N'Trắng', 41, '10%', 'NCC022', 'sp003trang.png', NULL, 1),
('SP003TR42', 'TH001', N'ZX 1K Boost', 2500000, 11, N'Trắng', 42, '10%', 'NCC022', 'sp003trang.png', NULL, 1),
('SP003TR43', 'TH001', N'ZX 1K Boost', 2500000, 11, N'Trắng', 43, '10%', 'NCC022', 'sp003trang.png', NULL, 1),
('SP004XA40', 'TH002', N'Nike Revolution 5 Nam', 1790000, 14, N'Xanh Nước', 40, '30%', 'NCC033', 'sp004xanh.png', NULL, 1),
('SP004XA41', 'TH002', N'Nike Revolution 5 Nam', 1790000, 13, N'Xanh Nước', 41, '30%', 'NCC033', 'sp004xanh.png', NULL, 1),
('SP004XA42', 'TH002', N'Nike Revolution 5 Nam', 1790000, 15, N'Xanh Nước', 42, '30%', 'NCC033', 'sp004xanh.png', NULL, 1),
('SP004XA43', 'TH002', N'Nike Revolution 5 Nam', 1790000, 12, N'Xanh Nước', 43, '30%', 'NCC033', 'sp004xanh.png', NULL, 1),
('SP004XA44', 'TH002', N'Nike Revolution 5 Nam', 1790000, 10, N'Xanh Nước', 44, '30%', 'NCC033', 'sp004xanh.png', NULL, 1),
('SP004DEN39', 'TH002', N'Nike Revolution 5 Nam', 1790000, 14, N'Đen', 39, '30%', 'NCC033', 'sp004den.png', NULL, 1),
('SP004DEN40', 'TH002', N'Nike Revolution 5 Nam', 1790000, 13, N'Đen', 40, '30%', 'NCC033', 'sp004den.png', NULL, 1),
('SP004DEN41', 'TH002', N'Nike Revolution 5 Nam', 1790000, 12, N'Đen', 41, '30%', 'NCC033', 'sp004den.png', NULL, 1),
('SP005HO36', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 13, N'Hồng', 36, '20%', 'NCC022', 'sp005hong.png', NULL, 1),
('SP005HO37', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 14, N'Hồng', 37, '20%', 'NCC022', 'sp005hong.png', NULL, 1),
('SP005HO38', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 14, N'Hồng', 38, '20%', 'NCC022', 'sp005hong.png', NULL, 1),
('SP005HO39', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 14, N'Hồng', 39, '20%', 'NCC022', 'sp005hong.png', NULL, 1),
('SP005TR37', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 13, N'Trắng', 37, '20%', 'NCC022', 'sp005trang.png', NULL, 1),
('SP005TR38', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 14, N'Trắng', 38, '20%', 'NCC022', 'sp005trang.png', NULL, 1),
('SP005TR39', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 14, N'Trắng', 39, '20%', 'NCC022', 'sp005trang.png', NULL, 1),
('SP005DEN37', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 14, N'Đen', 37, '20%', 'NCC022', 'sp005den.png', NULL, 1),
('SP005DEN38', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 14, N'Đen', 38, '20%', 'NCC022', 'sp005den.png', NULL, 1),
('SP005DEN39', 'TH002', N'Nike Zoom Fly 3 Nữ', 3690000, 14, N'Đen', 39, '20%', 'NCC022', 'sp005trang.png', NULL, 1),
('SP006TR37', 'TH003', N'D21 KHAKI WASH', 282000, 19, N'Trắng', 37, '00%', 'NCC011', 'sp006trang.png', NULL, 1),
('SP006TR38', 'TH003', N'D21 KHAKI WASH', 282000, 18, N'Trắng', 38, '00%', 'NCC011', 'sp006trang.png', NULL, 1),
('SP006TR39', 'TH003', N'D21 KHAKI WASH', 282000, 19, N'Trắng', 39, '00%', 'NCC011', 'sp006trang.png', NULL, 1),
('SP006TR40', 'TH003', N'D21 KHAKI WASH', 282000, 19, N'Trắng', 40, '00%', 'NCC011', 'sp006trang.png', NULL, 1),
('SP006DEN38', 'TH003', N'D21 KHAKI WASH', 282000, 17, N'Đen', 38, '00%', 'NCC011', 'sp006den.png', NULL, 1),
('SP006DEN39', 'TH003', N'D21 KHAKI WASH', 282000, 17, N'Đen', 39, '00%', 'NCC011', 'sp006den.png', NULL, 1),
('SP006DEN40', 'TH003', N'D21 KHAKI WASH', 282000, 19, N'Đen', 40, '00%', 'NCC011', 'sp006den.png', NULL, 1),
('SP006XA39', 'TH003', N'D21 KHAKI WASH', 282000, 19, N'Xanh Nước', 39, '00%', 'NCC011', 'sp006xanh.png', NULL, 1),
('SP006XA40', 'TH003', N'D21 KHAKI WASH', 282000, 16, N'Xanh Nước', 40, '00%', 'NCC011', 'sp006xanh.png', NULL, 1),
('SP006XA41', 'TH003', N'D21 KHAKI WASH', 282000, 19, N'Xanh Nước', 41, '00%', 'NCC011', 'sp006xanh.png', NULL, 1),
('SP007TR40', 'TH004', N'Puma Ralph Sampson', 1770000, 12, N'Trắng', 40, '10%', 'NCC022', 'sp007trang.png', NULL, 1),
('SP007TR41', 'TH004', N'Puma Ralph Sampson', 1770000, 13, N'Trắng', 41, '10%', 'NCC022', 'sp007trang.png', NULL, 1),
('SP007TR42', 'TH004', N'Puma Ralph Sampson', 1770000, 12, N'Trắng', 42, '10%', 'NCC022', 'sp007trang.png', NULL, 1),
('SP007TR43', 'TH004', N'Puma Ralph Sampson', 1770000, 12, N'Trắng', 43, '10%', 'NCC022', 'sp007trang.png', NULL, 1),
('SP007DEN39', 'TH004', N'Puma Ralph Sampson', 1770000, 14, N'Đen', 39, '10%', 'NCC022', 'sp007den.png', NULL, 1),
('SP007DEN40', 'TH004', N'Puma Ralph Sampson', 1770000, 13, N'Đen', 40, '10%', 'NCC022', 'sp007den.png', NULL, 1),
('SP007DEN41', 'TH004', N'Puma Ralph Sampson', 1770000, 13, N'Đen', 41, '10%', 'NCC022', 'sp007den.png', NULL, 1),
('SP007DEN42', 'TH004', N'Puma Ralph Sampson', 1770000, 12, N'Đen', 42, '10%', 'NCC022', 'sp007den.png', NULL, 1),
('SP007XA40', 'TH004', N'Puma Ralph Sampson', 1770000, 13, N'Xanh Nước', 40, '10%', 'NCC022', 'sp007xanh.png', NULL, 1),
('SP007XA41', 'TH004', N'Puma Ralph Sampson', 1770000, 14, N'Xanh Nước', 41, '10%', 'NCC022', 'sp007xanh.png', NULL, 1),
('SP007XA42', 'TH004', N'Puma Ralph Sampson', 1770000, 13, N'Xanh Nước', 42, '10%', 'NCC022', 'sp007xanh.png', NULL, 1),
('SP008TR40', 'TH004', N'Puma Clyde Stitch', 1990000, 13, N'Trắng', 40, '10%', 'NCC044', 'sp008trang.png', NULL, 1),
('SP008TR41', 'TH004', N'Puma Clyde Stitch', 1990000, 14, N'Trắng', 41, '10%', 'NCC044', 'sp008trang.png', NULL, 1),
('SP008TR42', 'TH004', N'Puma Clyde Stitch', 1990000, 13, N'Trắng', 42, '10%', 'NCC044', 'sp008trang.png', NULL, 1),
('SP008DEN41', 'TH004', N'Puma Clyde Stitch', 1990000, 12, N'Đen', 41, '10%', 'NCC044', 'sp008den.png', NULL, 1),
('SP008DEN42', 'TH004', N'Puma Clyde Stitch', 1990000, 13, N'Đen', 42, '10%', 'NCC044', 'sp008den.png', NULL, 1),
('SP008DEN43', 'TH004', N'Puma Clyde Stitch', 1990000, 13, N'Đen', 43, '10%', 'NCC044', 'sp008den.png', NULL, 1);

CREATE TABLE KhachHang(
MaKH VARCHAR(10) PRIMARY KEY,
TenKH NVARCHAR(50) NOT NULL,
SDT VARCHAR(15) NOT NULL,
Email VARCHAR(50) NULL,
NgaySinh DATE NULL,
GioiTinh BIT NOT NULL,
TichDiem INT NOT NULL,
MaNV VARCHAR(10) NOT NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaNV) REFERENCES dbo.NhanVien(MaNV),
);

INSERT INTO KhachHang(MaKH,TenKH,SDT,Email,NgaySinh,GioiTinh,TichDiem,MaNV,TrangThai) VALUES
('KH001', N'Nguyễn Xuân Diệu', '0999888767', 'xdieu111@gmail.com', '19900228', 0, 100, 'PH18383', 1),
('KH002', N'Trần Quang Minh', '0990234545', 'quangminh12@gmail.com', '19950321', 1, 100, 'PH18383', 1),
('KH003', N'Định Thị Quỳnh', '0998563258', 'quynhdinh26@gmail.com', '19920522', 0, 100, 'PH18383', 1),
('KH004', N'Đặng Quang Đoàn', '0925398765', 'dangdoan22@gmail.com', '19930128', 1, 100, 'PH17417', 1),
('KH005', N'Ngô Hà Duy', '0909486254', 'haduy22@gmail.com', '19900220', 1, 100, 'PH17417', 1),
('KH006', N'Bùi Thị Duyên', '0902455322', 'duyen09@gmail.com', '19911109', 0, 100, 'PH17417', 1),
('KH007', N'Đoàn Văn Trung', '0905683454', 'trung12@gmail.com', '19950810', 1, 100, 'PH17245', 1),
('KH008', N'Ngô Thùy Linh', '0909737175', 'linh08@gmail.com', '20000215', 0, 100, 'PH17245', 1),
('KH009', N'Nguyễn Nam Thành', '0903668233', 'thanh001@gmail.com', '19990209', 1, 100, 'PH17245', 1),
('KH010', N'Đinh Văn Tùng', '0992863432', 'tung88@gmail.com', '19980909', 1, 100, 'PH17481', 1),
('KH011', N'Đoàn Phú Thái', '0972863432', 'thai321@gmail.com', '20021009', 1, 100, 'PH17481', 1),
('KH012', N'Trịnh Tiến Lực', '0962862432', 'luc307@gmail.com', '20020209', 1, 100, 'PH17481', 1),
('KH013', N'Nguyễn Quang Toan', '0777348002', 'toan123@gmail.com', '20021103', 1, 100, 'PH17446', 1),
('KH014', N'Lý Thị Nga', '0981287652', 'lynnga123@gmail.com', '20020826', 0, 100, 'PH17446', 1),
('KH015', N'Nguyễn Viết Thiệu', '0902863432', 'thieu28@gmail.com', '20021030', 1, 100, 'PH17446', 1);

CREATE TABLE HoaDonThanhToan(
MaHDThanhToan VARCHAR(12) PRIMARY KEY,
MaKhachHang VARCHAR(10) NOT NULL,
MaNhanVien VARCHAR(10) NOT NULL,
NgayThanhToan DATE NULL,
DiemThuong INT NOT NULL,
DoiDiem INT NOT NULL,
GhiChu NVARCHAR(50) NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaKhachHang) REFERENCES dbo.KhachHang(MaKH),
FOREIGN KEY (MaNhanVien) REFERENCES dbo.NhanVien(MaNV),
);

INSERT INTO dbo.HoaDonThanhToan (MaHDThanhToan,MaKhachHang,MaNhanVien,NgayThanhToan,DiemThuong,DoiDiem,GhiChu,TrangThai) VALUES
('211115A8H35S', 'KH001', 'PH18383', '20211115', 100, 0, NULL, 1),
('211115UE18SA', 'KH002', 'PH18383', '20211115', 100, 0, NULL, 1),
('2111151HUS9A', 'KH003', 'PH18383', '20211115', 100, 0, NULL, 1),
('2111167SAJHX', 'KH004', 'PH17417', '20211116', 100, 0, NULL, 1),
('211116HU18SA', 'KH005', 'PH17417', '20211116', 100, 0, NULL, 1),
('211116H1US9A', 'KH006', 'PH17417', '20211116', 100, 0, NULL, 1),
('211117HU1A9Z', 'KH007', 'PH17245', '20211117', 100, 0, NULL, 1),
('211117HU198S', 'KH008', 'PH17245', '20211117', 100, 0, NULL, 1),
('211117JZU82A', 'KH009', 'PH17245', '20211117', 100, 0, NULL, 1),
('211118UHX1UA', 'KH010', 'PH17481', '20211118', 100, 0, NULL, 1),
('211118H1U9SA', 'KH011', 'PH17481', '20211118', 100, 0, NULL, 1),
('211118HXU981', 'KH012', 'PH17481', '20211118', 100, 0, NULL, 1),
('211119KCO813', 'KH013', 'PH17446', '20211119', 100, 0, NULL, 1),
('211119ZIXUA9', 'KH014', 'PH17446', '20211119', 100, 0, NULL, 1),
('211119N1JS90', 'KH015', 'PH17446', '20211119', 100, 0, NULL, 1);

CREATE TABLE ChiTietHoaDonThanhToan(
MaHDThanhToan VARCHAR(12) NOT NULL,
MaSanPham VARCHAR(10) NOT NULL,
DonGia MONEY NOT NULL,
SoLuong INT NOT NULL,
KhuyenMai VARCHAR(10) NOT NULL,
TrangThai BIT NOT NULL,

FOREIGN KEY (MaHDThanhToan) REFERENCES dbo.HoaDonThanhToan(MaHDThanhToan),
FOREIGN KEY (MaSanPham) REFERENCES dbo.SanPham(MaSP),
PRIMARY KEY (MaHDThanhToan, MaSanPham),
);

INSERT INTO dbo.ChiTietHoaDonThanhToan (MaHDThanhToan,MaSanPham,DonGia,SoLuong,KhuyenMai,TrangThai) VALUES
('211115A8H35S', 'SP001TR40', 5000000, 1, '10%', 1),
('211115A8H35S', 'SP001TR41', 5000000, 1, '10%', 1),
('211115A8H35S', 'SP002DEN36', 3000000, 2, '20%', 1),
('211115A8H35S', 'SP002DEN39', 3000000, 1, '20%', 1),
('211115UE18SA', 'SP002DEN38', 3000000, 1, '20%', 1),
('2111151HUS9A', 'SP003DEN41', 2500000, 1, '10%', 1),
('2111167SAJHX', 'SP006TR40', 282000, 1, '00%', 1),
('211116HU18SA', 'SP007DEN41', 1770000, 1, '10%', 1),
('211116H1US9A', 'SP004XA44', 1790000, 1, '30%', 1),
('211117HU1A9Z', 'SP001TR42', 5000000, 1, '10%', 1),
('211117HU198S', 'SP005HO38', 3690000, 1, '20%', 1),
('211117JZU82A', 'SP002DEN39', 3000000, 1, '20%', 1),
('211118UHX1UA', 'SP004XA41', 1790000, 1, '30%', 1),
('211118H1U9SA', 'SP002DEN37', 3000000, 1, '20%', 1),
('211118HXU981', 'SP001DEN41', 5000000, 1, '10%', 1),
('211119KCO813', 'SP006XA40', 282000, 1, '00%', 1),
('211119ZIXUA9', 'SP007DEN42', 1770000, 1, '10%', 1),
('211119N1JS90', 'SP003DEN43', 2500000, 1, '10%', 1);

CREATE TABLE HoaDonNhapHang(
MaHDNhapHang VARCHAR(12) PRIMARY KEY,
MaNV VARCHAR(10) NOT NULL,
MaNCC VARCHAR(10) NOT NULL,
NgayNhapHang DATE NOT NULL,
GhiChu NVARCHAR(50) NULL,

FOREIGN KEY (MaNV) REFERENCES dbo.NhanVien(MaNV),
FOREIGN KEY (MaNCC) REFERENCES dbo.NhaCungCap(MaNCC),
);

INSERT INTO HoaDonNhapHang (MaHDNhapHang,MaNV,MaNCC,NgayNhapHang,GhiChu) VALUES
('210810US828A', 'PH18383', 'NCC011', '20210810', NULL),
('210818USHU9X', 'PH17245', 'NCC022', '20210818', NULL),
('210910HUAO8X', 'PH17417', 'NCC022', '20210910', NULL),
('210928HAUSU9', 'PH17481', 'NCC055', '20210928', NULL),
('211002AHUX9A', 'PH17446', 'NCC044', '20211002', NULL),
('211022873JSA', 'PH17417', 'NCC033', '20211022', NULL);
 
CREATE TABLE ChiTietHoaDonNhapHang(
MaHDNhapHang VARCHAR(12) NOT NULL,
MaSP VARCHAR(10) NOT NULL,
GiaNhap MONEY NOT NULL,
SoLuong INT NOT NULL,

FOREIGN KEY (MaHDNhapHang) REFERENCES dbo.HoaDonNhapHang(MaHDNhapHang),
FOREIGN KEY (MaSP) REFERENCES dbo.SanPham(MaSP),
PRIMARY KEY (MaHDNhapHang, MaSP),
);

INSERT INTO ChiTietHoaDonNhapHang(MaHDNhapHang,MaSP,GiaNhap,SoLuong) VALUES
('210810US828A', 'SP001TR40', 3500000, 11),
('210810US828A', 'SP001TR41', 3500000, 11),
('210810US828A', 'SP001TR42', 3500000, 11),
('210810US828A', 'SP001DEN40', 3500000, 10),
('210810US828A', 'SP001DEN41', 3500000, 11),
('210810US828A', 'SP001DEN42', 3500000, 10),
('210810US828A', 'SP006DEN38', 150000, 17),
('210810US828A', 'SP006DEN39', 150000, 17),
('210810US828A', 'SP006DEN40', 150000, 19),
('210810US828A', 'SP006TR37', 150000, 19),
('210810US828A', 'SP006TR38', 150000, 18),
('210810US828A', 'SP006TR39', 150000, 19),
('210810US828A', 'SP006TR40', 150000, 20),
('210810US828A', 'SP006XA39', 150000, 19),
('210810US828A', 'SP006XA40', 150000, 17),
('210810US828A', 'SP006XA41', 150000, 19),
('210818USHU9X', 'SP003DEN41', 1500000, 12),
('210818USHU9X', 'SP003DEN42', 1500000, 12),
('210818USHU9X', 'SP003DEN43', 1500000, 11),
('210818USHU9X', 'SP003DEN44', 1500000, 10),
('210818USHU9X', 'SP003TR41', 1500000, 12),
('210818USHU9X', 'SP003TR42', 1500000, 11),
('210818USHU9X', 'SP003TR43', 1500000, 11),
('210818USHU9X', 'SP005DEN37', 2000000, 14),
('210818USHU9X', 'SP005DEN38', 2000000, 14),
('210818USHU9X', 'SP005DEN39', 2000000, 14),
('210818USHU9X', 'SP005HO36', 2000000, 13),
('210818USHU9X', 'SP005HO37', 2000000, 14),
('210818USHU9X', 'SP005HO38', 2000000, 15),
('210818USHU9X', 'SP005HO39', 2000000, 14),
('210818USHU9X', 'SP005TR37', 2000000, 13),
('210818USHU9X', 'SP005TR38', 2000000, 14),
('210818USHU9X', 'SP005TR39', 2000000, 14),
('210910HUAO8X', 'SP007DEN39', 1200000, 14),
('210910HUAO8X', 'SP007DEN40', 1200000, 13),
('210910HUAO8X', 'SP007DEN41', 1200000, 14),
('210910HUAO8X', 'SP007DEN42', 1200000, 13),
('210910HUAO8X', 'SP007TR40', 1200000, 12),
('210910HUAO8X', 'SP007TR41', 1200000, 13),
('210910HUAO8X', 'SP007TR42', 1200000, 12),
('210910HUAO8X', 'SP007TR43', 1200000, 12),
('210910HUAO8X', 'SP007XA40', 1200000, 13),
('210910HUAO8X', 'SP007XA41', 1200000, 14),
('210910HUAO8X', 'SP007XA42', 1200000, 13),
('210928HAUSU9', 'SP002DEN36', 2000000, 10),
('210928HAUSU9', 'SP002DEN37', 2000000, 11),
('210928HAUSU9', 'SP002DEN38', 2000000, 11),
('210928HAUSU9', 'SP002DEN39', 2000000, 12),
('210928HAUSU9', 'SP002TR39', 2000000, 11),
('210928HAUSU9', 'SP002TR40', 2000000, 11),
('210928HAUSU9', 'SP002TR41', 2000000, 11),
('211002AHUX9A', 'SP008DEN41', 1200000, 12),
('211002AHUX9A', 'SP008DEN42', 1200000, 13),
('211002AHUX9A', 'SP008DEN43', 1200000, 13),
('211002AHUX9A', 'SP008TR40', 1200000, 13),
('211002AHUX9A', 'SP008TR41', 1200000, 14),
('211002AHUX9A', 'SP008TR42', 1200000, 13),
('211022873JSA', 'SP004DEN39', 1000000, 14),
('211022873JSA', 'SP004DEN40', 1000000, 12),
('211022873JSA', 'SP004DEN41', 1000000, 13),
('211022873JSA', 'SP004XA40', 1000000, 14),
('211022873JSA', 'SP004XA41', 1000000, 14),
('211022873JSA', 'SP004XA42', 1000000, 15),
('211022873JSA', 'SP004XA43', 1000000, 12),
('211022873JSA', 'SP004XA44', 1000000, 11);

INSERT INTO dbo.NhanVien VALUES
('PH17000', N'Nguyễn Bá A', 'baha123', N'Hà Nội', '0325878373', 'hanbph17245@fpt.edu.vn', '20020516', 1, 'baha123.jpg', 0, 1, NULL),
('PH17001', N'Nguyễn Phú B', 'quang123', N'Hà Nội', '0936352884', 'quangnpph17417@fpt.edu.vn', '20021004', 1, 'quang123.jpg', 0, 1, NULL),
('PH17002', N'Nguyễn Công C', 'truong123', N'Hà Nội', '0964853798', 'truongncph17481@fpt.edu.vn', '20020722', 1, 'truong123.jpg', 0, 1, NULL),
('PH18003', N'Nguyễn Văn D', 'vanhuy123', N'Hà Nội', '0338327433', 'huynvph18383@fpt.edu.vn', '20020222', 1, 'vanhuy123.jpg', 0, 1, NULL),
('PH17004', N'Nguyễn Tiến E', 'tienhai123', N'Hà Nội', '0347766383', 'haintph17446@fpt.edu.vn', '20021223', 1, 'tienhai123.jpg', 0, 1, NULL);

INSERT INTO KhachHang(MaKH,TenKH,SDT,Email,NgaySinh,GioiTinh,TichDiem,MaNV,TrangThai) VALUES
('KH016', N'Nguyễn Xuân A', '0999888766', 'xdieu1114@gmail.com', '19900228', 0, 300, 'PH18383', 0),
('KH017', N'Trần Quang B', '0990234545', 'quangminh124@gmail.com', '19950321', 1, 500, 'PH18383', 0),
('KH018', N'Định Thị C', '0998563257', 'quynhdinh264@gmail.com', '19920522', 0, 400, 'PH18383', 0),
('KH019', N'Đặng Quang D', '0925398766', 'dangdoan224@gmail.com', '19930128', 1, 200, 'PH17417', 0),
('KH020', N'Ngô Hà E', '0909486251', 'haduy224@gmail.com', '19900220', 1, 300, 'PH17417', 0),
('KH021', N'Bùi Thị F', '0902455321', 'duyen094@gmail.com', '19911109', 0, 1100, 'PH17417', 0),
('KH022', N'Đoàn Văn G', '0905683451', 'trung124@gmail.com', '19950810', 1, 900, 'PH17245', 0),
('KH023', N'Ngô Thùy H', '0909737171', 'linh084@gmail.com', '20000215', 0, 300, 'PH17245', 0),
('KH024', N'Nguyễn Nam I', '0903668231', 'thanh0014@gmail.com', '19990209', 1, 100, 'PH17245', 0),
('KH025', N'Đinh Văn K', '0992863431', 'tung884@gmail.com', '19980909', 1, 600, 'PH17481', 0),
('KH026', N'Đoàn Phú L', '0972863431', 'thai3214@gmail.com', '20021009', 1, 700, 'PH17481', 0),
('KH027', N'Trịnh Tiến M', '0962862431', 'luc3074@gmail.com', '20020209', 1, 400, 'PH17481', 0),
('KH028', N'Nguyễn Quang N', '0777348001', 'toan1234@gmail.com', '20021103', 1, 500, 'PH17446', 0),
('KH029', N'Lý Thị O', '0981287651', 'lynnga1234@gmail.com', '20020826', 0, 200, 'PH17446', 0),
('KH030', N'Nguyễn Viết P', '0902863431', 'thieu284@gmail.com', '20021030', 1, 400, 'PH17446', 0);

INSERT INTO NhaCungCap (MaNCC,TenNCC,DiaChi,SDT,Email,TrangThai) VALUES
('NCC066', N'Công ty Bình Tiên', N'Hải Dương', '0989237456', 'binhtien@gmail.com', 0),
('NCC077', N'Công ty giày da Xuân Hồng', N'Nam Định', '0979273458', 'xhong1@gmail.com', 0),
('NCC088', N'Công ty giày da Bắc Ninh', N'Bắc Ninh', '0234785985', 'bninh23@gmail.com', 0),
('NCC099', N'Công ty giày da Thái Bình', N'Thái Bình', '0934879289', 'tbinh2@gmail.com', 0),
('NCC101', N'Công ty giày da Lào Cai', N'Lào Cai', '0927781923', 'lcai@gmail.com', 0);

SELECT A.MaSP, A.MaThuongHieu, A.TenSanPham, A.GiaBan, A.SoLuong,
A.MaMau, A.Size, B.GiaTri, A.MaNCC, A.AnhSP, A.ChiTiet 
FROM dbo.SanPham A JOIN dbo.KhuyenMai B ON B.MaKM = A.MaKM
WHERE A.MaThuongHieu = 'TH001' AND A.TenSanPham LIKE '%c%'
ORDER BY A.MaSP OFFSET 0 * 20 
ROWS FETCH NEXT 20 ROWS ONLY;

SELECT * FROM dbo.SanPham
SELECT * FROM dbo.MauSac ORDER BY MaMau
SELECT * FROM dbo.Size

SELECT * FROM dbo.NhanVien WHERE TrangThai = 0

SELECT * FROM dbo.SanPham
WHERE MaThuongHieu LIKE '%%'
	  AND Mau LIKE '%%'
	  AND Size LIKE '%40%' 
	  AND GiaBan BETWEEN 0 AND 50000000 
	  AND TenSanPham LIKE '%a%'
ORDER BY MaSP OFFSET 0 * 20 ROWS FETCH NEXT 20 ROWS ONLY;


select * from HoaDonThanhToan
SELECT * FROM dbo.ChiTietHoaDonThanhToan 
WHERE MaNhanVien LIKE '%PH17417%'
	  AND DAY(NgayThanhToan) LIKE ?
	  AND MONTH(NgayThanhToan) LIKE ?
ORDER BY MaHDThanhToan OFFSET 0 * 15 ROWS FETCH NEXT 15 ROWS ONLY;

SELECT A.MaSanPham, B.TenSanPham, B.Mau, B.Size, A.DonGia, A.SoLuong, B.MaKM, A.DoiDiem
FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.SanPham B ON B.MaSP = A.MaSanPham
WHERE MaHDThanhToan=?
ORDER BY MaHDThanhToan OFFSET ? * 5 ROWS FETCH NEXT 5 ROWS ONLY;

SELECT A.MaHDThanhToan, A.MaSanPham, B.TenSanPham, B.Mau, B.Size, A.DonGia, A.SoLuong, B.MaKM
FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.SanPham B ON B.MaSP = A.MaSanPham
				WHERE A.MaHDThanhToan='211115A8H35S' AND A.TrangThai=1
				ORDER BY A.MaSanPham OFFSET 0 * 5 ROWS FETCH NEXT 5 ROWS ONLY;

SELECT * FROM dbo.KhachHang
SELECT * FROM dbo.HoaDonThanhToan
SELECT * FROM dbo.ChiTietHoaDonThanhToan where MaHDThanhToan = '211201QXNKEN'
UPDATE dbo.KhachHang SET SDT = '0936352884' WHERE MaKH = 'KH100';

DELETE FROM dbo.HoaDonThanhToan WHERE MaHDThanhToan = '211201QXNKEN'

SELECT * FROM dbo.HoaDonThanhToan
WHERE MaHDThanhToan LIKE ?
AND NgayThanhToan BETWEEN ? AND ?
ORDER BY MaHDThanhToan OFFSET ? * 15 ROWS FETCH NEXT 15 ROWS ONLY;

SELECT A.MaHDNhapHang, A.MaSP, B.TenSanPham, C.TenThuongHieu, A.GiaNhap, A.SoLuong, D.NgayNhapHang, D.MaNV, D.MaNCC
FROM dbo.ChiTietHoaDonNhapHang A JOIN dbo.SanPham B ON B.MaSP = A.MaSP 
JOIN dbo.ThuongHieu C ON C.MaThuongHieu = B.MaThuongHieu
JOIN dbo.HoaDonNhapHang D ON D.MaHDNhapHang = A.MaHDNhapHang
WHERE D.MaNCC= 'NCC066'
ORDER BY A.MaSP OFFSET ? * 8 ROWS FETCH NEXT 8 ROWS ONLY;

SELECT * FROM dbo.ChiTietHoaDonNhapHang
SELECT * FROM dbo.SanPham
SELECT * FROM dbo.HoaDonNhapHang

SELECT A.MaHDThanhToan, A.MaSanPham, B.TenSanPham, B.Mau, B.Size, A.DonGia, A.SoLuong, B.MaKM
FROM dbo.ChiTietHoaDonThanhToan A JOIN dbo.SanPham B ON B.MaSP = A.MaSanPham
WHERE A.MaHDThanhToan='211201NVQXTH' AND A.TrangThai=1
ORDER BY A.MaSanPham OFFSET 0 * 5 ROWS FETCH NEXT 5 ROWS ONLY;

SELECT * FROM dbo.ChiTietHoaDonThanhToan
SELECT * FROM dbo.HoaDonThanhToan
SELECT * FROM dbo.SanPham
SELECT * FROM dbo.KhachHang

UPDATE dbo.SanPham SET SoLuong=Soluong-1 WHERE MaSP='SP001DEN42'

UPDATE dbo.ChiTietHoaDonThanhToan SET TrangThai=0 WHERE MaHDThanhToan=? AND MaSanPham=?
UPDATE dbo.ChiTietHoaDonThanhToan SET SoLuong=SoLuong-? WHERE MaHDThanhToan=? AND MaSanPham=?