package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\t<table align=\"center\"  width=\"\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("  <td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//w3c//dtd html 4.0 transitional//en\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
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
      out.write("\t\t<script language=\"JavaScript\" src=\"images/gen_validatorv31.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("//var x_win = window.self; \r\n");
      out.write("\r\n");
      out.write("function goOn() {\r\n");
      out.write("var port=document.register.port.value;\r\n");
      out.write("var host=document.register.host.value;\r\n");
      out.write("var userName=document.register.userName.value;\r\n");
      out.write("window.location.href='http://'+host+':'+port+'/ETS/ChekUserAction?userName='+userName;\r\n");
      out.write("\r\n");
      out.write("} \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
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
      out.write("\t\t<body>\r\n");
      out.write("\t\t   <h3><center><h3><font color=\"#FF1493\"><b><i>Employee Register Form </i></b></font></h3>\r\n");
      out.write("<form action=\"./RegisterEmployees\" method=\"post\" name=\"register\" onSubmit=\"return validate()\">\r\n");
      out.write(" <!--<table border=\"1\"><tr><td></td></tr></table>-->\r\n");
      out.write(" <input type=\"hidden\" name=\"port\" value=\"");
      out.print(request.getLocalPort() );
      out.write("\">\r\n");
      out.write(" <input type=\"hidden\" name=\"host\" value=\"");
      out.print(request.getServerName() );
      out.write("\">\r\n");
      out.write(" <br>\r\n");
      out.write(" ");
if(request.getParameter("status")!=null){ 
      out.write("\r\n");
      out.write("      ");
      out.print(request.getParameter("status") );
} 
      out.write("\r\n");
      out.write(" <table align=\"left\" width=70%>\r\n");
      out.write("<th colspan=\"6\" bgcolor=\"#FFFFCC\"><span class=Title>Account Details</span></th>\r\n");
      out.write("<tr></tr><tr></tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <td><pre><span class=Title>    User Name</span></pre></td>\r\n");
      out.write("    <td width=\"303\"><input type=\"text\" name=\"userName\" value=\"");
if(request.getParameter("userName")!=null)out.print(request.getParameter("userName")); 
      out.write("\" size=\"20\" onBlur=\"goOn()\"/>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=Title>");
if(request.getParameter("status1")!=null)                                       out.print(request.getParameter("status1"));    
      out.write("</span></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write(" <td><pre><span class=Title>    PassWord</span></pre></td>\r\n");
      out.write("  <td>\r\n");
      out.write("    \r\n");
      out.write("        <input type=\"password\" name=\"password\"  onkeyup=\"testPassword(document.forms.register.password.value);\" onChange=\"Encrypt(document.forms.register.password.value);\"></td></tr>\r\n");
      out.write("        <tr><td></td><!--<td>\r\n");
      out.write("        \r\n");
      out.write("     <span class=Title><a id=\"Words\"> Strength:</a></td>\r\n");
      out.write("      <td><table cellpadding=0 cellspacing=0><tr><td height=15  bgcolor=#dddddd></td></tr></table></td>\r\n");
      out.write("--></tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><pre><span class=Title>    Confirm</span><pre></td>\r\n");
      out.write("    <td><input type=\"password\" name=\"conformpassword\" value=\"\" size=\"20\" onBlur=\"checkconformpassword()\"/></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<td><pre><span class=Title>Login Type</span></pre></td>\r\n");
      out.write("         <td>\r\n");
      out.write("         <select name=\"logintype\">\r\n");
      out.write("         <option>---Select---</option>\r\n");
      out.write("         <option value=\"teamlead\">TeamLead</option>\r\n");
      out.write("         <option value=\"developer\">Developer</option>\r\n");
      out.write("             <option value=\"client\">Client</option>\r\n");
      out.write("         </select>\r\n");
      out.write("         </td>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><pre><span class=Title>    SecurityQuestion</span></pre></td>\r\n");
      out.write("    <td><select name=\"squest\">\r\n");
      out.write("      <option value=\"select\" selected=\"true\"><font size=\"3\" face=\"Verdana\">--Select One---</font></option>\r\n");
      out.write("      <option value=\"What is your favorite pastime?\"><font size=\"3\" face=\"Verdana\">What is your favorite pastime?</font></option>\r\n");
      out.write("      <option value=\"Who your childhood hero?\"><font size=\"3\" face=\"Verdana\">Who your childhood hero?</font></option>\r\n");
      out.write("      <option value=\"What is the name of your first school?\"><font size=\"3\" face=\"Verdana\">What is the name of your first school?</font></option>\r\n");
      out.write("      <option value=\"Where did you meet your spouse?\"><font size=\"3\" face=\"Verdana\">Where did you meet your spouse?</font></option>\r\n");
      out.write("      <option value=\"What is your favorite sports team?\"><font size=\"3\" face=\"Verdana\">What is your favorite sports team?</font></option>\r\n");
      out.write("      <option value=\"What is your father middle name?\"><font size=\"3\" face=\"Verdana\">What is your father middle name?</font></option>\r\n");
      out.write("      <option value=\"What was your high school mascot?\"><font size=\"3\" face=\"Verdana\">What was your high school mascot?</font></option>\r\n");
      out.write("      <option value=\"What make was your first car or bike?\"><font size=\"3\" face=\"Verdana\">What make was your first car or bike?</font></option>\r\n");
      out.write("      <option value=\"What is your pet name?\"><font size=\"3\" face=\"Verdana\">What is your pet name?</font></option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("</tr>\r\n");
      out.write(" <!--<tr>\r\n");
      out.write("    <td colspan=\"2\"> <pre> <input type=\"checkbox\" name=\"ch\" value=\"1\" onClick=\"check(register)\" /><span class=Title>Own Question</span></pre></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><span class=\"style3\"><font size=\"3\" face=\"verdana\"></font></span></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"ownquest\" disabled=\"disabled\" size=\"37\"/>    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("--><tr>\r\n");
      out.write("    <td><pre><span class=Title>    Security Answer</span></pre></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"secrete\" value=\"\" size=\"20\"/></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr></tr><tr></tr>\r\n");
      out.write("  <th colspan=\"6\" bgcolor=\"#FFFFCC\"><span class=Title>Personal Details</span>  </th>\r\n");
      out.write("  <tr></tr><tr></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><pre><span class=Title>    First Name</span></pre></td>\r\n");
      out.write("    <td width=\"276\"><input type=\"text\" name=\"firstName\" value=\"\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td width=\"139\"><pre><span class=Title>    Last Name</span></pre></td>\r\n");
      out.write("    <td width=\"276\">\r\n");
      out.write("      <input type=\"text\" name=\"lastName\" value=\"\" size=\"20\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><pre><span class=Title> Birth Date</span></pre></td>\r\n");
      out.write("    <td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"dob\" value=\"\" size=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\treadonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:show_calendar('document.register.dob', document.register.dob.value);\"> <img src=\"");
      out.print(request.getContextPath()+"/images/cal.gif");
      out.write("\" alt=\"a\" width=\"18\" height=\"18\" border=\"0\"/></a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("  </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td><pre><span class=Title>    Browse Photo</span></pre></td>\r\n");
      out.write("    <td><input type=\"file\" name=\"photo\" class=\"textfield\" onChange=\"preview(this)\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr></tr><tr></tr>\r\n");
      out.write("<th colspan=\"6\" bgcolor=\"#FFFFCC\"><center><span class=Title>Contact Details</span>\r\n");
      out.write("</center></th>\r\n");
      out.write("<tr></tr><tr></tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><pre><span class=Title>    Address Type </span></pre></td>\r\n");
      out.write("    <td width=\"276\"><select name=\"addressType\" onChange=\"cleartext()\">\r\n");
      out.write("    <option value=\"select\" selected=\"true\"><font size=\"3\" face=\"Verdana\">Select </font></option>\r\n");
      out.write("    <option value=\"home\"><font size=\"3\" face=\"Verdana\">Home</font></option>\r\n");
      out.write("    <option value=\"office\"><font size=\"3\" face=\"Verdana\">Office</font></option>\r\n");
      out.write("    <option value=\"personal\"><font size=\"3\" face=\"Verdana\">Personal</font></option>\r\n");
      out.write("      </select></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><pre><span class=Title>    House No</span></pre></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"houseNo\" value=\"\" size=\"20\"/></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><pre><span class=Title>    Street</span></pre></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"street\" value=\"\" size=\"20\"/></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><pre><span class=Title>    Phone Type</span></pre></td>\r\n");
      out.write("    <td><select name=\"phoneType\">\r\n");
      out.write("        <option value=\"select\" selected=\"true\"><font size=\"3\" face=\"Verdana\">Select</font></option>\r\n");
      out.write("        <option value=\"home\"><font size=\"3\" face=\"Verdana\">Home</font></option>\r\n");
      out.write("        <option value=\"office\"><font size=\"3\" face=\"Verdana\">Office</font></option>\r\n");
      out.write("        <option value=\"mobile\"><font size=\"3\" face=\"Verdana\">Mobile</font></option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td><pre><span class=Title>    Phone No</span></pre></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"phoneNo\" value=\"\" size=\"20\" onBlur=\"ValidateForm()\"/></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<th colspan=\"5\">&nbsp;</th>\r\n");
      out.write("<tr></tr><tr></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td></td>\r\n");
      out.write("    <td align=\"center\"><font size=\"3\" face=\"Verdana\">\r\n");
      out.write("    <pre>                   <input type=\"submit\" name=\"register\" value=\"Register\"/>&nbsp;  <input type=\"reset\" name=\"cancel\" value=\"Cancel\"/>\r\n");
      out.write("   </pre> </font></td>\r\n");
      out.write("    <td align=\"center\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write(" <p><br/>\r\n");
      out.write("     <br/>\r\n");
      out.write("   <br/>\r\n");
      out.write("   </p>\r\n");
      out.write(" <p>&nbsp;</p>\r\n");
      out.write(" <p>&nbsp;</p>\r\n");
      out.write(" <p>&nbsp;</p>\r\n");
      out.write(" <p><br/>\r\n");
      out.write("      </p>\r\n");
      out.write(" <table border=\"0\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <img alt=\"See Photo Here\" id=\"previewField\" src=\"images/red rose 1.jpg\" height=\"150\" width=\"120\">\r\n");
      out.write(" </tr></table><table  border=\"0\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td><pre><span class=Title>    Gender</span></pre></td>\r\n");
      out.write("    <td><select name=\"gender\">\r\n");
      out.write("    <option value=\"select\" selected=\"true\"><font size=\"3\" face=\"Verdana\">Select </font></option>\r\n");
      out.write("    <option value=\"Male\"><font size=\"3\" face=\"Verdana\">Male</font></option>\r\n");
      out.write("    <option value=\"Female\"><font size=\"3\" face=\"Verdana\">Female</font></option>\r\n");
      out.write("    </select>\r\n");
      out.write("    </td>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td><pre><span class=Title>    Email</span></pre></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"email\" value=\"\" size=\"20\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><pre><span class=Title>    Fax No</span></td>\r\n");
      out.write("    <td><input type=\"text\" name=\"fax\" value=\"\" size=\"20\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\r\n");
      out.write("  <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\r\n");
      out.write("  <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\r\n");
      out.write("  <tr rowspan=\"2\"></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"120\"><pre><span class=Title>   City</span></pre></td>\r\n");
      out.write("    <td width=\"273\">\r\n");
      out.write("      <input type=\"text\" name=\"city\" value=\"\" size=\"20\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><pre><span class=Title>   State</span></pre></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input type=\"text\" name=\"state\" value=\"\" size=\"20\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><pre><span class=Title>   Country</span></pre></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input type=\"text\" name=\"country\" value=\"\" size=\"20\"/>\r\n");
      out.write("   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><pre><span class=Title>   Pin</span></pre></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input type=\"text\" name=\"pin\" value=\"\" size=\"20\" onChange=\"showStatus()\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("<input type=\"hidden\" name=\"homeaddresstype\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"homehouseno\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"homestreet\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"homephonetype\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"homecountry\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"homepin\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"homestate\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"homephoneno\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"homecity\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <input type=\"hidden\" name=\"officeaddresstype\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"officehouseno\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"officestreet\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"officephonetype\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"officecountry\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"officepin\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"officestate\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"officephoneno\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"officecity\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"personaladdresstype\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"personalhouseno\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"personalstreet\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"personalphonetype\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"personalcountry\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"personalpin\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"personalstate\" value=\"\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"personalphoneno\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"personalcity\"/>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("  var frmvalidator  = new Validator(\"register\");\r\n");
      out.write("  \r\n");
      out.write("  frmvalidator.addValidation(\"userName\",\"req\",\"Please enter your Username\");\r\n");
      out.write("  frmvalidator.addValidation(\"password\",\"req\",\"Please enter your Password\");\r\n");
      out.write("  frmvalidator.addValidation(\"conformpassword\",\"req\",\"Please enter your Confirm Password\");\r\n");
      out.write("  \r\n");
      out.write("  frmvalidator.addValidation(\"logintype\",\"dontselect=0\");\r\n");
      out.write("  \r\n");
      out.write("  frmvalidator.addValidation(\"squest\",\"dontselect=0\");\r\n");
      out.write("  frmvalidator.addValidation(\"secrete\",\"req\",\"Please enter your Answer\");\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  frmvalidator.addValidation(\"firstName\",\"req\",\"Please enter your First Name\");\r\n");
      out.write("  frmvalidator.addValidation(\"firstName\",\"maxlen=20\",\t\"Max length for FirstName is 20\");\r\n");
      out.write("  frmvalidator.addValidation(\"firstName\",\"alpha\",\" First Name Alphabetic chars only\");\r\n");
      out.write("  \r\n");
      out.write("  frmvalidator.addValidation(\"lastName\",\"req\",\"Please enter your Last Name\");\r\n");
      out.write("  frmvalidator.addValidation(\"lastName\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("  frmvalidator.addValidation(\"lastName\",\"alpha\",\" Last Name Alphabetic chars only\");\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("   frmvalidator.addValidation(\"dob\",\"req\",\"Please enter your DOB\"); \r\n");
      out.write("   frmvalidator.addValidation(\"photo\",\"req\",\"Please Load Your Photo\"); \r\n");
      out.write("   \r\n");
      out.write("   frmvalidator.addValidation(\"gender\",\"dontselect=0\");\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  frmvalidator.addValidation(\"email\",\"maxlen=50\");\r\n");
      out.write("  frmvalidator.addValidation(\"email\",\"req\");\r\n");
      out.write("  frmvalidator.addValidation(\"email\",\"email\");\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("   frmvalidator.addValidation(\"addressType\",\"dontselect=0\");\r\n");
      out.write("   \r\n");
      out.write("   frmvalidator.addValidation(\"houseNo\",\"req\",\"Please enter your House Number\");\r\n");
      out.write("   \r\n");
      out.write("   frmvalidator.addValidation(\"street\",\"req\",\"Please enter your Street \");\r\n");
      out.write("   frmvalidator.addValidation(\"street\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("   frmvalidator.addValidation(\"street\",\"alpha\",\" Street Alphabetic chars only\");\r\n");
      out.write("   \r\n");
      out.write("     frmvalidator.addValidation(\"phoneType\",\"dontselect=0\");\r\n");
      out.write("   frmvalidator.addValidation(\"phoneNo\",\"req\");\r\n");
      out.write("  \r\n");
      out.write("  frmvalidator.addValidation(\"phoneNo\",\"maxlen=50\");\r\n");
      out.write("  frmvalidator.addValidation(\"phoneNo\",\"numeric\");\r\n");
      out.write(" frmvalidator.addValidation(\"phoneNo\",\"Phone\");\r\n");
      out.write("   \r\n");
      out.write("   frmvalidator.addValidation(\"city\",\"req\",\"Please enter your city Name\");\r\n");
      out.write("   frmvalidator.addValidation(\"city\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("   frmvalidator.addValidation(\"city\",\"alpha\",\" City Alphabetic chars only\");\r\n");
      out.write("   \r\n");
      out.write("   frmvalidator.addValidation(\"state\",\"req\",\"Please enter your State Name\");\r\n");
      out.write("   frmvalidator.addValidation(\"state\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("   frmvalidator.addValidation(\"state\",\"alpha\",\" State Alphabetic chars only\");\r\n");
      out.write("   \r\n");
      out.write("   frmvalidator.addValidation(\"country\",\"req\",\"Please enter your Country Name\");\r\n");
      out.write("   frmvalidator.addValidation(\"country\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("   frmvalidator.addValidation(\"country\",\"alpha\",\" Country Alphabetic chars only\");\r\n");
      out.write("   \r\n");
      out.write("   frmvalidator.addValidation(\"pin\",\"req\",\"Please enter your pin Number\");\r\n");
      out.write("   frmvalidator.addValidation(\"pin\",\"maxlen=10\");\r\n");
      out.write("   frmvalidator.addValidation(\"pin\",\"numeric\");\r\n");
      out.write("  frmvalidator.addValidation(\"pin\",\"Pin\");\r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("   frmvalidator.addValidation(\"fax\",\"req\",\"Please enter Fax Number\");\r\n");
      out.write("   frmvalidator.addValidation(\"fax\",\"maxlen=10\");\r\n");
      out.write("   frmvalidator.addValidation(\"fax\",\"numeric\");\r\n");
      out.write("  frmvalidator.addValidation(\"fax\",\"Fax\");\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write(" </script>\r\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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