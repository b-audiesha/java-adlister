<%--
  Created by IntelliJ IDEA.
  User: audibrattin
  Date: 4/9/21
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Login"/>
  </jsp:include>
</head>
<body style="text-align: center">
<%@ include file="partials/navbar.jsp" %>
<h1>Login:</h1>
<form method="POST">
  <input type="text" name="username" placeholder="enter username">
  <input type="password" name="password" placeholder="enter password">
  <button type="submit">Submit</button>
</form>
</body>
</html>
