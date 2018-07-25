package com.revature.overknight.servlets;

import javax.servlet.*;
import java.io.IOException;

public class SecurityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initialized.");  //TODO: Change to log statement
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroyed.");  //TODO: Change to log statement
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter doFilter() called.");  //TODO: Change to log statement
    }
}