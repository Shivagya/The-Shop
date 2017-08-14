<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url var="css" value="/resources/bootstrap/css"/>
<c:url var="js" value="/resources/bootstrap/js"/>
<c:url var="img" value="/resources/images"/>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="${css}/bootstrap.min.css" rel="stylesheet">
<link href="${css}/StyleSheet.css" rel="stylesheet">
<script src="${js}/jquery-2.2.3.js"></script>
<script src="${js}/angular.min.js"></script>
<script src="${js}/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>


<style>

.navbar-nav li a:hover, .navbar-nav li.active a{
	color:black !important;
	background-color:#00cc00 !important; 
}

</style>


</head>
<html>
<body style="background-color:#ccccb3;">
	<!--NAVBAR--> 
	
	<nav style="background-color: #262626;" class="navbar navbar-inverse navbar-fixed-top" >
		
		<div class="container-fluid" >

			
			
			
			<!-- LOGO -->
			
			<div class="navbar-header" >

				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#website_nav">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>					
				</button>

				<a href="index" class="navbar-brand" style="color:#00cc00">THE Shop</a>

			</div>
			
			
			
			
			<!-- Menu Items -->
			
			<div class="collapse navbar-collapse" id="website_nav">
				<ul class="nav navbar-nav">
					<li> <a href="index"><span class="glyphicon glyphicon-home"></span></a></li>
					
					<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">
					Men
					<span class="caret"></span></a>
					<ul class="dropdown-menu">
					<li><a href="#">Footwear</a></li>
					<li><a href="#">Clothing</a></li>
					</ul>
					</li>
					
					
					
					<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">
					Women
					<span class="caret"></span></a>
					<ul class="dropdown-menu">
					<li><a href="#">Footwear</a></li>
					<li><a href="#">Clothing</a></li>
					</ul>
					</li>
					
					
					
					<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">
					Kids
					<span class="caret"></span></a>
					<ul class="dropdown-menu">
					<li><a href="#">Footwear</a></li>
					<li><a href="#">Clothing</a></li>
					</ul>
					</li>
					
					
					
					<!--<li><a href="#"><input type="text" name="search"></a></li>-->
					<li><a href="aboutus">About Us</a></li>
					<li><a href="contactus">Contact Us</a></li>
				</ul>

				<ul class=" nav navbar-nav navbar-right">
					<li><a href="#" title="User" class="dropdown-toggle" data-toggle="dropdown">
						<span class="glyphicon glyphicon-user"><span class="caret"></span></span>
						</a>

						<ul class="dropdown-menu">
							<li><a href="signup">Sign Up</a></li>
							<li><a href="login">Sign In</a></li>
						</ul>
					</li>
					
				</ul>
			</div>
			
			
			
			

		</div>
		
		
		
		
	</nav>	


