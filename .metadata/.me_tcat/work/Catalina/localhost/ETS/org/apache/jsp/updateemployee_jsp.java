package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.track.core.util.LoggerManager;
import com.track.core.util.CoreHash;
import com.track.core.util.CoreList;
import com.track.dae.dao.ProfileDAO;
import com.track.dae.model.Profile;

public final class updateemployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function sub()\r\n");
      out.write("{\r\n");
      out.write(" var Logintype=document.f1.logintype.value;\r\n");
      out.write(" alert(Logintype);\r\n");
      out.write(" location.href=\"updateemployee.jsp?logintype=\"+Logintype;\r\n");
      out.write("}\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("      \r\n");
      out.write("<td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b></b></font><font color=\"blue\" size=\"6\"><b>Online Project Module Recording System</b></font></center></td>><i></i></b></font></center></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write(" <center><h3><font color=\"#FF1493\"><b><i>Modify Employee Details</b></font></h3></center>\r\n");
      out.write("\t\t<form name=\"f1\" action=\"./UpdateProfile.jsp\" method=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table align=\"center\" border=\"0\" width=\"999\" style=\"width: 1024px; height: 348px;\" height=\"\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td> LoginType:</td>\r\n");
      out.write("\t\t<td><select name=\"logintype\" onchange=\"sub()\">\r\n");
      out.write("         \t\t<option value=\"select\">\r\n");
      out.write("\t\t\t\t\t --SELECT--\r\n");
      out.write("\t\t\t\t</option>\r\n");
      out.write("         \t\t\t\t");

         							String select = "";
		  		                    String logintype =null;
		  		                    String logintype1=null;
         								CoreList cl=new CoreList();
		 								//AddDistrictForm df=new AddDistrictForm();
		 								//Profile pf=new Profile();
		 								//AddStateInfoDao sd=new AddStateInfoDao();
		 								ProfileDAO pfdao=new ProfileDAO();
		 								cl=pfdao.getLogintype();
		 								Enumeration em=cl.elements();
		 								if(request.getParameter("logintype")!=null)
									    {
									         try
									          {
									          logintype1 = request.getParameter("logintype");
									          
					  		                  }
					  		              catch(Exception e){}   		    
			  		                    }
			  		 
			 								while(em.hasMoreElements())
			 								{
			  									//AddStateInfoForm sf=(AddStateInfoForm)em.nextElement();
			  									Profile pf=(Profile)em.nextElement();
			  									 //stateid=sf.getState_id();
			  									 logintype=pf.getLoginType();
			  									//df.setState_id(sf.getState_id());
			  									
			  									 select="";
			  									 
			  									 System.out.println("..."+logintype+"......"+logintype1);
			             if(logintype==logintype1)
			  	         select = "selected";	
			 						    
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(logintype);
      out.write('"');
      out.write(' ');
      out.print(select);
      out.write('>');
      out.print(pf.getLoginType());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("         \t\t\t\t\t\t    </select>   \t\t\t\t\t\t     \r\n");
      out.write("         \t\t\t\t\t\t    \r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("         \r\n");
      out.write("         \t    \t\t\t\t\t\t  \r\n");
      out.write("    \t\t\t\t\t\t  \r\n");
      out.write("    \t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\tusername:\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"username\" >\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"SELECT\">\r\n");
      out.write("\t\t\t\t\t\t\t\t--SELECT--\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

									String select1 = "";
		  		                    String username1 =null;
		  		                    String username = null;
          	  							String l=request.getParameter("logintype");
          	  							 if(request.getParameter("logintype")!=null)
										  {
										    try
										       {
										    	username1 = request.getParameter("username");
		  		                          }
		  		                        catch(Exception e){}   		    
		  		                               }
          	  							
          	  							if(l!=null)
          	 							{
             							  	//AddDistrictDao add=new AddDistrictDao();
             							  	ProfileDAO prodao=new ProfileDAO();
             								//AddDistrictForm adf=new AddDistrictForm();
             								Profile pf=new Profile();
             								//int d1=new Integer(l);
             								//CoreList cf=add.district_get(d1); 
             								CoreList cf=prodao.getusername(l); 
             								Enumeration em1=cf.elements();
             								while(em1.hasMoreElements())
             								{
             		   							//adf=(AddDistrictForm)em1.nextElement();
             		   							pf=(Profile)em1.nextElement();
             		   							//distid=adf.getDist_id();
             		   							username=pf.getLoginID();
											  select1="";
											  System.out.println("..."+username+"......"+username1);
											  if(username==username1)
											  	    select1 = "selected";
									         
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(username );
      out.write('"');
      out.write(' ');
      out.print(select1);
      out.write('>');
      out.print(pf.getLoginID());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t");
 }} 
      out.write("\r\n");
      out.write("    \t\t\t\t\t\t  </select>\r\n");
      out.write("           \t \t\t\t\t\t\t   <input type=\"hidden\" name=\"ln\" value=\"");
      out.print(l );
      out.write("\"/>\r\n");
      out.write("         \t\t\t\t\t\t\t</td>\r\n");
      out.write("     \t\t\t\t\t\t  </tr>\r\n");
      out.write("     \t\t\t\t\t\t  \r\n");
      out.write("     \t<tr><td>\r\n");
      out.write("     \t<input type=\"submit\" value=\"submit\">\r\n");
      out.write("     \t</td></tr>\r\n");
      out.write("     \t</table>\r\n");
      out.write("     \t</form>\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
