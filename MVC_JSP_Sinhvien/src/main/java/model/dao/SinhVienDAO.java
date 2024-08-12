package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bean.SinhVien;


public class SinhVienDAO {
	
	public ArrayList<SinhVien> getAll(){
		
		ArrayList<SinhVien> list = new ArrayList<>();
		
		try{
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dulieu", "root", "Hoangtrai@22");
	 //        Statement sm = conn.createStatement();
	 //        String sql = "select * from login";
	         PreparedStatement preparedStatement;

	         preparedStatement = conn.prepareStatement("SELECT * FROM sinhvien");
	     

//	     
	     ResultSet rs = preparedStatement.executeQuery();
	         while(rs.next()){
	        	 SinhVien sinhvien = new SinhVien();
	        	 sinhvien.setId(rs.getString("id"));
	        	 sinhvien.setName(rs.getString("name"));
	        	 sinhvien.setAge(rs.getInt("age"));
	        	 sinhvien.setUniversity(rs.getString("university"));
	        	 list.add(sinhvien);

	         }
			
		}catch(Exception e){
			e.printStackTrace();
		
			
		}
		
		return list;
	}
	
	public boolean addStudent(SinhVien sinhvien){
	    String id = sinhvien.getId();
	    String name = sinhvien.getName();
	    int age = sinhvien.getAge();
	    String university = sinhvien.getUniversity();

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dulieu", "root", "Hoangtrai@22");

	        // Use a PreparedStatement to avoid SQL injection
	        String sql = "INSERT INTO sinhvien (id, name, age, university) VALUES (?, ?, ?, ?)";
	        PreparedStatement preparedStatement = conn.prepareStatement(sql);

	        // Set the parameters for the PreparedStatement
	        preparedStatement.setString(1, id);
	        preparedStatement.setString(2, name);
	        preparedStatement.setInt(3, age);
	        preparedStatement.setString(4, university);

	        // Execute the update (not a query, so use executeUpdate)
	        int rowsAffected = preparedStatement.executeUpdate();

	        // Check if any rows were affected
	        if (rowsAffected > 0) {
	            System.out.println("Student added successfully");
	            return true;
	        } else {
	            System.out.println("Failed to add student");
	            return false;
	        }
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	        return false;
	    }
	}


}
