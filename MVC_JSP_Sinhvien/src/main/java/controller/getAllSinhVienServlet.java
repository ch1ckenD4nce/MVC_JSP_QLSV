package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.SinhVien;
import model.bo.SinhVienBO;


@WebServlet("/getAllSinhVienServlet")
public class getAllSinhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//    public getAllSinhVienServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SinhVienBO sinhVienBO = new SinhVienBO();
		ArrayList<SinhVien> sinhViens = sinhVienBO.getAll();
		request.setAttribute("sinhViens", sinhViens);
		request.getRequestDispatcher("sinhVienList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
