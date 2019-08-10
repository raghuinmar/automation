<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%@page import="com.track.core.util.LoggerManager"%>
<%@page import="com.track.core.util.CoreHash"%>
<%@page import="com.track.project.model.QueryBean"%>
<%@page import="com.track.project.dao.QueryDAO"%>
<html>
<head>
		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
<td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
        <tr>
        <% String role=(String)session.getAttribute("role");
        if(role.equalsIgnoreCase("admin")){ %>
        <tr>
        <td><jsp:include page="AdminMenu.html"/></td>
        </tr>
        <% } else if(role.equalsIgnoreCase("teamlead")){ %>
        <tr>
        <td><jsp:include page="Tl.html"/></td>
        </tr>
        <% } else if(role.equalsIgnoreCase("developer")){ %>
        <tr>
        <td><jsp:include page="DevMenu.html"/></td>
        </tr>
        <% } %>
    
			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b></b></font><font color="blue" size="6"><b>Online Project Module Recording System</b></font></center></td>

			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
				

<fieldset>
					<legend class="style1"><font color="#FFFWQNAM"><i>Solution</i></font></legend>
					<br/>
					<form id="form1" method="post" action="ReplySolution.jsp">
					
					<%
					      int queryid = Integer.parseInt(request.getParameter("id"));
					      CoreHash aCoreHash = new CoreHash();
	     				  try{
            				 
             				QueryBean aQuery = new QueryDAO().getSolution(queryid);  
            				  System.out.println("aQuery.getSolutionDate() in jsp is..."+aQuery.getSolutionDate());
         					 
					 %>
					  <table width="381" border="0" align="center">
                        <tr bgcolor="">
                          <td bgcolor="" width="85"><b>From</b></td>
              <td width="286"><label>
                            <input name="from" type="text" id="textfield" size="48" value="<%=aQuery.getLoginid()%>" readonly />
                          </label></td>
                        </tr>
                         <% String role1=(String)session.getAttribute("role");
                        if(role1.equalsIgnoreCase("teamlead")){ %>
        <tr>
                          <td><b>To</b></td>
                          <td><label>
                            <input name="to" type="text" id="textfield2" size="48"  value="Administrator" readonly/>
                          </label></td>
                        </tr>
                  <% } else if(role1.equalsIgnoreCase("developer")){ %>       
                         <tr>
                          <td><b>To</b></td>
                          <td><label>
                            <input name="to" type="text" id="textfield2" size="48"  value="TeamLead" readonly/>
                          </label></td>
                        </tr>
                        <% } %>
                  
                        <tr>
                          <td><b>Query</td>
                          <td><label>
                            <textarea name="query" id="textarea" cols="45" rows="5" readonly="readonly"><%=aQuery.getDescription() %></textarea>
                          </label></td>
                        </tr>
                        <tr>
                          <td><b>Send Date</b></td>
                          <td><input type="text" name="query2" id="query" readonly value="<%=aQuery.getQueryDate()%>"/></td>
                        </tr>
                        <tr>
                          <td><b>Reply Date</b></td>
                          <td><input name="textfield" type="text" id="textfield3" size="48" readonly="readonly" value="<%=aQuery.getSolutionDate()%>"/></td>
                        </tr>
                        <tr>
                          <td><b>Solution</b></td>
                          <td><textarea name="query2" id="query" cols="45" rows="5" readonly><%=aQuery.getSolution()%></textarea></td>
                        </tr>
                        <tr>
                          <td colspan="2"><label>
                            <div align="center">
                              <input type="button" name="button" id="button" value="back" onclick="javascript:history.back(-1)"/>
                              </div>
                          </label></td>
                        </tr>
                      </table>
                      <%}
                      catch(Exception e)
                      {
                         LoggerManager.writeLogWarning(e);
                      } %>
                      </form>
					<br/>
                    
					  </fieldset>
					  
					  
					  
					  </td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>