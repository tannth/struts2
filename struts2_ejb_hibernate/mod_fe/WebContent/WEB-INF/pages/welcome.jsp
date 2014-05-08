<%@taglib prefix="s" uri="/struts-tags" %>

<s:if test="#session.USER != ''">
	Welcome, <font color="bule"> <s:property value="%{#session.USER}" />
		</font>
	</s:if>