<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<html>
<head>
<script type="text/javascript">
function newedesignation(entered, alertbox)
{

with (entered)
{
if (value==null || value=="")
{if (alertbox!="") {alert(alertbox);} return false;}
else {return true;}
}
} 

function formvalidation(thisform)
{
with (thisform)
{
if (newedesignation(oldpassword,"Please Enter OldPassword")==false) {oldpassword.focus(); return false;};
if (newedesignation(newpassword,"Please Enter NewPassword")==false) {newpassword.focus(); return false;};
}
}
</script>		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
<td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>        <tr>
        <td><jsp:include page="DevMenu.html"/></td>
        </tr>
			<tr>
<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
				



<html>
	<head>
	<style type="text/css">
.Title {
font-family:Verdana;
font-weight:bold;
font-size:8pt
}
.Title1 {font-family:Verdana;
font-weight:bold;
font-size:8pt
}
        </style>
	</head>
<body>      
      <center><span class=Title><h3>Change Password Form </h3></span></center>
      
      
    <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
      
		<form id="form3" name="newedesignation" method="post"
			action="./ChangePasswordAction" onsubmit="return formvalidation(this)"> 
			<table border="0" align="center">
				<tr>
					<td><span class=Title>
					  Login Name
					</span></td>
					<td>
						<input type="text" name="username" value="<%=session.getAttribute("user") %>" readonly />					</td>
				</tr>
				<tr>
					<td><span class=Title>
					  Old Password
					</span></td>
					<td>
						<input type="password" name="oldpassword" />					</td>
				</tr>
				<tr>
					<td><span class=Title>
					  New Password
					</span></td>
					<td>
						<input type="password" name="newpassword" />					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div align="center"><strong>
						  <input type="submit" name="Submit" value="Change" />
						</strong></div>				  </td>
				</tr>
			</table>
		</form>
	</body>
</html>
  </td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>