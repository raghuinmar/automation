package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;
import com.track.project.model.QueryBean;
import com.track.project.dao.QueryDAO;
import com.track.core.util.CoreHash;

public final class ViewQueries_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("<td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>        <tr>\r\n");
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
 } else if(role.equalsIgnoreCase("teamlead")){ 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Tl.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
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
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b></b></font><font color=\"blue\" size=\"6\"><b>Online Project Module Recording System</b></font></center></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table align=\"center\" border=\"0\" width=\"999\" style=\"width: 1024px; height: 348px;\" height=\"\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"1\" width=\"100%\" height=\"350\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend>View Query Status</legend>\r\n");
      out.write("                    <br />\r\n");
      out.write("                    <form name=\"f\" method=\"post\" action=\"DeleteBrandAction.jsp\">\r\n");
      out.write(" \r\n");
      out.write("    <table width=\"637\" border=\"0\" align=\"center\" bordercolor=\"#8692E3\">\r\n");
      out.write("    \r\n");
      out.write("     \r\n");
      out.write("      ");

        String user=(String)session.getAttribute("user");
	     CoreHash aCoreHash = new CoreHash();
	     try{
             int queryid = 0;
             QueryDAO querydao = new QueryDAO();
             aCoreHash = querydao.getQueryStatusByTl(user); 
         	if(!aCoreHash.isEmpty())
         	{
       	
      out.write("\r\n");
      out.write("         <tr bgcolor=\"#FFFWQNAM\">\r\n");
      out.write("        <td width=\"233\" height=\"16\"><div align=\"center\" class=\"style8\">Query ID</div></td>\r\n");
      out.write("        <td width=\"372\"><div align=\"center\" class=\"style8\">Query Date</div></td>\r\n");
      out.write("        <td width=\"372\"><div align=\"center\" class=\"style8\">Status</div></td>\r\n");
      out.write("        <td width=\"372\"><div align=\"center\" class=\"style8\">Solution</div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("          ");

             Enumeration enu = aCoreHash.elements();
             QueryBean aQuery;
             while(enu.hasMoreElements())     
            {
               aQuery = (QueryBean)enu.nextElement();
               queryid = aQuery.getQueryid();
           
      out.write("\r\n");
      out.write("      <tr bgcolor=\"#F4F5F7\">\r\n");
      out.write("              <td bgcolor=\"#F4F5F7\"><div align=\"center\"><span class=\"style7\">");
      out.print(queryid);
      out.write("</span></div></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\" class=\"style7\">\r\n");
      out.write("         \r\n");
      out.write("        ");
      out.print(aQuery.getQueryDate());
      out.write("\r\n");
      out.write("        </div></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\"><span class=\"style7\">");
      out.print(aQuery.getStatus());
      out.write("</span></div></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\" class=\"style3\">\r\n");
      out.write("        ");

        if(aQuery.getStatus().equals("Process"))
        {
         
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <strong><a href=\"SendSolution.jsp?id=");
      out.print(queryid);
      out.write("\">Reply</a></strong>\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("        </div></td>\r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("     ");
}
      }
      else 
      {
      out.write("\r\n");
      out.write("         <tr><td height=\"24\" colspan=\"6\"><div align=\"center\" class=\"style3\"><strong>No Records Found</strong></div></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      ");
  }
      
      
       }
      catch(Exception e){}
       
       
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    </table>\r\n");
      out.write("  </form>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td></tr>\r\n");
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
