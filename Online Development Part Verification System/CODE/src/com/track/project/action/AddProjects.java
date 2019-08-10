package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.project.dao.ProjectDetailsDao;
import com.track.project.model.ProjectBean;

public class AddProjects extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doPost(request,response);
}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String target="";
	
		
		String projname=request.getParameter("pname");
		System.out.println("proj name in action class is ..."+projname);
		String projcode=request.getParameter("pcode");
		String projdur=request.getParameter("pduar");
		try{
		ProjectBean proj=new ProjectBean();
		proj.setProjname(projname);
		proj.setProjcode(projcode);
		proj.setProjduration(projdur);
		
		String flag=new ProjectDetailsDao().addProjDetails(proj);
		System.out.println("flag in action is...."+flag);
		if(flag.equalsIgnoreCase("true"))
			target="AddProjects.jsp?status=Proj is Added Successfully";
		else
			target="AddProjects.jsp?status=Proj Adding is Failed";
		}catch(Exception e){e.printStackTrace();}
		RequestDispatcher rd1 = request.getRequestDispatcher(target);
		rd1.forward(request,response);
}
}
