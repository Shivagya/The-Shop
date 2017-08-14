<%@include file="header.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"	 %>
<br>
<br>
<br>
<br>
<br>
	
	<form:form action="${pageContext.request.contextPath}/adminsubmitcategorydetails" commandName="category" method="post">
		
	<c:if test="${!empty category.category_name}">
			<label>Category I.D : </label>
			<form:input path="category_id" disabled="true" readonly="true"/><form:errors path="category_id"/>
			<form:hidden path="category_id"/>
			<br>
	</c:if>
	
			<label>Category Name : </label>
			<form:input path="category_name"/><form:errors path="category_name"/>
			<br>


			<label>Category Description :</label>
			<form:input path="category_desc"/><form:errors path="category_desc"/>
			<br>

					
		<c:if test = "${empty category.category_name }">
		
			<input type="submit" value="Add"/>

		</c:if>
		
		<c:if test = "${!empty category.category_name }">
		
			<input type="submit" value="edit"/>

		</c:if>
		
		
		
	</form:form>
	
	
	
	
	
	
	<h3>Category List</h3>
<c:if test="${not empty listCategory}">
    <div class="table-responsive">
    <table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>             
        <th>Description</th> 
                     
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listCategory}" var="catg">
        <tr>
            <td>${catg.category_id}</td>
            <td>${catg.category_name}</td>     
            <td>${catg.category_desc}</td>
             
            <td><a href="<c:url value='/editc/${catg.category_id}' />" >Edit</a></td>
            <td><a href="<c:url value='/deletec/${catg.category_id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    <tbody>
    </table>
 </div>
</c:if>

<%@include file="footer.jsp" %>