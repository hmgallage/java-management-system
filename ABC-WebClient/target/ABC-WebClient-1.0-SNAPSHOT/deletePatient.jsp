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
       int id=Integer.parseInt(request.getParameter("Pat_ID"));
       
       boolean success= Webhelper.deletePatient(id);
       if(success== true){
       out.print("success");
               
        String redirect = "Patients.jsp";
        response.sendRedirect(redirect);
    
       }
       else{
       
         out.print("error");
       
       }
       
       
       
       %>
    </body>
</html>