package com.revature.overknight.servlets;

import com.revature.overknight.beans.Users;
import com.revature.overknight.services.UserService;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetAllUsersServlet")
public class GetAllUsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Users> users = UserService.getAllUsers();
        resp.setContentType("text/json");
        resp.getWriter().println(new ObjectMapper().writeValueAsString(users));
    }
}
