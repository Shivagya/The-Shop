<%@include file="header.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"	 %>
<br>
<br>
<br>
<br>
<br>
	
	<form:form action="${pageContext.request.contextPath}/adminsubmitproductdetails" commandName="product" enctype="multipart/form-data" method="post">
		
	<c:if test="${!empty product.pname}">
			<label>Product I.D : </label>
			<form:input path="pid" disabled="true" readonly="true"/><form:errors path="pid"/>
			<form:hidden path="pid"/>
			<br>
	</c:if>
	
			<label>Product Name : </label>
			<form:input path="pname"/><form:errors path="pname"/>
			<br>


			<label>Product Price :</label>
			<form:input path="pprice"/><form:errors path="pprice"/>
			<br>

		
			<label>Product Category : </label>
			<select name="pcategoryid">
    			<c:forEach items="${listcategory}" var="cat">
      			<option value=${cat.category_id}>${cat.category_id}</option>
      			</c:forEach>
     		 </select>
			<br>


			<label>Product Quantity : </label>
			<form:input path="pquantity"/><form:errors path="pquantity"/>
			<br>
			
			
			<label>Upload Image : </label>
			<form:input path="image" type="file"/><form:errors path="image"/>
			<br>
			
		<c:if test = "${empty product.pname }">
		
			<input type="submit" value="Add"/>

		</c:if>
		
		<c:if test = "${!empty product.pname }">
		
			<input type="submit" value="Edit"/>

		</c:if>
		
		
		
	</form:form>
	
	
	
	
	
	
	
	<h3>Product List</h3>
<c:if test="${!empty listproducts}">
    <div class="table-responsive">
    <table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>             
        <th>Price</th>
        <th>Quantity</th>
        <th>Category</th> 
              
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listproducts}" var="prod">
        <tr>
            <td>${prod.pid}</td>
            <td>${prod.pname}</td>     
            <td>${prod.pprice}</td>
            <td>${prod.pquantity}</td>
            <td>${prod.pcategoryid}</td>
             
            <td><a href="<c:url value='/edit/${prod.pid}' />" >Edit</a></td>
            <td><a href="<c:url value='/delete/${prod.pid}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    <tbody>
    </table>
 </div>
</c:if>

<%@include file="footer.jsp" %>