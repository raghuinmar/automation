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
function inDate(){

  var date=new Date();
  document.subtask.cdate.value=date.getDate()+"-"+(date.getMonth()+1)+"-"+date.getYear();
  document.getElementById('cdate').innerHTML=0;
}		
</script>
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
if (subtask(taskid,"Please Select AnySubtask")==false) {taskid.focus(); return false;};
if (subtask(cdate,"Currentdate Cannot be Empty  ")==false) {cdate.focus(); return false;};
if (subtask(ehrs,"Please Enter No of Hours Spent")==false) {ehrs.focus(); return false;};

}
}
</script>	
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
			
			
			
			
	<form  method="post" action="./SubmitWorkStatusToTl" name="subtask" onsubmit="return formvalidation(this)">
<% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
			<%  String user = (String) session.getAttribute("user");%>   
<center><table width="400" border="0">
<tr align="right"><font color="#FF1493" size="4"><b><i> &nbsp;&nbsp;&nbsp;&nbsp;Send Work Status To TeamLead</b></font></tr>
  <br>
  <tr>
    <td width="" height="" align="center">
     <strong>Select SubTask</strong>    </td>
    <td width="95"><div align="left">
      <select name="taskid" id="select">
        <option >--Select--</option>
        <%
             
             
		  		try
		  		{
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listSubTaskByDev(user);
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
		  	
		  %>
      </select>
    </div></td>
  </tr>
  <tr>
					<th align="center">CurrentDate</th>
					<td><input type="text" name="cdate" size="14" readonly="readonly" onfocus="inDate()"></td>
					</tr>
  <tr>
  
  
 <tr>
					<th align="center">EnterHoursSpent</th>
					<td><input type="text" name="ehrs" size="14"></td>
					</tr>
  <tr>

    <td width="" align="center"><input type="submit" name="Assign" value="Submit">  </td>
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