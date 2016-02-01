<%@page import="com.modhutersuk.controller.*"%>  
  
<p>Results</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("You Have Searched: , "+bean.getName());  
%>  