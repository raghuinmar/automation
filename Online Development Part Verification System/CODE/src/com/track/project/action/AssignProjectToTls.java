package com.track.project.action;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.project.dao.AssignProjectsDao;
import com.track.project.model.AssignBean;


public class AssignProjectToTls extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doPost(request,response);
}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String target="";
	
		int teamleadid=Integer.parseInt(request.getParameter("tlid"));
		System.out.println("team lead id in action ..."+teamleadid);
		int projid=Integer.parseInt(request.getParameter("projid"));
		System.out.println("projid name in action class is ..."+projid);
		String nmodules=request.getParameter("nmodules");
		String sdate=request.getParameter("sdate");
		String edate=request.getParameter("edate");
		try{
		AssignBean ab=new AssignBean();
		ab.setTlid(teamleadid);
		ab.setProjid(projid);
		ab.setModules(nmodules);
		ab.setSdate(sdate);
		ab.setEdate(edate);
		
		String flag=new AssignProjectsDao().assignProjsToTls(ab);
		System.out.println("flag in action is...."+flag);
		if(flag.equalsIgnoreCase("true"))
			target="AssignTask.jsp?status=Proj is Asigned Successfully";
		else
			target="AssignTask.jsp?status=Project is already assigned to Teamlead";
		}catch(Exception e){e.printStackTrace();}
		RequestDispatcher rd1 = request.getRequestDispatcher(target);
		rd1.forward(request,response);
}
}