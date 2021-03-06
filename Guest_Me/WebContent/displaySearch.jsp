<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
		<link rel="stylesheet" href="site/css/reset.css" type="text/css" media="all">
		<link rel="stylesheet" href="site/css/layout.css" type="text/css" media="all">
		<link rel="stylesheet" href="site/css/style.css" type="text/css" media="all">
		<script type="text/javascript" src="js/jquery-1.6.js" ></script>
		<script type="text/javascript" src="js/cufon-yui.js"></script>
		<script type="text/javascript" src="js/cufon-replace.js"></script>
  		<script type="text/javascript" src="js/Didact_Gothic_400.font.js"></script>
		<script type="text/javascript" src="js/atooltip.jquery.js"></script>
		<script type="text/javascript" src="js/jquery.jqtransform.js" ></script>
		<script type="text/javascript" src="js/script.js"></script>
		
<title>Search Results</title>
</head>
<body>
<h2 class="pad_bot1 pad_top1">Search Results</h2>
<c:forEach items="${abc}" var="ad">
<div class="body2">

			<div class="main">
			
				<section id="content">
					<div class="wrapper">
						<article class="col1">
							<div class="pad2">
								<div class="wrapper">
									<figure class="left marg_right1"><img  src = "<c:out value="${ad.pic}" /> " height="250" width="200" ></figure>
									
									
									<p>Description: <c:out value="${ad.descr}" /></p>
									<p>Location: <c:out value="${ad.location}" /> </p>
									<p>Available From: <c:out value="${ad.av_from}" /></p>
									<p>Available To: <c:out value="${ad.av_to}" /></p>
									<p>Price: <c:out value="${ad.price}" /></p>
									<p>Rooms: <c:out value="${ad.rooms}" /></p>
								<p>Availability: <font color="white"><c:out value="${ad.availability }"/> </font> </p> 
								
								</div>
								
							</div>
							</article>
							</div>
							</section>
							</div>

							</div>
							
</c:forEach>


 
          
        </tbody>
    </table>


</body>
</html>