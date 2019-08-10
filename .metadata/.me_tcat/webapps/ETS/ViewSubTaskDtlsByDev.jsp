<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %><%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.project.model.ProjModuleBean"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="com.track.core.util.CoreList"%> 
<html>
<head>
		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
 <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <tr>
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
				



 <center><table>
 <%

      
	     String user = (String) session.getAttribute("user");
	     CoreList inCoreList = new CoreList();
	     System.out.println("ccore hash value"+inCoreList.isEmpty());
	     // CoreHash bCoreHash = new CoreHash();
	      
	      
	     try{
            
             String mname;
             String projcode;
             String projname;
             String subtaskname;
             String ehrs;
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProjectDetailsDao().getSubTaskDetailsofDev(user);
            
           //  bCoreHash = branddao.listBrandNames();
             
             ProjModuleBean pBean = new ProjModuleBean();
             System.out.println("pbean in jsp is..."+pBean);
             if(!inCoreList.isEmpty())
         	{
        
       %>
        <tr><td></td><td></td><i><th width="20"><font color="" size="3"><i>SubTaskDetails</i></font></th><td></td></tr>
    <tr bgcolor="#FFFWQNAM">
    <td width="30"><div align="center" class="style8"></div></td>
        <td width="64"><div align="center" class="style8"><b>ProjectCode</b></div></td>
        <td width="64"><div align="center" class="style8"><b>ProjectName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>ModuleName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>SubtaskName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>EstimatedHours</b></div></td>
    
    </tr>
   
          
      <%    	Enumeration enu = inCoreList.elements();
          System.out.println("has more elements value"+enu.hasMoreElements());
          			int i=0;
          			while (enu.hasMoreElements()) {
          			i++;
          			System.out.println("...........");
          				pBean = (ProjModuleBean) enu.nextElement();
          				System.out.println(".....pBean......"+pBean);
          				mname=pBean.getMname();
          				System.out.println(".....mname......"+mname);
          				projcode=pBean.getProjcode();
          				projname=pBean.getProjname();
						subtaskname=pBean.getSubtaskname();
						ehrs=pBean.getEhrs();
						
          		         		
         %>
         <tr bgcolor="#CEC9FA" height="10" >
         <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=i %></div></td>
        <td height="20"  bgcolor="#F4F5F7"><div align="center" class="style7"><%=projcode %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=projname %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=mname %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=subtaskname %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=ehrs %></div></td>
   </tr>
 <%   } %>
  <%
      	
  } else {%>
      
         <tr><td height="24" colspan="8"><div align="center" class="style3"><strong>No Records Found</strong></div></td>
         </tr>
     
      
     <%  }  }
      	catch (Exception e) {
      		LoggerManager.writeLogWarning(e);
      	}
      	
   
      %>
      </table></center>
      
      
      </td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>