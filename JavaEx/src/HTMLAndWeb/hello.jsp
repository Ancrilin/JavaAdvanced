<%@page contentType="text/html;charset=UTF-8" language="java"
import ="java.sql.*" errorPage=""%>

<html>
	<head>
		<title>第一个使用JSP实现HelloWorld的例子</title>
	</head>
	<body>
	<H1>
	<%
		out.println("HelloWorld!");
	%>
	</H1>
	</body>
</html>