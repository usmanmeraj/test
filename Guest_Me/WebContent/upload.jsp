<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <meta charset="UTF-8">
    <title>Upload</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="bootstrap/css/style.css">

    
    
    
  </head>
<body>


<div class="login-card">
	 <h1>Upload Image</h1><br>
		<form method="post" action="UploadServlet" enctype="multipart/form-data">
	
			<input type="file" name="uploadFile" required accept="image/*" /> 
			<br/><br/> 
		
		<input type="submit" name="upload" value="Upload" >
		</form>
		
	
	
	</div>

<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>

    
    
    
	
</body>
</html>