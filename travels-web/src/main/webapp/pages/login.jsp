<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>IBP - Login</title>
<link href="css/libs/bootstrap.min.css" rel="stylesheet">
<link href="css/libs/bootstrap-select.min.css" rel="stylesheet">
<link href="css/secondary.css" rel="stylesheet">

<link href="css/custom.css" rel="stylesheet" type="text/css">
<link href="css/book.css" rel="stylesheet" type="text/css">
<link href="css/thickbox.css" rel="stylesheet" type="text/css">
<link href="css/body.css" rel="stylesheet" type="text/css">
<link href="css/text.css" rel="stylesheet" type="text/css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="js/jquery.validate.min.js" ></script>
<script type="text/javascript">
$(document).ready(function(){
    $("#loginform").validate({
		errorElement: 'span',
    rules :{
        "j_username" : {
            required : true
        },
		"j_password" : {
            required : true
        }
    },
    messages :{
        "j_username" : {
            required : 'Enter username'
        },
		"j_password" : {
            required : 'Enter password'
        }
    }
    });
});
</script>
</head>
<body>
	
                                                                <form:form action="j_spring_security_check" commandName="loginForm" name="loginForm" method="post" id="loginform">
                                                                    <table width="440" border="0" cellspacing="0" cellpadding="0" class="silver1pxBorder">
                                                                        <tr>
                                                                            <td class="black9ptBold" colspan="3">Please enter your UserName and Password below.</td>
                                                                        </tr>
                                                                        <tr>
																			<td class="labelField"><label for="j_username">Username</label></td>
																			<td ><form:input name="j_username" type="text" id="j_username" class="" path="j_username" /></td>
																			<td></td>
                                                                        </tr>
                                                                        <tr>
                                                                           <td class="labelField"><label for="password">Password</label></td>
																			<td ><form:password name="j_password" id="j_password" class="" path="j_password" />
																			<form:errors class="errorContainer" /></td>
<!-- 																			<td align="left" class="txtStyle">
                                                                                <a onclick="window.open('/MIL_OPS_Portal/com/matson/milops/security/ui/Login/userId.jsp','ResetPassword','height=450, width=550, top=200, left=200, toolbar=no, menubar=no, scrollbars=yes, resizable=no,location=n o, status=no');this.style.color='#954116';this.style.textDecoration='underline';this.onmouseout=''" style="color:blue; size:small" onmouseover="this.style.textDecoration='underline';this.style.cursor='pointer'" onmouseout="this.style.textDecoration='none'">Forgot Password?</a>
                                                                            </td>
 -->                                                                        </tr>
                                                                        <tr>
																		<td colspan="3" class="labelField">	<input type="submit" class="" id="loginBtn" value="Login"/></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td class="labelField" colspan="3">
                                                                                <font color="Red" size="1pt">*UserName and Password are case sensitive.</font>
                                                                            </td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td class="labelField" colspan="3">
                                                                                <font color="Red" size="1pt">*Five unsuccessful login attempts will lock your account for 30 minutes.</font>
                                                                            </td>
                                                                        </tr>

                                                                    </table>
                                                                </form:form>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-select.js"></script>
	<script src="js/selectpickers.js"></script>
</body>
</html>