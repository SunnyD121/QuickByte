package com.revature.overknight.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Iterator;

import javax.json.Json;
import javax.json.JsonObject;
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

        CustomJsonParser parser = new CustomJsonParser(request.getReader().readLine());

		//TODO: get valid parameters from Angular when we figure out exactly how.
		String username = parser.getParameter("username");
		String password = parser.getParameter("password");

		System.out.println(username);
        System.out.println(password);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = null;
		
//		if(UserService.userLogin(username, password))
//		{
//			session = request.getSession();
//			session.setAttribute("username", username);
//			System.out.println("LOGIN STARTED: " + (String)session.getAttribute("username"));
//			RequestDispatcher rd = request.getRequestDispatcher("Homepage.html");
//			rd.forward(request, response);
//		}
//		else
//		{
//			RequestDispatcher rd = request.getRequestDispatcher("errorpage404");
//            rd.forward(request, response);
//		}
//        response.sendError(200);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
