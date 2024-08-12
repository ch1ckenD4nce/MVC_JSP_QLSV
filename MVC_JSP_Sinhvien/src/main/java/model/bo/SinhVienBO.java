package model.bo;

import java.util.ArrayList;
import java.util.List;

import model.bean.SinhVien;
import model.dao.SinhVienDAO;

public class SinhVienBO {
	public ArrayList<SinhVien> getAll(){
		SinhVienDAO sinhVienDAO = new SinhVienDAO();
		return sinhVienDAO.getAll();
	}
	public boolean addSinhVien(SinhVien sinhvien)  {
		SinhVienDAO sinhvienDAO = new SinhVienDAO();
		return sinhvienDAO.addStudent(sinhvien);
	}
}

