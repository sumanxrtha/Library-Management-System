<%--
  Created by IntelliJ IDEA.
  User: SuMaN
  Date: 4/29/2021
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
<div id="wrapper">

    <!-- Sidebar -->
    <%@include file="../NavBar/adNav.jsp" %>
    <div class="container">
        <div class="table-responsive">
            <a href="admin?page=newAdmin">Add Admin</a>
            <table class="table">
                <tr>
                    <th>Name</th>
                    <th>Username</th>
                    <th>Mobile</th>
                    <th>Email</th>
                    <th>Password</th>
                </tr>
                <!-- <%--userList--%> -->
                <c:forEach items="${adminList}" var="user">
                    <tr>
                        <td>${user.adminName}</td>
                        <td>${user.adminUsername}</td>
                        <td>${user.adminMob}</td>
                        <td>${user.adminEmail}</td>
                        <td>${user.adminPass}</td>
                        <td><a href="admin?page=userDetails&id=${user.adminId}">View Details</a></td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>

</div>

</body>

</html>
