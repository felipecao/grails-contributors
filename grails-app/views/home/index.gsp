<!doctype html>
<html>
	<head>
		<meta name="layout" content="main"/>
	</head>
	<body>
		<div id="leftCol">
		<h1>Grails-Core</h1>
        <g:link action="commits">Commits</g:link>
		<ul>
			<g:each var="c" in="${coreContributors}">
				<li><a target="_blank" href="https://github.com/${c.login}">${c.login}</a>: ${c.contributions}</li>
			</g:each>
		</ul>
		</div>
		<div id="rightCol">
		<h1>Grails-Doc</h1>
		<ul>
			<g:each var="c" in="${docContributors}">
				<li><a target="_blank" href="https://github.com/${c.login}">${c.login}</a>: ${c.contributions}</li>
			</g:each>
		</ul>
		</div>
	</body>
</html>
