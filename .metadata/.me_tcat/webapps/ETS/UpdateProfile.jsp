<%@ page import="com.track.dae.dao.*,com.track.dae.model.*"%>

<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
	<head>
	
	</head>
	<script language="JavaScript" src="scripts/gen_validatorv31.js" type="text/javascript"></script>
<script language="JavaScript" type="text/javascript" src="scripts/ts_picker.js"></script>
<script language="JavaScript1.1" src="scripts/pass.js">


</script> <script type="text/javascript" src="scripts/image.js"> </script>
 <script type="text/javascript" src="scripts/general.js"> </script>
 <script type="text/javascript" src="scripts/adi.js"> </script>
 <script type="text/javascript" src="scripts/form_validation.js"> </script>

		<script language="JavaScript" src="images/javascripts.js"></script>
	
	<script language="JavaScript" src="images/pop-closeup.js"></script>
		<script language="JavaScript" src="images/gen_validatorv31.js"></script>


		<style type="text/css">
.Title {
	font-family: Verdana;
	font-weight: bold;
	font-size: 8pt
}

.Title1 {
	font-family: Verdana;
	font-weight: bold;
	font-size: 8pt
}
</style>


		<body>
			<form action="./updateAction" name="register">
				<%
					String name = request.getParameter("username");
					out.println("name" + name);
					String path = "";
					Profile aprofile = new ProfileDAO().getProfile(name, path);
					System.out.println();
				%>
				<input type='hidden' name='loginid'
					value=<%=request.getParameter("username")%> />
				<p>
				 <td width="" height="" valign="top"><img src="images/f.jpg" width="1200" height="200" /></td></td>
       <tr>
        <td><jsp:include page="AdminMenu.html"/></td>
        </tr>
					&nbsp;
				</p>
				<table>
					<tr>
						<td></td>
					</tr>
				</table>
				<p>
					&nbsp;
				</p>
				<%
					if (request.getParameter("status") != null) {
				%>
				<%=request.getParameter("status")%>
				<%
					}
				%>
				<table>
					<tr>
						<td border="1" bgcolor="white">

							<center>
								<span class=subHead><h3>
										Update Profile
									</h3> </span>
							</center>
							<p align="center">

								<table width="405" border="0" align="left">
									<th colspan=2>
										<span class=Title>1.Personal Details</span>
									</th>
									<tr></tr>
									<tr></tr>
									<tr>
										<td align="center">
											<span class=Title>First Name</span>
										</td>
										<td width="255">
											<input type="text" name="firstName"
												value="<%=aprofile.getFirstname()%>" type="text"
												STYLE="color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: tan;"
												size="18" maxlength="30" readonly />
										</td>
									</tr>
									<tr>
										<td align="center">
											<span class=Title>Last Name</span>
										</td>
										<td width="273">
											<font size="3" face="Verdana"> <input type="text"
													name="lastName" value="<%=aprofile.getLastname()%>"
													type="text"
													STYLE="color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: tan;"
													size="18" maxlength="30" readonly /> </font>
										</td>
									</tr>
									<tr>
										<td align="center">
											<span class=Title> Birth Date</span>
										</td>
										<td>
											<input type="text" name="dob"
												value="<%=aprofile.getBdate()%>" type="text"
												STYLE="color: #FFFFFF; font-family: Verdana; font-weight: bold; font-size: 12px; background-color: tan;"
												size="18" maxlength="30" readonly />
											<a
												href="javascript:show_calendar('document.register.dob', document.register.dob.value);">
										</td>
									</tr>
									<tr>
										<td align="center">
											<span class=Title>Browse Photo</span>
										</td>
										<td>
											<input type="file" name="photo" class="textfield"
												onChange="preview(this)" />
										</td>
									</tr>
									<tr>
										<td align="center">
											<span class=Title>Email</span>
										</td>
										<td>
											<input type="text" name="email"
												value="<%=aprofile.getEmail()%>" />
										</td>
									</tr>
									<tr>
										<td align="center">
											<span class=Title> Fax No</span>
										</td>
										<td>
											<input type="text" name="fax" value="<%=aprofile.getFax()%>"
												size="20" />
										</td>
									</tr>
									<th colspan="2">
										<span class=Title>2.Contact Details</span>
									</th>
									<tr></tr>
									<tr></tr>
									<tr>
										<td align="center">
											<span class=Title> AddressType :</span>
										</td>
										<td>
											<input type="text" name="addresstype"
												value="<%=aprofile.getHome()%>" size="20" />
										</td>
									</tr>
									<tr>
										<td align="center">
											<span class=Title> House No</span>
										</td>
										<td>
											<input type="text" name="houseNo"
												value="<%=aprofile.getHno()%>" size="20" />
										</td>
									</tr>
									<tr>
										<td align="center">
											<span class=Title>Street</span>
										</td>
										<td>
											<input type="text" name="street"
												value="<%=aprofile.getStreet()%>" size="20" />
										</td>
									</tr>
									<tr>
										<td align="center">
											<span class=Title>Phone No</span>
										</td>
										<td>
											<input type="text" name="phoneNo"
												value="<%=aprofile.getPhone()%>" size="20" />
										</td>
									</tr>
									<tr>
										<td></td>
										<td align="center">
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<input type="submit" name="createAccount" class="ygbtem"
												value="Update" />
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<input type="reset" name="cancel" value="Cancel" />
										</td>
									</tr>
								</table>
								<br />
								<br>
								<table width="403" border="0" align="center" height="167">
									<tr rowspan="7"></tr>
									<tr></tr>
									<tr></tr>
									<tr colspan="3">
										<td>
											<img alt="See Photo Here" id="previewField"
												src="images/Water lilies.jpg" height="150" width="120">
										</td>
									</tr>
								</table>
								<table width="403" border="0" align="center" height="126">
									<tr></tr>
									<tr></tr>
									<tr></tr>
									<tr></tr>
									<tr></tr>
									<tr></tr>
									<tr></tr>
									<tr></tr>
									<tr rowspan="2"></tr>
									<tr>
										<td width="120">
											<span class=Title>City</span>
										</td>
										<td width="273">
											<input type="text" name="city"
												value="<%=aprofile.getCity()%>" size="20" />
										</td>
									</tr>
									<tr>
										<td>
											<span class=Title> State</span>
										</td>
										<td>
											<input type="text" name="state"
												value="<%=aprofile.getState()%>" size="20" />
										</td>
									</tr>
									<tr>
										<td>
											<span class=Title> Country</span>
										</td>
										<td>
											<input type="text" name="country"
												value="<%=aprofile.getCountry()%>" size="20" />
										</td>
									</tr>
									<tr>
										<td>
											<span class=Title> Pin</span>
										</td>
										<td>
											<input type="text" name="pin" value="<%=aprofile.getPin()%>"
												size="20" />
										</td>
									</tr>
								</table>
						</td>
					</tr>
				</table>

				<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
var frmvalidator = new Validator("register");

frmvalidator.addValidation("firstName", "req", "Please enter your First Name");
frmvalidator.addValidation("firstName", "maxlen=20","Max length for FirstName is 20");
frmvalidator.addValidation("firstName", "alpha"," First Name Alphabetic chars only");

//frmvalidator.addValidation("lastName", "req", "Please enter your Last Name");
//frmvalidator.addValidation("lastName", "maxlen=20", "Max length is 20");
//frmvalidator.addValidation("lastName", "alpha"," Last Name Alphabetic chars only");

//frmvalidator.addValidation("dob", "req", "Please enter your DOB");

//frmvalidator.addValidation("photo", "req", "Please Load Your Photo");

//frmvalidator.addValidation("email", "maxlen=50");
//frmvalidator.addValidation("email", "req");
//frmvalidator.addValidation("email", "email");

frmvalidator.addValidation("addressType", "dontselect=0");

//frmvalidator.addValidation("houseNo", "req", "Please enter your House Number");

//frmvalidator.addValidation("street", "req", "Please enter your Street Number");
//frmvalidator.addValidation("street","maxlen=20","Max length is 20");
//frmvalidator.addValidation("street","alpha"," Street Alphabetic chars only");

//frmvalidator.addValidation("phoneNo", "req");
//frmvalidator.addValidation("phoneNo", "maxlen=50");
//frmvalidator.addValidation("phoneNo", "numeric");
//frmvalidator.addValidation("phoneNo", "Phone");

//frmvalidator.addValidation("city", "req", "Please enter your city Name");
//frmvalidator.addValidation("city","maxlen=20","Max length is 20");
//frmvalidator.addValidation("city","alpha"," City Alphabetic chars only");

//frmvalidator.addValidation("state", "req", "Please enter your State Name");
//frmvalidator.addValidation("state","maxlen=20","Max length is 20");
frmvalidator.addValidation("state","alpha"," State Alphabetic chars only");

frmvalidator.addValidation("country", "req", "Please enter your Country Name");
frmvalidator.addValidation("country","maxlen=20","Max length is 20");
frmvalidator.addValidation("country","alpha"," Country Alphabetic chars only");

frmvalidator.addValidation("pin", "req", "Please enter your pin Number");
frmvalidator.addValidation("pin","maxlen=10");
frmvalidator.addValidation("pin","numeric");
frmvalidator.addValidation("pin","Pin");

frmvalidator.addValidation("fax", "req", "Please enter Fax Number");
frmvalidator.addValidation("fax","maxlen=10");
frmvalidator.addValidation("fax","numeric");
frmvalidator.addValidation("fax","Fax");


frmvalidator.addValidation("fax", "age");
</script>
		</body>
</html>
