<%--
  Created by IntelliJ IDEA.
  User: audibrattin
  Date: 4/9/21
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>AdLister Profile</title>
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Profile Page"/>
  </jsp:include>
</head>
<body style="text-align: center">
<%@ include file="partials/navbar.jsp" %>
<h2>You are now logged in.</h2>
<%@ include file="partials/footer.jsp" %>
</body>
</html>
