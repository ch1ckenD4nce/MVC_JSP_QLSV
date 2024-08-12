<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.SinhVien"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Danh sách sinh viên</h2>
        <table border='1' width='100%'>
        <tr>
            <th>ID</th>
            <th>Name</th>
             <th>Age</th>
              <th>University</th>
              
        </tr>
	<%
	ArrayList<SinhVien> sinhViens = (ArrayList<SinhVien>) request.getAttribute("sinhViens");
	if(sinhViens == null){
		response.sendRedirect("getAllSinhVienServlet");
	} else{
		for (int i = 0; i < sinhViens.size(); i++){
			
			%>
			<tr>
			<td><%= sinhViens.get(i).getId() %> </td>
			<td><%= sinhViens.get(i).getName() %> </td>
			<td><%= sinhViens.get(i).getAge() %> </td>
			<td><%= sinhViens.get(i).getUniversity() %> </td>
			
			</tr>
	<% }
		
	}
	 %>
        
           
            
    </table>
    <br>

</body>
</html>