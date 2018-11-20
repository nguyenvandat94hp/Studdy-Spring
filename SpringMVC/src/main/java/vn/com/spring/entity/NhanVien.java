package vn.com.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NHANVIEN")
public class NhanVien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MANHANVIEN")
	private int maNhanVien;

	@Column(name = "HOTEN")
	private String hoTen;

	@Column(name = "DIACHI")
	private String diaChi;

	@Column(name = "GIOITINH")
	private Boolean gioiTinh;

	@Column(name = "CMND")
	private String cmnd;

	@OneToOne
	@JoinColumn(name = "MACHUCVU")
	private ChucVu chucVu;

	@Column(name = "TENDANGNHAP")
	private String tenDangNhap;

	@Column(name = "MATKHAU")
	private String matKhau;

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public NhanVien(int maNhanVien, String hoTen, String diaChi, boolean gioiTinh, String cmnd, ChucVu chucVu,
			String tenDangNhap, String matKhau) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.chucVu = chucVu;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}

	public NhanVien() {
	}

	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", gioiTinh="
				+ gioiTinh + ", cmnd=" + cmnd + ", chucVu=" + chucVu + ", tenDangNhap=" + tenDangNhap + ", matKhau="
				+ matKhau + "]";
	}

}