<%--
  Created by IntelliJ IDEA.
  User: SuMaN
  Date: 5/3/2021
  Time: 6:28 AM
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
                    <th>Edition</th>
                    <th>Publisher</th>
                    <th>Author</th>
                    <th>Price</th>
                    <th>Quantity</th>
                </tr>
                <!-- <%--bookList--%> -->
                <c:forEach items="${bookList}" var="book">
                    <tr>
                        <td>${book.bookName}</td>
                        <td>${book.edition}</td>
                        <td>${book.publisher}</td>
                        <td>${book.author}</td>
                        <td>${book.price}</td>
                        <td>${book.quantity}</td>
                        <td><a href="book?page=bookDetails&id=${book.bookId}">View Details</a></td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>

</div>

</body>

</html>
