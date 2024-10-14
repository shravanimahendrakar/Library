<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Book Details</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
/* Center the form and book details */
form, table {
	margin: 0 auto;
	text-align: center;
}

/* Adjust the height and prevent unnecessary scrolling */
body {
	min-height: 76vh;
	display: flex;
	flex-direction: column;
	justify-content: center;
}

table {
	margin-top: 20px;
}

</style>
</head>
<body>
	<a style="position: absolute; right: 5%; top: 10%" href="logout">Logout</a>

	<div class="container">
		<h2>Hello ${userName}</h2>
		<div class="center-links"> 
			<c:if test="${admin}">
				<a href="all-user" class="btn btn-primary mx-2">All registered User</a>  
			</c:if>
		</div>
		
		<form action="book-details" method="post" class="mb-4">
			<input type="hidden" value="${userName}" name="userName">
			<div class="form-group">
				<label for="bookOption">Select a book type:</label> <select
					class="form-control" name="type" id="type" required>
					<option value="">-- Select a book type --</option>
					<c:forEach var="option" items="${bookTypes}">
						<option value="${option}">${option}</option>
					</c:forEach>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

		<h2>All Book details</h2>
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>Name</th>
						<th>Type</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="b" items="${bookList}">
						<tr>
							<td>${b.name }</td>
							<td>${b.type }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>

</body>
</html>