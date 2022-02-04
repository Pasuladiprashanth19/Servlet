package com.deepu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.lookup.ModuleBinding.UnNamedModule;


@WebServlet("/Login")
public class Login extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.equals("prashanth")&& pass.equals("learnings"));
		{
			response.sendRedirect("welcome.jsp");
		}
		
	}

}
