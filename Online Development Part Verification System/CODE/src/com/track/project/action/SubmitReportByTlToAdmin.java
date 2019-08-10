package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.project.dao.ReportDao;

public class SubmitReportByTlToAdmin extends HttpServlet {
 @Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	doPost(request, response);
}
 @Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	 
	 
	 String target="";
	 boolean flag;
	 int tid;
	 try{
		 tid=Integer.parseInt(request.getParameter("tid"));
		 System.out.println("tlid in action is......."+tid);
		flag= new ReportDao().submitReportToAdminByTl(tid);
		if(flag==true)
			target="ViewReportonPartiDate.jsp?status=ReportSubmitedSucessfully";
		else
			target="ViewReportonPartiDate.jsp";
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
		
	 }
	 catch (Exception e) {
		e.printStackTrace();
		e.getMessage();
	}
	
}
}
