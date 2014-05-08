<head>
<link href="css/ui/ui.login.css" rel="stylesheet" media="all" />
</head>
<div id="tabs">
	<ul>

		<li><a href="#login">Login</a></li>
		<li><a href="#tabs-2">Register</a></li>
		<li><a href="#tabs-3">Recover password</a></li>
	</ul>
	<div id="login">
		<div class="response-msg success ui-corner-all">
			<span>Success message</span> Lorem ipsum dolor sit amet, consectetuer
			adipiscing elit
		</div>
		<form action="welcomeLink.action">
			<ul>
				<li><label for="email" class="desc"> Email: </label>
					<div>
						<input type="text" tabindex="1" maxlength="255" value=""
							class="field text full" name="email" id="email" />
					</div></li>
				<li><label for="password" class="desc"> Password: </label>

					<div>
						<input type="text" tabindex="1" maxlength="255" value=""
							class="field text full" name="password" id="password" />
					</div></li>
				<li class="buttons">
					<div>
						<button
							class="ui-state-default ui-corner-all float-right ui-button"
							type="submit">Go to dashboard</button>
					</div>
				</li>
			</ul>
		</form>
	</div>
	<div id="tabs-2">
		<div class="other-box gray-box ui-corner-all">
			<div class="cont ui-corner-all tooltip" title="Example tooltip!">
				<h3>Example information message</h3>
				<p>Sed ut perspiciatis unde omnis iste natus error sit
					voluptatem accusantium doloremque laudantium.</p>
			</div>
		</div>
		<p>You can put a register form here.</p>
	</div>
	<div id="tabs-3">
		<form action="welcomeLink.action">
			<ul>
				<li><label for="email" class="desc"> Registered Email:
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