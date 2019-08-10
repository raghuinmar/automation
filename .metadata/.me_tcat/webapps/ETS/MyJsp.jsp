
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.project.dao.ReportDao"%>
<%@page import="com.track.project.model.ReportBean"%>
<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<html>
<head>
	<script type="text/javascript">
function viewbydate(entered, alertbox)
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
if (viewbydate(taskid,"Please Select AnyDeveloper")==false) {did.focus(); return false;};
if (viewbydate(edate,"Please Select Date")==false) {edate.focus(); return false;};

}
}
</script>		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
<td width="" height="" valign="top"><img src="./images/f.jpg" width="1000" height="200" /></td>
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



<html>
<head>

<script language="JavaScript" src="scripts/gen_validatorv31.js" type="text/javascript"></script>
<script language="JavaScript" type="text/javascript" src="scripts/ts_picker.js"></script>
<script language="JavaScript1.1" src="scripts/pass.js">


</script> <script type="text/javascript" src="scripts/image.js"> </script>
 <script type="text/javascript" src="scripts/general.js"> </script>
 <script type="text/javascript" src="scripts/adi.js"> </script>
 <script type="text/javascript" src="scripts/form_validation.js"> </script>

		<script language="JavaScript" src="images/javascripts.js"></script>
		<script language="JavaScript" src="images/pop-closeup.js"></script>
<script>

 


</script> </head>
<body>
<form  method="post" action="MyJsp.jsp" name="subtask" onsubmit="return formvalidation(this)">
<% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
			<%  String user = (String) session.getAttribute("user");%>   
<center><table width="" border="0">

  <tr><font color="#FF1493"><b><i>Report Details</b></font></tr>
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
    <th><span class=Title> Select Date</span></th>
    <td>
   <input type="text" name="edate" value="" size="20" readonly="readonly" /><a href="javascript:show_calendar('document.subtask.edate', document.subtask.edate.value);"> <img src="images/cal.gif" alt="a" width="18" height="18" border="0"/></a>    </td>
  </tr>
    <tr><td align="center"><input type="submit" name="submit" value="View Details"></td><td align="center"><input type="reset" name="clear" value="Clear"></td></tr>
    </table><br><br><br>
  <%if(request.getParameter("submit")!=null){ %> 
  <%System.out.println("submit=="+request.getParameter("submit")); %>
<table border="1">
<tr><font color="#FF1493"><b><i>Report Details</b></font></tr>
<% 
try{
ReportBean rb=null;
      int taskid=Integer.parseInt(request.getParameter("taskid"));
     String edate =request.getParameter("edate");
    
  
      System.out.println("taskid in jsp is......."+taskid);      
    CoreHash ch=new ReportDao().getReportOfDev(taskid,edate); 
        System.out.println("core hash obj is...."+ch);
       Enumeration em=ch.elements(); 
       %>
 <tr><th>ProjCode</th>
<th>ProjName</th>
<th>ModuleName</th>
<th>AsignedTask</th>
<th>OnDate</th>
<th>HoursWorked</th>
</tr>  

 
        <%   while(em.hasMoreElements()){
            rb=(ReportBean)em.nextElement();             
          
           
         %>  
         
       <tr>   
        <td value="<%=rb.getProjcode()%>"><%=rb.getProjcode()%></td>
           <td><%=rb.getProjname()%></td>
                <td><%=rb.getModulename()%></td>
           <td><%=rb.getTaskname()%></td> 
           <td><%=rb.getEdate()%></td>
            <td align="center"><%=rb.getEhrs()%></td> 
      </tr>   <%} %>
   </table>
    <%}catch(Exception e)
{e.printStackTrace();}%> 

</center>
</form>
<% } %>
</body>
</html>



</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>