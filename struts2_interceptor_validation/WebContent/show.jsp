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
	<h1>
		The result of search with inputted name:
		<s:property value="nameSearch" />
	</h1>

	<table border="1">
		<thead>
			<tr>
				<th>No.</th>
				<th>Username</th>
				<th>Password</th>
				<th>Lastname</th>
				<th>isAdmin</th>
			</tr>
			<s:iterator value="list" status="listStatus">
				<tr>
					<s:form action="updateAction" theme="simple">
						<td><s:property value="%{#listStatus.count}" /></td>
						<td><s:property value="username" /></td>
						<td><s:password name="password" value="%{password}"
								showPassword="true" /></td>
						<td><s:property value="lastname" /></td>
						<td><s:checkbox name="roles" value="%{roles}" /></td>
						<s:url id="delete" action="deleteAction">
							<s:param name="username" value="username" />
							<s:param name="nameSearch" value="nameSearch" />
						</s:url>
						<td><s:a href="%{delete}">Delete</s:a></td>
						<td><s:hidden name="username" value="%{username}" /> <s:hidden
								name="nameSearch" value="%{nameSearch}" /> <s:submit
								value="Update" /></td>
					</s:form>
				</tr>
			</s:iterator>
		</thead>

	</table>
</body>
</html>