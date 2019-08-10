<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.project.model.ProjModuleBean"%>
<%@page import="com.track.core.util.CoreList"%>
<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<html>
<head>
	<script type="text/javascript">
function subtask(entered, alertbox)
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
if (subtask(projid,"Select Any Project")==false) {projid.focus(); return false;};
if (subtask(mid,"Select Any Module")==false) {mid.focus(); return false;};
if (subtask(stname,"Please Enter SubTaskName")==false) {stname.focus(); return false;};
}
}
</script>	
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
        <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200"/></td>
        <tr>
        <td><jsp:include page="Tl.html"/></td>
        </tr>
			<tr>
				<td colspan="" width="" height="30"><center><font color="#FF8C00" size="6"><b><i></i></b></font><font color="#FF8C00" size="6"><b><i>Online Development Part Verification System</i></b></font></center></td>
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
			
			
			
			
	<form  method="post" action="./AddSubTasks" name="subtask" onsubmit="return formvalidation(this)">
<% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
			<%  String user = (String) session.getAttribute("user");%>   
<center><table width="470" border="0">
  <tr>
    
  
    <td width="" height="40" align="right">
      <strong>Select Project</strong>   </td>
    <td width="96"><div align="left">
     <select name="projid" id="select" onchange="javascript:if(document.subtask.projid.value==''){alert('Select Any ProjectName');} else{ location.href='AddSubTasks.jsp?projid='+document.subtask.projid.value;}">
								<option>
									--Select--
								</option>
								<%
									try {
										CoreHash bCoreHash = new ProjectDetailsDao().listProjNamesOfTl(user);										
										Enumeration enu = bCoreHash.keys();
										String select = "";
										int projid1 = 0;
										int projid = 0;
										if (request.getParameter("projid") != null) {
											projid1 = Integer.parseInt(request.getParameter("projid"));
											System.out.println("projid1.... in jsp ...." + projid1);
										}
										while (enu.hasMoreElements()) {
											projid = Integer.parseInt(enu.nextElement().toString());
											System.out.println("projid in jsp ...." + projid);
											select = "";
											if (projid == projid1)
												select = "selected";
								%>
								<option value="<%=projid%>" <%=select%>><%=bCoreHash.get(new Integer(projid))%></option>
								<%
									}
									} catch (Exception e) {
										LoggerManager.writeLogWarning(e);
									}
								%>
							</select>
    </div></td>
 <tr>
 <tr>
    <td width="" height="40" align="right">
     <strong>Select Module</strong>    </td>
    <td width="95"><div align="left">
      <select name="mid" id="select"  >
      
        <option>--Select--</option>
        <%
             if(request.getParameter("projid")!=null)
             {
		  		try
		  		{
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listModulesByProj(Integer.parseInt(request.getParameter("projid")));
		  		   Enumeration enu = bCoreHash.keys();
		  		   String select = "";
		  		   int mid1 = 0;
		  		   int mid = 0;
		  		   if(request.getParameter("mid")!=null)
		  		   {
		  		   try
		  		      {
		  		        mid1 = Integer.parseInt(request.getParameter("mid"));
		  		        System.out.println("mid1.... in jsp ...." + mid1);
		  		      }
		  		      catch(Exception e){} 
		  		         		    
		  		   }
		  		   while(enu.hasMoreElements())
		  		   {
		  		   		mid = Integer.parseInt(enu.nextElement().toString());
		  		   		select = "";
		  		   		if(mid==mid1)
		  		   		    select = "selected";
		  		   		
		  		   %>
        <option value="<%=mid%>" <%=select%>><%=(bCoreHash.get(new Integer(mid)))%></option>  		 
        <%}
		  		}
		  		catch(Exception e)
		  		{
		  		   LoggerManager.writeLogWarning(e);
		  		}
		  		}
		  %>
      </select>
    </div></td>
  </tr>
 <tr>
					<th align="right">AddSubTask</th>
					<td><input type="text" name="stname"></td>
					</tr>
  <tr>

    <td width="" align="center"><input type="submit" name="Add" value="Add">  </td>
  <td><input type="reset" name="cancle" value="cancle"></td><td></td>
    </tr>
</table>
</center>

<br><br>
  <center><table>
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
             String subtaskname;
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProjectDetailsDao().getSubTaskDetails(projid);
            
           //  bCoreHash = branddao.listBrandNames();
             
             ProjModuleBean pBean = new ProjModuleBean();
             System.out.println("pbean in jsp is..."+pBean);
             if(!inCoreList.isEmpty())
         	{
        
       %>
        <tr><td></td><td></td><i><th width="20"><font color="" size="3"><i>SubTaskDetails</i></font></th><td></td></tr>
    <tr bgcolor="#FFFWQNAM">
    <td width="30"><div align="center" class="style8"></div></td>
        <td width=""><div align="center" class="style8"><b>ProjCode</b></div></td>
        <td width="70"><div align="center" class="style8"><b>ProjName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>ModuleName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>SubtaskName</b></div></td>
    
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
						
          		         		
         %>
         <tr bgcolor="#CEC9FA" height="10" >
         <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=i %></div></td>
        <td height="20"  bgcolor="#F4F5F7"><div align="center" class="style7"><%=projcode %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=projname %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=mname %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=subtaskname %></div></td>
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
	
					</form>
						
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>