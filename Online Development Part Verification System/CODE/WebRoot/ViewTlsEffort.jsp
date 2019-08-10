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
if (viewbydate(tlid,"Please Select Teamlead")==false) {tlid.focus(); return false;};
if (viewbydate(edate,"Please Select date")==false) {edate.focus(); return false;};
}
}
</script>		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
				

<td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <tr>
        <td><jsp:include page="AdminMenu.html"/></td>
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
     <strong>Select TeamLead</strong>    </td>
    <td width="95"><div align="left">
      <select name="tlid" id="select" onchange="javascript:if(document.viewbydate.tlid.value==''){alert('Select Any TeamLead');} else{ location.href='ViewTlsEffort.jsp?tlid='+document.viewbydate.tlid.value;}">
        <option >--Select--</option>
        <%
            
            
		  		try
		  		{
		  		System.out.println("useeeeeeeeeeerrrrrrrrrrrrr......."+user);
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listTeamLeads();
		  		   Enumeration enu = bCoreHash.keys();
		  		   String select = "";
		  		   int tlid1 = 0;
		  		   int tlid = 0;
		  		   if(request.getParameter("tlid")!=null)
		  		   {
		  		   try
		  		      {
		  		        tlid1 = Integer.parseInt(request.getParameter("tlid"));
		  		      }
		  		      catch(Exception e){} 
		  		         		    
		  		   }
		  		   while(enu.hasMoreElements())
		  		   {
		  		   		tlid = Integer.parseInt(enu.nextElement().toString());
		  		   		select = "";
		  		   		if(tlid==tlid1)
		  		   		    select = "selected";
		  		   		
		  		   %>
        <option value="<%=tlid%>" <%=select%>><%=(bCoreHash.get(new Integer(tlid)))%></option>  		 
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
      int tlid=Integer.parseInt(request.getParameter("tlid"));
     String edate =request.getParameter("edate");
    
  
      System.out.println("tlid in jsp is......."+tlid);      
    CoreHash ch=new ReportDao().getReportOfTl(tlid,edate); 
        System.out.println("core hash obj is...."+ch);
       Enumeration em=ch.elements(); 

String report2="";
          
          report2+="<table align='center' WIDTH='850' border='1' bordercolor='black' bgcolor='#FF1493'>";
      report2+=" <th colspan='1' bgcolor='#FF1493'><center><b><font color='white'>TEAMLEAD WORK EFFORT DETAILS</font></center></th></table>";          
      
    report2+="<strong> <table align='center' WIDTH='800' border='1' bordercolor='block' bgcolor=''><tr> <td>Proj&nbsp;Code</td> <td>Project&nbsp;Name</td><td>Teamlead&nbsp;Name</td> <td>On&nbsp;Date</td>  <td>Login&nbsp;Time</td>  <td>Total&nbsp;Time</td>       <td>Logout&nbsp;Time</td>  </tr></table></strong> <table align='center' WIDTH='800' border='0' bordercolor='black' bgcolor=''>";       
          
          
          
         %> 
 <tr><th>ProjCode</th>
<th>ProjName</th>
<th>TeamLeadName</th>
<th>OnDate</th>
<th>LoginTime</th>
<th>LogoutTime</th>
<th>TotalHoursSpent</th>

</tr>  

 
        <%   while(em.hasMoreElements()){
            rb=(ReportBean)em.nextElement();             
          report2+="  <tr>";   
            report2+=" <td value="+rb.getProjcode()+">"+rb.getProjcode()+"</td>";
            report2+=" <td>"+rb.getProjname()+"</td>"; 
            report2+=" <td>"+rb.getUser()+"</td>"; 
             report2+=" <td>"+edate+"</td>";   
            report2+=" <td>"+rb.getLogintime()+"</td>";
            report2+=" <td>"+rb.getLogouttime()+"</td>";
             report2+=" <td>"+rb.getTotaltime()+"</td>";
        report2+="</tr>";
             session.setAttribute("Report",report2);
             %>    
         
       <tr>   
        <td value="<%=rb.getProjcode()%>"><%=rb.getProjcode()%></td>
           <td align="center"><%=rb.getProjname()%></td>
                <td align="center"><%=rb.getUser()%></td>
           <td align="center"><%=edate%></td> 
           <td align="center"><%=rb.getLogintime()%></td>
            <td align="center"><%=rb.getLogouttime()%></td>
            <td align="center"><%=rb.getTotaltime()%></td>
              </tr>
      
   </table>
    <%}}catch(Exception e)
{e.printStackTrace();}%> 

</center>

<% } %>
</body>
  
  </html>

