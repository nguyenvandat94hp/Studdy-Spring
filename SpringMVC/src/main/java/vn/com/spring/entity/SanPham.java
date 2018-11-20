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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "SANPHAM")
public class SanPham {

	@Id
	@Column(name = "MASANPHAM")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSanPham;

	@Column(name = "TENSANPHAM")
	private String tenSanPham;

	@Column(name = "MOTA")
	private String moTa;

	@Column(name = "HINHSANPHAM")
	private String hinhSanPham;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MADANHMUC")
	private DanhMucSanPham danhMucSanPham;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "MASANHPHAM")
	Set<ChiTietSanPham> danhSachChiTietSanPham;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CHITIETKHUYENMAI", joinColumns = {
			@JoinColumn(name = "maSanPham", referencedColumnName = "maSanPham") }, inverseJoinColumns = {
					@JoinColumn(name = "maKhuyenMai", referencedColumnName = "maKhuyenMai") })
	Set<KhuyenMai> danhSachKhuyenMai;

	public Set<ChiTietSanPham> getDanhSachChiTietSanPham() {
		return danhSachChiTietSanPham;
	}

	public void setDanhSachChiTietSanPham(Set<ChiTietSanPham> danhSachChiTietSanPham) {
		this.danhSachChiTietSanPham = danhSachChiTietSanPham;
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getHinhSanPham() {
		return hinhSanPham;
	}

	public void setHinhSanPham(String hinhSanPham) {
		this.hinhSanPham = hinhSanPham;
	}

	public DanhMucSanPham getDanhMucSanPham() {
		return danhMucSanPham;
	}

	public void setDanhMucSanPham(DanhMucSanPham danhMucSanPham) {
		this.danhMucSanPham = danhMucSanPham;
	}

	public SanPham(int maSanPham, String tenSanPham, String moTa, String hinhSanPham, DanhMucSanPham danhMucSanPham) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.moTa = moTa;
		this.hinhSanPham = hinhSanPham;
		this.danhMucSanPham = danhMucSanPham;
	}

	public SanPham() {
		super();
	}

}
