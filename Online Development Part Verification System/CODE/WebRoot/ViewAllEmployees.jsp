<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.core.util.CoreList"%>
<%@page import="com.track.project.model.ProjectBean"%>
<%@page import="com.track.dae.dao.ProfileDAO"%>
<%@page import="com.track.dae.model.Profile"%>
<html>
<head>
		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
    
<td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <tr>
        <td><jsp:include page="AdminMenu.html"/></td>
        </tr>
			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td> 
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="0" width="100%" height="350" valign="top">
				<br><br>
 


<center><h3><font color="#FF1493"><b><i>View All Employee Details</b></font></h3></center>
   <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
  
      
      <input type="hidden" name="type" value="projcode"/>
      <input type="hidden" name="value" value="<%=request.getParameter("projcode")%>"/>
    <table width="" border="0" align="center" bordercolor="#F4F5F7">
    
      <tr bgcolor="#FFFWQNAM">
       <%
String name=(String)session.getAttribute("user");
String path=request.getRealPath("/userimages");
        
	     String role = (String) session.getAttribute("role");
	     CoreList inCoreList = new CoreList();
	     System.out.println("ccore hash value"+inCoreList.isEmpty());
	     // CoreHash bCoreHash = new CoreHash();
	      
	      
	     try{
             String designation="";
             String fname="";
             String lname="";
             String dob;
             String email;
             String fax;
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProfileDAO().getEmpDetails(path);
            
           //  bCoreHash = branddao.listBrandNames();
             
             Profile pBean = new Profile();
             System.out.println("pbean in jsp is..."+pBean);
             if(!inCoreList.isEmpty())
         	{
        
       %>
        
        
        <td width="110"><div align="center" class="style8"><b>Designation</b></div></td>
        <td width="110"><div align="center" class="style8"><b>FirstName</b></div></td>
        <td width="87"><div align="center" class="style8"><b>LastName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>Dob</b></div></td>
      <td width="110"><div align="center" class="style8"><b>Email</b></div></td>
        <td width="87"><div align="center" class="style8"><b>Fax</b></div></td>
        
        <td width="64"><div align="center" class="style8"><b>EmpPicture</b></div></td>
        
      </tr>
          <%
          
          	Enumeration enu = inCoreList.elements();
          System.out.println("has more elements value"+enu.hasMoreElements());
          			int i=0;
          			while (enu.hasMoreElements()) {
          			System.out.println("...........");
          				pBean = (Profile) enu.nextElement();
          				System.out.println(".....pBean......"+pBean);
          				designation = pBean.getLogintype();
          				System.out.println("designation.... in jsp ...."+designation); 		
          				fname = pBean.getFirstname();
          				lname = pBean.getLastname();
						dob = pBean.getBdate();
						email=pBean.getEmail();
						fax=pBean.getFax();
						 System.out.println("has more elements value"+pBean.getPhoto());
						
          		         		
          %>
      <tr bgcolor="#CEC9FA" >
    
        
        <td bgcolor="#F4F5F7" ><div align="center" class="style7">  <%=designation %></div></td> 
        <td bgcolor="#F4F5F7"><div align="center" class="style7"><%=fname%></div></td>
        <td bgcolor="#F4F5F7"><div align="center"><span class="style7"><%=lname %></span></div></td>
        <td bgcolor="#F4F5F7" ><div align="center" class="style7">  <%=dob%></div></td> 
        <td bgcolor="#F4F5F7"><div align="center" class="style7"><%=email%></div></td>
        <td bgcolor="#F4F5F7"><div align="center"><span class="style7"><%=fax %></span></div></td>
        <td bgcolor="#F4F5F7"> <p><img alt="See Photo Here" id="previewField" src="userimages/<%=pBean.getPhoto() %>" height="50" width="90"></p></td>
        
      
        
      </tr>
     <%i++;
      	}%> <input type="hidden" name="count" value="<%=i%>"/>
      		<% }else {
      %>
         <tr><td height="24" colspan="8"><div align="center" class="style3"><strong>No Records Found</strong></div></td>
         </tr>
      <%
      	}
    
}
      	catch (Exception e) {
      		LoggerManager.writeLogWarning(e);
      	}
   
      %>
         
      
      	
      
     
       
  </table>



</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>