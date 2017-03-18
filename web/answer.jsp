
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Answer count</title>
</head>
<body>
<% String answer = (String) session.getAttribute("answer"); %>
<h2><%= answer %></h2>

</body>
</html>
