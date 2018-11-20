package vn.com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "SIZESANPHAM")
public class SizeSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MASIZE")
	private int maSize;

	@Column(name = "SIZE")
	private String size;

	public int getMaSize() {
		return maSize;
	}

	public void setMaSize(int maSize) {
		this.maSize = maSize;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public SizeSanPham(int maSize, String size) {
		super();
		this.maSize = maSize;
		this.size = size;
	}

	public SizeSanPham() {
		super();
	}

}
