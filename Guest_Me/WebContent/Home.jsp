<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Home</title>

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
                        <a href="Home.jsp">Home</a>
                    </li>
                   
                   <li>
  <a class="page-scroll" href="#search"> Search</a>
                    </li>
                    
                   
                   <li>
                   <a href="FinalServlet?action=accepted">View Accepted Booking</a>
                   </li>
                    
                    <li>
                    <a class="page-scroll" href="#message" > View Messages</a>
                    
                    </li>
                    
                    <li>
                    
                    <a class="page-scroll" href="#about" > View All Ads</a>
                    </li>

 <li>
                        <a class="page-scroll" href="#about">View Your Ads</a>
                    </li>

<li>
<a class="page-scroll" href="#adlist">Adlist</a>
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
                <h1> <font color="black"> WELCOME <%= session.getAttribute("username") %>  </font></h1>
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
                    <a href="AdsController?action=only" class="btn btn-default btn-xl">View Your Ads</a> <br><br>
                 <a href="AdsController?action=all" class="btn btn-default btn-xl">View All Ads</a>
                </div>
            </div>
        </div>
    </section>

    <section id="message">
    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Messages</h2>
                <a href="MessageController?action=message" class="btn btn-default btn-xl wow tada">View Messages</a>
            </div>
        </div>
    </aside>
</section>

<center><h2 class="section-heading">Explore Beautiful Cities Of Pakistan</h2></center>
<br>
   <section class="no-padding" id="portfolio">
          
        <div class="container-fluid">
            <div class="row no-gutter">
                <div class="col-lg-4 col-sm-6">
              
                    <a href="SearchServlet?action=location&location=islamabad" class="portfolio-box">
                        <img src="startbootstrap/img/portfolio/i1.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    City
                                </div>
                                <div class="project-name">
                                    Islamabad
                                </div>
                            </div>
                        </div>
                        
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                   <a href="SearchServlet?action=location&location=lahore"  class="portfolio-box">
                        <img src="startbootstrap/img/portfolio/thumb.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    City
                                </div>
                                <div class="project-name">
                                    Lahore
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="SearchServlet?action=location&location=peshawar"  class="portfolio-box">
                        <img src="startbootstrap/img/portfolio/pesh.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    City
                                </div>
                                <div class="project-name">
                                    Peshawar
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="SearchServlet?action=location&location=karachi"  class="portfolio-box">
                        <img src="startbootstrap/img/portfolio/karac.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    City
                                </div>
                                <div class="project-name">
                                    Karachi
                            </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="SearchServlet?action=location&location=quetta"  class="portfolio-box">
                        <img src="startbootstrap/img/portfolio/quetta.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    City
                                </div>
                                <div class="project-name">
                                    Quetta
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                   <a href="SearchServlet?action=location&location=faisalabad"  class="portfolio-box">
                        <img src="startbootstrap/img/portfolio/Faisalabad.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    City
                                </div>
                                <div class="project-name">
                                    Faisalabad
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </section>


<section id="search">
    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Search Here</h2>
                <a href="Searchpage.jsp" class="btn btn-default btn-xl wow tada">Search</a>
            </div>
        </div>
    </aside>
</section>
   
   
   <section class="bg-primary" id="adlist">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Post Ads!</h2>
                    <hr class="light">
                    
                    <a href="upload.jsp" class="btn btn-default btn-xl">Adlist</a>
                
                </div>
            </div>
        </div>
    </section>
   
    <br>
    <br>
       
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
