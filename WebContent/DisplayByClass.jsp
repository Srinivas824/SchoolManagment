<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="C"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display By Class</title>
</head>
<body>
	<center>
		<table border=2>
			<tr>
				<td>studentId</td>
				<td>studentFullName</td>
				<td>fatherName</td>
				<td>age</td>
				<td>gender</td>
				<td>address</td>
				<td>studentClass</td>
				<td>feePaid</td>
				<td>feeDue</td>
				<td>totalFee</td>
				<td>phoneNo</td>


			</tr>
			<C:forEach var="student" items="${studentList}">
				<tr>
					<td>${student.studentId}</td>
					<td>${student.studentFullName}</td>
					<td>${student.fatherName}</td>
					<td>${student.age}</td>
					<td>${student.gender}</td>
					<td>${student.address}</td>
					<td>${student.studentClass}</td>
					<td>${student.feePaid}</td>
					<td>${student.feeDue}</td>
					<td>${student.totalFee}</td>
					<td>${student.phoneNo}</td>
				
				</tr>
			</C:forEach>
		</table>
	</center>
	
</body>
</html>