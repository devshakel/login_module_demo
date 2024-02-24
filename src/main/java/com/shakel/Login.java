package com.shakel;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shakel.connection.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("uname");
		String pd = request.getParameter("pd");
		LoginDao dao = new LoginDao();
		
		if(dao.checkDetails(uname, pd)) {
			HttpSession sesson = request.getSession();
			sesson.setAttribute("uname", uname);
			response.sendRedirect("welcome.jsp");
		} 
		else {
			response.sendRedirect("login.jsp");
		}
	}

}