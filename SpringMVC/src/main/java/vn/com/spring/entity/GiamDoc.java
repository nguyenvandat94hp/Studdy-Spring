package vn.com.spring.entity;

public class GiamDoc extends NhanVien {
	private String chucVu;

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public GiamDoc(String chucVu) {
		super();
		this.chucVu = chucVu;
	}

	public GiamDoc() {
		super();
	}

	@Override
	public String toString() {
		return "GiamDoc [chucVu=" + chucVu + "]";
	}
	
}
