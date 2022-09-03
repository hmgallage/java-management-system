<%-- 
    Document   : login.jsp
    Created on : Oct 23, 2021, 10:43:29 PM
    Author     : ACER
--%>

<%@page import="lasitha.service.Doctor"%>
<%@page import="mycompany.Webhelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

     <!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>ABC Hospitals Login</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free Website Template" name="keywords">
        <meta content="Free Website Template" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Barlow:wght@400;500;600;700;800;900&display=swap" rel="stylesheet"> 
        
        <!-- CSS Libraries -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="lib/flaticon/font/flaticon.css" rel="stylesheet">
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body>
        <!-- Top Bar Start -->
        <div class="top-bar">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-lg-4 col-md-12">
                        <div class="logo">
                            <a href="index.html">
                                <h1>ABC <span>Hospitals</span></h1>
                                <!-- <img src="img/logo.jpg" alt="Logo"> -->
                            </a>
                        </div>
                    
                    </div>
                </div>
            </div>
        </div>
        <!-- Top Bar End -->

        <!-- Nav Bar Start -->
        <div class="nav-bar">
            <div class="container">
                <nav class="navbar navbar-expand-lg bg-dark navbar-dark">
                    <a href="#" class="navbar-brand">Log In</a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                        <div class="navbar-nav mr-auto">
                            <a href="index.jsp" class="nav-item nav-link active">Sign</a>

                           
                    </div>
                </nav>
            </div>
        </div>
        <!-- Nav Bar End -->
        <!-- Nav Bar End -->
    
        
        
        <!-- Location Start -->
        <div class="location">
            <div class="container">
                    <div class="col-lg-5">
                        <div class="location-form">
                            
                            <form>
                                <div class="control-group">
                                    <input type="text" class="form-control" name="email" placeholder="Email" required="required" />
                                </div>
                                <div class="control-group">
                                    <input type="password" class="form-control" name="pass" placeholder="Password" required="required" />
                                </div>
                                <div>
                                    <button class="btn btn-custom" name="submit" type="submit">Log in</button>
                                </div>
                                </form>
                                <div>
                                    <button class="btn btn-custom" href="SignIn.jsp">Sign in</a></button>
                                </div>
                              
                                
                                
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Location End -->
        
        
        <!-- Footer Start -->
        <div class="footer">
            <div class="container">
                <div class="row">
                    
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-link">
                           
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-link">
                        
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="footer-newsletter">
                            
                        </div>
                    </div>
                </div>
            </div>
            <div class="container copyright">
                <p>&copy; <a href="#">ABC Hospitals (PVT) LTD</a>, All Right Reserved. </a></p>
            </div>
        </div>
        <!-- Footer End -->
        
        <!-- Back to top button -->
        <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
        
        <!-- Pre Loader -->
        <div id="loader" class="show">
            <div class="loader"></div>
        </div>

        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="lib/waypoints/waypoints.min.js"></script>
        <script src="lib/counterup/counterup.min.js"></script>
        
        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>
</html>

<%
    
if(request.getParameter("submit")!=null){

String email =request.getParameter("email");
String pass=request.getParameter("pass");

Doctor doc= Webhelper.getDoctor(email, pass);

if(doc==null){

out.print("invalid username or password");

}
else{
out.print("success");
response.sendRedirect("Home.jsp");
}


}


%>