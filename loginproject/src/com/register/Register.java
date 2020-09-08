package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.register.dao.RegisterDao;

@WebServlet("/Register")
public class Register extends HttpServlet {
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		RegisterDao rdao = new RegisterDao();
		if(rdao.registration(uname, pass)) {
			response.sendRedirect("login.jsp");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("Failed to register");
		}
	}

}
