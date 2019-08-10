<%@ page import ="com.track.dae.dao.*,com.track.dae.model.*" %>
<%@page import="java.util.Enumeration,com.track.core.util.CoreHash"%>
<%@page import="com.track.core.util.DateWrapper"%>

<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
	<head>

		<style type="text/css">
.Title {
font-family:Verdana;
font-weight:bold;
font-size:8pt
}
</style>
	</head>
	<body>

  <%String sdate=DateWrapper.parseDate(request.getParameter("fromdate"));
		   String edate=DateWrapper.parseDate(request.getParameter("todate")); %>
  <tr><strong><span class="style16"> Report Details From <%=sdate %> to <%=edate %><br/>
            <br/>
  </span></strong></tr>
  <tr>
    
    <td bgcolor="#E0FEFD"><div align="center" class="style16">LoginID</div></td>
    <td bgcolor="#E0FEFD"><div align="center" class="style16">FirstName</div></td>
    <td bgcolor="#E0FEFD"><div align="center" class="style16">LastName</div></td>
    <td bgcolor="#E0FEFD"><div align="center" class="style16">Email</div></td>
    <td bgcolor="#E0FEFD"><div align="center" class="style16">DOB</div></td>
    <td bgcolor="#E0FEFD"><div align="center" class="style16">RegisterDate</div></td>
  </tr>
  <%int sno=1;
		   
		   CoreHash aCoreHash=new ProfileDAO().getReportFromTo(sdate,edate);
		   System.out.println(sdate+""+edate);
		   Enumeration e=aCoreHash.keys();
		   while(e.hasMoreElements())
		   {
		   Integer i=(Integer)e.nextElement();
		   Profile aProfile=(Profile)aCoreHash.get(i);
		   
		   %>
  
 <tr>
    
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getLoginID() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getFirstName() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getLastName() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getEmail() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getBirthDate() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getRegDate() %></div></td>
  </tr>
  <%} %>

	</body>
</html>
  
  