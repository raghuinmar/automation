
<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%@page import="java.util.Enumeration"%>
<%@page import="com.track.project.model.QueryBean"%>
<%@page import="com.track.project.dao.QueryDAO"%>
<%@page import="com.track.core.util.CoreHash"%>
<html>
<head>
		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
<td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>        <tr>
        <% String role=(String)session.getAttribute("role");
        if(role.equalsIgnoreCase("client")){ %>
        <tr>
        <td><jsp:include page="Cl.html"/></td>
        </tr><!--
        <% } else if(role.equalsIgnoreCase("teamlead")){ %>
        <tr>
        <td><jsp:include page="Tl.html"/></td>
        </tr>
        <% } else if(role.equalsIgnoreCase("developer")){ %>
        <tr>
        <td><jsp:include page="DevMenu.html"/></td>
        </tr>
        --><% } %>

			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
				

<fieldset>
					<legend>View Query Status</legend>
                    <br />
                    <form name="f" method="post" action="DeleteBrandAction.jsp">
 
    <table width="637" border="0" align="center" bordercolor="#8692E3">
    
     
      <%
        String user=(String)session.getAttribute("user");
	     CoreHash aCoreHash = new CoreHash();
	     try{
             int queryid = 0;
             QueryDAO querydao = new QueryDAO();
             aCoreHash = querydao.getQueryStatusByTl(user); 
         	if(!aCoreHash.isEmpty())
         	{
       	%>
         <tr bgcolor="#FFFWQNAM">
        <td width="233" height="16"><div align="center" class="style8">Query ID</div></td>
        <td width="372"><div align="center" class="style8">Query Date</div></td>
        <td width="372"><div align="center" class="style8">Status</div></td>
        <td width="372"><div align="center" class="style8">Solution</div></td>
      </tr>
          <%
             Enumeration enu = aCoreHash.elements();
             QueryBean aQuery;
             while(enu.hasMoreElements())     
            {
               aQuery = (QueryBean)enu.nextElement();
               queryid = aQuery.getQueryid();
           %>
      <tr bgcolor="#F4F5F7">
              <td bgcolor="#F4F5F7"><div align="center"><span class="style7"><%=queryid%></span></div></td>
        <td bgcolor="#F4F5F7"><div align="center" class="style7">
         
        <%=aQuery.getQueryDate()%>
        </div></td>
        <td bgcolor="#F4F5F7"><div align="center"><span class="style7"><%=aQuery.getStatus()%></span></div></td>
        <td bgcolor="#F4F5F7"><div align="center" class="style3">
        <%
        if(aQuery.getStatus().equals("Process"))
        {
         %>
        
        <strong><a href="SendSolution.jsp?id=<%=queryid%>">Reply</a></strong>
        <%} %>
        </div></td>
        
      </tr>
     <%}
      }
      else 
      {%>
         <tr><td height="24" colspan="6"><div align="center" class="style3"><strong>No Records Found</strong></div></td>
         </tr>
      <%  }
      
      
       }
      catch(Exception e){}
       
       %>
     
    </table>
  </form>
					</fieldset>
					
					
					</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>