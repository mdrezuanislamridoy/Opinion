package com.opinion.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(filterName = "user", urlPatterns= {"/loginpage","/signuppage"})
public class loginPage extends HttpFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest) request;
		HttpServletResponse hsrs = (HttpServletResponse) response;
		HttpSession hs = hsr.getSession();
		String name = (String) hs.getAttribute("name");
		if (name==null) {
			chain.doFilter(request, response);
		}else {
			hsrs.sendRedirect("/ShareOpinion");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
