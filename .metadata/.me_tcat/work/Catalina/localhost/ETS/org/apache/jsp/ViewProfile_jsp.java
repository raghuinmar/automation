package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.track.dae.dao.*;
import com.track.dae.model.*;

public final class ViewProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("<td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("        ");
 String role=(String)session.getAttribute("role");
        if(role.equalsIgnoreCase("admin")){ 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
 } else if(role.equalsIgnoreCase("client")){ 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Cl.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
 } else if(role.equalsIgnoreCase("teamlead")){ 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Tl.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        ");
 } else if(role.equalsIgnoreCase("developer")){ 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "DevMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b></b></font><font color=\"blue\" size=\"6\"><b>Online Project Module Recording System</b></font></center></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//w3c//dtd html 4.0 transitional//en\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write(".Title {\r\n");
      out.write("font-family:Verdana;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("font-size:8pt\r\n");
      out.write("}\r\n");
      out.write(".Title1 {font-family:Verdana;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("font-size:8pt\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("<script language=\"JavaScript\" src=\"scripts/gen_validatorv31.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\" src=\"scripts/ts_picker.js\"></script>\r\n");
      out.write("<script language=\"JavaScript1.1\" src=\"scripts/pass.js\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script> <script type=\"text/javascript\" src=\"scripts/image.js\"> </script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/general.js\"> </script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/adi.js\"> </script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"scripts/form_validation.js\"> </script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"images/javascripts.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"images/pop-closeup.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("     ");

String name=(String)session.getAttribute("user");
     System.out.println("name in jsp is..."+name);
String path=request.getRealPath("/userimages");

		Profile aprofile=new ProfileDAO().getProfile(name,path);


      out.write("\r\n");
      out.write("\r\n");
      out.write("    <center><table>\r\n");
      out.write("     <th height=\"11\" colspan=\"\" bgcolor=\"#FFFWQNAM\"><center><b><font color=\"white\">Image</font></center></th>\r\n");
      out.write("  <td> <p><img alt=\"See Photo Here\" id=\"previewField\" src=\"userimages/");
      out.print(name );
      out.write("+.jpg\" height=\"110\" width=\"110\"></p></td>\r\n");
      out.write("     </table></center><br/>\r\n");
      out.write("    <center> <table width=\"500\" height=\"116\" bordercolor=\"#FEE8B6\">\r\n");
      out.write("       <th height=\"20\" colspan=\"15\" bgcolor=\"#FFFWQNAM\"><center><b><font color=\"white\">Personal Details</font></center></th>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td width=\"128\" bgcolor=\"#F4F5F7\"><strong><span class=\"style14 Title\">FirstName</span></strong></td>\r\n");
      out.write("         <td width=\"366\" bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>");
      out.print(aprofile.getFirstname());
      out.write("</strong></span></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>LastName</strong></span></td>\r\n");
      out.write("         <td bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>");
      out.print(aprofile.getLastname());
      out.write("</strong></span></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>Dob</strong></span></td>\r\n");
      out.write("         <td bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>");
      out.print(aprofile.getBdate());
      out.write("</strong></span></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>Email</strong></span></td>\r\n");
      out.write("         <td bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>");
      out.print(aprofile.getEmail());
      out.write("</strong></span></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>Fax</strong></span></td>\r\n");
      out.write("         <td bgcolor=\"#F4F5F7\"><span class=\"Title1\"><strong>");
      out.print(aprofile.getFax());
      out.write("</strong></span></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("     </table></center>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<br/><br>\r\n");
      out.write("<table  align=\"center\"  bgcolor=\"\" width=\"719\" height=\"\">\r\n");
      out.write("<th height=\"10\" colspan=\"15\" bgcolor=\"#FFFWQNAM\"><center><b><font color=\"white\">Address Details</font></center></th>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <tr height=\"20\">\r\n");
      out.write("    <td bgcolor=\"cyanblueeee\"><div align=\"center\" class=\"Title\">Address Type </div>      </td>\r\n");
      out.write("    <td bgcolor=\"cyanblueeee\"><div align=\"center\" class=\"Title\">HouseNo</div></td>\r\n");
      out.write("    <td bgcolor=\"cyanblueeee\"><div align=\"center\" class=\"Title\">Street</div></td>\r\n");
      out.write("    <td bgcolor=\"cyanblueeee\"><div align=\"center\" class=\"Title\">City</div></td>\r\n");
      out.write("    <td bgcolor=\"cyanblueeee\"><div align=\"center\" class=\"Title\">State</div></td>\r\n");
      out.write("    <td bgcolor=\"cyanblueeee\"><div align=\"center\" class=\"Title\">Country</div></td>\r\n");
      out.write("    <td bgcolor=\"cyanblueeee\"><div align=\"center\" class=\"Title\">PhoneNo</div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
if(aprofile.getHome()!=null){ 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\" height=\"40\"><span class=\"Title\">Home</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getHno());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getStreet());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getCity());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getState());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getCountry());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getPhone());
      out.write("</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
}if(aprofile.getOffice()!=null){  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">Office</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getOhno());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getOstreet());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getOcity());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getOstate());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getOcountry());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getOphone());
      out.write("</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
}if(aprofile.getContact()!=null){  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">Personal</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getChno());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getCstreet());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getCcity());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getCstate());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getCcountry());
      out.write("</span></td>\r\n");
      out.write("    <td bgcolor=\"#F4F5F7\"><span class=\"Title\">");
      out.print(aprofile.getCphone());
      out.write("</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" width=\"900\" height=\"20\"><img src=\"images/images1.jpeg\" height=\"20\" width=\"999\"/><br></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
