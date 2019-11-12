package com.appmaven;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

import conexion.*;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.getRequestDispatcher("respuesta.jsp").forward(request, response);
		System.out.println(request.getParameter("tipo"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("llegamos a registro usuario");
		System.out.println(request.getParameter("tipo"));
		try {
			String variable;
			
			SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String sql = "IGUAL que PHP";
			conexion nueva = new conexion();
			
			PreparedStatement prepare = (PreparedStatement) nueva.getConexion().prepareStatement(sql);
			
			prepare.setString(1, request.getParameter("variable1"));
			prepare.setString(2, request.getParameter("variable2"));
			prepare.setString(3, request.getParameter("variable3"));
			prepare.setString(4, request.getParameter("variable4"));
			prepare.setString(5, request.getParameter("variable5"));
			prepare.setString(6, request.getParameter("variable6"));
			
			prepare.execute();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	
		
		
		
	}

}
