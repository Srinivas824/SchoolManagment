package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		
		
		
		out.print("<html>");
		if(email.equalsIgnoreCase("ADMIN") && password.equalsIgnoreCase("ADMIN")){

			RequestDispatcher rd = request.getRequestDispatcher("/SchoolManagement.html");
			rd.forward(request, response); 
		}else{
				out.print("<body bgcolor=red text=yellow>");
				out.print("<h1>Invalid Credentials : </h1>");
				RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
				rd.include(request, response); 
				out.print("</body>");
			}
			out.print("</html>");
		}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
