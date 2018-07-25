package com.revature.overknight.servlets;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Front Controller service() called.");    //TODO: Change to log statement
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Front Controller Destroyed.");    //TODO: Change to log statement
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Front Controller Initialized.");    //TODO: Change to log statement
    }
}
