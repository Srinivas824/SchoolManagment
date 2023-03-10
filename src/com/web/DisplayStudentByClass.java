package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.model.Students;

@WebServlet("/DisplayStudentByClass")
public class DisplayStudentByClass extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			int studentClass = Integer.parseInt(request.getParameter("studentClass"));
			StudentDao stDao = new StudentDao();
			List<Students> studentList = stDao.DisplayStudentByClass(studentClass);
			
			request.setAttribute("studentList", studentList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/DisplayByClass.jsp");
			rd.include(request, response);
		
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
