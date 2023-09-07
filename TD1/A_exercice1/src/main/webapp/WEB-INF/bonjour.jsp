<%--
Cette JSP sera appelée une fois que l'utilisateur est loggué
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty login}">
    Bienvenue ${login}!
</c:if>
</body>
</html>
