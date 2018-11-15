package vn.com.spring.entity;

import java.util.List;
import java.util.Map;

public class NhanVien {
	private int id;
	private String name;
	private String location;
	private GiamDoc giamDoc;
	private List<String> list;
	private List<GiamDoc> giamDocs;
	private Map<String, Object> map;
	
	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<GiamDoc> getGiamDocs() {
		return giamDocs;
	}

	public void setGiamDocs(List<GiamDoc> giamDocs) {
		this.giamDocs = giamDocs;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

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
