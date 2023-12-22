<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>spay</title>
</head>
<body>
<center>
<img alt="logo" src="<c:url value="/resources/image/spay-icon.jpg" />" height=300 width=300 >
<h2>PAY YOUR BILL</h2>
<form action="dopymt" method="post">
<table>
<tr>
<td><font face="verdana" size="2px">Credit/Debit Card number:</font></td>
<td><input type="text" name="cNo"></td>
</tr>
<tr>
<td><font face="verdana" size="2px">Name on Card</font></td>
<td><input type="text" name="cName"></td>
</tr>
<tr>
<td><font face="verdana" size="2px">Enter CVV</font></td>
<td><input type="number" name="cvv" min="111" max="999"></td>
</tr>
<tr>
<td><font face="verdana" size="2px">Enter the amount</font></td>
<td><input type="number" name="amt" max="100000"></td>
</tr>
</table>
<input type="submit" value="PAY">
</form>
</center>
</body>
</html>