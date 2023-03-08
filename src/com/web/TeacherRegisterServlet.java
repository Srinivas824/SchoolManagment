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


@WebServlet("/TeacherRegisterServlet")
public class TeacherRegisterServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			long phoneNumber = Long.parseLong(request.getParameter("phoneNumber"));
			String role = request.getParameter("role");
			double salary = Double.parseDouble(request.getParameter("salary"));
			out.print("<html>");
		  TeacherDao td = new TeacherDao();
		  int teacher = td.register(name, gender, address, email, phoneNumber, role, salary);
		  if(teacher ==1 ){
				out.print("<body bgcolor=blue text=yellow>");
				out.print("<h1> Regstration Sucessfully: </h1>");
			}else{
				out.print("<body bgcolor=red text=yellow>");
				out.print("<h1>Invalid Credentials : </h1>");
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
