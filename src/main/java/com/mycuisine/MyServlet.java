package com.mycuisine;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
	    name = "MyServlet",
	    urlPatterns = "/MyServlet",
	    initParams = {
	        @WebInitParam(name = "name", value = "meenu")
	    }
	)
public class MyServlet extends HttpServlet {
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	ServletConfig cg=getServletConfig();
//	String str=cg.getInitParameter("name");
		
		ServletContext cxt=getServletContext();
		String str=cxt.getInitParameter("name");
		
    PrintWriter out=response.getWriter();

	out.println(str);
	
	
	
	}

}
