<%@page import="lasitha.service.Doctor"%>
<%@page import="mycompany.Webhelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>ABC Hospitals</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="ABC Hospitals" name="keywords">
        <meta content="ABC Hospitals" name="description">

        <!-- Favicon -->
        <link href="nnn/img/favicon.ico" rel="icon">

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Barlow:wght@400;500;600;700;800;900&display=swap" rel="stylesheet"> 
        
        <!-- CSS Libraries -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="nnn/lib/flaticon/font/flaticon.css" rel="stylesheet">
        <link href="nnn/lib/animate/animate.min.css" rel="stylesheet">
        <link href="nnn/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="nnn/css/style.css" rel="stylesheet">
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
                            <a href="" class="nav-item nav-link">Log In</a>

                           
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
                                    <input type="text" class="form-control" name="email" placeholder="User Email" required="required" />
                                </div>
                                <div class="control-group">
                                    <input type="password" class="form-control" name="pass" placeholder="Password" required="required" />
                                </div>
                                <div>
                                    <button class="btn btn-custom" name="submit" type="submit">Log in</button>
                                   
                                </div>
                            </form>
                            <a href="SignIn.jsp" class="nav-item nav-link"> Sign up </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Location End -->
        
        
        
        <!-- Carousel Start -->
        
                            <img src="nnn/img/images_01.jpg" alt="Image">
                        
            
        <!-- Carousel End -->
        
        
       

        <!-- Footer Start -->
        <div class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6">
                       
            </div>
            <div class="container copyright">
                <p>&copy; <a href="#">ABC Hospitals</a>, All Right Reserved.</p>
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
        <script src="nnn/lib/easing/easing.min.js"></script>
        <script src="nnn/lib/owlcarousel/owl.carousel.min.js"></script>
        <script src="nnn/lib/waypoints/waypoints.min.js"></script>
        <script src="nnn/lib/counterup/counterup.min.js"></script>
        
        <!-- Contact Javascript File -->
        <script src="nnn/mail/jqBootstrapValidation.min.js"></script>
        <script src="nnn/mail/contact.js"></script>

        <!-- Template Javascript -->
        <script src="nnn/js/main.js"></script>
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
response.sendRedirect("Homepage.jsp");
}


}


%>