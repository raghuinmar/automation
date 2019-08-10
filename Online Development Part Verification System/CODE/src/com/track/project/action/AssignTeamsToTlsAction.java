package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.track.project.dao.AssignProjectsDao;
import com.track.project.model.AssignTeambean;


public class AssignTeamsToTlsAction extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

doPost(request,response);
}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		AssignTeambean atb=null;
		String flag="false";
		String target="";
		int tlid;
		int count = Integer.parseInt(request.getParameter("count")); 
		System.out.println("count value is ....."+count);
     	try {
     		int teamleadid=Integer.parseInt(request.getParameter("tlid"));
    		System.out.println("team lead id in action ..."+teamleadid);
     		AssignProjectsDao aProj = new AssignProjectsDao();
     			String ch[] = new String[count];   			
     			Integer devid[] = new Integer[count];   		
     			for (int i = 0,j=0; i<count; i++) {
     		    	atb = new AssignTeambean();
     		    	ch[i] =  request.getParameter("ch"+(i));
     		    	System.out.println("ch[i] value inaction is...."+ch[i]);
     		    	if(ch[i]!=null)
     		    	{     		        	     		        	
     		    		devid[j] = new Integer(ch[i].substring(ch[i].indexOf(",")+1));
     		    		atb.setDeveloperid((devid[j].intValue()));   
     		        	flag=aProj.assignTeamToTls(atb,teamleadid);
                		}
                		j++;
                	}
     			
     
     	if(flag.equalsIgnoreCase("true"))
			target="AssignTeamToTls.jsp?status=Team Assigned Successfully";
		else
			target="AssignTeamToTls.jsp?status=Team Assigning Failed";
		}catch(Exception e){e.printStackTrace();}
		RequestDispatcher rd1 = request.getRequestDispatcher(target);
		rd1.forward(request,response);
     	response.sendRedirect(target);
	}
}