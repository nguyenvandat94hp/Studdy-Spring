package vn.com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHUCVU")
public class ChucVu {
	@Column(name = "MACHUCVU")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maChucVu;

	@Column(name = "TENCHUCVU")
	private String tenChucVu;

	public int getMaChucVu() {
		return maChucVu;
	}

	public void setMaChucVu(int maChucVu) {
		this.maChucVu = maChucVu;
	}

	public String getTenChucVu() {
		return tenChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}

	public ChucVu(int maChucVu, String tenChucVu) {
		super();
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
	}

	public ChucVu() {

	}

}
