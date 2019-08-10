package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.track.core.util.LoggerManager;
import com.track.core.util.CoreHash;
import com.track.project.dao.ProjectDetailsDao;
import java.util.Enumeration;
import com.track.project.model.ProjectBean;

public final class ViewAdnUpdateProjs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("      <td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b></b></font><font color=\"blue\" size=\"6\"><b>Online Project Module Recording System</b></font></center></td>\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table align=\"center\" border=\"0\" width=\"999\" style=\"width: 1024px; height: 348px;\" height=\"\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"1\" width=\"100%\" height=\"350\" valign=\"top\">\r\n");
      out.write("\t<br><br>\t\t\r\n");
      out.write(" <center><h3><font color=\"#FF1493\"><b><i>Modify Project Details</b></font></h3></center>\r\n");
      out.write("<form id=\"form1\" method=\"post\" action=\"ViewAdnUpdateProjs.jsp\" name=\"inventory\">\r\n");
      out.write("    <table width=\"200\" border=\"0\" align=\"center\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"\"><strong>SelectProjectCode</strong></td>\r\n");
      out.write("        <td width=\"90\"><label>\r\n");
      out.write("          <select name=\"projcode\" id=\"select\" onchange=\"javascript:if(document.inventory.projcode.value==''){alert('select Any ProjCode');}else{ document.inventory.submit();}\">\r\n");
      out.write("          <option>--Select--</option>\r\n");
      out.write("          ");

		  		try
		  		{
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listProjectCodes();
		  		   Enumeration enu = bCoreHash.keys();
		  		   String select = "";
		  		   int projcode1 = 0;
		  		   int projcode = 0;
		  		   if(request.getParameter("projcode")!=null)
		  		   {
		  		        projcode1 = Integer.parseInt(request.getParameter("projcode"));
		  		        System.out.println("proj code.... in jsp ...."+projcode1); 		    
		  		   }
		  		   while(enu.hasMoreElements())
		  		   {
		  		   		projcode = Integer.parseInt(enu.nextElement().toString());
		  		   		System.out.println("proj code in jsp ...."+projcode);
		  		   		select = "";
		  		   		if(projcode==projcode1)
		  		   		    select = "selected";
		  		   		
		  		   
      out.write("\r\n");
      out.write("\t\t  \t\t   <option value=\"");
      out.print(projcode);
      out.write('"');
      out.write(' ');
      out.print(select);
      out.write('>');
      out.print(bCoreHash.get(new Integer(projcode)));
      out.write("</option>  \t\t \r\n");
      out.write("\t\t  \t\t");
}
		  		}
		  		catch(Exception e)
		  		{
		  		   LoggerManager.writeLogWarning(e);
		  		}
		  
      out.write("\r\n");
      out.write("          </select>\r\n");
      out.write("        </label></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    <br />\r\n");
      out.write("     ");
 if(request.getParameter("status")!=null)
					  {
      out.write("\r\n");
      out.write("                           <strong>");
      out.print(request.getParameter("status"));
      out.write("</strong>\r\n");
      out.write("                      ");
}
      out.write("\r\n");
      out.write("  ");

        if(request.getParameter("projcode")!=null) 
        {
    
      out.write("\r\n");
      out.write("    <form name=\"modificconectfacil\" action=\"./updateProjDetails\" method=\"\">     \r\n");
      out.write("<table align=\"center\" WIDTH=\"500\" border=\"0\" bordercolor=\"black\" bgcolor=\"#F4F5F7\">\r\n");
      out.write("      <th colspan=\"15\" bgcolor=\"#FFFWQNAM\"><center><b><font color=\"white\">MODIFY PROJECT DETAILS</font></center></th>\r\n");
      out.write("      <tr rowspan=\"4\"></tr>\r\n");
      out.write("          \r\n");
      out.write("       <tr><td><span class=Title>\r\n");
      out.write("    ");
if(request.getParameter("status")!=null)out.print(request.getParameter("status"));  
      
      out.write(" </span> \r\n");
      out.write("       ");
 if(request.getParameter("status")!=null)
					  {
      out.write("\r\n");
      out.write("                           <strong>");
      out.print(request.getParameter("status"));
      out.write("</strong>\r\n");
      out.write("                      ");
}
      out.write("\r\n");
      out.write("    </td></tr>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("                \r\n");
      out.write("                ");

                 
                

    ProjectBean  pb=null;
       try{
        
 
       
    pb=new ProjectDetailsDao().getProjDetails(Integer.parseInt(request.getParameter("projcode")));
     
          
         
      out.write(" \r\n");
      out.write("                  \r\n");
      out.write("        <tr>\r\n");
      out.write("    <input type=\"hidden\" name=\"projid\" value=\"");
      out.print(pb.getProjid());
      out.write("\"/>\r\n");
      out.write("     <td>Project Name </td>\r\n");
      out.write("    <td><input type=\"text\"  name=\"pname\"  value=\"");
      out.print(pb.getProjname());
      out.write("\"/></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     \r\n");
      out.write("      <tr>\r\n");
      out.write("    <td>Project Code</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"pcode\" value=\"");
      out.print(pb.getProjcode());
      out.write("\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("          \r\n");
      out.write("      <tr>\r\n");
      out.write("    <td>EstimatedDuration</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"pduar\" value=\"");
      out.print(pb.getProjduration());
      out.write("\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("    ");
} catch(Exception e)
{e.printStackTrace();}
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         <tr rowspan=\"1\"></tr><tr rowspan=\"1\"></tr><tr rowspan=\"1\"></tr><tr rowspan=\"1\"></tr>\r\n");
      out.write("      <tr><td colspan=\"2\"><center>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      <input type=\"submit\" name=\"submit\" value=\"Modify Project Details\"/>\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("   \r\n");
      out.write("     <input type=\"button\" name=\"Submit\" value=\"Back\" onclick=\"javascript:history.back(-1)\"/>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("</center></td></tr>\r\n");
      out.write("      </table>\r\n");
      out.write("</form> \r\n");
      out.write("\r\n");
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
