package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;


@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String studentFullName = request.getParameter("studentFullName");
		String fatherName = request.getParameter("fatherName");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		int studentClass = Integer.parseInt(request.getParameter("studentClass"));
		double feePaid = Double.parseDouble(request.getParameter("feePaid"));
		double feeDue = Double.parseDouble(request.getParameter("feeDue"));
		double totalFee = Double.parseDouble(request.getParameter("totalFee"));
		long phoneNo = Long.parseLong(request.getParameter("phoneNo"));
		out.print("<html>");
		StudentDao sd = new StudentDao();
		int student = sd.studentRegister(studentFullName, fatherName, age, gender, address, studentClass, feePaid, feeDue, totalFee, phoneNo);
		if(student ==1 ){
			out.print("<body bgcolor=blue text=yellow>");
			out.print("<h1> Regstration Sucessfully: </h1>");
		}else{
			out.print("<body bgcolor=red text=yellow>");
			out.print("<h1> Regstration unSucessfully: </h1>");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
		rd.include(request, response); 
		out.print("</body>");

		out.print("</html>");

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
