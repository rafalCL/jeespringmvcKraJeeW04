<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cart items</title>
</head>
<body>
    <h1>Cart items</h1>
    <ul>
        <c:forEach items="${cart.cartItems}" var="item">
            <li>${item}</li>
        </c:forEach>
    </ul>
</body>
</html>
