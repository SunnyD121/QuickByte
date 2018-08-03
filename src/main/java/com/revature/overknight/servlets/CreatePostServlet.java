package com.revature.overknight.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.overknight.utils.AWSObjectIO;
/**
 * Servlet implementation class CreatePostServlet
 */
@WebServlet("/CreatePostServlet")
public class CreatePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePostServlet() {
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

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
//    	 //SETUP
//		String json = request.getReader().readLine();
//        JsonReader reader = Json.createReader(new StringReader(json));
//
//        // READ INCOMING JSON OBJECT
//        JsonObject personObject = reader.readObject();
//        reader.close();
//
//		//GET INFO
//        String username = personObject.getString("username");
//		String text = personObject.getString("text");
		
		//SETUP REPLY
		response.setContentType("text/json");
		PrintWriter out = response.getWriter();
    	
    	// UPLOAD THE FILE TO S3
    	AWSObjectIO ai = new AWSObjectIO();
        AWSObjectIO.uploadFile(request, response);
        
        // ADD POST TO THE DATABASE

        out.println("This is a placeholder");
    }

}
