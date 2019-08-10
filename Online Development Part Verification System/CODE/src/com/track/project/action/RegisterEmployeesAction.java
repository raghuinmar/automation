package com.track.project.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.track.dae.dao.ProfileDAO;
import com.track.dae.model.Profile;


public class RegisterEmployeesAction extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String target="AdminRegister.jsp?status=Registration Failed"; 
		try{
		 Profile rb = new Profile(); 
	    rb.setPhoto(request.getParameter("photo"));
        rb.setFirstName(request.getParameter("firstName")); 
        rb.setLastName(request.getParameter("lastName")); 
      
        rb.setBirthDate(request.getParameter("dob")); 
        rb.setEmail(request.getParameter("email"));
        rb.setFax(request.getParameter("fax"));
        //home
        String home=request.getParameter("homeaddresstype");
        if(home!=null)
        {
        rb.setHome(home);	
        rb.setHno(request.getParameter("homehouseno"));
        rb.setStreet(request.getParameter("homestreet"));
        rb.setCity(request.getParameter("homecity")); 
        rb.setState(request.getParameter("homestate")); 
        rb.setCountry(request.getParameter("homecountry"));
        rb.setPin(request.getParameter("homepin"));
        rb.setHomePhoneType(request.getParameter("homephonetype"));
        rb.setPhone(request.getParameter("homephoneno"));
        }
        //office
        String office=request.getParameter("officeaddresstype");
        if(office!=null)
        {
        rb.setOffice(office);	
        rb.setOhno(request.getParameter("officehouseno"));
        rb.setOstreet(request.getParameter("officestreet"));
        rb.setOcity(request.getParameter("officecity")); 
        rb.setOstate(request.getParameter("officestate")); 
        rb.setOcountry(request.getParameter("officecountry"));
        rb.setOpin(request.getParameter("officepin"));
        rb.setOfficePhoneType(request.getParameter("officephonetype"));
        rb.setOphone(request.getParameter("officephoneno"));
        }
        //contact
        String contact=request.getParameter("personaladdresstype");
        if(contact!=null)
        {
       	rb.setContact(contact);	
       	rb.setChno(request.getParameter("personalhouseno"));
        rb.setCstreet(request.getParameter("personalstreet"));
        rb.setCcity(request.getParameter("personalcity")); 
        rb.setCstate(request.getParameter("personalstate")); 
        rb.setCcountry(request.getParameter("personalcountry"));
        rb.setCpin(request.getParameter("personalpin"));
        rb.setPersonalPhoneType(request.getParameter("personalphonetype"));
        rb.setCphone(request.getParameter("personalphoneno"));
        }
        
       // rb.setStatus(1); 
        //rb.setFirstLogin(0); 
        rb.setLoginID(request.getParameter("userName")); 
      String login=  request.getParameter("logintype");
      System.out.println("login type ...."+login);
        rb.setLoginType(login); 
        System.out.println("user logintype"+login);
        rb.setPassword(request.getParameter("password")); 
        String questid=""; 
        if(request.getParameter("ch")!=null) 
        { 
           // rb.setSecretQuestionID(questid); 
            rb.setSecretQuestionID(request.getParameter("ownquest")); 
        } 
        else 
        { 
            questid=request.getParameter("squest"); 
            rb.setSecretQuestionID(questid); 
            rb.setOwnSecretQuestion("Not Mentioned"); 
        } 
        rb.setSecretAnswer(request.getParameter("secrete")); 
        rb.setLocale(request.getLocale().toString()); 
        boolean flag=new ProfileDAO().registerEmployees(rb);
        System.out.println("flag==="+flag);
        
        if(flag) 
           target = "AdminRegister.jsp?status=Registration Success"; 
        else  
            target = "AdminRegister.jsp?status=Registration Failure"; 
            }catch(Exception e){e.printStackTrace();}
        RequestDispatcher rd = request.getRequestDispatcher(target);
        rd.forward(request,response);
	}

}

