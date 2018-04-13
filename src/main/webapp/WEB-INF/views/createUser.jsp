<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form commandName="user" method="POST">
        <form:input path="firstName" />
        <form:input path="lastName"/>
        <input type="submit" value="Create User">
    </form:form>
</body>
</html>
