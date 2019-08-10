package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.project.dao.ProjectDetailsDao;
import com.track.project.model.ProjectBean;

public class DeleteProjDtlsAction extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doPost(request,response);
}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		ProjectBean pb=null;
		boolean flag=false;
		String target="";
	
	
		try {
	     	
			ProjectDetailsDao aInventorydao = new ProjectDetailsDao();
     			String  ch[] =(request.getParameterValues("ch"));     		  
     		  flag= new ProjectDetailsDao().deleteProjDetails(ch);      
     	if(flag)
			target="DeleteProject.jsp?status=Projs  Deleted Successfully";
		else
			target="DeleteProject.jsp?status=Proj Deleting is Failed";
		}catch(Exception e){e.printStackTrace();}
		RequestDispatcher rd1 = request.getRequestDispatcher(target);
		rd1.forward(request,response);
     	response.sendRedirect(target);
	}
}
	