package vn.com.spring.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "CHITIETHOADON")
public class ChiTietHoaDon {

	@EmbeddedId
	private ChiTietHoaDonID chiTietHoaDonID;

	@Column(name = "SOLUONG")
	private int soLuong;

	@Column(name = "GIATIEN")
	private int giaTien;

	
	public ChiTietHoaDon() {
		super();
	}

	public ChiTietHoaDon(int soLuong, int giaTien) {
		super();
		this.soLuong = soLuong;
		this.giaTien = giaTien;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}

}
