package com.revature.overknight.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.revature.overknight.utils.Logger;

public class SecurityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Logger.log(this.getClass(), "Security Filter Initialized.");     //TODO: change to log statement
    }

    @Override
    public void destroy() {
        Logger.log(this.getClass(), "Security Filter Destroyed.");     //TODO: change to log statement
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        Logger.log(this.getClass(), "Security Filter doFilter() called.");     //TODO: change to log statement
    }
}