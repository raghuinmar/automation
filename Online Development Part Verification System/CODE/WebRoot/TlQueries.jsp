 <%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
 
 <html>
<head>
		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
     <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <tr>
        <td><jsp:include page="Tl.html"/></td>
        </tr>
			<tr>
			<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>

			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
 
 <fieldset>
					<legend class="style1"><font color="#FFFWQNAM"><i> Send Query</font></legend>
					<br/>
					<form id="form1" method="post" action="./sendQueryByTl" name="f">
					  <table width="337" border="0" align="center">
                        <tr>
                          <td width="54">From</td>
                          <td width="273"><label>
                            <input name="loginid" type="text" id="textfield" size="48" value="<%=(String)session.getAttribute("user")%>" readonly />
                          </label></td>
                        </tr>
                        <tr>
                          <td>To</td>
                          <td><label>
<%--                          <select><option>--select--</option><option>TeamLead</option><option>Admin</option></select>--%>
                            <input name="to" type="text" id="textfield2" size="48"  value="Administrator" readonly/>
                          </label></td>
                        </tr>
                        <tr>
                          <td>Query</td>
                          <td><label>
                            <textarea name="description" id="textarea" cols="45" rows="5"></textarea>
                          </label></td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td colspan="2"><label>
                            <div align="center">
                              <input type="submit" name="button" id="button" value="Send" />
                              </div>
                          </label></td>
                        </tr>
                      </table>
                      </form>
                      <script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("f");
  
 
   frmvalidator.addValidation("description","req","Please enter Description");
  
   
    
 </script>
 
					<br/>
                    
					  </fieldset>
					  
					  
					  </td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>