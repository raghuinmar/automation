<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.project.model.ReportBean"%>
<%@page import="com.track.project.dao.ReportDao"%>

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
if (viewbydate(did,"Please Select AnyDeveloper")==false) {did.focus(); return false;};
if (viewbydate(tid,"Please Select AnySubTask")==false) {tid.focus(); return false;};
if (viewbydate(edate,"Please Select Date")==false) {edate.focus(); return false;};

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
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>

			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
				

<%  String user = (String) session.getAttribute("user");%>  
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

//var x_win = window.self; 


</script> 
<body>
<center>
<form action="" name="viewbydate" method="post" onsubmit="return formvalidation(this)">
<table>

<tr>
    <td width="" height="" align="center">
     <strong>Select Developer</strong>    </td>
    <td width="95"><div align="left">
      <select name="did" id="select" onchange="javascript:if(document.viewbydate.did.value==''){alert('Select Any DeveloperName');} else{ location.href='ViewReportonPartiDate.jsp?did='+document.viewbydate.did.value;}">
        <option >--Select--</option>
        <%
            
            
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
		  		
		  %>
      </select>
    </div></td>
  </tr>
  
  <tr>
    <td width="" height="" align="center">
     <strong>Select SubTask</strong>    </td>
    <td width="95"><div align="left">
      <select name="tid" id="select" onchange="javascript:if(document.viewbydate.tid.value==''){alert('Select Any Subtask');} else{ location.href='ViewReportonPartiDate.jsp?projid='+document.subtask.projid.value+'&mid='+document.subtask.mid.value;}">

        <option>--Select--</option>
        <%
             if(request.getParameter("did")!=null)
             {
		  		try
		  		{
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listSubTaskByDid(Integer.parseInt(request.getParameter("did")));
		  		   Enumeration enu = bCoreHash.keys();
		  		   String select = "";
		  		   int tid1 = 0;
		  		   int tid = 0;
		  		   if(request.getParameter("tid")!=null)
		  		   {
		  		   try
		  		      {
		  		        tid1 = Integer.parseInt(request.getParameter("tid"));
		  		        System.out.println("tid1 in jsp ...." + tid1);
		  		      }
		  		      catch(Exception e){} 
		  		         		    
		  		   }
		  		   while(enu.hasMoreElements())
		  		   {
		  		   		tid = Integer.parseInt(enu.nextElement().toString());
		  		   		select = "";
		  		   		if(tid==tid1)
		  		   		    select = "selected";
		  		   		
		  		   %>
        <option value="<%=tid%>" <%=select%>><%=(bCoreHash.get(new Integer(tid)))%></option>  		 
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
    <th><span class=Title> Select Date</span></th>
    <td>
   <input type="text" name="edate" value="" size="20" readonly="readonly" /><a href="javascript:show_calendar('document.viewbydate.edate', document.viewbydate.edate.value);"> <img src="images/cal.gif" alt="a" width="18" height="18" border="0"/></a>    </td>
  </tr>
  <tr>

						<td>
							<center>
								<input type="submit" name="submit" value="View">
							</center>
						</td>
						<td>
							<center>
								<input type="reset" name="clear" value="Clear">
							</center>
						</td>
					<tr>
  </table>
  <%if(request.getParameter("submit")!=null){ %> 
  <%System.out.println("submit=="+request.getParameter("submit")); %>
<table border="1">
<span class="style13">Export to : <a href="ExportXLS" target="_blank"><font color="brown">XLS</font></a></span><br/>
<tr><font color="#FF1493"><b><i>Report Details</b></font></tr>
<% 
try{
ReportBean rb=null;
      int taskid=Integer.parseInt(request.getParameter("tid"));
     String edate =request.getParameter("edate");
    
  
      System.out.println("taskid in jsp is......."+taskid);      
    CoreHash ch=new ReportDao().getReportOfDev(taskid,edate); 
        System.out.println("core hash obj is...."+ch);
       Enumeration em=ch.elements(); 

String report2="";
          
          report2+="<table align='center' WIDTH='850' border='1' bordercolor='black' bgcolor='#FF1493'>";
      report2+=" <th colspan='1' bgcolor='#FF1493'><center><b><font color='white'>DEVELOPER WORK STATUS DETAILS</font></center></th></table>";          
      
    report2+="<strong> <table align='center' WIDTH='800' border='1' bordercolor='block' bgcolor=''><tr> <td>Proj&nbsp;Code</td> <td>Project&nbsp;Name</td><td>Module&nbsp;Name</td> <td>TaskAsigned</td>  <td>On&nbsp;Date</td>        <td>Hours&nbsp;Worked</td>  </tr></table></strong> <table align='center' WIDTH='800' border='0' bordercolor='black' bgcolor=''>";       
          
          
          
         %> 
 <tr><th>ProjCode</th>
<th>ProjName</th>
<th>ModuleName</th>
<th>AsignedTask</th>
<th>OnDate</th>
<th>HoursWorked</th>
<th>SubmitStatus</th>
<th>SubmitToAdmin</th>
</tr>  

 
        <%   while(em.hasMoreElements()){
            rb=(ReportBean)em.nextElement();             
          report2+="  <tr>";   
            report2+=" <td value="+rb.getProjcode()+">"+rb.getProjcode()+"</td>";
            report2+=" <td>"+rb.getProjname()+"</td>"; 
            report2+=" <td>"+rb.getModulename()+"</td>"; 
             report2+=" <td>"+rb.getTaskname()+"</td>";   
            report2+=" <td>"+rb.getEdate()+"</td>";
            report2+=" <td>"+rb.getEhrs()+"</td>";
        report2+="</tr>";
             session.setAttribute("Report",report2);
             %>    
         
       <tr>   
        <td value="<%=rb.getProjcode()%>"><%=rb.getProjcode()%></td>
           <td><%=rb.getProjname()%></td>
                <td><%=rb.getModulename()%></td>
           <td><%=rb.getTaskname()%></td> 
           <td><%=rb.getEdate()%></td>
            <td align="center"><%=rb.getEhrs()%></td>
               <%
           if(rb.getStatus().equals("unchecked"))
           {
         %>
        <td bgcolor="#F4F5F7"><div align="center"><span class="style7">NotSubmited</span></div></td>
     
      <%}else {%> <td bgcolor="#F4F5F7"><div align="center"><span class="style7">Submited</span></div></td> <%}  %>
   
   <% if(rb.getStatus().equals("unchecked"))
           {
         %>
        <td bgcolor="#F4F5F7"><div align="center"><span class="style7"><a href='./submitToAdmin?tid=<%=taskid %>'>Submit</a></span></div></td>
   
      <%}else {%> <td bgcolor="#F4F5F7"><div align="center"><span class="style7"></span></div></td> <%} }  %>
    </tr>
   
      
   </table>
    <%}catch(Exception e)
{e.printStackTrace();}%> 

</center>

<% } %>
</body>
  
  </html>

