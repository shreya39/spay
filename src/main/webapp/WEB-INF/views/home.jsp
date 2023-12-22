<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@include file="./base.jsp"%>
<title><c:out value="${page }"></c:out></title>
</head>
<body>
<div class="container mt-3">
  <img alt="logo" src="<c:url value="/resources/image/spay-icon.jpg" />" height=300 width=300 >
		<div style="background-color: LightGray; width: 100%">
			<h1 class="text-center"></h1>
		</div>
		<div class="row mt-4">
			<div class="col-md-5">
				<h3 class="text-center">Welcome to Payment Gateway</h3>
				<br>
				<div class="list-group">
					<button type="button"
						class="list-group-item list-group-item-action active">
						Pay Using</button>
					<a href='<c:url value='/add'></c:url>' 
					class="list-group-item list-group-item-action">Debit/Credit Card</a> 
					<a href='<c:url value='/net'></c:url>'
					class="list-group-item list-group-item-action">Net Banking</a> <a
					href='<c:url value='/upi'></c:url>'
					class="list-group-item list-group-item-action">UPI Applications</a>
				</div>
			</div>
		</div>
	</div>			
</body>
</html>