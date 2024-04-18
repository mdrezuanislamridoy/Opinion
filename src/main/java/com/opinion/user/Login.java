package com.opinion.user;
import com.opinion.ConnectionProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gmail = request.getParameter("gmail");
		String password = request.getParameter("password");
		
		Connection con = ConnectionProvider.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from user where gmail = ? && password = ?");
			ps.setString(1, gmail);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String name = rs.getString("name");
				HttpSession hs = request.getSession();
				hs.setAttribute("name", name);
				hs.setAttribute("gmail", gmail);
			}else {
				response.getWriter().print("login Failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
