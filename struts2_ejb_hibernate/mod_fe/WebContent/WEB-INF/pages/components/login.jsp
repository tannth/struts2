<%@taglib prefix="s" uri="/struts-tags"%>
<head>
<link href="css/ui/ui.login.css" rel="stylesheet" media="all" />
<script type="text/javascript" src="js/ui/ui.tabs.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// Tabs
		$('#tabs, #tabs2').tabs();
	});
</script>

</head>
<div id="tabs">
	<ul>

		<li><a href="#login">Login</a></li>
		<li><a href="#tabs-2">Recover password</a></li>
	</ul>
	<div id="login">
		
		<s:form action="login" method="post">
			<ul>
				<li>
					<div>
						<label for="username" class="desc"> Username: </label>
						<s:textfield name="username" tabindex="1"
							cssClass="field text full"/>
					</div>
				</li>
				<li>
					<div>
						<label for="password" class="desc"> Password: </label>
						<s:password name="password" tabindex="1"
							cssClass="field text full" />
					</div>
				</li>
				<li class="buttons">
					<div>
						<s:submit
							cssClass="ui-state-default ui-corner-all float-right ui-button"
							key="global_submit_login" />
					</div>
				</li>
			</ul>
		</s:form>
	</div>
	<div id="tabs-2">
		<form action="welcomeLink.action">
			<ul>
				<li><label for="email" class="desc"> Email:
				</label>
					<div>
						<input type="text" tabindex="1" maxlength="255" value=""
							class="field text full" name="email" id="email" />
					</div></li>
				<li class="buttons">
					<div>
						<button
							class="ui-state-default ui-corner-all float-right ui-button"
							type="submit">Send new password</button>
					</div>
				</li>
			</ul>
		</form>
	</div>
</div>