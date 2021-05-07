<%--
  Created by IntelliJ IDEA.
  User: SuMaN
  Date: 4/23/2021
  Time: 4:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link rel="stylesheet" href="WebPages/CSS/registration.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
<div class="container">
    <div class="title">Registration</div>
    <form action="staff?page=register" method="post">
        <div class="user-details">
            <div class="input-box">
                <span class="details">Full Name</span>
                <input type="text" name="name" placeholder="Enter your name" required>
            </div>
            <div class="input-box">
                <span class="details">Username</span>
                <input type="text" name="username" placeholder="Enter your username" required>
            </div>
            <div class="input-box">
                <span class="details">Email</span>
                <input type="email" name="email" placeholder="Enter your email" required>
            </div>
            <div class="input-box">
                <span class="details">Phone Number</span>
                <input type="text" name="phone" placeholder="Enter your number" required>
            </div>
            <div class="input-box">
                <span class="details">Password</span>
                <input type="password" name="password" placeholder="Enter your password" required>
            </div>
            <div class="input-box">
                <span class="details">Confirm Password</span>
                <input type="password" name="cpassword" placeholder="Enter your password again" required>
            </div>
        </div>
        <div class="button">
            <input type="submit" value="Register">
        </div>
    </form>
</div>
</body>

</html>

