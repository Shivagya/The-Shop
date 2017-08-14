<%@include file="header.jsp" %> 
<br>
<br>
<br>
<br>
<br>
	<div>
	<p>
		<h4>${msg}</h4> <br>
		<h4>The Details you added are...</h4> <br>
		Product I.D : ${product.pid} <br>
		Product Name : ${product.pname} <br>
		Product Price : ${product.pprice} <br>
		Product Category : ${product.pcategory} <br>
		Product Quantity : ${product.pquantity} <br>
		<img src="/resources/images/${product.pid}.jpg" height="150" width="150"><br>
	</p>
	</div>

<%@include file="footer.jsp" %> 