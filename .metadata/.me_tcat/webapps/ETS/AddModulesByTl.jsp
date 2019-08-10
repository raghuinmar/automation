
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.dao.ProjectDetailsDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.core.util.LoggerManager"%>

<%@page import="com.track.core.util.CoreList"%>

<%@page import="com.track.project.model.ProjModuleBean"%>
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
if (asigntask(projid,"Please Select Project")==false) {projid.focus(); return false;};
if (asigntask(mname,"Please Enter ModuleName")==false) {mname.focus(); return false;};
}
}
</script>		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
      <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td>
        <tr>
        <td><jsp:include page="Tl.html"/></td>
        </tr>
			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b><i></i></b></font><font color="blue" size="6"><b><i>Online Project Module Recording System</i></b></font></center></td>
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
			
			
			
			
			<form action="./AddModulesByTl" name="asigntask" method="post" onsubmit="return formvalidation(this)">
			
			<% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
			<%  String user = (String) session.getAttribute("user");%>
			<center>
				<table>
				<tr><th align="center"><h3><font color="#FF1493"><b><i>Add Modules</b></font></h3></th></tr>
					<tr>
						<th align="right">
							SelectProject
						</th>
						<td>
							<select name="projid" id="select"
								onchange="javascript:if(document.asigntask.projid.value==''){alert('select Any Project');}}">
								<option>
									--Select--
								</option>
								<%
									try {
										CoreHash bCoreHash = new ProjectDetailsDao().listProjNamesOfTl(user);										Enumeration enu = bCoreHash.keys();
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
					<th align="right">ModuleName</th>
					<td><input type="text" name="mname"></td>
					</tr>
					<tr>
  <td align="center"><input type="submit" name="Add" value="Add">  </td>
  <td align="center"><input type="reset" name="cancle" value="cancle"></td>
  </tr></table>
  <br><br>
  <table>
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
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProjectDetailsDao().getModuleDetails(projid);
            
           //  bCoreHash = branddao.listBrandNames();
             
             ProjModuleBean pBean = new ProjModuleBean();
             System.out.println("pbean in jsp is..."+pBean);
             if(!inCoreList.isEmpty())
         	{
        
       %>
        <tr><td></td><td></td><i><th width="20"><font color="" size="3"><i>ModuleDetails</i></font></th><td></td></tr>
    <tr bgcolor="#FFFWQNAM">
    <td width="30"><div align="center" class="style8"></div></td>
        <td width=""><div align="center" class="style8"><b>ProjCode</b></div></td>
        <td width="70"><div align="center" class="style8"><b>ProjName</b></div></td>
        <td width="64"><div align="center" class="style8"><b>ModuleName</b></div></td>
  
    
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
						
						
          		         		
         %>
         <tr bgcolor="#CEC9FA" height="10" >
         <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=i %></div></td>
        <td height="20"  bgcolor="#F4F5F7"><div align="center" class="style7"><%=projcode %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=projname %></div></td>
        <td height="20" bgcolor="#F4F5F7"><div align="center" class="style7"><%=mname %></div></td>
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