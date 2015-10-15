<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Travels - Login</title>
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
<c:if test="${!empty SPRING_SECURITY_LAST_EXCEPTION}">
 <p class="error"><c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/></p>
 <c:remove scope="session" var="SPRING_SECURITY_LAST_EXCEPTION"/>
</c:if>

	<form:form action="j_spring_security_check" commandName="loginForm"
		name="loginForm" method="post" id="loginform">
		<table class="silver1pxBorder">
			<tr>
				<td class="black9ptBold" colspan="3">Please enter your UserName
					and Password below.</td>
			</tr>
			<tr>
				<td class="labelField"><label for="j_username">Username</label></td>
				<td><form:input name="j_username" type="text" id="j_username"
						class="" path="j_username" /></td>
				<td></td>
			</tr>
			<tr>
				<td class="labelField"><label for="password">Password</label></td>
				<td><form:password name="j_password" id="j_password" class=""
						path="j_password" /> <form:errors class="errorContainer" /></td>
			</tr>
			<tr>
				<td colspan="3" class="labelField"><input type="submit"
					class="" id="loginBtn" value="Login" /></td>
			</tr>
			<tr>
				<td class="labelField" colspan="3"><font color="Red" size="1pt">*UserName
						and Password are case sensitive.</font></td>
			</tr>
			<tr>
				<td class="labelField" colspan="3"><font color="Red" size="1pt">*Five
						unsuccessful login attempts will lock your account for 30 minutes.</font>
				</td>
			</tr>

		</table>
	</form:form>
</body>
</html>