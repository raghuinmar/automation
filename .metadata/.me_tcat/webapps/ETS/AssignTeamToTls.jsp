
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>

<%@page import="com.track.core.util.CoreList"%>
<%@page import="com.track.dae.dao.ProfileDAO"%>
<%@page import="com.track.dae.model.Profile"%>
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
if (asigntask(tlid,"Please Select Any Teamlead")==false) {tlid.focus(); return false;};

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
<td colspan="" width="" height="30"><center><font color="blue" size="6"><b>Online Project  </b></font><font color="blue" size="6"><b>Module Recording System</b></font></center></td>			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
	<br><br>		
 <center><h3><font color="#FF1493"><b><i>Assign Team's To TeamLead's</b></font></h3></center>
<form id="form1" method="post" action="AssignTeamToTls.jsp" name="asigntask" onsubmit="return formvalidation(this)"> 
    <table width="200" border="0" align="center">
      <tr>
        <td width=""><strong>SelectTeamLead</strong></td>
        <td width="90"><label>
          <select name="tlid" id="select"
								onchange="javascript:if(document.asigntask.tlid.value==''){alert('select Any TeamLead');}else{ document.asigntask.submit();}">
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
											System.out.println("tlid1 code.... in jsp ...." + tlid1);
										}
										while (enu.hasMoreElements()) {
											tlid = Integer.parseInt(enu.nextElement().toString());
											System.out.println("tlid in jsp ...." + tlid);
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
        if(request.getParameter("tlid")!=null) 
        System.out.println("tlid1................ code.... in jsp ...." + request.getParameter("tlid"));
        {
    %>
    <form action="./assignTeamsToTls" method="post" onsubmit="return formvalidation(this)">  
      
      <input type="hidden" name="type" value="tlid"/>
      <input type="hidden" name="tlid" value="<%=request.getParameter("tlid")%>"/>
    <table width="" border="0" align="center" bordercolor="#F4F5F7">
    
      <tr bgcolor="#FFFWQNAM">
      <%
String name=(String)session.getAttribute("user");
String path=request.getRealPath("/userimages");
        
	     String role = (String) session.getAttribute("role");
	     CoreList inCoreList = new CoreList();
	     System.out.println("ccore hash value"+inCoreList.isEmpty());
	     // CoreHash bCoreHash = new CoreHash();
	      
	      
	     try{
             String designation="";
             String fname="";
             String lname="";
             int userid;
             String dob;
             String email;
             String fax;
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProfileDAO().getDevelopersDetails(path);
            
           //  bCoreHash = branddao.listBrandNames();
             
             Profile pBean = new Profile();
             System.out.println("pbean in jsp is..."+pBean);
             if(!inCoreList.isEmpty())
         	{
        
       %>
        
        
        <td width="30"><div align="center" class="style8"></div></td>
        <td width="87"><div align="center" class="style8"><b>FirstName</b></div></td>
        <td width="87"><div align="center" class="style8"><b>LastName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>Dob</b></div></td>
      <td width="110"><div align="center" class="style8"><b>Email</b></div></td>
        <td width="87"><div align="center" class="style8"><b>Fax</b></div></td>        
        <td width="64"><div align="center" class="style8"><b>EmpPicture</b></div></td>
      
         
        
        
      </tr>
          <%
          
          	Enumeration enu = inCoreList.elements();
          System.out.println("has more elements value"+enu.hasMoreElements());
          			int i=0;
          			while (enu.hasMoreElements()) {
          			System.out.println("...........");
          				pBean = (Profile) enu.nextElement();
          				System.out.println(".....pBean......"+pBean);
          				designation = pBean.getLogintype();
          				System.out.println("designation.... in jsp ...."+designation); 
          				userid= Integer.parseInt(pBean.getId());		
          				fname = pBean.getFirstname();
          				lname = pBean.getLastname();
						dob = pBean.getBdate();
						email=pBean.getEmail();
						fax=pBean.getFax();
						 System.out.println("has more elements value"+pBean.getPhoto());
						
          		         		
          %>
      <tr bgcolor="#CEC9FA" height="10" >
    
        <td height="20" bgcolor="#F4F5F7"><input name="ch<%=i%>" type="checkbox" id="checkbox2" value="<%=1%>,<%=userid%>"/></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=fname%></div></td>
        <td bgcolor="#F4F5F7"><div align="center" class="style7"><%=lname %></div></td>
        <td bgcolor="#F4F5F7" ><div align="center" class="style7">  <%=dob%></div></td> 
        <td bgcolor="#F4F5F7"><div align="center" class="style7"><%=email%></div></td>
        <td bgcolor="#F4F5F7"><div align="center"><span class="style7"><%=fax %></span></div></td>
        <td bgcolor="#F4F5F7"> <p><img alt="See Photo Here" id="previewField" src="userimages/<%=pBean.getPhoto() %>" height="50" width="90"></p></td>
        
        
      
        
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
         
          <input type="submit" name="button" id="button" value="Assign"/>
          &nbsp;
         
        </div></td>
      </tr>
       
  </table>

</form>
 
<% }%>








</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>