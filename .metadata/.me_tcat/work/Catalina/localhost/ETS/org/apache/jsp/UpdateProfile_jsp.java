package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.track.dae.dao.*;
import com.track.dae.model.*;

public final class UpdateProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//w3c//dtd html 4.0 transitional//en\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<script language=\"JavaScript\" src=\"scripts/gen_validatorv31.js\" type=\"text/javascript\"></script>\r\n");
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
      out.write("\t\r\n");
      out.write("\t<script language=\"JavaScript\" src=\"images/pop-closeup.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"images/gen_validatorv31.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write(".Title {\r\n");
      out.write("\tfont-family: Verdana;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 8pt\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".Title1 {\r\n");
      out.write("\tfont-family: Verdana;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 8pt\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<body>\r\n");
      out.write("\t\t\t<form action=\"./updateAction\" name=\"register\">\r\n");
      out.write("\t\t\t\t");

					String name = request.getParameter("username");
					out.println("name" + name);
					String path = "";
					Profile aprofile = new ProfileDAO().getProfile(name, path);
					System.out.println();
				
      out.write("\r\n");
      out.write("\t\t\t\t<input type='hidden' name='loginid'\r\n");
      out.write("\t\t\t\t\tvalue=");
      out.print(request.getParameter("username"));
      out.write(" />\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t <td width=\"\" height=\"\" valign=\"top\"><img src=\"images/f.jpg\" width=\"1200\" height=\"200\" /></td></td>\r\n");
      out.write("       <tr>\r\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminMenu.html", out, false);
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t");

					if (request.getParameter("status") != null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print(request.getParameter("status"));
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td border=\"1\" bgcolor=\"white\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=subHead><h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tUpdate Profile\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h3> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"405\" border=\"0\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=Title>1.Personal Details</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title>First Name</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"255\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"firstName\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getFirstname());
      out.write("\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tSTYLE=\"color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: tan;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsize=\"18\" maxlength=\"30\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title>Last Name</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"273\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\"> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"lastName\" value=\"");
      out.print(aprofile.getLastname());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tSTYLE=\"color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: tan;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsize=\"18\" maxlength=\"30\" readonly /> </font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title> Birth Date</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"dob\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getBdate());
      out.write("\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tSTYLE=\"color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: tan;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsize=\"18\" maxlength=\"30\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:show_calendar('document.register.dob', document.register.dob.value);\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title>Browse Photo</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"photo\" class=\"textfield\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonChange=\"preview(this)\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title>Email</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getEmail());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title> Fax No</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"fax\" value=\"");
      out.print(aprofile.getFax());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsize=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=Title>2.Contact Details</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title> AddressType :</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"addresstype\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getHome());
      out.write("\" size=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title> House No</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"houseNo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getHno());
      out.write("\" size=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title>Street</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"street\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getStreet());
      out.write("\" size=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title>Phone No</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phoneNo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getPhone());
      out.write("\" size=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"createAccount\" class=\"ygbtem\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"Update\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" name=\"cancel\" value=\"Cancel\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"403\" border=\"0\" align=\"center\" height=\"167\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr rowspan=\"7\"></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img alt=\"See Photo Here\" id=\"previewField\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"images/Water lilies.jpg\" height=\"150\" width=\"120\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"403\" border=\"0\" align=\"center\" height=\"126\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr rowspan=\"2\"></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"120\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title>City</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"273\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"city\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getCity());
      out.write("\" size=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title> State</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"state\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getState());
      out.write("\" size=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title> Country</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"country\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(aprofile.getCountry());
      out.write("\" size=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=Title> Pin</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"pin\" value=\"");
      out.print(aprofile.getPin());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsize=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("var frmvalidator = new Validator(\"register\");\r\n");
      out.write("\r\n");
      out.write("frmvalidator.addValidation(\"firstName\", \"req\", \"Please enter your First Name\");\r\n");
      out.write("frmvalidator.addValidation(\"firstName\", \"maxlen=20\",\"Max length for FirstName is 20\");\r\n");
      out.write("frmvalidator.addValidation(\"firstName\", \"alpha\",\" First Name Alphabetic chars only\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"lastName\", \"req\", \"Please enter your Last Name\");\r\n");
      out.write("//frmvalidator.addValidation(\"lastName\", \"maxlen=20\", \"Max length is 20\");\r\n");
      out.write("//frmvalidator.addValidation(\"lastName\", \"alpha\",\" Last Name Alphabetic chars only\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"dob\", \"req\", \"Please enter your DOB\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"photo\", \"req\", \"Please Load Your Photo\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"email\", \"maxlen=50\");\r\n");
      out.write("//frmvalidator.addValidation(\"email\", \"req\");\r\n");
      out.write("//frmvalidator.addValidation(\"email\", \"email\");\r\n");
      out.write("\r\n");
      out.write("frmvalidator.addValidation(\"addressType\", \"dontselect=0\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"houseNo\", \"req\", \"Please enter your House Number\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"street\", \"req\", \"Please enter your Street Number\");\r\n");
      out.write("//frmvalidator.addValidation(\"street\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("//frmvalidator.addValidation(\"street\",\"alpha\",\" Street Alphabetic chars only\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"phoneNo\", \"req\");\r\n");
      out.write("//frmvalidator.addValidation(\"phoneNo\", \"maxlen=50\");\r\n");
      out.write("//frmvalidator.addValidation(\"phoneNo\", \"numeric\");\r\n");
      out.write("//frmvalidator.addValidation(\"phoneNo\", \"Phone\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"city\", \"req\", \"Please enter your city Name\");\r\n");
      out.write("//frmvalidator.addValidation(\"city\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("//frmvalidator.addValidation(\"city\",\"alpha\",\" City Alphabetic chars only\");\r\n");
      out.write("\r\n");
      out.write("//frmvalidator.addValidation(\"state\", \"req\", \"Please enter your State Name\");\r\n");
      out.write("//frmvalidator.addValidation(\"state\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("frmvalidator.addValidation(\"state\",\"alpha\",\" State Alphabetic chars only\");\r\n");
      out.write("\r\n");
      out.write("frmvalidator.addValidation(\"country\", \"req\", \"Please enter your Country Name\");\r\n");
      out.write("frmvalidator.addValidation(\"country\",\"maxlen=20\",\"Max length is 20\");\r\n");
      out.write("frmvalidator.addValidation(\"country\",\"alpha\",\" Country Alphabetic chars only\");\r\n");
      out.write("\r\n");
      out.write("frmvalidator.addValidation(\"pin\", \"req\", \"Please enter your pin Number\");\r\n");
      out.write("frmvalidator.addValidation(\"pin\",\"maxlen=10\");\r\n");
      out.write("frmvalidator.addValidation(\"pin\",\"numeric\");\r\n");
      out.write("frmvalidator.addValidation(\"pin\",\"Pin\");\r\n");
      out.write("\r\n");
      out.write("frmvalidator.addValidation(\"fax\", \"req\", \"Please enter Fax Number\");\r\n");
      out.write("frmvalidator.addValidation(\"fax\",\"maxlen=10\");\r\n");
      out.write("frmvalidator.addValidation(\"fax\",\"numeric\");\r\n");
      out.write("frmvalidator.addValidation(\"fax\",\"Fax\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("frmvalidator.addValidation(\"fax\", \"age\");\r\n");
      out.write("</script>\r\n");
      out.write("\t\t</body>\r\n");
      out.write("</html>\r\n");
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