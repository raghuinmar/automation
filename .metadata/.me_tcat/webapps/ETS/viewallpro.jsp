<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.core.util.CoreList"%>
<%@page import="com.track.project.model.ProjectBean"%>
<html>
<head>
		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
    <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <tr>
        <td><jsp:include page="Cl.html"/></td>
        </tr>
			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="0" width="100%" height="350" valign="top">
				<br><br>
 


<center><h3><font color="#FF1493"><b><i>View All Project Details</b></font></h3></center>
   <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
  
      
      <input type="hidden" name="type" value="projcode"/>
      <input type="hidden" name="value" value="<%=request.getParameter("projcode")%>"/>
    <table width="" border="0" align="center" bordercolor="#F4F5F7">
    
      <tr bgcolor="#FFFWQNAM">
      <%
        
	     String role = (String) session.getAttribute("role");
	     CoreList inCoreList = new CoreList();
	     System.out.println("ccore hash value"+inCoreList.isEmpty());
	     // CoreHash bCoreHash = new CoreHash();
	      
	      
	     try{
             int projcode = 0;
             int projid = 0;
             String projname;
             String pcode;
             String projduration;
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProjectDetailsDao().getProjectDetails();
            
           //  bCoreHash = branddao.listBrandNames();
             
             ProjectBean pBean = new ProjectBean();
              
             
             if(!inCoreList.isEmpty())
         	{
        
       %>
        
        
        
        <td width="110"><div align="center" class="style8"><b>ProjName</b></div></td>
        <td width="87"><div align="center" class="style8"><b>ProjCode</b></div></td>
        <td width="64"><div align="center" class="style8"><b>ProjDuration</b></div></td>
      
         
        
        
      </tr>
          <%
          
          	Enumeration enu = inCoreList.elements();
          System.out.println("has more elements value"+enu.hasMoreElements());
          			int i=0;
          			while (enu.hasMoreElements()) {
          			System.out.println("...........");
          				pBean = (ProjectBean) enu.nextElement();
          				System.out.println("..........."+pBean);
          				projid = pBean.getProjid();
          				System.out.println("projid code.... in jsp ...."+projid); 		
          				projname = pBean.getProjname();
          				pcode = pBean.getProjcode();
						projduration = pBean.getProjduration();
						
          		         		
          %>
      <tr bgcolor="#CEC9FA" >
    
        
        <td bgcolor="#F4F5F7" ><div align="center" class="style7">  <%=projname%></div></td> 
        <td bgcolor="#F4F5F7"><div align="center" class="style7"><%=pcode%></div></td>
        <td bgcolor="#F4F5F7"><div align="center"><span class="style7"><%=projduration %></span></div></td>
        
        
      
        
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