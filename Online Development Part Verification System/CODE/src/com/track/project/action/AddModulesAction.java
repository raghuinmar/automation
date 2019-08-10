package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.project.dao.ProjectDetailsDao;
import com.track.project.model.ProjModuleBean;


public class AddModulesAction extends  HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doPost(request,response);
}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String target="";
	
		
		int projid=Integer.parseInt(request.getParameter("projid"));
		System.out.println("projid in action class is ..."+projid);
		String modulename=request.getParameter("mname");
		
		try{
			ProjModuleBean pmb=new ProjModuleBean();
			pmb.setProjid(projid);
			pmb.setMname(modulename);
		
		
		String flag=new ProjectDetailsDao().addModuleDetails(pmb);
		System.out.println("flag in action is...."+flag);
		if(flag.equalsIgnoreCase("true"))
			target="AddModulesByTl.jsp?status=Module is Added Successfully";
		else
			target="AddModulesByTl.jsp?status=Module Adding is Failed";
		}catch(Exception e){e.printStackTrace();}
		RequestDispatcher rd1 = request.getRequestDispatcher(target);
		rd1.forward(request,response);
}
}