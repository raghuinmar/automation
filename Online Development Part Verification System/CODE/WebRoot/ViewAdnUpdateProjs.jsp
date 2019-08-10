<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.project.model.ProjectBean"%>
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
<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
	<br><br>		
 <center><h3><font color="#FF1493"><b><i>Modify Project Details</b></font></h3></center>
<form id="form1" method="post" action="ViewAdnUpdateProjs.jsp" name="inventory">
    <table width="200" border="0" align="center">
      <tr>
        <td width=""><strong>SelectProjectCode</strong></td>
        <td width="90"><label>
          <select name="projcode" id="select" onchange="javascript:if(document.inventory.projcode.value==''){alert('select Any ProjCode');}else{ document.inventory.submit();}">
          <option>--Select--</option>
          <%
		  		try
		  		{
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listProjectCodes();
		  		   Enumeration enu = bCoreHash.keys();
		  		   String select = "";
		  		   int projcode1 = 0;
		  		   int projcode = 0;
		  		   if(request.getParameter("projcode")!=null)
		  		   {
		  		        projcode1 = Integer.parseInt(request.getParameter("projcode"));
		  		        System.out.println("proj code.... in jsp ...."+projcode1); 		    
		  		   }
		  		   while(enu.hasMoreElements())
		  		   {
		  		   		projcode = Integer.parseInt(enu.nextElement().toString());
		  		   		System.out.println("proj code in jsp ...."+projcode);
		  		   		select = "";
		  		   		if(projcode==projcode1)
		  		   		    select = "selected";
		  		   		
		  		   %>
		  		   <option value="<%=projcode%>" <%=select%>><%=bCoreHash.get(new Integer(projcode))%></option>  		 
		  		<%}
		  		}
		  		catch(Exception e)
		  		{
		  		   LoggerManager.writeLogWarning(e);
		  		}
		  %>
          </select>
        </label></td>
      </tr>
    </table>
    </form>
    
    <br />
     <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
  <%
        if(request.getParameter("projcode")!=null) 
        {
    %>
    <form name="modificconectfacil" action="./updateProjDetails" method="">     
<table align="center" WIDTH="500" border="0" bordercolor="black" bgcolor="#F4F5F7">
      <th colspan="15" bgcolor="#FFFWQNAM"><center><b><font color="white">MODIFY PROJECT DETAILS</font></center></th>
      <tr rowspan="4"></tr>
          
       <tr><td><span class=Title>
    <%if(request.getParameter("status")!=null)out.print(request.getParameter("status"));  
      %> </span> 
       <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
    </td></tr>
       
       
                
                <%
                 
                

    ProjectBean  pb=null;
       try{
        
 
       
    pb=new ProjectDetailsDao().getProjDetails(Integer.parseInt(request.getParameter("projcode")));
     
          
         %> 
                  
        <tr>
    <input type="hidden" name="projid" value="<%=pb.getProjid()%>"/>
     <td>Project Name </td>
    <td><input type="text"  name="pname"  value="<%=pb.getProjname()%>"/></td>
     </tr>
     
      <tr>
    <td>Project Code</td>
    <td><input type="text" name="pcode" value="<%=pb.getProjcode()%>" /></td>
    </tr>
          
      <tr>
    <td>EstimatedDuration</td>
    <td><input type="text" name="pduar" value="<%=pb.getProjduration()%>" /></td>
    </tr>
     
        
    <%} catch(Exception e)
{e.printStackTrace();}%> 
        
        
         <tr rowspan="1"></tr><tr rowspan="1"></tr><tr rowspan="1"></tr><tr rowspan="1"></tr>
      <tr><td colspan="2"><center>
     

      <input type="submit" name="submit" value="Modify Project Details"/>

          
   
     <input type="button" name="Submit" value="Back" onclick="javascript:history.back(-1)"/>

     
</center></td></tr>
      </table>
</form> 

<% }%>








</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>