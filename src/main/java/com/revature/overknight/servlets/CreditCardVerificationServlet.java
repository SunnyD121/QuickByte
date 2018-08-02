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

/**
 * Servlet implementation class CreditCardVerificationServlet
 */
@WebServlet("/CreditCardVerificationServlet")
public class CreditCardVerificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditCardVerificationServlet() {
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
		 // SETUP
        String json = "";
        StringBuilder sb = new StringBuilder();
        while ((json = request.getReader().readLine()) != null) sb.append(json);
		json = sb.toString();
        JsonReader reader = Json.createReader(new StringReader(json));
        Long creditCardNumber = -1L;

        // READ INCOMING JSON OBJECT
        JsonObject personObject = reader.readObject();
        reader.close();

		//GET USERNAME
        String creditCardNumberString = personObject.getString("creditCardNumber");
		
		//SETUP RESPONSE
		response.setContentType("text");
		PrintWriter out = response.getWriter();
		HttpSession session = null;
		
		//PARSE CREDITCARD NUMBER AND VERIFY VALIDITY
		creditCardNumber = Long.parseLong(creditCardNumberString);
		out.println(CcVerify.isValid(creditCardNumber).toString());
	}

}
