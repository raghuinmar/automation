package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.project.model.QueryBean;

public class SendQueryAction2 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String loginid=req.getParameter("loginid");
		String description=req.getParameter("description");
		
		try{
			QueryBean aQuery = new QueryBean();
			aQuery.setLoginid(loginid);
			aQuery.setDescription(description);
			new com.track.project.dao.QueryDAO().sendQueryByTl(aQuery);
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		String target="ViewQueryStatus.jsp?status=Query sended Sucessfully";
		RequestDispatcher rd1 = req.getRequestDispatcher(target);
		rd1.forward(req,resp);
}
}