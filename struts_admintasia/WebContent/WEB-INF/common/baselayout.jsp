<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="myTitle" /></title>

<tiles:insertAttribute name="myScript" />
</head>
<body>
	<div id="page_wrapper">
		<div id="page-header">
			<div id="page-header-wrapper">
				<tiles:insertAttribute name="myHeader" />
				<tiles:insertAttribute name="myMenu" />
			</div>
		</div>
		<script type="text/javascript" src="js/ui/ui.tabs.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				// Tabs
				$('#tabs, #tabs2, #tabs5').tabs();
			});
		</script>

		<div id="sub-nav">
			<tiles:insertAttribute name="myNavTop" />
		</div>

		<div class="clear"></div>
		<div id="page-layout">
			<div id="page-content">
				<div id="page-content-wrapper">
					<tiles:insertAttribute name="myBody" />
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>

</body>
</html>