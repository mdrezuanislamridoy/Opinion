package com.opinion.user;
import com.opinion.ConnectionProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String gmail = request.getParameter("gmail");
		String password = request.getParameter("password");
		
		Connection con = ConnectionProvider.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("insert into user value(?,?,?)");
			ps.setString(1, name);
			ps.setString(2, gmail);
			ps.setString(3, password);
			int ra = ps.executeUpdate();
			if (ra>0) {
				response.getWriter().print("signup Success");
			}else {
				response.getWriter().print("login Failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
