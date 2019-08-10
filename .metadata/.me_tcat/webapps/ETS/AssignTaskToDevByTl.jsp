<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.core.util.LoggerManager"%>
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
if (subtask(projid,"Please Select Any Project")==false) {projid.focus(); return false;};
if (subtask(mid,"Please Select Module")==false) {mid.focus(); return false;};
if (subtask(taskid,"Please Select SubTask")==false) {taskid.focus(); return false;};
if (subtask(did,"Please Select Any Developer")==false) {did.focus(); return false;};
if (subtask(ehrs,"Please Enter estimated hrs")==false) {ehrs.focus(); return false;};

}
}
</script>		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
       <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <tr>
        <td><jsp:include page="Tl.html"/></td>
        </tr>
			<tr>
<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
			
			
			
			
	<form  method="post" action="./AssignTasksToDev" name="subtask" onsubmit="return formvalidation(this)" >
<% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
			<%  String user = (String) session.getAttribute("user");%>   
<center><table width="" border="0">
<tr align="right"><font color="#FF1493"><b><i>AssignTask to Developers</b></font></tr>
  <tr>
   <td width="" height="" align="center">
      <strong>Select Project</strong>   </td>
    <td width="96"><div align="left">
     <select name="projid" id="select" onchange="javascript:if(document.subtask.projid.value==''){alert('Select Any ProjectName');} else{ location.href='AssignTaskToDevByTl.jsp?projid='+document.subtask.projid.value;}">
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
    <td width="" height="" align="center">
     <strong>Select Module</strong>    </td>
    <td width="95"><div align="left">
      <select name="mid" id="select" onchange="javascript:if(document.subtask.mid.value==''){alert('Select Any Module');} else{ location.href='AssignTaskToDevByTl.jsp?projid='+document.subtask.projid.value+'&mid='+document.subtask.mid.value;}">
<%--                                                                 <select name="mandalid" id="select"  onchange="javascript: location.href='addvillage.jsp?mandalid='+document.rigister.mandalid.value+'&villageid='+document.search.villageid.value;">--%>
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
		  		        System.out.println("mid1 in jsp ...." + mid1);
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
    <td width="" height="" align="center">
     <strong>Select SubTask</strong>    </td>
    <td width="95"><div align="left">
      <select name="taskid" id="select">
        <option >--Select--</option>
        <%
             if(request.getParameter("mid")!=null)
             {
		  		try
		  		{
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listSubTaskByModule(Integer.parseInt(request.getParameter("mid")));
		  		   Enumeration enu = bCoreHash.keys();
		  		   String select = "";
		  		   int taskid1 = 0;
		  		   int taskid = 0;
		  		   if(request.getParameter("taskid")!=null)
		  		   {
		  		   try
		  		      {
		  		        taskid1 = Integer.parseInt(request.getParameter("taskid"));
		  		      }
		  		      catch(Exception e){} 
		  		         		    
		  		   }
		  		   while(enu.hasMoreElements())
		  		   {
		  		   		taskid = Integer.parseInt(enu.nextElement().toString());
		  		   		select = "";
		  		   		if(taskid==taskid1)
		  		   		    select = "selected";
		  		   		
		  		   %>
        <option value="<%=taskid%>" <%=select%>><%=(bCoreHash.get(new Integer(taskid)))%></option>  		 
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
    <td width="" height="" align="center">
     <strong>Select Developer</strong>    </td>
    <td width="95"><div align="left">
      <select name="did" id="select">
        <option >--Select--</option>
        <%
             if(request.getParameter("mid")!=null)
             {
		  		try
		  		{
		  		System.out.println("useeeeeeeeeeerrrrrrrrrrrrr......."+user);
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listDevelopersByTl(user);
		  		   Enumeration enu = bCoreHash.keys();
		  		   String select = "";
		  		   int did1 = 0;
		  		   int did = 0;
		  		   if(request.getParameter("did")!=null)
		  		   {
		  		   try
		  		      {
		  		        did1 = Integer.parseInt(request.getParameter("did"));
		  		      }
		  		      catch(Exception e){} 
		  		         		    
		  		   }
		  		   while(enu.hasMoreElements())
		  		   {
		  		   		did = Integer.parseInt(enu.nextElement().toString());
		  		   		select = "";
		  		   		if(did==did1)
		  		   		    select = "selected";
		  		   		
		  		   %>
        <option value="<%=did%>" <%=select%>><%=(bCoreHash.get(new Integer(did)))%></option>  		 
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
					<th align="center">EstimatedHrs</th>
					<td><input type="text" name="ehrs" size="14"></td>
					</tr>
  <tr>

    <td width="" align="center"><input type="submit" name="Assign" value="Add">  </td>
  <td><input type="reset" name="cancle" value="cancle"></td><td></td>
    </tr>
</table>
</center>
	
					</form>
						
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>