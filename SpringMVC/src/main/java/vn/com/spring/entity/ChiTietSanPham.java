package vn.com.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity(name = "CHITITETSANPHAM")
public class ChiTietSanPham {

	@Column(name = "MACHITIETSANPHAM")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maChiTietSanPham;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "MASANPHAM")
	private SanPham sanPham;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "MASIZE")
	private SizeSanPham maSize;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "MAMAU")
	private MauSanPham mAMAU;

	@Column(name = "SOLUONG")
	private int soLuong;

	@Column(name = "NGAYNHAP")
	private String ngayNhap;

	public int getMaChiTietSanPham() {
		return maChiTietSanPham;
	}

	public void setMaChiTietSanPham(int maChiTietSanPham) {
		this.maChiTietSanPham = maChiTietSanPham;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public SizeSanPham getMaSize() {
		return maSize;
	}

	public void setMaSize(SizeSanPham maSize) {
		this.maSize = maSize;
	}

	public MauSanPham getmAMAU() {
		return mAMAU;
	}

	public void setmAMAU(MauSanPham mAMAU) {
		this.mAMAU = mAMAU;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public ChiTietSanPham(int maChiTietSanPham, SanPham sanPham, SizeSanPham maSize, MauSanPham mAMAU, int soLuong,
			String ngayNhap) {
		super();
		this.maChiTietSanPham = maChiTietSanPham;
		this.sanPham = sanPham;
		this.maSize = maSize;
		this.mAMAU = mAMAU;
		this.soLuong = soLuong;
		this.ngayNhap = ngayNhap;
	}

	public ChiTietSanPham() {
		super();
	}
}
