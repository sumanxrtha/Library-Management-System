<%--
  Created by IntelliJ IDEA.
  User: SuMaN
  Date: 4/24/2021
  Time: 5:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="<%= session.getAttribute("user")%>?page=home">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item ">
                <a class="nav-link" href="<%= session.getAttribute("user")%>?page=teacher">Teacher</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%= session.getAttribute("user")%>?page=student">Student</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%= session.getAttribute("user")%>?page=staff">Staff</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%= session.getAttribute("user")%>?page=book">Book</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%= session.getAttribute("user")%>?page=logout">Logout</a>
            </li>
        </ul>
    </div>
</nav>
</body>
</html>
