<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<html>
<head>	
<script type="text/javascript">
function emptyvalidation(entered, alertbox)
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
if (addtask(pname,"Please Enter An UserName")==false) {username.focus(); return false;};
}
}
</script>	
</head>
<body>
		<table bgcolor="#FFFFLIBLU"  align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
       <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
       
        <tr bgcolor="#1E5B91">
        <td><font color="#0000ff"><jsp:include page="GeneralOptions.html"></jsp:include></font><br></td>
        </tr>
			<tr>
				<td colspan="" width="" height="30"><center><font color="#FFFF004343" size="6"><b><i><font color="#0000ff">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;    Online Project Module Recording System</font>  </i></b></font></center></td>

			</tr>
			
		</table>


<form action="./addProjects" method="post" name="addtask"> 
  
  <table bgcolor="" bordercolor="green" border="0" align="center" cellpadding="1" cellspacing="2" height="10" width="10">
  <tr>
  <th>Task Name</th><td> <input type="text" name="pname"/> </td>
  </tr>
  <tr>
  <th>TaskDescription</th>  <td><input type="text" name="pcode"/></td>
  </tr>
  <tr>
  <th></th><td></td></tr>
  <tr>
  <td align="center"><input type="submit" name="Add" value="Add">  </td>
  <td align="center"><input type="reset" name="cancle" value="cancle"></td>
  </tr>
  </table>
  </form>
  <table>
  <tr>
				<td colspan="2" width="900" height="10"><img src="images2/fols.jpeg" height="30" width="999"/><br></td>
			</tr>
			</table>
			</body>
</html>