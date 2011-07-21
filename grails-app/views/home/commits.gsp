<!doctype html>
<html>
	<head>
		<meta name="layout" content="main"/>
	</head>
	<body>
        <h1 class="center">All Commits</h1>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>contributor</th>
                    <th>date</th>
                    <th>message</th>
                </tr>
            </thead>
            <tbody>
                <g:each var="c" in="${commits}" status="ctr">
                    <tr class="row${ctr%2}">
                        <td>${c.commitId[0..4]}...</td>
                        <td>${c.committerLogin}</td>
                        <td><g:formatDate date="${c.dateCreated}" format="yyyy-MM-dd" /></td>
                        <td>${c.message[0..10]}...</td>
                    </tr>
                </g:each>
            </tbody>
        </table>
	</body>
</html>
