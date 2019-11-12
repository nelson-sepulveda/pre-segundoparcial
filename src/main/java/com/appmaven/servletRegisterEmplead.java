package com.appmaven;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

import conexion.conexion;

/**
 * Servlet implementation class servletRegisterEmplead
 */
public class servletRegisterEmplead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletRegisterEmplead() {
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
			String variable;
			
			SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
			String sql = "INSERT INTO EMPLEADO (codigo,cedula,nombre,fechanacimiento,fechaingreso,fecharetiro) values (? , ? , ? , ? , ? , ?)";
			conexion nueva = new conexion();
			
			PreparedStatement prepare = (PreparedStatement) nueva.getConexion().prepareStatement(sql);
			
			prepare.setString(1, request.getParameter("codigoempleado"));
			prepare.setString(2, request.getParameter("cedulaempleado"));
			prepare.setString(3, request.getParameter("nombreempleado"));
			prepare.setString(3, request.getParameter("fechanacimiento"));
			prepare.setString(4, request.getParameter("fechaingreso"));
			prepare.setString(5, request.getParameter("fecharetiro"));
			
			prepare.execute();
			
		} catch (Exception e) {
			System.out.println(e.getMessage() + " error");
		}	
	}

}
