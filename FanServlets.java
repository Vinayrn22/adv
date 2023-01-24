package com.xworkz;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1 , urlPatterns ="/fan")
public class FanServlets extends HttpServlet {
	
	public void LaptopServelets() 
	{
		System.out.println("laptop"+getClass().getSimpleName());	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("running laptop");
	}
}
