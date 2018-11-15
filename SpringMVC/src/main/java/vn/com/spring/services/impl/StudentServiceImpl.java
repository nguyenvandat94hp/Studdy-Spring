package vn.com.spring.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.spring.dao.NhanVienDAO;
import vn.com.spring.model.NhanVien;
import vn.com.spring.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	NhanVienDAO nhanVienDAO;
	public NhanVien findNhanVien(int id) {
		nhanVienDAO.findOne(id);
		return null;
	}
	
}
