package vn.com.spring.entity;

import java.io.Serializable;

public class ChiTietHoaDonID implements Serializable {

	private static final long serialVersionUID = 1L;
	private int maHoaDon;
	private int maChiTietSanPham;

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public int getMaChiTietSanPham() {
		return maChiTietSanPham;
	}

	public void setMaChiTietSanPham(int maChiTietSanPham) {
		this.maChiTietSanPham = maChiTietSanPham;
	}

	public ChiTietHoaDonID(int maHoaDon, int maChiTietSanPham) {
		super();
		this.maHoaDon = maHoaDon;
		this.maChiTietSanPham = maChiTietSanPham;
	}

	public ChiTietHoaDonID() {
		super();
	}

}
