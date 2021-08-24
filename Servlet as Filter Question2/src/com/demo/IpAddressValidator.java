package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IpAddressValidator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ipAddress=request.getParameter("ipAddress");
		String invalidIpAddress=this.getServletConfig().getInitParameter("invalidIpAddress");
		if(ipAddress.equals(invalidIpAddress)) {
			response.sendRedirect("forbidden.jsp");
		}else {
			response.sendRedirect("success.jsp");
		}
	}

}
