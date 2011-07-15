<!doctype html>
<html>
	<head>
		<meta name="layout" content="main"/>
	</head>
	<body>
		<p>Core Contributors</p>
		<ul>
			<g:each var="c" in="${coreContributors}">
				<li><a target="_blank" href="https://github.com/${c.login}">${c.login}</a>: ${c.contributions}</li>
			</g:each>
		</ul>
		
		<p>Doc Contributors</p>
		<ul>
			<g:each var="c" in="${docContributors}">
				<li><a target="_blank" href="https://github.com/${c.login}">${c.login}</a>: ${c.contributions}</li>
			</g:each>
		</ul>
	</body>
</html>
