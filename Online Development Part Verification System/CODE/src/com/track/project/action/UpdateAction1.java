package com.track.project.action;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.track.dae.dao.ProfileDAO;
import com.track.dae.model.Profile;

public class UpdateAction1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String target = "AdminHome.jsp?status=Updation is Failed";
		try {
			
			Profile rb = new Profile();
			rb.setLoginID(request.getParameter("loginid"));
			
			System.out.println(request.getParameter("loginid"));
			rb.setFirstName(request.getParameter("firstName"));
			rb.setLastName(request.getParameter("lastName"));
			rb.setEmail(request.getParameter("email"));
			rb.setFax(request.getParameter("fax"));
			rb.setHome(request.getParameter("addresstype"));
			rb.setHno(request.getParameter("houseNo"));
			rb.setStreet(request.getParameter("street"));
			rb.setCity(request.getParameter("city"));
			rb.setState(request.getParameter("state"));
			rb.setCountry(request.getParameter("country"));
			rb.setPin(request.getParameter("pin"));
			rb.setPhone(request.getParameter("phoneNo"));
			boolean flag = new ProfileDAO().modifyProfile(rb);

			if (flag)
				target = "AdminHome.jsp?status=Updation Success";
			else
				target = "AdminHome.jsp?status=Updation Failed";
		} catch (Exception e) {
			System.out.println(e);
		}

		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
