<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="WebPages/CSS/style.css">
</head>

<body>
<div class="container">
    <div class="form-box">
        <div class="button-box">
            <div id="btn"></div>
            <button type="button" class="toggle-btn" onclick="student()">Student</button>
            <button type="button" class="toggle-btn" onclick="teacher()">Teacher</button>
            <button type="button" class="toggle-btn" onclick="librarian()">Librarian</button>
            <button type="button" class="toggle-btn" onclick="other()">Other Staff</button>
            <button type="button" class="toggle-btn" onclick="admin()">Admin</button>
        </div>

        <form id="student" class="input-group" action="student" method="post">
            <input type="hidden" name="page" value="student">
            <input type="text" class="input-field" placeholder="Student's User Name" name="username" required>
            <input type="password" class="input-field" placeholder="Enter Password" name="password" required>
            <input type="checkbox" class="chech-box">
            <!-- name="savepassword in browser"  //not completed-->
            <label>Remember Password</label><br>

            <button type="submit" class="submit-btn">Log  in</button><br>
            <a href="student?page=newStudent" class="link-btn">Not a Member yet? Register</a>

        </form>

        <form id="teacher" class="input-group" action="teacher" method="post">
            <input type="hidden" name="page" value="teacher">
            <input type="text" class="input-field" placeholder="Teacher's User Name" name="username" required>
            <input type="password" class="input-field" name="password" placeholder="Enter Password" required>

            <input type="checkbox" class="chech-box">
            <label>Remember Password</label><br>

            <button type="submit" class="submit-btn">Log  in</button><br>

            <a href="teacher?page=newTeacher" class="link-btn">Not a Member yet? Register</a>
        </form>

        <form id="librarian" class="input-group" action="librarian" method="post">
            <input type="hidden" name="page" value="librarian">
            <input type="text" class="input-field" name="username" placeholder="Librarian's User Name" required>
            <input type="password" class="input-field" name="password" placeholder="Enter Password" required>

            <input type="checkbox" class="chech-box">
            <label>Remember Password</label><br>

            <button type="submit" class="submit-btn">Log  in</button>
        </form>

        <form id="other" class="input-group" action="staff" method="post">
            <input type="hidden" name="page" value="other">
            <input type="text" class="input-field" name="username" placeholder="Staff's User Name" required>
            <input type="password" class="input-field" name="password" placeholder="Enter Password" required>

            <input type="checkbox" class="chech-box">
            <label>Remember Password</label><br>

            <button type="submit" class="submit-btn">Log  in</button><br>

            <a href="staff?page=newStaff" class="link-btn">Not a Member yet? Register</a>
        </form>

        <form id="admin" class="input-group" action="admin" method="post">
            <input type="hidden" name="page" value="admin">
            <input type="text" class="input-field" name="username" placeholder="Admin's User Name" required>
            <input type="password" class="input-field" name="password" placeholder="Enter Password" required>

            <input type="checkbox" class="chech-box">
            <label>Remember Password</label><br>

            <button type="submit" class="submit-btn">Log  in</button>
        </form>
    </div>
</div>

<script>
    var m = document.getElementById("student");
    var n = document.getElementById("teacher");
    var o = document.getElementById("librarian");
    var p = document.getElementById("other");
    var q = document.getElementById("admin");
    var z = document.getElementById("btn");

    function student() {
        m.style.left = "50px";
        n.style.left = "450px";
        o.style.left = "450px";
        p.style.left = "450px";
        q.style.left = "450px";
        z.style.left = "0";
    }

    function teacher() {
        m.style.left = "-450px";
        n.style.left = "50px";
        o.style.left = "450px";
        p.style.left = "450px";
        q.style.left = "450px";
        z.style.left = "76px";
    }

    function librarian() {
        m.style.left = "-400px";
        n.style.left = "-400px";
        o.style.left = "50px";
        p.style.left = "400px";
        q.style.left = "400px";
        z.style.left = "152px";
    }

    function other() {
        m.style.left = "-400px";
        n.style.left = "-400px";
        o.style.left = "-400px";
        p.style.left = "50px";
        q.style.left = "400px";
        z.style.left = "228px";
    }

    function admin() {
        m.style.left = "-400px";
        n.style.left = "-400px";
        o.style.left = "-400px";
        p.style.left = "-400px";
        q.style.left = "50px";
        z.style.left = "304px";
    }
</script>
</body>

</html>