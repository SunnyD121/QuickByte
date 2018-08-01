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
import javax.servlet.http.HttpSession;

import com.revature.overknight.utils.CcVerify;
import com.revature.overknight.services.UserService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


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
		String password = personObject.getString("password");
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
		
		// CHECK CC AND IF VALID, ADD USER TO TABLE
        System.out.println(creditCardNumber);
		if(CcVerify.isValid(creditCardNumber))
		{
			boolean validUserRegistration = UserService.registerNewUser(
						username, password, creditCardNumber);
//			System.out.println(validUserRegistration);

			//out.println("{\"returnValue\":" + validUserRegistration + "}" );
            if (validUserRegistration) out.println("true");
            else out.println("false");
		}
		else{
		    out.println("false");
        }
		
		
		
		
      
	}

}
