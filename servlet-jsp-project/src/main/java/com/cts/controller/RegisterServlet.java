package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.model.Registration;
import com.cts.service.RegisterService;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/RegisterServlet")
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
		response.sendRedirect("register.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome to post method");
		String user=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("username "+user +"password "+password);
		/*Registration r=new Registration();
		r.setUsername(user);
		r.setPassword(password);*/
		RegisterService rs=new RegisterService();
		//rs.validate(r);
		boolean result=rs.validate(user,password);
		if(result) {
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp"); 
			rd.forward(request, response);
			HttpSession session=request.getSession();
			session.setAttribute("username", user);
		}else
			response.sendRedirect("register.jsp");
	}

}
