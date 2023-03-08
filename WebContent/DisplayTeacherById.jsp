<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Teacher</title>
</head>
<body>
		<center>
		<table border=2>
			<tr>
				<td>teacherId</td>
				<td>name</td>
				<td>gender</td>
				<td>address</td>
				<td>phoneNumber</td>
				<td>email</td>
				<td>role</td>
				<td>salary</td>
				

			</tr>
				
			<tr>
				<td>${tech.teacherId}</td>
				<td>${tech.name}</td>
				<td>${tech.gender}</td>
				<td>${tech.address}</td>
				<td>${tech.phoneNumber}</td>
				<td>${tech.email}</td>
				<td>${tech.role}</td>
				<td>${tech.salary}</td>
			</tr>
			</table>
	</center>
		
</body>
</html>