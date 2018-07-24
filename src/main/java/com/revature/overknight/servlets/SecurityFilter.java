package com.revature.overknight.servlets;

import javax.servlet.*;
import java.io.IOException;

public class SecurityFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Security Filter Initialized.");     //TODO: change to log statement
    }

    @Override
    public void destroy() {
        System.out.println("Security Filter Destroyed.");     //TODO: change to log statement
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("Security Filter doFilter() called.");     //TODO: change to log statement
    }
}