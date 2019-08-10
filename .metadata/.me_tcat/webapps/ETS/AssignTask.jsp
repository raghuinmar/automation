<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>

<html>
<head>
<script type="text/javascript">
function asigntask(entered, alertbox)
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
if (asigntask(tlid,"Please Select Teamlead")==false) {tlid.focus(); return false;};
if (asigntask(projid,"Please Select Projname")==false) {projid.focus(); return false;};
if (asigntask(nmodules,"Please Enter No of Modules")==false) {nmodules.focus(); return false;};
if (asigntask(sdate,"Please Select Estimated Start Date")==false) {sdate.focus(); return false;};
if (asigntask(edate,"Please Select Estimated End Date")==false) {edate.focus(); return false;};
var str2 = document.getElementById("sdate").value;
var str1 = document.getElementById("edate").value;
 //alert("stri.length is..."+str1.length);
 if(str1=="")
 {
 alert("select date");
 return false;
 }
 
  var currentTime = new Date();
    
     var month =parseInt(currentTime.getMonth() + 1);
      var day = parseInt(currentTime.getDate());
      var year =parseInt(currentTime.getFullYear()); 
     //alert(year);
        if(str1.length==9)
     {
        var dt1  = parseInt(str1.substring(0,1),10); 
        var mon1 = parseInt(str1.substring(2,3),10);
        var yr1  = parseInt(str1.substring(4,9),10);
      }      
     else if(str1.length==10)
     {
        var dt1  = parseInt(str1.substring(0,1),10); 
        var mon1 = parseInt(str1.substring(2,4),10);
        var yr1  = parseInt(str1.substring(5,9),10);     
      }    
      else 
      {
        var dt1  = parseInt(str1.substring(0,2),10);
        var mon1 = parseInt(str1.substring(3,5),10);
        var yr1  = parseInt(str1.substring(6,10),10);        
         }  
         
     
if(yr1<=year)  
{
var currentdate=new Date(year, month, day); 
var date1 = new Date(yr1, mon1, dt1);
if(date1<currentdate)
{
alert("EstimatedEndDate can not be less then currentdate");
return false;
}
}

if(str2.length==9)
     {
        var dt2  = parseInt(str1.substring(0,1),10); 
        var mon2 = parseInt(str1.substring(2,3),10);
        var yr2  = parseInt(str1.substring(4,9),10);
      }      
     else if(str2.length==10)
     {
        var dt2  = parseInt(str1.substring(0,1),10); 
        var mon2 = parseInt(str1.substring(2,4),10);
        var yr2  = parseInt(str1.substring(5,9),10);     
      }    
      else 
      {
        var dt2  = parseInt(str1.substring(0,2),10);
        var mon2 = parseInt(str1.substring(3,5),10);
        var yr2  = parseInt(str1.substring(6,10),10);        
         }  
         
     
if(yr2<=year)  
{
var currentdate=new Date(year, month, day); 
var date2 = new Date(yr2, mon2, dt2);
if(date2<currentdate)
{
alert("EstimatedStartDate can not be less then currentdate");
return false;
}


}
}
}
</script>	









<script type="text/javascript">
function CompareDates2(thisform)
{
alert("hai");
with (thisform)
{
if (asigntask(tlid,"Please Select Teamlead")==false) {tlid.focus(); return false;};
if (asigntask(projid,"Please Select Projname")==false) {projid.focus(); return false;};
if (asigntask(nmodules,"Please Enter No of Modules")==false) {nmodules.focus(); return false;};
if (asigntask(sdate,"Please Select Estimated Start Date")==false) {sdate.focus(); return false;};
if (asigntask(edate,"Please Select Estimated End Date")==false) {edate.focus(); return false;};

var day1, day2;
var month1, month2;
var year1, year2;
  var currentTime = new Date();
    
     var month =parseInt(currentTime.getMonth() + 1);
      var day = parseInt(currentTime.getDate());
      var year =parseInt(currentTime.getFullYear()); 
value1 = document.getElementById("sdate").value;

value2 = document.getElementById("edate").value;


day1 = value1.substring (0, value1.indexOf ("-"));

month1 = value1.substring (value1.indexOf ("-")+1, value1.lastIndexOf ("-"));

year1 = value1.substring (value1.lastIndexOf ("-")+1, value1.length);


day2 = value2.substring (0, value2.indexOf ("-"));

month2 = value2.substring (value2.indexOf ("-")+1, value2.lastIndexOf ("-"));

year2 = value2.substring (value2.lastIndexOf ("-")+1, value2.length);

date2 = year2+"-"+month2+"-"+day2;


date1 = year1+"-"+month1+"-"+day1;


  var currentdate=new Date(year, month, day);    

 var datee1 = new Date(year1, month1, day1);  
  

     var datee2 = new Date(year2, month2, day2);  
        
     
       if(datee1<currentdate)
  {
      alert("Sorry estimated start date can not be less than current date");
      document.getElementById("sdate").value="";
      return false;
  
  }
  
  else if(datee2<currentdate)
     {
       alert("Sorry estimated end date can not be less then CurrentDate");
       document.getElementById("edate").value="";
       return false;
     
     }
 
 else  if(datee2<datee2)
  {
      alert("sorry the estimated end date can not be less then estimated start date");
      return false;
  
  }
  
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
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b>Online Project </b></font><font color="blue" size="6"><b>Module Recording System</b></font></center></td>

			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
				
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.core.util.LoggerManager"%><html>
	<head>
		<script language="JavaScript" src="scripts/gen_validatorv31.js"
			type="text/javascript"></script>
		<script language="JavaScript" type="text/javascript"
			src="scripts/ts_picker.js"></script>
		<script language="JavaScript1.1" src="scripts/pass.js">


</script>
		<script type="text/javascript" src="scripts/image.js"> </script>
		<script type="text/javascript" src="scripts/general.js"> </script>
		<script type="text/javascript" src="scripts/adi.js"> </script>
		<script type="text/javascript" src="scripts/form_validation.js"> </script>
	</head>
	<center><h3><font color="#FF1493"><b><i>Assign Projects To Teamlead's</b></font></h3></center>
   <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
	<body>
		<form action="./AssignProjToTls" name="asigntask" method="post" onsubmit="return CompareDates2(this)">
			<center>
				<table>
					<tr>
						<th align="left">
							Select TeamLead
						</th>
						<td>
							<select name="tlid" id="select"
								onchange="javascript:if(document.asigntask.tlid.value==''){alert('select Any TeamLead');}">
								<option>
									--Select--
								</option>
								<%
									try {
										CoreHash bCoreHash = new ProjectDetailsDao().listTeamLeads();
										Enumeration enu = bCoreHash.keys();
										String select = "";
										int tlid1 = 0;
										int tlid = 0;
										if (request.getParameter("tlid") != null) {
											tlid1 = Integer.parseInt(request.getParameter("tlid"));
											System.out.println("tlid code.... in jsp ...." + tlid1);
										}
										while (enu.hasMoreElements()) {
											tlid = Integer.parseInt(enu.nextElement().toString());
											System.out.println("proj code in jsp ...." + tlid);
											select = "";
											if (tlid == tlid1)
												select = "selected";
								%>
								<option value="<%=tlid%>" <%=select%>><%=bCoreHash.get(new Integer(tlid))%></option>
								<%
									}
									} catch (Exception e) {
										LoggerManager.writeLogWarning(e);
									}
								%>
							</select>
						</td>
						<td>
					</tr>

					<tr>
						<th align="left">
							SelectProjectToAssign
						</th>
						<td>
							<select name="projid" id="select"
								onchange="javascript:if(document.asigntask.projid.value==''){alert('select Any Project');}}">
								<option>
									--Select--
								</option>
								<%
									try {
										CoreHash bCoreHash = new ProjectDetailsDao().listProjNames();
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
						</td>
					</tr>
					<tr>
						<th align="left">
							Max No of Modules
						</th>
						<td>
							<input type="text" name="nmodules">
						</td>
					<tr>
					<tr>
						<th align="left">
							Expected Start Date
						</th>
						<td>
							<input type="text" readonly="readonly" name="sdate">
							<a
								href="javascript:show_calendar('document.asigntask.sdate', document.asigntask.sdate.value);">
								<img src="images/cal.gif" alt="a" width="18" height="18"
									border="0" />
							</a>
						</td>
					<tr>
					<tr>
						<th align="left">
							Estimated End Date
						</th>
						<td>
							<input type="text" readonly="readonly" name="edate">
							<a
								href="javascript:show_calendar('document.asigntask.edate', document.asigntask.edate.value);">
								<img src="images/cal.gif" alt="a" width="18" height="18"
									border="0" />
							</a>
						</td>
					<tr>
					<tr>

						<td>
							<center>
								<input type="submit" name="assign" value="Assign">
							</center>
						</td>
						<td>
							<center>
								<input type="reset" name="clear" value="Clear">
							</center>
						</td>
					<tr>
				</table>

			</center>
		</form>
	</body>
</html>


</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>