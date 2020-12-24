<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Localization</title>
</head>
<body>
<spring:message code="label.title"></spring:message>
<form action="">
<spring:message code="label.firstName" /> <input type="text" name="firstName"> <br>
<spring:message code="label.lastName" /> <input type="text" name="secondName"> <br>
<spring:message code="label.submit" var="alias"> </spring:message>
<input type="submit" value="${alias}" >
</form>
</body>
</html>