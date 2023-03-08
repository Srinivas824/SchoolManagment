package com.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TeacherDao;
import com.model.Teacher;


@WebServlet("/GetAllTeachers")
public class GetAllTeachers extends HttpServlet {
	    
    

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			TeacherDao techDao = new TeacherDao();
			List<Teacher> techList= techDao.getAllTeacher();
			
			request.setAttribute("techList", techList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/DisplayAllTeacher.jsp");
			rd.include(request, response);

		
		
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
