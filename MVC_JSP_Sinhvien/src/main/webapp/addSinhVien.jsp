<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <h1 align="center">Thêm sinh viên</h1>
    <form action="addSinhVienServlet" method="post" name="form_AddSV">
        <label for="id">Mã sv</label>:</label>
        <input type="int" id="id" name="id" required onblur="checkID()"><br>

        <label for="name">Tên sinh viên:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="age">Tuổi:</label>
        <input type="number" id="age" name="age" required><br>

        <label for="university">Trường đại học:</label>
        <input type="text" id="university" name="university" required><br>

        <button name="addsv" type="submit">Thêm sinh viên</button>
    </form>
</body>
</html>