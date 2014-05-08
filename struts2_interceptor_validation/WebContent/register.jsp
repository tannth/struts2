<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="registerAction" method="post">
		<s:textfield name="username" label="User Name" required="true" />
		<s:password name="password" label="Password" required="true" />
		<s:password name="confirm" label="Confirm Password" />
		<s:textfield name="lastname" label="Last Name" required="true" />
		<s:textfield name="emailID" label="Email" required="true" />
		<s:textfield name="phoneNo" label="Phone No. (e.g: 08.1234567)" />
		<s:submit value="Register" />
	</s:form>
</body>
</html>