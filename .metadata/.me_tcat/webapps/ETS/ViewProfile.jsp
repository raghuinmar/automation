<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %><html>
<head>
		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>

<td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <% String role=(String)session.getAttribute("role");
        if(role.equalsIgnoreCase("admin")){ %>
        <tr>
        <td><jsp:include page="AdminMenu.html"/></td>
        </tr>
        <% } else if(role.equalsIgnoreCase("client")){ %>
        <tr>
        <td><jsp:include page="Cl.html"/></td>
        </tr>
        <% } else if(role.equalsIgnoreCase("teamlead")){ %>
        <tr>
        <td><jsp:include page="Tl.html"/></td>
        </tr>
        
        <% } else if(role.equalsIgnoreCase("developer")){ %>
        <tr>
        <td><jsp:include page="DevMenu.html"/></td>
        </tr>
        <% } %>
			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>
			</tr>
			
		</table>
		
		










<%@ page import ="com.track.dae.dao.*,com.track.dae.model.*" %>

<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
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
        
<script language="JavaScript" src="scripts/gen_validatorv31.js" type="text/javascript"></script>
<script language="JavaScript" type="text/javascript" src="scripts/ts_picker.js"></script>
<script language="JavaScript1.1" src="scripts/pass.js">


</script> <script type="text/javascript" src="scripts/image.js"> </script>
 <script type="text/javascript" src="scripts/general.js"> </script>
 <script type="text/javascript" src="scripts/adi.js"> </script>
 <script type="text/javascript" src="scripts/form_validation.js"> </script>

		<script language="JavaScript" src="images/javascripts.js"></script>
		<script language="JavaScript" src="images/pop-closeup.js"></script>
	</head>
	<body>


     
     <%
String name=(String)session.getAttribute("user");
     System.out.println("name in jsp is..."+name);
String path=request.getRealPath("/userimages");

		Profile aprofile=new ProfileDAO().getProfile(name,path);

%>

    <center><table>
     <th height="11" colspan="" bgcolor="#FFFWQNAM"><center><b><font color="white">Image</font></center></th>
  <td> <p><img alt="See Photo Here" id="previewField" src="userimages/<%=name %>+.jpg" height="110" width="110"></p></td>
     </table></center><br/>
    <center> <table width="500" height="116" bordercolor="#FEE8B6">
       <th height="20" colspan="15" bgcolor="#FFFWQNAM"><center><b><font color="white">Personal Details</font></center></th>
       <tr>
         <td width="128" bgcolor="#F4F5F7"><strong><span class="style14 Title">FirstName</span></strong></td>
         <td width="366" bgcolor="#F4F5F7"><span class="Title1"><strong><%=aprofile.getFirstname()%></strong></span></td>
       </tr>
       <tr>
         <td bgcolor="#F4F5F7"><span class="Title1"><strong>LastName</strong></span></td>
         <td bgcolor="#F4F5F7"><span class="Title1"><strong><%=aprofile.getLastname()%></strong></span></td>
       </tr>
       <tr>
         <td bgcolor="#F4F5F7"><span class="Title1"><strong>Dob</strong></span></td>
         <td bgcolor="#F4F5F7"><span class="Title1"><strong><%=aprofile.getBdate()%></strong></span></td>
       </tr>
       <tr>
         <td bgcolor="#F4F5F7"><span class="Title1"><strong>Email</strong></span></td>
         <td bgcolor="#F4F5F7"><span class="Title1"><strong><%=aprofile.getEmail()%></strong></span></td>
       </tr>
       <tr>
         <td bgcolor="#F4F5F7"><span class="Title1"><strong>Fax</strong></span></td>
         <td bgcolor="#F4F5F7"><span class="Title1"><strong><%=aprofile.getFax()%></strong></span></td>
       </tr>
     </table></center>
    

<br/><br>
<table  align="center"  bgcolor="" width="719" height="">
<th height="10" colspan="15" bgcolor="#FFFWQNAM"><center><b><font color="white">Address Details</font></center></th>

  
  <tr height="20">
    <td bgcolor="cyanblueeee"><div align="center" class="Title">Address Type </div>      </td>
    <td bgcolor="cyanblueeee"><div align="center" class="Title">HouseNo</div></td>
    <td bgcolor="cyanblueeee"><div align="center" class="Title">Street</div></td>
    <td bgcolor="cyanblueeee"><div align="center" class="Title">City</div></td>
    <td bgcolor="cyanblueeee"><div align="center" class="Title">State</div></td>
    <td bgcolor="cyanblueeee"><div align="center" class="Title">Country</div></td>
    <td bgcolor="cyanblueeee"><div align="center" class="Title">PhoneNo</div></td>
  </tr>
  <%if(aprofile.getHome()!=null){ %>
  <tr>
    <td bgcolor="#F4F5F7" height="40"><span class="Title">Home</span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getHno()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getStreet()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getCity()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getState()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getCountry()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getPhone()%></span></td>
  </tr>
  <%}if(aprofile.getOffice()!=null){  %>
  <tr>
    <td bgcolor="#F4F5F7"><span class="Title">Office</span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getOhno()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getOstreet()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getOcity()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getOstate()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getOcountry()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getOphone()%></span></td>
  </tr>
  <%}if(aprofile.getContact()!=null){  %>
  <tr>
    <td bgcolor="#F4F5F7"><span class="Title">Personal</span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getChno()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getCstreet()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getCcity()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getCstate()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getCcountry()%></span></td>
    <td bgcolor="#F4F5F7"><span class="Title"><%=aprofile.getCphone()%></span></td>
  </tr>
  <%} %>
</table>
</body>
</html>


			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
		


