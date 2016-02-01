package com.modhutersuk.controller;

 
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

public class ModHuntersUkController extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
    	System.out.println("Entry - doPost");
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String name=request.getParameter("name");
        System.out.println("name value is: " + name);
      
          
        LoginBean bean=new LoginBean();  
        bean.setName(name);  
        
        request.setAttribute("bean",bean);  
          
       
          
        if(name != null){  
            RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");  
            rd.forward(request, response);  
        }  
        else{  
            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
            rd.forward(request, response);  
        }  
        System.out.println("Exit - doPost");
    }  
  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        System.out.println("Entry - doGet");
    	doPost(req, resp);
    	System.out.println("Exit - doGet");
    }  
} 