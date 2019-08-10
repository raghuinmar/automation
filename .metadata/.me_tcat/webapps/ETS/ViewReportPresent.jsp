<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%@ page import ="com.track.dae.dao.*,com.track.dae.model.*" %>
<%@page import="java.util.Enumeration,com.track.core.util.CoreHash"%>


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

<%String report="";
report+=" <table border='1' align='center' bordercolor='black' bgcolor='#FFFFFF' width='719' height='20%'>";
report+="<br/><br/><tr><strong><span class='style16'><u> Present LoginUser Report<br/><br/></u></span></strong></tr><tr>";
report+="<td bgcolor='#E0FEFD'><div align='center' class='style16'>LoginID</div></td>";
   report+=" <td bgcolor='#E0FEFD'><div align='center' class='style16'>FirstName</div></td>";
    report+="<td bgcolor='#E0FEFD'><div align='center' class='style16'>LastName</div></td>";
    report+="<td bgcolor='#E0FEFD'><div align='center' class='style16'>Email</div></td>";
   report+=" <td bgcolor='#E0FEFD'><div align='center' class='style16'>DOB</div></td>";
    report+="<td bgcolor='#E0FEFD'><div align='center' class='style16'>RegisterDate</div></td></tr>";


 %>
      
<table border="1" align="center" bordercolor="#FFFFFF" bgcolor="#FFFFFF" width="719" height="20%">
  <br/>
  <br/>
  <tr><strong><span class="style16"><u> Present LoginUser Report</u>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="style13">Export to : <a href="ExportXLS" target="_blank"><font color="brown">XLS</font></a></span><br/>
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
		  
		   CoreHash aCoreHash=new ProfileDAO().getReportPresent();
		   
		   Enumeration e=aCoreHash.keys();
		   while(e.hasMoreElements())
		   {
		   Integer i=(Integer)e.nextElement();
		   Profile aProfile=(Profile)aCoreHash.get(i);

  report+="<tr><td bgcolor='#EFFEFF'><div align='center' class='style16'>"+aProfile.getLoginID()+"</div></td>";
 report+="   <td bgcolor='#EFFEFF'><div align='center' class='style16'>"+aProfile.getFirstName()+"</div></td>";
 report+="   <td bgcolor='#EFFEFF'><div align='center' class='style16'>"+aProfile.getLastName() +"</div></td>";
 report+="   <td bgcolor='#EFFEFF'><div align='center' class='style16'>"+aProfile.getEmail() +"</div></td>";
report+="    <td bgcolor='#EFFEFF'><div align='center' class='style16'>"+aProfile.getBirthDate() +"</div></td>";
report+="    <td bgcolor='#EFFEFF'><div align='center' class='style16'>"+aProfile.getRegDate() +"</div></td></tr>";
  

		   
		   %>
  
 <tr>
    
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getLoginID() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getFirstName() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getLastName() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getEmail() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getBirthDate() %></div></td>
    <td bgcolor="#EFFEFF"><div align="center" class="style16"><%=aProfile.getRegDate() %></div></td>
  </tr>
  <%}
  report+="</table>";
  session.setAttribute("Report",report);
   %>
  
</table>
 		 
	</body>
</html>
  