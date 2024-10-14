<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <h3 class="text-center mb-4">Register User</h3>
      <form action="register-user" method="post">
        <input type="hidden" name="id" value="${lastUserId}">
        
        <div class="form-group">
          <label for="name">Name</label>
          <input type="text" class="form-control" name="name" id="name" placeholder="Enter name" required>
        </div>

        <div class="form-group">
          <label for="address">Address</label>
          <input type="text" class="form-control" name="address" id="address" placeholder="Enter address" required>
        </div>

        <div class="form-group">
          <label for="emailId">Email</label>
          <input type="email" class="form-control" name="emailId" id="emailId" placeholder="Enter email" required>
        </div>

        <div class="form-group">
          <label for="phoneNumber">Phone Number</label>
          <input type="number" class="form-control" name="phoneNumber" id="phoneNumber" placeholder="Enter phone number" required>
        </div>

        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" class="form-control" name="password" id="password" placeholder="Enter password" required>
        </div>

        <div class="form-group">
          <label for="country">Country</label>
          <input type="text" class="form-control" name="country" id="country" placeholder="Enter country" required>
        </div>

        <button type="submit" class="btn btn-primary btn-block">Submit</button>
      </form>
    </div>
  </div>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
