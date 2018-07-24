package com.revature.overknight.servlets;

<<<<<<< HEAD
import javax.servlet.*;
import java.io.IOException;

public class SecurityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initialized.");  //TODO: Change to log statement
=======
import com.revature.utils.LogWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SecurityFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LogWrapper.log(this.getClass(), "Security Filter created.", LogWrapper.Severity.DEBUG);
        //DO NOT DELETE this method. Server gives an error if you do.
>>>>>>> e759c36d1a22e149c56ffebc686af8825f248aaf
    }

    @Override
    public void destroy() {
<<<<<<< HEAD
        System.out.println("Filter destroyed.");  //TODO: Change to log statement
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter doFilter() called.");  //TODO: Change to log statement
    }
=======
        LogWrapper.log(this.getClass(), "Security Filter destroyed.", LogWrapper.Severity.DEBUG);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        LogWrapper.log(this.getClass(), "Filter inspecting authentication...", LogWrapper.Severity.INFO);
        HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		
		HttpSession session = request.getSession(false);
		if(session==null){
            LogWrapper.log(this.getClass(), "Filter deemed user unworthy.", LogWrapper.Severity.INFO);
            response.sendError(401);

		}else{
			//Forwards the request to the proper servlet it was originally going to hit.
            LogWrapper.log(this.getClass(), "Filter deemed user worthy.", LogWrapper.Severity.INFO);
			chain.doFilter(request, response);
		}
	}

>>>>>>> e759c36d1a22e149c56ffebc686af8825f248aaf
}
