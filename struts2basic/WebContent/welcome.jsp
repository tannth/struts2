<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<s:if test="#session.USER != ''">
	hi, <font color="bule"> <s:property value="%{#session.USER}" />
		</font>
	</s:if>
	<h2>Welcome to Strut2 Basic</h2>
	<s:form action="searchLikeLastName">
		<s:textfield name="nameSearch" label="Name" />
		<s:submit value="Search" />
	</s:form>
</body>
</html>