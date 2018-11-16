package vn.com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="NHANVIEN")
@Table
public class NhanVien {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MANHANVIEN")
	private int maNhanVien;
	
	@Column(name="HOTEN")
	private String hoTen;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="MATKHAU")
	private String passWord;


	public NhanVien() {
		super();
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
