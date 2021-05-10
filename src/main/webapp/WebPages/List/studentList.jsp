<%@ page import="java.util.Date" %><%--
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
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
                    <th>Faculty</th>
                    <th>Password</th>
                    <th>Roll No.</th>
                    <th>Semester</th>
                    <th>Admission Date</th>
                    <th>Regular Book</th>
                    <th>Extra Book</th>
                    <th>Fine</th>

                </tr>
                <!-- <%--userList--%> -->
                <c:forEach items="${studentList}" var="user">
                    <tr>
                        <td>${user.studentName}</td>
                        <td>${user.studentUsername}</td>
                        <td>${user.studentMob}</td>
                        <td>${user.studentEmail}</td>
                        <td>${user.faculty}</td>
                        <td>${user.studentPass}</td>
                        <td>${user.studentRoll}</td>
                        <td>${user.semester}</td>

<%--                        <%--%>
<%--                            Date date = new Date();--%>
<%--                            date = .AdmissionDate;--%>
<%--                            out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");--%>
<%--                        %>--%>

                        <jsp:useBean id="date" class="java.util.Date"/>
<%--                        <td> ${user.AdmissionDate} type="date" pattern="dd-MMM-yyyy"</td>--%>

                       <td> <fmt:formatDate value="${user.AdmissionDate}" type="date" pattern="yyyy-MM-dd"/></td>
<%--                        <td>${user.AdmissionDate}.toString</td>--%>
                        <td>${user.regularBook}</td>
                        <td>${user.extraBook}</td>
                        <td>${user.fine}</td>


                        <td><a href="student?page=userDetails&id=${user.studentId}">View Details</a></td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>

</div>

</body>

</html>
