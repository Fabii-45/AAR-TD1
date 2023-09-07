<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>METEO</title>
</head>
<body>

<form method="post">
    <select name="meteo">
        <c:forEach items="${options}" var="opt">
            <option value="${opt.key}">${opt.value}</option>
        </c:forEach>
    </select>
    <button type="submit">Valider</button>
</form>

<c:forEach items="${optionCounts}" var="count">
    ${options[count.key - 1].value} a été sélectionné ${count.value} fois<br>
</c:forEach>

</body>
</html>