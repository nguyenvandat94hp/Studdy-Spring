package vn.com.spring.dao;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.com.spring.dao.impl.NhanVienDAOImpl;
import vn.com.spring.entity.NhanVien;

@Repository
public class NhanVienDAO implements NhanVienDAOImpl {

	@Autowired
	SessionFactory sessionFactory;

	public boolean findNhanVien(String email, String passWord) throws NoResultException {
		String query = "FROM NhanVien WHERE TENDANGNHAP ='" + email + "' and MATKHAU ='" + passWord + "'";
		Session session = sessionFactory.getCurrentSession();

		try {
			NhanVien nhanVien = (NhanVien) session.createQuery(query).getSingleResult();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return false;
		}
	}

}
