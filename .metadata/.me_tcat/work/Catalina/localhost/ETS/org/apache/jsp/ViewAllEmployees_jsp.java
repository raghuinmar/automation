package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.track.core.util.CoreHash;
import com.track.project.dao.ProjectDetailsDao;
import java.util.Enumeration;
import com.track.core.util.LoggerManager;
import com.track.core.util.CoreList;
import com.track.project.model.ProjectBean;
import com.track.dae.dao.ProfileDAO;
import com.track.dae.model.Profile;

public final class ViewAllEmployees_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

if(session.getAttribute("user")==null){
      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("/LogoutAction");
        return;
      }
      out.write('\r');
      out.write('\n');
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("    \r\n");
      out.write("<td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b></b></font><font color=\"blue\" size=\"6\"><b>Online Project Module Recording System</b></font></center></td> \r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table align=\"center\" border=\"0\" width=\"999\" style=\"width: 1024px; height: 348px;\" height=\"\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"0\" width=\"100%\" height=\"350\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center><h3><font color=\"#FF1493\"><b><i>View All Employee Details</b></font></h3></center>\r\n");
      out.write("   ");
 if(request.getParameter("status")!=null)
					  {
      out.write("\r\n");
      out.write("                           <strong>");
      out.print(request.getParameter("status"));
      out.write("</strong>\r\n");
      out.write("                      ");
}
      out.write("\r\n");
      out.write("  \r\n");
      out.write("      \r\n");
      out.write("      <input type=\"hidden\" name=\"type\" value=\"projcode\"/>\r\n");
      out.write("      <input type=\"hidden\" name=\"value\" value=\"");
      out.print(request.getParameter("projcode"));
      out.write("\"/>\r\n");
      out.write("    <table width=\"\" border=\"0\" align=\"center\" bordercolor=\"#F4F5F7\">\r\n");
      out.write("    \r\n");
      out.write("      <tr bgcolor=\"#FFFWQNAM\">\r\n");
      out.write("       ");

String name=(String)session.getAttribute("user");
String path=request.getRealPath("/userimages");
        
	     String role = (String) session.getAttribute("role");
	     CoreList inCoreList = new CoreList();
	     System.out.println("ccore hash value"+inCoreList.isEmpty());
	     // CoreHash bCoreHash = new CoreHash();
	      
	      
	     try{
             String designation="";
             String fname="";
             String lname="";
             String dob;
             String email;
             String fax;
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProfileDAO().getEmpDetails(path);
            
           //  bCoreHash = branddao.listBrandNames();
             
             Profile pBean = new Profile();
             System.out.println("pbean in jsp is..."+pBean);
             if(!inCoreList.isEmpty())
         	{
        
       
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <td width=\"110\"><div align=\"center\" class=\"style8\"><b>Designation</b></div></td>\r\n");
      out.write("        <td width=\"110\"><div align=\"center\" class=\"style8\"><b>FirstName</b></div></td>\r\n");
      out.write("        <td width=\"87\"><div align=\"center\" class=\"style8\"><b>LastName</b></div></td>\r\n");
      out.write("        <td width=\"64\"><div align=\"center\" class=\"style8\"><b>Dob</b></div></td>\r\n");
      out.write("      <td width=\"110\"><div align=\"center\" class=\"style8\"><b>Email</b></div></td>\r\n");
      out.write("        <td width=\"87\"><div align=\"center\" class=\"style8\"><b>Fax</b></div></td>\r\n");
      out.write("        \r\n");
      out.write("        <td width=\"64\"><div align=\"center\" class=\"style8\"><b>EmpPicture</b></div></td>\r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("          ");

          
          	Enumeration enu = inCoreList.elements();
          System.out.println("has more elements value"+enu.hasMoreElements());
          			int i=0;
          			while (enu.hasMoreElements()) {
          			System.out.println("...........");
          				pBean = (Profile) enu.nextElement();
          				System.out.println(".....pBean......"+pBean);
          				designation = pBean.getLogintype();
          				System.out.println("designation.... in jsp ...."+designation); 		
          				fname = pBean.getFirstname();
          				lname = pBean.getLastname();
						dob = pBean.getBdate();
						email=pBean.getEmail();
						fax=pBean.getFax();
						 System.out.println("has more elements value"+pBean.getPhoto());
						
          		         		
          
      out.write("\r\n");
      out.write("      <tr bgcolor=\"#CEC9FA\" >\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        <td bgcolor=\"#F4F5F7\" ><div align=\"center\" class=\"style7\">  ");
      out.print(designation );
      out.write("</div></td> \r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\" class=\"style7\">");
      out.print(fname);
      out.write("</div></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\"><span class=\"style7\">");
      out.print(lname );
      out.write("</span></div></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\" ><div align=\"center\" class=\"style7\">  ");
      out.print(dob);
      out.write("</div></td> \r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\" class=\"style7\">");
      out.print(email);
      out.write("</div></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\"><span class=\"style7\">");
      out.print(fax );
      out.write("</span></div></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"> <p><img alt=\"See Photo Here\" id=\"previewField\" src=\"userimages/");
      out.print(pBean.getPhoto() );
      out.write("\" height=\"50\" width=\"90\"></p></td>\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("     ");
i++;
      	}
      out.write(" <input type=\"hidden\" name=\"count\" value=\"");
      out.print(i);
      out.write("\"/>\r\n");
      out.write("      \t\t");
 }else {
      
      out.write("\r\n");
      out.write("         <tr><td height=\"24\" colspan=\"8\"><div align=\"center\" class=\"style3\"><strong>No Records Found</strong></div></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      ");

      	}
    
}
      	catch (Exception e) {
      		LoggerManager.writeLogWarning(e);
      	}
   
      
      out.write("\r\n");
      out.write("         \r\n");
      out.write("      \r\n");
      out.write("      \t\r\n");
      out.write("      \r\n");
      out.write("     \r\n");
      out.write("       \r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" width=\"900\" height=\"20\"><img src=\"images/images1.jpeg\" height=\"20\" width=\"999\"/><br></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("</html>");
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
