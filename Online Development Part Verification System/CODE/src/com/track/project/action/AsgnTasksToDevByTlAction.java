package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.track.project.dao.AssignProjectsDao;
import com.track.project.model.AssignBean;

public class AsgnTasksToDevByTlAction extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
       doPost(req, resp);
}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String target="";
		int projid=Integer.parseInt(req.getParameter("projid"));
		int mid=Integer.parseInt(req.getParameter("mid"));
		int taskid=Integer.parseInt(req.getParameter("taskid"));
		System.out.println("task id-----"+taskid);
		int devid=Integer.parseInt(req.getParameter("did"));
		String ehrs=req.getParameter("ehrs");
		HttpSession session=req.getSession();
		String user=(String)session.getAttribute("user");
		System.out.println("user in action is...."+user);
		
		try{
			AssignBean ab=new AssignBean();
			ab.setProjid(projid);
			ab.setMid(mid);
			ab.setTaskid(taskid);
			ab.setDid(devid);
			ab.setTlname(user);
			ab.setEhrs(ehrs);
			
			String flag=new AssignProjectsDao().assignTaskToDevelopers(ab);
			System.out.println("flag in action is...."+flag);
			
			if(flag.equalsIgnoreCase("true"))
				target="AssignTaskToDevByTl.jsp?status=Task is assigned Successfully to Developer";
			else
				target="AssignTaskToDevByTl.jsp?status=assigning task to Developer is Failed";
			}catch(Exception e){e.printStackTrace();}
			RequestDispatcher rd1 = req.getRequestDispatcher(target);
			rd1.forward(req,resp);
	}
	}