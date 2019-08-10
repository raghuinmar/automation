
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.core.util.CoreList"%>
<%@page import="com.track.project.model.ProjectBean"%>

 <%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>


<center><h3><font color="#FF1493"><b><i>Delete Project Details</b></font></h3></center>
   <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
  <form action="./deleteProjects" method="post"> 
      
      <input type="hidden" name="type" value="projcode"/>
      <input type="hidden" name="value" value="<%=request.getParameter("projcode")%>"/>
    <table width="" border="0" align="center" bordercolor="">
    
      <tr bgcolor="#FFFFMMK">
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
        
        
        <td width="110"><div align="center" class="style8"></div></td>
        <td width="110"><div align="center" class="style8">ProjName</div></td>
        <td width="87"><div align="center" class="style8">ProjCode</div></td>
        <td width="64"><div align="center" class="style8">ProjDuration</div></td>
      
         
        
        
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
    
        <td bgcolor="#C3D7BA"><input name="ch<%=i%>" type="checkbox" id="checkbox2" value="<%=1%>,<%=projid%>"/></td>
        <td bgcolor="#C3D7BA" ><div align="center" class="style7">  <%=projname%></div></td> 
        <td bgcolor="#C3D7BA"><div align="center" class="style7"><%=pcode%></div></td>
        <td bgcolor="#C3D7BA"><div align="center"><span class="style7"><%=projduration %></span></div></td>
        
        
      
        
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
         
      
      	
      
      <tr>
        <td colspan="8"><div align="center">
         
          <input type="submit" name="button" id="button" value="Delete"/>
          &nbsp;
         
        </div></td>
      </tr>
       
  </table>

</form>
   

