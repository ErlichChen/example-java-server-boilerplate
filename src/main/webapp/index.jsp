<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
    <form action="userinfo/register" method="post">
        <div>
            <span>用户名: </span>
            <input type="text" name="username">
        </div>
        <div>
            <span>密  码: </span>
            <input type="text" name="password">
        </div>
        <div>
            <input type="submit" value="register">
        </div>
    </form>
</body>
</html>
