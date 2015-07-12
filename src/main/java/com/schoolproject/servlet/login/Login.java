package com.schoolproject.servlet.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.schoolproject.user.LoginUser;


public class Login extends HttpServlet{
	public void doPost(HttpServletRequest request,
            HttpServletResponse response)
throws ServletException, IOException {


try {
	String name=request.getParameter("name");
  String emailid=request.getParameter("emailid");
  
  LoginUser user = new LoginUser();
  user.setName(name);
  user.setEmailid(emailid);
  RequestDispatcher dispatcher=request.getRequestDispatcher("/Welcome.jsp");
  //Set the customer instance into request.Then only the customer object
  //will be available in the Welcome.jsp page
  request.setAttribute("cust",user);
  dispatcher.forward(request, response);
} catch (Exception e) {
	// TODO: handle exception
}
}
}
