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

@Entity(name = "HOADON")
public class HoaDon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAHOADON")
	private int maHoaDon;

	@Column(name = "TENKHACHHANG")
	private String tenKhachHang;

	@Column(name = "sodt")
	private String soDT;

	@Column(name = "DIACHIGIAOHANG")
	private String diaChiGiaoHang;

	@Column(name = "TINHTRANG")
	private boolean tinhTrang;

	@Column(name = "NGAYLAP")
	private String ngayLap;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "MAHOADON")
	Set<ChiTietHoaDon> danhSachChiTietHoaDon;
}