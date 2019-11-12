package com.appmaven;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mysql.jdbc.PreparedStatement;

import conexion.*;


/**
 * Servlet implementation class searchEmpleado
 */
public class searchEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			String sql = "SELECT * FROM EMPLEADO WHERE codigo = ?";
			conexion nueva = new conexion();
			PreparedStatement prepare = (PreparedStatement) nueva.getConexion().prepareStatement(sql);
			prepare.setString(1, request.getParameter("searchcodigoempleado"));
			
			prepare.execute();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
