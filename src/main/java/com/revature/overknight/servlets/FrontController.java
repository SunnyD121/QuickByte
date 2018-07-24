package com.revature.overknight.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    public FrontController() {
        super();
        System.out.println("FrontController Created.");     //TODO: change to log statement
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("FrontController Initialized.");     //TODO: change to log statement
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("FrontController Destroyed.");     //TODO: change to log statement
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("FrontController service() called.");     //TODO: change to log statement
    }

}
