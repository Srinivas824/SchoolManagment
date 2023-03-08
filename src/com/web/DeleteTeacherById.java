package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TeacherDao;


@WebServlet("/DeleteTeacherById")
public class DeleteTeacherById extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int teacherId = Integer.parseInt(request.getParameter("teacherId"));
		TeacherDao techDAO = new TeacherDao();
		int x = techDAO.DeleteTecherById(teacherId);
		if(x ==1 ){
			out.print("<body bgcolor=blue text=yellow>");
			out.print("<h1> Delete Sucessfully: </h1>");
		}else{
			out.print("<body bgcolor=red text=yellow>");
			out.print("<h1>Delete unSucessfully : </h1>");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
