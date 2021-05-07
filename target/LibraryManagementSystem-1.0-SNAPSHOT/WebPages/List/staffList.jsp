<%--
  Created by IntelliJ IDEA.
  User: SuMaN
  Date: 5/3/2021
  Time: 6:30 AM
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
            <table class="table">
                <tr>
                    <th>Name</th>
                    <th>Username</th>
                    <th>Mobile</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Total Book</th>
                    <th>Fine</th>

                </tr>
                <!-- <%--userList--%> -->
                <c:forEach items="${staffList}" var="user">
                    <tr>
                        <td>${user.staffName}</td>
                        <td>${user.staffUsername}</td>
                        <td>${user.staffMob}</td>
                        <td>${user.staffEmail}</td>
                        <td>${user.staffPass}</td>
                        <td>${user.totalBook}</td>
                        <td>${user.fine}</td>


                        <td><a href="staff?page=userDetails&id=${user.staffId}">View Details</a></td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>

</div>

</body>

</html>
