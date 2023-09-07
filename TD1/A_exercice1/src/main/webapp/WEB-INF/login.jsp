<%--
Cette JSP accueillera un form avec les deux champs login et password
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
<form method="post">
    <label> login
        <input type="text" name="login">
    </label>
    <br/>
    <label> password
        <input type="text" name="password">
    </label>
    <br/>
    <button type="submit">Envoyer</button>
</form>
</body>
</html>
