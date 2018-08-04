package com.revature.overknight.servlets;

import com.revature.overknight.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BanUserServlet")
public class BanUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = "";
        StringBuilder sb = new StringBuilder();
        while ((input = req.getReader().readLine()) != null) sb.append(input);
        input = sb.toString();

        resp.setContentType("text");
        if (UserService.banUser(input)){
            resp.getWriter().println("true");
        }
        else resp.getWriter().println("false");
    }
}
