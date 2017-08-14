<%@page isELIgnored="false" %>

<%@taglib uri="http://www.springframework.org/security/tags"   prefix="sec"%>

<%@include file="header.jsp" %> 

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<sec:authorize access="hasRole('ROLE_ADMIN')">

<jsp:forward page="/adminHome"></jsp:forward>

</sec:authorize>



	<!-- CAROUSEL -->
	
	<div class="container-fluid" style="width:80%;">
	
		<div id="my-slider" class="carousel slide" data-ride="carousel">
		
				<!-- INDICATORS OR DOT NAVS -->
			
				<ol class="carousel-indicators">
					<li data-target="#my-slider" data-slide-to="0" class="active"></li>
					<li data-target="#my-slider" data-slide-to="1"></li>
					<li data-target="#my-slider" data-slide-to="2"></li>
					<li data-target="#my-slider" data-slide-to="3"></li>
				</ol>
			
				<!-- WRAPPER FOR SLIDES -->
			
				<div class="carousel-inner" role="listbox" >
			
					<div class="item active">
						<img src="${img}/nike1.jpg" class="img-responsive img-rounded" alt="NIKE"/>
						<div class="carousel-caption">
							<h1>35% OFF ON NIKE SHOES</h1>
							<p>This image does not belongs to me, I am just using it for the example.</p>
						</div>
					</div>
				
					<div class="item">
						<img src="${img}/formals.jpg" class="img-responsive img-rounded" alt="FORMALS"/>
						<div class="carousel-caption">
							<h1>25% OFF ON FORMAL SHOES</h1>
							<p>This image does not belongs to me, I am just using it for the example.</p>
						</div>
					</div>	
				
					<div class="item">
						<img src="${img}/omega.jpg" class="img-responsive img-rounded" alt="OMEGA WATCHES"/>
						<div class="carousel-caption">
							<h1>15% DISCOUNT ON OMEGA WATCHES</h1>
							<p>This image does not belongs to me, I am just using it for the example.</p>
						</div>
					</div>
					
					<div class="item">
						<img src="${img}/tanishq.jpg" class="img-responsive img-rounded" alt="JEWELLERY"/>
						<div class="carousel-caption">
							<h1>10% DISCOUNT ON  JEWELLERY</h1>
							<p>This image does not belongs to me, I am just using it for the example.</p>
						</div>
					</div>
							
				</div>
			
				<!-- CONTROLS OR NEXT & PREV BUTTONS -->
			
				<a class="left carousel-control" href="#my-slider" role="button" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
			
				<a class="right carousel-control" href="#my-slider" role="button" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
		
		</div>
	
	</div>
	
	
<%@include file="footer.jsp" %>	






