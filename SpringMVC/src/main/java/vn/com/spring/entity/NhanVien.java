package vn.com.spring.entity;

public class NhanVien {
	private int id;
	private String name;
	private String location;
	private GiamDoc giamDoc;

	public NhanVien(int id, String name, GiamDoc giamDoc) {
		super();
		this.id = id;
		this.name = name;
		this.giamDoc = giamDoc;
	}

	public NhanVien(GiamDoc giamDoc) {
		super();
		this.giamDoc = giamDoc;
	}

	public GiamDoc getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(GiamDoc giamDoc) {
		this.giamDoc = giamDoc;
	}

	public NhanVien() {
		super();
	}

	public NhanVien(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public NhanVien(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public String getInfomationEmployee() {
		System.out.println(id + name + location);
		return id + name + location + giamDoc.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
