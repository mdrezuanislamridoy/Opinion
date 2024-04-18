package com.opinion.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(filterName = "profileFilter", urlPatterns = {"/profilepage"})
public class ProfilePageF implements Filter {
       
    public void destroy() {
        // Cleanup resources if needed
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(false); // Do not create session if it doesn't exist

        // Check if user is logged in
        if (session != null && session.getAttribute("name") != null) {
            // User is logged in, allow access to the profile page
            chain.doFilter(request, response);
        } else {
            // User is not logged in, redirect to the login page
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/loginpage");
        }
    }

    public void init(FilterConfig fConfig) throws ServletException {
        // Initialization code if needed
    }
}
