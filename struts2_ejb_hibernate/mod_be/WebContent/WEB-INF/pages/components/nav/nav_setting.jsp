<%@taglib prefix="s" uri="/struts-tags"%>
<div class="welcome">
	<span class="note">Welcome, <a href="#" title="Welcome, <s:property value='%{#session.USER}'/>"
		><s:property
				value="%{#session.account.username}" /></a></span> <a
		class="btn ui-state-default ui-corner-all" href="#"> <span
		class="ui-icon ui-icon-wrench"></span> Settings
	</a> <a class="btn ui-state-default ui-corner-all" href="#"> <span
		class="ui-icon ui-icon-person"></span> My account
	</a>
	<s:a action="logout" cssClass="btn ui-state-default ui-corner-all">
		<span class="ui-icon ui-icon-power"></span> Logout</s:a>
</div>
