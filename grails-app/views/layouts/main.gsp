<!doctype html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>Grails Contributors</title>
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		<g:layoutHead/>
	</head>
	<body>
		<div id="wrapper">
			<g:link controller="home"><img src="${resource(dir: 'images', file: 'logo.jpg')}" alt="Grails Contributors"/></g:link>
			<div id="content">
				<g:layoutBody/>
			</div>
			<div id="footer">
				Licensed under the terms of the Apache License, Version 2.0. Source code available on <a href="https://github.com/bobbywarner/grails-contributors" target="_blank">GitHub</a>.
			</div>
		</div>
		<g:javascript library="application"/>
	</body>
</html>