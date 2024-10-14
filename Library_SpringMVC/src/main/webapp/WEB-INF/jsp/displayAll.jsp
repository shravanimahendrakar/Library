<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display all user</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<a href="logout" style="position: absolute; top: 10px; right: 30px; padding: 10px 36px; text-decoration: none;">Logout</a>
	<!-- <div class="center-links" style="position: absolute; top: 10px; left: 40px;">
            <a href="login" class="btn btn-primary mx-2">Back</a>
        </div> -->
	<div class="container">
		<h2>All User details</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>address</th>
					<th>emailId</th>
					<th>phoneNumber</th>
					<th>country</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${userList}">
					<tr>
						<td>${e.name }</td>
						<td>${e.address }</td>
						<td>${e.emailId }</td>
						<td>${e.phoneNumber }</td>
						<td>${e.country }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>