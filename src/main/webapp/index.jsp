<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <form action="userinfo/login" method="post">
        <div>
            <span>用户名: </span>
            <input type="text" name="username">
        </div>
        <div>
            <span>密  码: </span>
            <input type="text" name="password">
        </div>
        <div>
            <input type="submit" value="login">
        </div>
    </form>
</body>
</html>
