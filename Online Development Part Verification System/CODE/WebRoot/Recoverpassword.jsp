
<html>
<head>
	<script type="text/javascript">
function viewbydate(entered, alertbox)
{

with (entered)
{
if (value==null || value=="")
{if (alertbox!="") {alert(alertbox);} return false;}
else {return true;}
}
}

function formvalidation(thisform)
{
with (thisform)
{
if (viewbydate(taskid,"Please Select AnyDeveloper")==false) {did.focus(); return false;};
if (viewbydate(edate,"Please Select Date")==false) {edate.focus(); return false;};

}
}
</script>		
</head>

		<table align="center"  width="" border="0" cellspacing="0" cellpadding="0">
		
			<tr>
    <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td>
        <tr>
        <td><jsp:include page="GeneralOptions.html"/></td>
        </tr>
			<tr>
				<td colspan="" width="" height="30"><center><font color="blue" size="6"><b> Online Development </b></font><font color="blue" size="6"><b> Part Verification System</b></font></center></td>
			</tr>
			
		</table>
		
		<table align="center" border="0" width="999" style="width: 1024px; height: 348px;" height="">
			<tr>
				<td colspan="1" width="100%" height="350" valign="top">
				<br><br>
<html>
	<head>
		<style type="text/css">
.Title {
font-family:Verdana;
font-weight:bold;
font-size:8pt
}
.Title1 {font-family:Verdana;
font-weight:bold;
font-size:8pt
}
        </style>
	</head>
	<body>

	 <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
                      <br>
		<FORM action="./RecoverPasswordAction" method="post" name="register">
			<TABLE border="0" align="center" bgcolor="white" width=80%>

				<TR>
					<TD>
						<TABLE border="0" align="center">
                      <center><h3><strong>ForgotPassword Form </strong></h3></center>
							<TR>
								<TD align="right"></TD>
								<TD>
									<TABLE border="0" align="center">
										<TR>
											<TD><span class=Title>
												Login Name</span>
											</TD>
											<TD>
												<INPUT type="text" name="username">
											</TD>
										</TR>
										<TR>
											<TD><span class=Title>
												Secret Question</span>
											</TD>
											<TD><span class=Title>
												<select name="squest">
      <option value="select" selected="true"><font size="3" face="Verdana">--Select One---</font></option>
      <option value="What is your favorite pastime?"><font size="3" face="Verdana">What is your favorite pastime?</font></option>
      <option value="Who your childhood hero?"><font size="3" face="Verdana">Who your childhood hero?</font></option>
      <option value="What is the name of your first school?"><font size="3" face="Verdana">What is the name of your first school?</font></option>
      <option value="Where did you meet your spouse?"><font size="3" face="Verdana">Where did you meet your spouse?</font></option>
      <option value="What is your favorite sports team?"><font size="3" face="Verdana">What is your favorite sports team?</font></option>
      <option value="What is your father middle name?"><font size="3" face="Verdana">What is your father middle name?</font></option>
      <option value="What was your high school mascot?"><font size="3" face="Verdana">What was your high school mascot?</font></option>
      <option value="What make was your first car or bike?"><font size="3" face="Verdana">What make was your first car or bike?</font></option>
      <option value="What is your pet name?"><font size="3" face="Verdana">What is your pet name?</font></option>
    </select>
										</span>	</TD>
										</TR>
										<TR>
											<TD colspan="2"><span class=Title>
												<INPUT type="checkbox" name="ch" value="1" onClick="check()">
												Own Question</span>
											</TD>
										</TR>
										<TR>
											<TD><span class=Title>
												Own Question</span>
											</TD>
											<TD>
												<INPUT type="text" name="ownquest" disabled>
											</TD>
										</TR>
										<TR>
											<TD><span class=Title>
												Secret Answer</span>
											</TD>
											<TD>
												<INPUT name="sanswer" type="text">
											</TD>
										</TR>
										<TR>
											<TD colspan="2"><span class=Title>
												<DIV align="center">
													<INPUT name="Input" type="submit" value="Recover">
													&nbsp;
													<INPUT name="Input" type="reset" value="Clear">
												</DIV></span>
											</TD>
										</TR>
									</TABLE>
								</TD>
								<TD>&nbsp;
									
							  </TD>
							</TR>
						</TABLE>
					</TD>
				</TR>
			</TABLE>
		</FORM>
      
	</body>
</html>


</td></tr>
			<tr>
				<td colspan="2" width="900" height="20"><img src="images/images1.jpeg" height="20" width="999"/><br></td>
			</tr>
			</table>
</html>