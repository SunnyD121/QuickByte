package com.revature.overknight.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.overknight.utils.Logger;

public class FrontController extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrontController() {
        super();
        Logger.log(this.getClass(), "FrontController Created.");     //TODO: change to log statement
    }

    @Override
    public void init() throws ServletException {
        super.init();
        Logger.log(this.getClass(), "FrontController Initialized.");     //TODO: change to log statement
    }

    @Override
    public void destroy() {
        super.destroy();
        Logger.log(this.getClass(), "FrontController Destroyed.");     //TODO: change to log statement
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        Logger.log(this.getClass(), "FrontController service() called.");     //TODO: change to log statement
    }

}
