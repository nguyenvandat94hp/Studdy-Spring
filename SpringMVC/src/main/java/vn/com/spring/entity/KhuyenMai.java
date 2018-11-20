package vn.com.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "KHUYENMAI")
public class KhuyenMai {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAKHUYENMAI")
	private int maKhuyenMai;

	@Column(name = "TENKHUYENMAI")
	private String tenKhuyenMai;

	@Column(name = "THOIGIANBATDAU")
	private String thoiGianBatDau;

	@Column(name = "THOIGIANKETTHUC")
	private String thoiGianKetThuc;

	@Column(name = "MOTA")
	private String moTa;

	@Column(name = "HINHKHUYENMAI")
	private String hinhKhuyenMai;

	@Column(name = "GIAGIAM")
	private int giaGiam;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CHITIETKHUYENMAI", joinColumns = {
			@JoinColumn(name = "maKhuyenMai", referencedColumnName = "maKhuyenMai") }, inverseJoinColumns = {
					@JoinColumn(name = "maSanPham", referencedColumnName = "maSanPham") })
	Set<SanPham> danhSachSanPham;

	public int getGiaGiam() {
		return giaGiam;
	}

	public void setGiaGiam(int giaGiam) {
		this.giaGiam = giaGiam;
	}

	public int getMaKhuyenMai() {
		return maKhuyenMai;
	}

	public void setMaKhuyenMai(int maKhuyenMai) {
		this.maKhuyenMai = maKhuyenMai;
	}

	public String getTenKhuyenMai() {
		return tenKhuyenMai;
	}

	public void setTenKhuyenMai(String tenKhuyenMai) {
		this.tenKhuyenMai = tenKhuyenMai;
	}

	public String getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(String thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public String getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(String thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getHinhKhuyenMai() {
		return hinhKhuyenMai;
	}

	public void setHinhKhuyenMai(String hinhKhuyenMai) {
		this.hinhKhuyenMai = hinhKhuyenMai;
	}

	public KhuyenMai(int maKhuyenMai, String tenKhuyenMai, String thoiGianBatDau, String thoiGianKetThuc, String moTa,
			String hinhKhuyenMai) {
		super();
		this.maKhuyenMai = maKhuyenMai;
		this.tenKhuyenMai = tenKhuyenMai;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.moTa = moTa;
		this.hinhKhuyenMai = hinhKhuyenMai;
	}

	public KhuyenMai() {
		super();
	}

}
