<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.core.util.CoreList"%>
<%@page import="com.track.dae.dao.ProfileDAO"%>
<%@page import="com.track.dae.model.Profile"%>    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<script type="text/javascript">
function sub()
{
 var Logintype=document.f1.logintype.value;
 alert(Logintype);
 location.href="updateemployee.jsp?logintype="+Logintype;
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
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>><i></i></b></font></center></td>
			</tr>
			
		</table>
	
	
		
			
 <center><h3><font color="#FF1493"><b><i>Modify Employee Details</b></font></h3></center>
		<form name="f1" action="./UpdateProfile.jsp" method="post">
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
		<tr>
		<td> LoginType:</td>
		<td><select name="logintype" onchange="sub()">
         		<option value="select">
					 --SELECT--
				</option>
         				<%
         							String select = "";
		  		                    String logintype =null;
		  		                    String logintype1=null;
         								CoreList cl=new CoreList();
		 								//AddDistrictForm df=new AddDistrictForm();
		 								//Profile pf=new Profile();
		 								//AddStateInfoDao sd=new AddStateInfoDao();
		 								ProfileDAO pfdao=new ProfileDAO();
		 								cl=pfdao.getLogintype();
		 								Enumeration em=cl.elements();
		 								if(request.getParameter("logintype")!=null)
									    {
									         try
									          {
									          logintype1 = request.getParameter("logintype");
									          
					  		                  }
					  		              catch(Exception e){}   		    
			  		                    }
			  		 
			 								while(em.hasMoreElements())
			 								{
			  									//AddStateInfoForm sf=(AddStateInfoForm)em.nextElement();
			  									Profile pf=(Profile)em.nextElement();
			  									 //stateid=sf.getState_id();
			  									 logintype=pf.getLoginType();
			  									//df.setState_id(sf.getState_id());
			  									
			  									 select="";
			  									 
			  									 System.out.println("..."+logintype+"......"+logintype1);
			             if(logintype==logintype1)
			  	         select = "selected";	
			 						    %>
								<option value="<%=logintype%>" <%=select%>><%=pf.getLoginType()%></option>

								<%} %>							
         						    </select>   						     
         						    
		</td>
		</tr>
         
         	    						  
    						  
    	
			<tr>
			<td>
				username:
			</td>
					<td>
						<select name="username" >
							<option value="SELECT">
								--SELECT--
							</option>
							<%
									String select1 = "";
		  		                    String username1 =null;
		  		                    String username = null;
          	  							String l=request.getParameter("logintype");
          	  							 if(request.getParameter("logintype")!=null)
										  {
										    try
										       {
										    	username1 = request.getParameter("username");
		  		                          }
		  		                        catch(Exception e){}   		    
		  		                               }
          	  							
          	  							if(l!=null)
          	 							{
             							  	//AddDistrictDao add=new AddDistrictDao();
             							  	ProfileDAO prodao=new ProfileDAO();
             								//AddDistrictForm adf=new AddDistrictForm();
             								Profile pf=new Profile();
             								//int d1=new Integer(l);
             								//CoreList cf=add.district_get(d1); 
             								CoreList cf=prodao.getusername(l); 
             								Enumeration em1=cf.elements();
             								while(em1.hasMoreElements())
             								{
             		   							//adf=(AddDistrictForm)em1.nextElement();
             		   							pf=(Profile)em1.nextElement();
             		   							//distid=adf.getDist_id();
             		   							username=pf.getLoginID();
											  select1="";
											  System.out.println("..."+username+"......"+username1);
											  if(username==username1)
											  	    select1 = "selected";
									         %>
							<option value="<%=username %>" <%=select1%>><%=pf.getLoginID()%></option>
							<% }} %>
    						  </select>
           	 						   <input type="hidden" name="ln" value="<%=l %>"/>
         							</td>
     						  </tr>
     						  
     	<tr><td>
     	<input type="submit" value="submit">
     	</td></tr>
     	</table>
     	</form>					  
							
							
		
		
		
</html>
