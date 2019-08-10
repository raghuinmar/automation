package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "GeneralOptions.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b> </b></font><font color=\"blue\" size=\"8\"><b>Online Development Part Verification System</b></font></center></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table align=\"center\" border=\"0\" width=\"999\" style=\"width: 1024px; height: 348px;\" height=\"\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"1\" width=\"100%\" height=\"350\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3><font color=\"blue\"><b>&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Login Here . . . . .</b></font></h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./statusmsg.jsp", out, false);
      out.write(" \r\n");
      out.write("\t\t\t\t     \r\n");
      out.write("          <form action=\"./LoginAction\" method=\"post\">\r\n");
      out.write("            \r\n");
      out.write("        <table  border=\"0\" align=\"center\"  bgcolor=\"white\" width=\"\"> \r\n");
      out.write("        <tr><td></td><td><font color=\"red\"> ");
 if(request.getParameter("status")!=null)
					  {
      out.write("\r\n");
      out.write("                           <strong>");
      out.print(request.getParameter("status"));
      out.write("</strong>\r\n");
      out.write("                      ");
}
      out.write("</font>\r\n");
      out.write("        </td></tr>                                             \r\n");
      out.write("               \r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <th ><font color=\"blue\"><b>UserID</b></font></th>\r\n");
      out.write("                      <td ><input type=\"text\" name=\"username\"/></td><td><font color=\"red\"></font></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <th><span class=\"Title\"><font color=\"blue\"><b>Password</b></font></span></th>\r\n");
      out.write("                      <td><input type=\"password\" name=\"password\"/></td><td><font color=\"red\"></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td colspan=\"2\">\r\n");
      out.write("                       <div align=\"center\" class=\"style11\">\r\n");
      out.write("                        <input type=\"submit\" name=\"Add\" value=\"Submit\">\r\n");
      out.write("                          &nbsp;\r\n");
      out.write("                         <input type=\"reset\" name=\"cancle\" value=\"Reset\">\r\n");
      out.write("                         </div>                        </td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("              \r\n");
      out.write("               <tr>\r\n");
      out.write("               <td></td>\r\n");
      out.write("                \r\n");
      out.write("                 <td>\r\n");
      out.write("                   <a href=\"Recoverpassword.jsp\"><strong><font color=\"blue\">&nbsp;Forgot Password ! !......</font></strong></a></td>\r\n");
      out.write("                 <td></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("          </table></form>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          </td></tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
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
