<%@page import="com.modhutersuk.controller.*"%>  
  
<p>You are successfully logged in!</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Welcome, "+bean.getName());  
%>  