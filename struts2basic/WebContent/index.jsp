<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<s:form method="post" action="login">
		<s:textfield name="username" label="label.username" />
		<s:textfield name="password" label="label.password" />
		<s:submit value="label.login" />
	</s:form>
</body>
</html>