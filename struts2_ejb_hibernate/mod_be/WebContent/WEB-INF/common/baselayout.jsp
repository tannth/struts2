<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="myTitle" /></title>
<tiles:insertAttribute name="myScript" />
<sx:head />
</head>

<body>
	<div id="page_wrapper">
		<div id="page-header">
			<div id="page-header-wrapper">
				<div id="top">
					<tiles:insertAttribute name="myLogo" />
					<tiles:insertAttribute name="myNavSetting" />
				</div>
				<tiles:insertAttribute name="myMenu" />
			</div>
		</div>

		<div id="sub-nav">

			<tiles:insertAttribute name="myNavTop" />
		</div>

		<div class="clear"></div>
		<div id="page-layout">
			<div id="page-content">
				<div id="page-content-wrapper">
					<tiles:insertAttribute name="myBody" />
					<tiles:insertAttribute name="mySidebar" />
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</div>

		<div class="clear"></div>
		<div id="footer">
			<tiles:insertAttribute name="myFooter" />
		</div>
		<div id="copyright">
			Powered by <a href="http://www.admintasia.com"
				title="Powerful admin UI template">Admintasia.com</a>
		</div>
	</div>
</body>
</html>