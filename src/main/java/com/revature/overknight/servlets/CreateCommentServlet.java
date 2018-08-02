package com.revature.overknight.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.time.LocalDate;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.overknight.services.CommentService;

/**
 * Servlet implementation class CreateCommentServlet
 */
@WebServlet("/CreateCommentServlet")
public class CreateCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCommentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //SETUP
		String json = request.getReader().readLine();
        JsonReader reader = Json.createReader(new StringReader(json));
        Long creditCardNumber = -1L;

        // READ INCOMING JSON OBJECT
        JsonObject personObject = reader.readObject();
        reader.close();

		//GET USERNAME, PASSWORD AND CC# FIELDS
        String username = personObject.getString("username");
		String text = personObject.getString("text");
		try {
            String ccn = personObject.getString("creditCardNumber");
            creditCardNumber = Long.parseLong(ccn);
        }
		catch (NumberFormatException e)
		{	
			e.printStackTrace();
		}
		
		//SETUP REPLY
		response.setContentType("text");
		PrintWriter out = response.getWriter();
		HttpSession session = null;
		
		//CREATE COMMENT
		
		if(CommentService.createNewComment(username, text))
		{
			out.println(LocalDate.now().toString());
		}
		
	}

}
