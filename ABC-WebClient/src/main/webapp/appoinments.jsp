<%-- 
    Document   : Home
    Created on : Oct 25, 2021, 4:58:48 PM
    Author     : ACER
--%>

<%@page import="java.util.List"%>
<%@page import="mycompany.Webhelper"%>
<%@page import="lasitha.service.App"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
           <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="css/navbarcss.css" rel="stylesheet">
         <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.0/css/jquery.dataTables.css">
  
                                    <style>
.panelheading{
  font-family:'Felix Tilting';
}
.testdesc{
      font-family: 'Segoe UI';
    }
    .footerHeadings{
      text-decoration: none;
      color: white;
    }
    .modalBackground{
      background-color: #272340;
    }
    .btn-color{
        background-color: #4E46E8;
    }    .modalfonts{
      font-family:'footlight MT' ;
    }
 
</style>
    </head>
   <html>
  
    <body>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.11.0/js/jquery.dataTables.js"></script>
<!------ Include the above in your HEAD tag ---------->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form>
          
                                <div class="control-group">
                                    <input type="text" class="form-control" name="app_name" placeholder="Name" required="required" />
                                </div>
          
                                <div class="control-group">
                                    <input type="text" class="form-control" name="app_date" placeholder="Date" required="required" />
                                </div>
                                <div class="control-group">
                                    <input type="text" class="form-control" name="app_doc" placeholder="Doctor ID" required="required" />
                                </div>
                                
                                <div>
                                    <button class="btn btn-custom" name="submit" type="submit">Add Appointment</button>
                                </div>
                            </form>
    </body>
</html>

   <script>

    
    
    $(document).ready( function () {
    $('#myTable').DataTable();
} );
</script>
<%

if(request.getParameter("submit")!=null){
String app_name= request.getParameter("app_name");
String app_date= request.getParameter("app_date");
String app_doc= request.getParameter(" app_doc");

App appl= new App();
appl.setApp_name(app_name);
appl.setApp_date(app_date);
appl.setApp_Doc(app_doc);


boolean success= Webhelper.addApp(appl);
if(success==true){
    
    out.print("success");
}
else{

 out.print("Error");
}



}

 //app app1= new app();
  //             app1.setApp_id(rs.getInt("App_ID"));
  //             app1.setApp_name(rs.getString("App_Name"));
    //           app1.setApp_date(rs.getString("App_Date"));         
    //           app1.setApp_doc(rs.getInt("App_Doc"));




%>



       <%
            
          Webhelper obj= new Webhelper();
            
            List<App> apps= obj.getApps();
            
         
        out.print("<div class='container mt-5'>");
            out.print("<table id='myTable' class='display' style='background-color:#272340'>");
            out.print("<thead><tr><th style='color:white' >App. Id</th><th  >Name</th><th>Date</th><th >Doc</th><th>Action</th></tr></thead>");
            
            out.print("<tbody>");
            for(App st : apps) {
                out.print("<tr>");
                out.print("<td>" + st.app_id() +"</td>");
                out.print("<td>" + st.getapp_Name()+"</td>");
                out.print("<td>" + st.getLname()+"</td>");
             
                
             
              
                 //out.print("<td>" + st.getHeadofficeproductQuantity()+"</td>");
               out.print("<td><a href='deleteDoctor.jsp?Doc_ID="+st.getDoctorid()+"'><button class='btn btn-danger '>Delete</button></a></td>");
               out.print("</tr>");
               
            }
            out.print("</tbody>");
            out.print("</table>");
            out.print("</div>");
        %>