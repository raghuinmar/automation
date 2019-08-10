package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProjects_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function addprojects(entered, alertbox)\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("with (entered)\r\n");
      out.write("{\r\n");
      out.write("if (value==null || value==\"\")\r\n");
      out.write("{if (alertbox!=\"\") {alert(alertbox);} return false;}\r\n");
      out.write("else {return true;}\r\n");
      out.write("}\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("function formvalidation(thisform)\r\n");
      out.write("{\r\n");
      out.write("with(thisform)\r\n");
      out.write("{\r\n");
      out.write("if (addprojects(pname,\"Please Enter ProjectName\")==false) {pname.focus(); return false;};\r\n");
      out.write("if (addprojects(pcode,\"Please Enter ProjectCode\")==false) {pcode.focus(); return false;};\r\n");
      out.write("if (addprojects(pduar,\"Please Enter ProjectDuration\")==false) {pduar.focus(); return false;};\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\t\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("    <td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b><i></i></b></font><font color=\"blue\" size=\"6\"><b><i>Online Project Module Recording System</i></b></font></center></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table align=\"center\" border=\"0\" width=\"999\" style=\"width: 1024px; height: 348px;\" height=\"\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"1\" width=\"100%\" height=\"350\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
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
      out.write("  <center><h3><font color=\"#FF1493\"><b><i>Add Project Details</b></font></h3></center>\r\n");
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
      out.write("  <form action=\"./addProjects\" method=\"post\" name=\"addprojects\" onsubmit=\"return formvalidation(this)\"> \r\n");
      out.write("  \r\n");
      out.write("  <table bgcolor=\"\" bordercolor=\"green\" border=\"0\" align=\"center\" cellpadding=\"1\" cellspacing=\"2\" height=\"10\" width=\"10\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <th>AddProjectName</th><td> <input type=\"text\" name=\"pname\"/> </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <th>AddProjectCode</th>  <td><input type=\"text\" name=\"pcode\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <th>AddProjectDuration</th>  <td><input type=\"text\" name=\"pduar\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td align=\"center\"><input type=\"submit\" name=\"Add\" value=\"Add\">  </td>\r\n");
      out.write("  <td align=\"center\"><input type=\"reset\" name=\"cancle\" value=\"cancle\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </form>\r\n");
      out.write(" \r\n");
      out.write("    \r\n");
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
