<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin Home</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="startbootstrap/css/bootstrap.min.css" type="text/css">

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="startbootstrap/css/animate.min.css" type="text/css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="startbootstrap/css/creative.css" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">Guest Me</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                
                
                 <li>
  <a class="page-scroll" href="#search"> Search</a>
                    </li>

<li>
<a class="page-scroll" href="#about" > View All Ads</a>
</li>


<li>
<a class="page-scroll" href="#users">View All Users</a>
</li>

<li>
<a class="page-scroll" href="#requests">View Requests</a>
</li>

<li>
<a href="logout.jsp">Logout</a>
</li>




 </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1> <font color="black"> WELCOME ADMIN <%= session.getAttribute("username") %>  </font></h1>
                <hr>
                <p><font color="black"><b>Rent unique places to stay from local hosts! </b> </font></p>
                
            </div>
        </div>
    </header>

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">View Ads!</h2>
                    <hr class="light">
                    <p class="text-faded">Discover Amazing places!   Book a Stay  & Travel </p>
                    
                 <a href="AdsController?action=allAdmin" class="btn btn-default btn-xl">View All Ads</a>
                </div>
            </div>
        </div>
    </section>

    <section id="requests">
    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>View Requests</h2>
                 <hr class="light">
                <a href="AdminController?action=requests" class="btn btn-default btn-xl wow tada">Requests</a>
            </div>
        </div>
    </aside>
</section>




   
   <section class="bg-primary" id="users">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">View All Users!</h2>
                    <hr class="light">
                    
                    <a href="AdminController?action=Allusers" class="btn btn-default btn-xl">View Users</a>
                
                </div>
            </div>
        </div>
    </section>
   
    <br>
    <br>
       
       
<section id="search">
    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Search Here</h2>
                 <hr class="light">
                <a href="Searchpage.jsp" class="btn btn-default btn-xl wow tada">Search</a>
            </div>
        </div>
    </aside>
</section>
   
       
       <div class="about">
   
    <p class="about-author">
      &copy; 2015 -
      GuestMe License<br>
    </p>
  </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="startbootstrap/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="startbootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="startbootstrap/js/jquery.easing.min.js"></script>
    <script src="startbootstrap/js/jquery.fittext.js"></script>
    <script src="startbootstrap/js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="startbootstrap/js/creative.js"></script>

</body>

</html>
