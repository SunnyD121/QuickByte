package com.revature.overknight.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Iterator;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.revature.overknight.services.UserService;
import com.revature.overknight.utils.CustomJsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
        String json = request.getReader().readLine();
        CustomJsonParser parser = new CustomJsonParser(json);
        JsonReader reader = Json.createReader(new StringReader(json));

        JsonObject personObject = reader.readObject();
        reader.close();

		String username = personObject.getString("username");
		String password = personObject.getString("password");
        System.out.println("In Servlet:");
		System.out.println(username);
        System.out.println(password);
		
		response.setContentType("text");
		PrintWriter out = response.getWriter();
		HttpSession session = null;

        boolean validUserLogin = UserService.userLogin(username, password);
        if (validUserLogin) {
            session = request.getSession();
            session.setAttribute("username", username);
            System.out.println("LOGIN STARTED: " + session.getAttribute("username"));
        }
        out.println(new ObjectMapper().writeValueAsString(validUserLogin));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
