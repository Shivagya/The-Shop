<%@include file="header.jsp" %> 
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<br>
<br>
<br>
<br>
<br>

<form class="form-horizontal" method="post" action="loginx">


	   <div class="form-group">	   	
       <label class="control-label col-sm-2">Enter user emailId</label>
       <div class="col-sm-9">
       <input class="form-control" placeholder="Enter Email Id" type = text name="uemail" /><br>
       </div>
       </div>
       
       <div class="form-group">	   
       <label class="control-label col-sm-2">Enter password</label>
       <div class="col-sm-9">
       <input class="form-control" placeholder="Enter Password" type = password name="upass" /><br>
       </div>
       </div>
       
       <div class="form-group">        
       <div class="col-sm-offset-2 col-sm-9"> 
       <input type="submit" value="Submit" />
       </div>
       </div>
       
       
</form>


<%@include file="footer.jsp" %>