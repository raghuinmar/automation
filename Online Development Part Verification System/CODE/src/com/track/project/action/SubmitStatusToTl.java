package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.track.project.dao.ReportDao;
import com.track.project.model.ReportBean;
@SuppressWarnings("serial")
public class SubmitStatusToTl extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
doPost(req,resp);
}
@Override
public void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	String target="";
int taskid=0;
String edate=req.getParameter("cdate");
int ehrs=0;
HttpSession session=req.getSession();
String user=(String)session.getAttribute("user");
try{
	taskid=Integer.parseInt(req.getParameter("taskid"));
	ehrs=Integer.parseInt(req.getParameter("ehrs"));
	ReportBean aQuery = new ReportBean();
	aQuery.setTaskid(taskid);
	aQuery.setEdate(edate);
	aQuery.setEhrs(ehrs);
	aQuery.setUser(user);
	
	String flag=new ReportDao().sendTaskStatus(aQuery);
	System.out.println("flag in action is...."+flag);
	if(flag.equalsIgnoreCase("true"))
		target="SendReportToTl.jsp?status=Report is Submited Successfully";
	else
		target="SendReportToTl.jsp?status=Report Submitting is Failed";
	}catch(Exception e)
	{
		e.printStackTrace();
		target="SendReportToTl.jsp?status=Report Submitting is Failed";
		RequestDispatcher rd1 = req.getRequestDispatcher(target);
		rd1.forward(req,resp);
	}
	RequestDispatcher rd1 = req.getRequestDispatcher(target);
	rd1.forward(req,resp);
}
}

