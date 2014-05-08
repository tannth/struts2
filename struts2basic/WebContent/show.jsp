<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
	<s:if test="#session.USER != ''">
	Hi, <font color="blue"><s:property value="%{#session.USER}" />
		</font>
		<h1>Result of Search</h1>
	The result of search with inputted name <s:property value="nameSearch" />
		<br />
		<table border="1">
			<thead>
				<tr>
					<th>No.</th>
					<th>Username</th>
					<th>Password</th>
					<th>Lastname</th>
					<th>isAdmin</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="list" status="listStatus">
					<tr>
						<td><s:property value="%{listStatus.count}" /></td>
						<td><s:property value="username" /></td>
						<td><s:property value="password" /></td>
						<td><s:property value="lastname" /></td>
						<td><s:property value="roles" /></td>
					</tr>
				</s:iterator>

			</tbody>
		</table>
	</s:if>
</body>
</html>