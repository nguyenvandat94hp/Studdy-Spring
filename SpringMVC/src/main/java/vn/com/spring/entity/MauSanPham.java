package vn.com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MauSanPham {

	@Column(name = "MAMAU")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maMau;

	@Column(name = "TENMAU")
	private String tenMau;

	public int getMaMau() {
		return maMau;
	}

	public void setMaMau(int maMau) {
		this.maMau = maMau;
	}

	public String getTenMau() {
		return tenMau;
	}

	public void setTenMau(String tenMau) {
		this.tenMau = tenMau;
	}

	public MauSanPham() {
		super();
	}

	public MauSanPham(int maMau, String tenMau) {
		super();
		this.maMau = maMau;
		this.tenMau = tenMau;
	}
	
}
