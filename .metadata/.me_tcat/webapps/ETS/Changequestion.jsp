<%if(session.getAttribute("user")==null){%>
<jsp:forward page="/LogoutAction"></jsp:forward>
<%} %>

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
        <script type="text/javascript">
function emptyvalidation(entered, alertbox)
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
if (register(password,"Please Enter Password")==false) {password.focus(); return false;};
if (register(sanswer,"Please Enter Security Answer")==false) {sanswer.focus(); return false;};
}
}
</script>
	</head>
	<body>
		
    <center><span class=Title><h3>ChangeQuestion Form  </h3></span></center>
    <% if(request.getParameter("status")!=null)
					  {%>
                           <strong><%=request.getParameter("status")%></strong>
                      <%}%>
      
    <form action="./ChangequestionAction" method="post" name="register" onsubmit="return formvalidation(this)"> 
                    <table width="200" border="0" align="center">
                      <tr>
                        <td><table width="380px" border="0" align="center">
                              <tr>
                                <td width="101"><span class=Title>Login Name </span></td>
                                <td width="269">
                                  <input type="text" name="username" value="<%=session.getAttribute("user")%>" readonly />                                </td>
                              </tr>
                              <tr>
                                <td ><span class=Title>Password </span></td>
                                <td>
                                  <input type="password" name="password">                                </td>
                              </tr>
                              <tr>
    <td><span class=Title> SecurityQuestion</span></td>
    <td><select name="squest">
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
    </select></td>
</tr>
 <tr>
    <td colspan="2">
         <input type="checkbox" name="ch" value="1" onClick="check(register)" />
     <span class=Title>Own Question </span></td>
  </tr>
  <tr>
    <td><span class=Title>Own Question</span></td>
    <td><input type="text" name="ownquest" disabled="disabled" size="37"/>    </td>
  </tr>
<tr>
    <td><span class=Title> Security Answer</span></td>
    <td><INPUT name="sanswer" type="text"></td>
</tr>


                              <tr>
                                <td colspan="2"><div align="center"><strong>
                                <input name="Input" type="submit" value="Change">
                                </strong></div>
                                    <div align="center"></div></td>
                              </tr>
                            </table></td>
                            </tr>
                          
                        </table>
                    </form>
  