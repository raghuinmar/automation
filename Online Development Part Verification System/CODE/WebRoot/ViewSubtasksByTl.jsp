<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.project.model.ProjModuleBean"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="com.track.core.util.CoreList"%><table>
  <tr>
  <%
        if(request.getParameter("projid")!=null) 
        System.out.println("projid................ code.... in jsp ...." + request.getParameter("projid"));
        {
    %>
   
   
     <%

        
	     String role = (String) session.getAttribute("role");
	     CoreList inCoreList = new CoreList();
	     System.out.println("ccore hash value"+inCoreList.isEmpty());
	     // CoreHash bCoreHash = new CoreHash();
	      
	      
	     try{
             int projid=Integer.parseInt(request.getParameter("projid"));
             System.out.println("projid in jsp is.........."+projid);
             String mname;
             String projcode;
             String projname;
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProjectDetailsDao().getModuleDetails(projid);
            
           //  bCoreHash = branddao.listBrandNames();
             
             ProjModuleBean pBean = new ProjModuleBean();
             System.out.println("pbean in jsp is..."+pBean);
             if(!inCoreList.isEmpty())
         	{
        
       %>
        <tr><td></td><td></td><i><th width="20"><font color="" size="3"><i>ModuleDetails</i></font></th><td></td></tr>
    <tr bgcolor="#FFFWQNAM">
    <td width="30"><div align="center" class="style8"></div></td>
        <td width=""><div align="center" class="style8"><b>ProjCode</b></div></td>
        <td width="70"><div align="center" class="style8"><b>ProjName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>ModuleName</b></div></td>
  
    
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
						
						
          		         		
         %>
         <tr bgcolor="#CEC9FA" height="10" >
         <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=i %></div></td>
        <td height="20"  bgcolor="#F4F5F7"><div align="center" class="style7"><%=projcode %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=projname %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=mname %></div></td>
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
      	}
   
      %>
   

         
  </table>