package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.track.core.util.CoreHash;
import com.track.project.dao.ProjectDetailsDao;
import java.util.Enumeration;
import com.track.core.util.LoggerManager;
import com.track.project.model.ReportBean;
import com.track.project.dao.ReportDao;

public final class ViewTlsEffort_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function viewbydate(entered, alertbox)\r\n");
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
      out.write("with (thisform)\r\n");
      out.write("{\r\n");
      out.write("if (viewbydate(tlid,\"Please Select Teamlead\")==false) {tlid.focus(); return false;};\r\n");
      out.write("if (viewbydate(edate,\"Please Select date\")==false) {edate.focus(); return false;};\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\t\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("<td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b></b></font><font color=\"blue\" size=\"6\"><b>Online Project Module Recording System</b></font></center></td>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
  String user = (String) session.getAttribute("user");
      out.write("  \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
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
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("//var x_win = window.self; \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<form action=\"\" name=\"viewbydate\" method=\"post\" onsubmit=\"return formvalidation(this)\">\r\n");
      out.write("<table>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("    <td width=\"\" height=\"\" align=\"center\">\r\n");
      out.write("     <strong>Select TeamLead</strong>    </td>\r\n");
      out.write("    <td width=\"95\"><div align=\"left\">\r\n");
      out.write("      <select name=\"tlid\" id=\"select\" onchange=\"javascript:if(document.viewbydate.tlid.value==''){alert('Select Any TeamLead');} else{ location.href='ViewTlsEffort.jsp?tlid='+document.viewbydate.tlid.value;}\">\r\n");
      out.write("        <option >--Select--</option>\r\n");
      out.write("        ");

            
            
		  		try
		  		{
		  		System.out.println("useeeeeeeeeeerrrrrrrrrrrrr......."+user);
		  		   CoreHash bCoreHash = new ProjectDetailsDao().listTeamLeads();
		  		   Enumeration enu = bCoreHash.keys();
		  		   String select = "";
		  		   int tlid1 = 0;
		  		   int tlid = 0;
		  		   if(request.getParameter("tlid")!=null)
		  		   {
		  		   try
		  		      {
		  		        tlid1 = Integer.parseInt(request.getParameter("tlid"));
		  		      }
		  		      catch(Exception e){} 
		  		         		    
		  		   }
		  		   while(enu.hasMoreElements())
		  		   {
		  		   		tlid = Integer.parseInt(enu.nextElement().toString());
		  		   		select = "";
		  		   		if(tlid==tlid1)
		  		   		    select = "selected";
		  		   		
		  		   
      out.write("\r\n");
      out.write("        <option value=\"");
      out.print(tlid);
      out.write('"');
      out.write(' ');
      out.print(select);
      out.write('>');
      out.print((bCoreHash.get(new Integer(tlid))));
      out.write("</option>  \t\t \r\n");
      out.write("        ");
}
		  		}
		  		catch(Exception e)
		  		{
		  		   LoggerManager.writeLogWarning(e);
		  		}
		  		
		  
      out.write("\r\n");
      out.write("      </select>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <th><span class=Title> Select Date</span></th>\r\n");
      out.write("    <td>\r\n");
      out.write("   <input type=\"text\" name=\"edate\" value=\"\" size=\"20\" readonly=\"readonly\" /><a href=\"javascript:show_calendar('document.viewbydate.edate', document.viewbydate.edate.value);\"> <img src=\"images/cal.gif\" alt=\"a\" width=\"18\" height=\"18\" border=\"0\"/></a>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"View\">\r\n");
      out.write("\t\t\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"reset\" name=\"clear\" value=\"Clear\">\r\n");
      out.write("\t\t\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  ");
if(request.getParameter("submit")!=null){ 
      out.write(" \r\n");
      out.write("  ");
System.out.println("submit=="+request.getParameter("submit")); 
      out.write("\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<span class=\"style13\">Export to : <a href=\"ExportXLS\" target=\"_blank\"><font color=\"brown\">XLS</font></a></span><br/>\r\n");
      out.write("<tr><font color=\"#FF1493\"><b><i>Report Details</b></font></tr>\r\n");
 
try{
ReportBean rb=null;
      int tlid=Integer.parseInt(request.getParameter("tlid"));
     String edate =request.getParameter("edate");
    
  
      System.out.println("tlid in jsp is......."+tlid);      
    CoreHash ch=new ReportDao().getReportOfTl(tlid,edate); 
        System.out.println("core hash obj is...."+ch);
       Enumeration em=ch.elements(); 

String report2="";
          
          report2+="<table align='center' WIDTH='850' border='1' bordercolor='black' bgcolor='#FF1493'>";
      report2+=" <th colspan='1' bgcolor='#FF1493'><center><b><font color='white'>TEAMLEAD WORK EFFORT DETAILS</font></center></th></table>";          
      
    report2+="<strong> <table align='center' WIDTH='800' border='1' bordercolor='block' bgcolor=''><tr> <td>Proj&nbsp;Code</td> <td>Project&nbsp;Name</td><td>Teamlead&nbsp;Name</td> <td>On&nbsp;Date</td>  <td>Login&nbsp;Time</td>  <td>Total&nbsp;Time</td>       <td>Logout&nbsp;Time</td>  </tr></table></strong> <table align='center' WIDTH='800' border='0' bordercolor='black' bgcolor=''>";       
          
          
          
         
      out.write(" \r\n");
      out.write(" <tr><th>ProjCode</th>\r\n");
      out.write("<th>ProjName</th>\r\n");
      out.write("<th>TeamLeadName</th>\r\n");
      out.write("<th>OnDate</th>\r\n");
      out.write("<th>LoginTime</th>\r\n");
      out.write("<th>LogoutTime</th>\r\n");
      out.write("<th>TotalHoursSpent</th>\r\n");
      out.write("\r\n");
      out.write("</tr>  \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("        ");
   while(em.hasMoreElements()){
            rb=(ReportBean)em.nextElement();             
          report2+="  <tr>";   
            report2+=" <td value="+rb.getProjcode()+">"+rb.getProjcode()+"</td>";
            report2+=" <td>"+rb.getProjname()+"</td>"; 
            report2+=" <td>"+rb.getUser()+"</td>"; 
             report2+=" <td>"+edate+"</td>";   
            report2+=" <td>"+rb.getLogintime()+"</td>";
            report2+=" <td>"+rb.getLogouttime()+"</td>";
             report2+=" <td>"+rb.getTotaltime()+"</td>";
        report2+="</tr>";
             session.setAttribute("Report",report2);
             
      out.write("    \r\n");
      out.write("         \r\n");
      out.write("       <tr>   \r\n");
      out.write("        <td value=\"");
      out.print(rb.getProjcode());
      out.write('"');
      out.write('>');
      out.print(rb.getProjcode());
      out.write("</td>\r\n");
      out.write("           <td align=\"center\">");
      out.print(rb.getProjname());
      out.write("</td>\r\n");
      out.write("                <td align=\"center\">");
      out.print(rb.getUser());
      out.write("</td>\r\n");
      out.write("           <td align=\"center\">");
      out.print(edate);
      out.write("</td> \r\n");
      out.write("           <td align=\"center\">");
      out.print(rb.getLogintime());
      out.write("</td>\r\n");
      out.write("            <td align=\"center\">");
      out.print(rb.getLogouttime());
      out.write("</td>\r\n");
      out.write("            <td align=\"center\">");
      out.print(rb.getTotaltime());
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("      \r\n");
      out.write("   </table>\r\n");
      out.write("    ");
}}catch(Exception e)
{e.printStackTrace();}
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("  \r\n");
      out.write("  </html>\r\n");
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
