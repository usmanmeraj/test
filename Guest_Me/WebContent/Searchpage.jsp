<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="UTF-8">
    <title>Search</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
    
</head>
<body>

  
      



 <div class="login-card">

 <h1>Search</h1><br>

<form action="SearchServlet?action=allS" method ="post">
<fieldset>
    <p>
    Location <input type="text" name="location" class="location" placeholder="Location" autofocus><br>
      <br>
    Available From <input type="text"  name="av_from" placeholder="yyyy-mm-dd"> Available To <input type="text"  name="av_to" placeholder="yyyy-mm-dd"><br>
    


    <p>
  <label>  Price <input type="text" name="price"  class="Price" placeholder="$"> </label>
   
      </p> 
      
      <p>
    No. Of Rooms
  <input type="number" name="rooms" min="1" max="11" placeholder="1-11"><br>
  
    </p>
    <p>
      <input type="submit" value="Search" class="checkout-btn"><br>
    </p>
    </fieldset>
</form>
 <div class="about">
   
    <p class="about-author">
      &copy; 2015 -
      GuestMe License<br>
    </p>
  </div>

</div>

<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>

    
    
</body>
</html>
