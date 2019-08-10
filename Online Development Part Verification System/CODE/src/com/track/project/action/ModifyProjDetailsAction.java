package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.core.util.LoggerManager;
import com.track.project.dao.ProjectDetailsDao;
import com.track.project.model.ProjectBean;

public class ModifyProjDetailsAction extends HttpServlet {
	
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
			/*System.out.println(request.getParameter("projcode"));
			int projid=Integer.parseInt(request.getParameter("projcode"));
			System.out.println("projid in action is ....."+projid);*/
			int projid1=Integer.parseInt(request.getParameter("projid"));
			System.out.println("projid1 in action is ....."+projid1);
		ProjectBean proj=new ProjectBean();
		proj.setProjname(projname);
		proj.setProjcode(projcode);
		proj.setProjduration(projdur);
		
		String flag=new ProjectDetailsDao().modifyProjDetails(proj,projid1);
		System.out.println("flag in action is...."+flag);
		if(flag.equalsIgnoreCase("true"))
			target="ViewAdnUpdateProjs.jsp?status=Proj is Modified Successfully";
		else
			target="ViewAdnUpdateProjs.jsp?status=Proj modifying is Failed";
		}catch(Exception e){e.printStackTrace();}
		RequestDispatcher rd1 = request.getRequestDispatcher(target);
		rd1.forward(request,response);
}
}