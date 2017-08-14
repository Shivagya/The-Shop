<%@include file="header.jsp" %> 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<br>
<br>
<br>
<br>
<br>


  <form:form class="form-horizontal" action="submituserdetails" commandName="signupuser" method="post">
    
    	
      <div class="form-group">	
      <label class="control-label col-sm-2">Name:</label>  
      <div class="col-sm-9">     
      <form:input class="form-control" placeholder="Enter Name" path="uname"/><form:errors path="uname"/>
      </div> 
      </div>
      
      
      <div class="form-group">
      <label class="control-label col-sm-2">Email:</label>
      <div class="col-sm-9">      
      <form:input class="form-control" placeholder="Enter Email" path="uemail"/><form:errors path="uemail"/> 
      </div>
      </div>
      
      
      <div class="form-group">
      <label class="control-label col-sm-2">Password:</label> 
      <div class="col-sm-9">           
      <form:input class="form-control" placeholder="Enter Password" type="password" path="upass"/><form:errors path="upass"/> 
      </div>
      </div>

	  <div class="form-group">	    
      <label class="control-label col-sm-2">Phone No.:</label>  
      <div class="col-sm-9">       
      <form:input class="form-control" placeholder="Enter Phone No." path="uphone"/><form:errors path="uphone"/>
      </div>
      </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2">Age</label>
      <div class="col-sm-9">
      <form:input class="form-control" placeholder="Enter age"  path="age"/><form:errors path="age"/>
      </div>
      </div>
    
    
      <div class="form-group">
      <label class="control-label col-sm-2">Sex</label>
      <div class="col-sm-9">
      <form:input class="form-control" placeholder="Enter Sex" path="sex"/><form:errors path="sex"/>
      </div>
      </div>
           
      <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-9">
      <input type="submit" value="Submit"/>
      </div>
      </div>
      
  </form:form>

<%@include file="footer.jsp" %>
