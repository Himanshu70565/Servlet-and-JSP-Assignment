package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String nameParameter = this.getServletConfig().getInitParameter("username");
		String passParameter = this.getServletConfig().getInitParameter("password");

		if (username.equals(nameParameter) && password.equals(passParameter)) {
			writer.write("Username and Password got matched");
		} else {
			int count = Integer.valueOf(this.getServletContext().getInitParameter("count"));
			while (count-- != 0) {
				writer.write("Wrong Parameter => Username : " + username + " , Password : " + password + " <br/>");
			}
		}

	}

}
