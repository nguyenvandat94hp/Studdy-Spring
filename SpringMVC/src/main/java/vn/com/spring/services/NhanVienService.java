package vn.com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.spring.dao.NhanVienDAO;
import vn.com.spring.entity.NhanVien;
import vn.com.spring.services.impl.NhanVienServiceImpl;

@Service
public class NhanVienService implements NhanVienServiceImpl {

	@Autowired
	NhanVienDAO studentDAO;

	public boolean findNhanVien(String email, String passWord) {
		return studentDAO.findNhanVien(email, passWord);
	}

}
