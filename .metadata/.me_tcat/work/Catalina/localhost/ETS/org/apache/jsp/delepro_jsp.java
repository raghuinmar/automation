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

public final class delepro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t     <script type=\"text/javascript\">\r\n");
      out.write("function deleteSelected()\r\n");
      out.write("    {  \r\n");
      out.write("        var chks = document.getElementsByName('ch');     \r\n");
      out.write("\t\tvar hasChecked = false;\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor (var i = 0; i < chks.length; i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t  if (chks[i].checked)\r\n");
      out.write("\t\t  {\r\n");
      out.write("\t\t    hasChecked = true;\t\t  \r\n");
      out.write("\t\t  \tbreak;\t  \r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (hasChecked == false)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t  alert(\"Please select at least one.\");\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("    }                                                                                      \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("      <td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Cl.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center><h3><font color=\"#FF1493\"><b><i>Delete Project Details</b></font></h3></center>\r\n");
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
      out.write("  <form action=\"./deleteProjects\" method=\"post\" name=\"delete\" onsubmit=\"return deleteSelected()\"> \r\n");
      out.write("      \r\n");
      out.write("      <input type=\"hidden\" name=\"type\" value=\"projcode\"/>\r\n");
      out.write("      <input type=\"hidden\" name=\"value\" value=\"");
      out.print(request.getParameter("projcode"));
      out.write("\"/>\r\n");
      out.write("    <table width=\"\" border=\"0\" align=\"center\" bordercolor=\"#F4F5F7\">\r\n");
      out.write("    \r\n");
      out.write("      <tr bgcolor=\"#FFFWQNAM\">\r\n");
      out.write("      ");

        
	     String role = (String) session.getAttribute("role");
	     CoreList inCoreList = new CoreList();
	     System.out.println("ccore hash value"+inCoreList.isEmpty());
	     // CoreHash bCoreHash = new CoreHash();
	      
	      
	     try{
             int projcode = 0;
             int projid = 0;
             String projname;
             String pcode;
             String projduration;
             ProjectDetailsDao p = new ProjectDetailsDao();
             inCoreList = new ProjectDetailsDao().getProjectDetails();
            
           //  bCoreHash = branddao.listBrandNames();
             
             ProjectBean pBean = new ProjectBean();
             
             if(!inCoreList.isEmpty())
         	{
        
       
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <td width=\"110\"><div align=\"center\" class=\"style8\"></div></td>\r\n");
      out.write("        <td width=\"110\"><div align=\"center\" class=\"style8\"><b>ProjName</b></div></td>\r\n");
      out.write("        <td width=\"87\"><div align=\"center\" class=\"style8\"><b>ProjCode</b></div></td>\r\n");
      out.write("        <td width=\"64\"><div align=\"center\" class=\"style8\"><b>ProjDuration</b></div></td>\r\n");
      out.write("      \r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("          ");

          
          	Enumeration enu = inCoreList.elements();
          System.out.println("has more elements value"+enu.hasMoreElements());
          			int i=0;
          			while (enu.hasMoreElements()) {
          		
          			System.out.println("...........");
          				pBean = (ProjectBean) enu.nextElement();
          				System.out.println("..........."+pBean);
          				projid = pBean.getProjid();
          				System.out.println("projid code.... in jsp ...."+projid); 		
          				projname = pBean.getProjname();
          				pcode = pBean.getProjcode();
						projduration = pBean.getProjduration();
						
          		         		
          
      out.write("\r\n");
      out.write("      <tr bgcolor=\"#CEC9FA\" >\r\n");
      out.write("    \r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><input name=\"ch\" type=\"checkbox\" id=\"checkbox2\" value=\"");
      out.print(projid);
      out.write("\"/></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\" ><div align=\"center\" class=\"style7\">  ");
      out.print(projname);
      out.write("</div></td> \r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\" class=\"style7\">");
      out.print(pcode);
      out.write("</div></td>\r\n");
      out.write("        <td bgcolor=\"#F4F5F7\"><div align=\"center\"><span class=\"style7\">");
      out.print(projduration );
      out.write("</span></div></td>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("  \r\n");
      out.write("      \t\t");
 } }else {
      
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
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"8\"><div align=\"center\">\r\n");
      out.write("         \r\n");
      out.write("          <input type=\"submit\" name=\"button\" id=\"button\" value=\"Delete\"/>\r\n");
      out.write("          &nbsp;\r\n");
      out.write("         \r\n");
      out.write("        </div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("       \r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("   \r\n");
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
