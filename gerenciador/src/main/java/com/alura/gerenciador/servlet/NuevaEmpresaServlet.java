package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NuevaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("nueva empresa registrada");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>nueva empresa registrada</body></html>");
	}

}
