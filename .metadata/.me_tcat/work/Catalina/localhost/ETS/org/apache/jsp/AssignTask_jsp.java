package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.track.core.util.CoreHash;
import com.track.project.dao.ProjectDetailsDao;
import java.util.Enumeration;
import com.track.core.util.LoggerManager;

public final class AssignTask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function asigntask(entered, alertbox)\r\n");
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
      out.write("if (asigntask(tlid,\"Please Select Teamlead\")==false) {tlid.focus(); return false;};\r\n");
      out.write("if (asigntask(projid,\"Please Select Projname\")==false) {projid.focus(); return false;};\r\n");
      out.write("if (asigntask(nmodules,\"Please Enter No of Modules\")==false) {nmodules.focus(); return false;};\r\n");
      out.write("if (asigntask(sdate,\"Please Select Estimated Start Date\")==false) {sdate.focus(); return false;};\r\n");
      out.write("if (asigntask(edate,\"Please Select Estimated End Date\")==false) {edate.focus(); return false;};\r\n");
      out.write("var str2 = document.getElementById(\"sdate\").value;\r\n");
      out.write("var str1 = document.getElementById(\"edate\").value;\r\n");
      out.write(" //alert(\"stri.length is...\"+str1.length);\r\n");
      out.write(" if(str1==\"\")\r\n");
      out.write(" {\r\n");
      out.write(" alert(\"select date\");\r\n");
      out.write(" return false;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("  var currentTime = new Date();\r\n");
      out.write("    \r\n");
      out.write("     var month =parseInt(currentTime.getMonth() + 1);\r\n");
      out.write("      var day = parseInt(currentTime.getDate());\r\n");
      out.write("      var year =parseInt(currentTime.getFullYear()); \r\n");
      out.write("     //alert(year);\r\n");
      out.write("        if(str1.length==9)\r\n");
      out.write("     {\r\n");
      out.write("        var dt1  = parseInt(str1.substring(0,1),10); \r\n");
      out.write("        var mon1 = parseInt(str1.substring(2,3),10);\r\n");
      out.write("        var yr1  = parseInt(str1.substring(4,9),10);\r\n");
      out.write("      }      \r\n");
      out.write("     else if(str1.length==10)\r\n");
      out.write("     {\r\n");
      out.write("        var dt1  = parseInt(str1.substring(0,1),10); \r\n");
      out.write("        var mon1 = parseInt(str1.substring(2,4),10);\r\n");
      out.write("        var yr1  = parseInt(str1.substring(5,9),10);     \r\n");
      out.write("      }    \r\n");
      out.write("      else \r\n");
      out.write("      {\r\n");
      out.write("        var dt1  = parseInt(str1.substring(0,2),10);\r\n");
      out.write("        var mon1 = parseInt(str1.substring(3,5),10);\r\n");
      out.write("        var yr1  = parseInt(str1.substring(6,10),10);        \r\n");
      out.write("         }  \r\n");
      out.write("         \r\n");
      out.write("     \r\n");
      out.write("if(yr1<=year)  \r\n");
      out.write("{\r\n");
      out.write("var currentdate=new Date(year, month, day); \r\n");
      out.write("var date1 = new Date(yr1, mon1, dt1);\r\n");
      out.write("if(date1<currentdate)\r\n");
      out.write("{\r\n");
      out.write("alert(\"EstimatedEndDate can not be less then currentdate\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if(str2.length==9)\r\n");
      out.write("     {\r\n");
      out.write("        var dt2  = parseInt(str1.substring(0,1),10); \r\n");
      out.write("        var mon2 = parseInt(str1.substring(2,3),10);\r\n");
      out.write("        var yr2  = parseInt(str1.substring(4,9),10);\r\n");
      out.write("      }      \r\n");
      out.write("     else if(str2.length==10)\r\n");
      out.write("     {\r\n");
      out.write("        var dt2  = parseInt(str1.substring(0,1),10); \r\n");
      out.write("        var mon2 = parseInt(str1.substring(2,4),10);\r\n");
      out.write("        var yr2  = parseInt(str1.substring(5,9),10);     \r\n");
      out.write("      }    \r\n");
      out.write("      else \r\n");
      out.write("      {\r\n");
      out.write("        var dt2  = parseInt(str1.substring(0,2),10);\r\n");
      out.write("        var mon2 = parseInt(str1.substring(3,5),10);\r\n");
      out.write("        var yr2  = parseInt(str1.substring(6,10),10);        \r\n");
      out.write("         }  \r\n");
      out.write("         \r\n");
      out.write("     \r\n");
      out.write("if(yr2<=year)  \r\n");
      out.write("{\r\n");
      out.write("var currentdate=new Date(year, month, day); \r\n");
      out.write("var date2 = new Date(yr2, mon2, dt2);\r\n");
      out.write("if(date2<currentdate)\r\n");
      out.write("{\r\n");
      out.write("alert(\"EstimatedStartDate can not be less then currentdate\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function CompareDates2(thisform)\r\n");
      out.write("{\r\n");
      out.write("alert(\"hai\");\r\n");
      out.write("with (thisform)\r\n");
      out.write("{\r\n");
      out.write("if (asigntask(tlid,\"Please Select Teamlead\")==false) {tlid.focus(); return false;};\r\n");
      out.write("if (asigntask(projid,\"Please Select Projname\")==false) {projid.focus(); return false;};\r\n");
      out.write("if (asigntask(nmodules,\"Please Enter No of Modules\")==false) {nmodules.focus(); return false;};\r\n");
      out.write("if (asigntask(sdate,\"Please Select Estimated Start Date\")==false) {sdate.focus(); return false;};\r\n");
      out.write("if (asigntask(edate,\"Please Select Estimated End Date\")==false) {edate.focus(); return false;};\r\n");
      out.write("\r\n");
      out.write("var day1, day2;\r\n");
      out.write("var month1, month2;\r\n");
      out.write("var year1, year2;\r\n");
      out.write("  var currentTime = new Date();\r\n");
      out.write("    \r\n");
      out.write("     var month =parseInt(currentTime.getMonth() + 1);\r\n");
      out.write("      var day = parseInt(currentTime.getDate());\r\n");
      out.write("      var year =parseInt(currentTime.getFullYear()); \r\n");
      out.write("value1 = document.getElementById(\"sdate\").value;\r\n");
      out.write("\r\n");
      out.write("value2 = document.getElementById(\"edate\").value;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("day1 = value1.substring (0, value1.indexOf (\"-\"));\r\n");
      out.write("\r\n");
      out.write("month1 = value1.substring (value1.indexOf (\"-\")+1, value1.lastIndexOf (\"-\"));\r\n");
      out.write("\r\n");
      out.write("year1 = value1.substring (value1.lastIndexOf (\"-\")+1, value1.length);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("day2 = value2.substring (0, value2.indexOf (\"-\"));\r\n");
      out.write("\r\n");
      out.write("month2 = value2.substring (value2.indexOf (\"-\")+1, value2.lastIndexOf (\"-\"));\r\n");
      out.write("\r\n");
      out.write("year2 = value2.substring (value2.lastIndexOf (\"-\")+1, value2.length);\r\n");
      out.write("\r\n");
      out.write("date2 = year2+\"-\"+month2+\"-\"+day2;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("date1 = year1+\"-\"+month1+\"-\"+day1;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  var currentdate=new Date(year, month, day);    \r\n");
      out.write("\r\n");
      out.write(" var datee1 = new Date(year1, month1, day1);  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("     var datee2 = new Date(year2, month2, day2);  \r\n");
      out.write("        \r\n");
      out.write("     \r\n");
      out.write("       if(datee1<currentdate)\r\n");
      out.write("  {\r\n");
      out.write("      alert(\"Sorry estimated start date can not be less than current date\");\r\n");
      out.write("      document.getElementById(\"sdate\").value=\"\";\r\n");
      out.write("      return false;\r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  else if(datee2<currentdate)\r\n");
      out.write("     {\r\n");
      out.write("       alert(\"Sorry estimated end date can not be less then CurrentDate\");\r\n");
      out.write("       document.getElementById(\"edate\").value=\"\";\r\n");
      out.write("       return false;\r\n");
      out.write("     \r\n");
      out.write("     }\r\n");
      out.write(" \r\n");
      out.write(" else  if(datee2<datee2)\r\n");
      out.write("  {\r\n");
      out.write("      alert(\"sorry the estimated end date can not be less then estimated start date\");\r\n");
      out.write("      return false;\r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("       <td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"\" width=\"\" height=\"30\"><center><font color=\"blue\" size=\"6\"><b>Online Project </b></font><font color=\"blue\" size=\"6\"><b>Module Recording System</b></font></center></td>\r\n");
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
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"scripts/gen_validatorv31.js\"\r\n");
      out.write("\t\t\ttype=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" type=\"text/javascript\"\r\n");
      out.write("\t\t\tsrc=\"scripts/ts_picker.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript1.1\" src=\"scripts/pass.js\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"scripts/image.js\"> </script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"scripts/general.js\"> </script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"scripts/adi.js\"> </script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"scripts/form_validation.js\"> </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<center><h3><font color=\"#FF1493\"><b><i>Assign Projects To Teamlead's</b></font></h3></center>\r\n");
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
      out.write("\t<body>\r\n");
      out.write("\t\t<form action=\"./AssignProjToTls\" name=\"asigntask\" method=\"post\" onsubmit=\"return CompareDates2(this)\">\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\tSelect TeamLead\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"tlid\" id=\"select\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonchange=\"javascript:if(document.asigntask.tlid.value==''){alert('select Any TeamLead');}\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t--Select--\r\n");
      out.write("\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									try {
										CoreHash bCoreHash = new ProjectDetailsDao().listTeamLeads();
										Enumeration enu = bCoreHash.keys();
										String select = "";
										int tlid1 = 0;
										int tlid = 0;
										if (request.getParameter("tlid") != null) {
											tlid1 = Integer.parseInt(request.getParameter("tlid"));
											System.out.println("tlid code.... in jsp ...." + tlid1);
										}
										while (enu.hasMoreElements()) {
											tlid = Integer.parseInt(enu.nextElement().toString());
											System.out.println("proj code in jsp ...." + tlid);
											select = "";
											if (tlid == tlid1)
												select = "selected";
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(tlid);
      out.write('"');
      out.write(' ');
      out.print(select);
      out.write('>');
      out.print(bCoreHash.get(new Integer(tlid)));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
									} catch (Exception e) {
										LoggerManager.writeLogWarning(e);
									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\tSelectProjectToAssign\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"projid\" id=\"select\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonchange=\"javascript:if(document.asigntask.projid.value==''){alert('select Any Project');}}\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t--Select--\r\n");
      out.write("\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									try {
										CoreHash bCoreHash = new ProjectDetailsDao().listProjNames();
										Enumeration enu = bCoreHash.keys();
										String select = "";
										int projid1 = 0;
										int projid = 0;
										if (request.getParameter("projid") != null) {
											projid1 = Integer.parseInt(request.getParameter("projid"));
											System.out.println("projid1.... in jsp ...." + projid1);
										}
										while (enu.hasMoreElements()) {
											projid = Integer.parseInt(enu.nextElement().toString());
											System.out.println("projid in jsp ...." + projid);
											select = "";
											if (projid == projid1)
												select = "selected";
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(projid);
      out.write('"');
      out.write(' ');
      out.print(select);
      out.write('>');
      out.print(bCoreHash.get(new Integer(projid)));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
									} catch (Exception e) {
										LoggerManager.writeLogWarning(e);
									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\tMax No of Modules\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"nmodules\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\tExpected Start Date\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" readonly=\"readonly\" name=\"sdate\">\r\n");
      out.write("\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:show_calendar('document.asigntask.sdate', document.asigntask.sdate.value);\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/cal.gif\" alt=\"a\" width=\"18\" height=\"18\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"0\" />\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\tEstimated End Date\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" readonly=\"readonly\" name=\"edate\">\r\n");
      out.write("\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:show_calendar('document.asigntask.edate', document.asigntask.edate.value);\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/cal.gif\" alt=\"a\" width=\"18\" height=\"18\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"0\" />\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"assign\" value=\"Assign\">\r\n");
      out.write("\t\t\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"reset\" name=\"clear\" value=\"Clear\">\r\n");
      out.write("\t\t\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
