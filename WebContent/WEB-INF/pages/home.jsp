<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	

	<div id= "login_frame">
		<form action="user/login" method="post">
			<div class="field_desc">
				Username:
			</div>
			<div class="field_edit">
				<input type="text" name="username" />
			</div>
			<div class="field_desc">
				Password:
			</div>
			<div class="field_edit">
				<input type="password" name="password" />
			</div>
			<div>
				<input type="submit" value="login" />
			</div>
		</form>
	</div>

	<a href="user/register">register</a>

</body>
</html>
