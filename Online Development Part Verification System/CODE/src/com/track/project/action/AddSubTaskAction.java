package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.project.dao.ProjectDetailsDao;
import com.track.project.model.ProjModuleBean;

public class AddSubTaskAction extends  HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doPost(request,response);
}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String target="";
	
		
		int projid=Integer.parseInt(request.getParameter("projid"));
		System.out.println("projid in action class is ..."+projid);
		int mid=Integer.parseInt(request.getParameter("mid"));
		String modulename=request.getParameter("mname");
		String stname=request.getParameter("stname");
		
		try{
			ProjModuleBean pmb=new ProjModuleBean();
			pmb.setProjid(projid);
			pmb.setMid(mid);
			pmb.setSubtaskname(stname);
			
		
		
		String flag=new ProjectDetailsDao().addSubTaskDetails(pmb);
		System.out.println("flag in action is...."+flag);
		if(flag.equalsIgnoreCase("true"))
			target="AddSubTasks.jsp?status=Subtask added sucessfully";
		else
			target="AddSubTasks.jsp?status=Subtask adding failed";
		}catch(Exception e){e.printStackTrace();}
		RequestDispatcher rd1 = request.getRequestDispatcher(target);
		rd1.forward(request,response);
	}
}