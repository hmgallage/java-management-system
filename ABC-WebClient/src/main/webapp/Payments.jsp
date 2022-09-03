<%-- 
    Document   : Home
    Created on : Oct 25, 2021, 4:58:48 PM
    Author     : ACER
--%>

<%@page import="java.util.List"%>
<%@page import="mycompany.Webhelper"%>
<%@page import="lasitha.service.Payment"%>
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
                                <h1>ABC<span>Hospitals</span></h1>
                                <!-- <img src="img/logo.jpg" alt="Logo"> -->
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-8 col-md-7 d-none d-lg-block">
                        <div class="row">
                            <div class="col-4">
                                <div class="top-bar-item">
                                    <div class="top-bar-icon">
                                        <i class="far fa-clock"></i>
                                    </div>
                                    <div class="top-bar-text">
                                        <h3>Open </h3>
                                        <p>24 Hours</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-4">
                                <div class="top-bar-item">
                                    <div class="top-bar-icon">
                                        <i class="fa fa-phone-alt"></i>
                                    </div>
                                    <div class="top-bar-text">
                                        <h3>Hotline</h3>
                                        <p>011 345 6789</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-4">
                                <div class="top-bar-item">
                                    <div class="top-bar-icon">
                                        <i class="far fa-envelope"></i>
                                    </div>
                                    <div class="top-bar-text">
                                        <h3>Email Us</h3>
                                        <p>abcinfo@gmail.com</p>
                                    </div>
                                </div>
                            </div>
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
                    <a href="#" class="navbar-brand">MENU</a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                        <div class="navbar-nav mr-auto">
                            <a href="Homepage.jsp" class="nav-item nav-link active">Home</a>

                            <div class="nav-item dropdown">
                                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Bill payment</a>
                                <div class="dropdown-menu">
                                    <a href="#" class="dropdown-item"></a>
                                    <a href="deletePatient.jsp"></a>
                                    <a href="#" class="dropdown-item"></a>
                                    <a href="#" class="dropdown-item"></a>
                                    <a href="#" class="dropdown-item"></a>
                                </div>
                            </div>
                            <a href="#" class="nav-item nav-link"></a>
                            <a href="#" class="nav-item nav-link"></a>
                            <a href="#" class="nav-item nav-link"></a>
                            <a href="#" class="nav-item nav-link"></a>
                            
                            <a href="#" class="nav-item nav-link"></a>
                        </div>
                        
                    </div>
                </nav>
            </div>
        </div>








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
          <div class="location">
            <div class="container">
                    <div >
                        <div class="location-form">
                                <div class="control-group">
                                    <input type="text" class="form-control" name="fname" placeholder="Name" required="required" />
                                </div>
          
                                <div class="control-group">
                                    <input type="text" class="form-control" name="patientno" placeholder="Patient No" required="required" />
                              </div>
                            <div class="control-group">
                                    <input type="int" class="form-control" name="treatments" placeholder="Treatment cost" required="required" />
                              </div>
                            <div class="control-group">
                                    <input type="int" class="form-control" name="tests" placeholder="Tests" required="required" />
                              </div>
                            <div class="control-group">
                                    <input type="int" class="form-control" name="drugs" placeholder="Doctor chargers" required="required" />
                              </div>
                            <div class="control-group">
                                    <input type="int" class="form-control" name="addfee" placeholder="Additional charges" required="required" />
                              </div>
                                <div>
                                    
                                    <button class="btn btn-custom" name="submit" type="submit">Billing</button>
                                </div>
                        
                    </div>
            </div>
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
String fname= request.getParameter("fname");
String patientno = request.getParameter("patientno");
String treatments = request.getParameter("treatments");
String tests = request.getParameter("tests");
String drugs = request.getParameter("drugs");
String addfee = request.getParameter("addfee");



Payment pay= new Payment();
pay.setFname(fname);
pay.setPatientno(patientno);
pay.setTreatments(treatments);
pay.setTests(tests);
pay.setDrugs(drugs);
pay.setAddfee(addfee);


boolean success= Webhelper.addPayment(pay);
if(success==true){
    
    out.print("success");
}
else{

 out.print("Error");
}



}

%>





      



       