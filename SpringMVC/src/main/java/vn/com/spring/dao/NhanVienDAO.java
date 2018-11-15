package vn.com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.com.spring.model.NhanVien;

public interface NhanVienDAO extends JpaRepository<NhanVien, Integer>{

}
