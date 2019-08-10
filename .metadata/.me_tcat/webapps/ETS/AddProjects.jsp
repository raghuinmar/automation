<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<html>
<head>
<script type="text/javascript">
function addprojects(entered, alertbox)
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
with(thisform)
{
if (addprojects(pname,"Please Enter ProjectName")==false) {pname.focus(); return false;};
if (addprojects(pcode,"Please Enter ProjectCode")==false) {pcode.focus(); return false;};
if (addprojects(pduar,"Please Enter ProjectDuration")==false) {pduar.focus(); return false;};
}
}
</script>		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
    <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <tr>
        <td><jsp:include page="AdminMenu.html"/></td>
        </tr>
			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b><i></i></b></font><font color="blue" size="6"><b><i>Online Project Module Recording System</i></b></font></center></td>
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
				
				
				










  <center><h3><font color="#FF1493"><b><i>Add Project Details</b></font></h3></center>
   <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
  <form action="./addProjects" method="post" name="addprojects" onsubmit="return formvalidation(this)"> 
  
  <table bgcolor="" bordercolor="green" border="0" align="center" cellpadding="1" cellspacing="2" height="10" width="10">
  <tr>
  <th>AddProjectName</th><td> <input type="text" name="pname"/> </td>
  </tr>
  <tr>
  <th>AddProjectCode</th>  <td><input type="text" name="pcode"/></td>
  </tr>
  <tr>
  <th>AddProjectDuration</th>  <td><input type="text" name="pduar"/></td>
  </tr>
  <tr>
  <td align="center"><input type="submit" name="Add" value="Add">  </td>
  <td align="center"><input type="reset" name="cancle" value="cancle"></td>
  </tr>
  </table>
  </form>
 
    



</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>