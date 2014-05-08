<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logins</title>
<s:head />
</head>
<body>
	<s:form action="login">
		<s:textfield name="username" value="" label="Username" />
		<s:password name="password" value="" label="Password" />
		<s:submit value="submit" />
	</s:form>
	Are you new user? Click
	<a href="register.jsp">here</a> to create new account.
</body>
</html>