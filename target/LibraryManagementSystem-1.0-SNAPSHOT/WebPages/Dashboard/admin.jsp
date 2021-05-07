<%--
  Created by IntelliJ IDEA.
  User: SuMaN
  Date: 4/24/2021
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<div id="wrapper">
    <%@include file="../NavBar/adNav.jsp" %>
    <!-- Sidebar -->

    <div class="container">
        <h1>Welcome <%= session.getAttribute("user")%></h1>

    </div>
</div>
</body>
</html>
