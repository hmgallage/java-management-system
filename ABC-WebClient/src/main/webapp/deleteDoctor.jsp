<%-- 
    Document   : deleteDoctor
    Created on : Oct 25, 2021, 5:19:09 PM
    Author     : ACER
--%>

<%@page import="mycompany.Webhelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       int id=Integer.parseInt(request.getParameter("Doc_ID"));
       
       boolean success= Webhelper.deleteDoctor(id);
       if(success== true){
       out.print("success");
               String redirect = "Doctors.jsp";
        response.sendRedirect(redirect);
       }
       else{
       
         out.print("error");
       
       }
       
       
       
       %>
    </body>
</html>
