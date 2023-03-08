package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TeacherDao;
import com.model.Teacher;


@WebServlet("/GetTeacherById")
public class GetTeacherById extends HttpServlet {
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int teacherId = Integer.parseInt(request.getParameter("teacherId"));
		TeacherDao techDAO = new TeacherDao();
		Teacher tech = techDAO.getTeacherById(teacherId);
		
		request.setAttribute("tech", tech);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayTeacherById.jsp");
		rd.include(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
