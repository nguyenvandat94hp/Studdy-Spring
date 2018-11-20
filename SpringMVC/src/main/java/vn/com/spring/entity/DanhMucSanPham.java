package vn.com.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "DANHMUCSANPHAM")
public class DanhMucSanPham {

	@Column(name = "MADANHMUC")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maDanhMuc;

	@Column(name = "TENDANHMUC")
	private String tenDanhMuc;

	@Column(name = "HINHDAIDIEN")
	private String hinhDanhMuc;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="MADANHMUC")
	Set<SanPham> danhSachSanPham;

	public Set<SanPham> getDanhSachSanPham() {
		return danhSachSanPham;
	}

	public void setDanhSachSanPham(Set<SanPham> danhSachSanPham) {
		this.danhSachSanPham = danhSachSanPham;
	}

	public int getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

	public String getHinhDanhMuc() {
		return hinhDanhMuc;
	}

	public void setHinhDanhMuc(String hinhDanhMuc) {
		this.hinhDanhMuc = hinhDanhMuc;
	}

	public DanhMucSanPham(int maDanhMuc, String tenDanhMuc, String hinhDanhMuc) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
		this.hinhDanhMuc = hinhDanhMuc;
	}

	public DanhMucSanPham() {
		super();
	}

}
