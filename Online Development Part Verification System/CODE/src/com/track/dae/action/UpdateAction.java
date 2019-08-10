package com.track.dae.action;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.track.core.util.LoggerManager;
import com.track.dae.dao.ProfileDAO;
import com.track.dae.model.Profile;

public class UpdateAction extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
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

