


<html>
<head>
		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
        <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td>
        <tr>
        <td><jsp:include page="GeneralOptions.html"/></td>
        </tr>
			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b> </b></font><font color="blue" size="8"><b>Online Development Part Verification System</b></font></center></td>
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
				
				<h3><font color="blue"><b>&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Login Here . . . . .</b></font></h3>
				
				  <jsp:include page="./statusmsg.jsp"/> 
				     
          <form action="./LoginAction" method="post">
            
        <table  border="0" align="center"  bgcolor="white" width=""> 
        <tr><td></td><td><font color="red"> <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%></font>
        </td></tr>                                             
               
                   <tr>
                     <th ><font color="blue"><b>UserID</b></font></th>
                      <td ><input type="text" name="username"/></td><td><font color="red"></font></td>
                      </tr>
                   <tr>
                     <th><span class="Title"><font color="blue"><b>Password</b></font></span></th>
                      <td><input type="password" name="password"/></td><td><font color="red"></td>
                      </tr>
                   <tr>
                     <td colspan="2">
                       <div align="center" class="style11">
                        <input type="submit" name="Add" value="Submit">
                          &nbsp;
                         <input type="reset" name="cancle" value="Reset">
                         </div>                        </td>
                      </tr>
               
               
              
               <tr>
               <td></td>
                
                 <td>
                   <a href="Recoverpassword.jsp"><strong><font color="blue">&nbsp;Forgot Password ! !......</font></strong></a></td>
                 <td></td>
               </tr>
              
          </table></form>
          
          
          
          </td></tr>
			
			</table>
</html>


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

