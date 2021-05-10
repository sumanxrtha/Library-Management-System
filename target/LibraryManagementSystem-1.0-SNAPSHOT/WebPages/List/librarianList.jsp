<%--
  Created by IntelliJ IDEA.
  User: SuMaN
  Date: 5/2/2021
  Time: 7:03 PM
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
            <a href="admin?page=newLibrarian">Add Librarian</a>
            <table class="table">
                <tr>
                    <th>Name</th>
                    <th>Username</th>
                    <th>Mobile</th>
                    <th>Email</th>
                    <th>Password</th>
                </tr>
                <!-- <%--userList--%> -->
                <c:forEach items="${librarianList}" var="user">
                    <tr>
                        <td>${user.librarianName}</td>
                        <td>${user.librarianUsername}</td>
                        <td>${user.librarianMob}</td>
                        <td>${user.librarianEmail}</td>
                        <td>${user.librarianPass}</td>
                        <td><a href="librarian?page=userDetails&id=${user.librarianId}">View Details</a></td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>

</div>

</body>

</html>
