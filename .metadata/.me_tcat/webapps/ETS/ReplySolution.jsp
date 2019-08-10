<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="com.track.core.util.*,java.util.*"%>
<%@page import="com.track.project.model.QueryBean"%>
<%@page import="com.track.project.dao.QueryDAO"%>
<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ReplySolution.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
       try
       {
           int queryid = Integer.parseInt(request.getParameter("queryid"));
           String replydate = DateWrapper.parseDate(new Date());
           String solution = request.getParameter("solution");
           
           QueryBean query = new QueryBean();
           
           query.setQueryid(queryid);
           query.setSolutionDate(replydate);
           query.setSolution(solution);
           
           new QueryDAO().setSolution(query); 
       }
       catch(Exception e)
       {
          LoggerManager.writeLogWarning(e);
       }
       response.sendRedirect("ViewQueries.jsp");
     %>
  </body>
</html>
