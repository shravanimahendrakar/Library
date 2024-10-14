<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Management</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .center-content {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            flex-direction: column;
        }
        .center-links {
            margin-bottom: 20px;
        }
        .form-container {
            width: 100%;
            max-width: 400px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="center-content">
        <h2 class="mb-4">Library Management</h2>

        <div class="center-links">
            <a href="register-form" class="btn btn-primary mx-2">Register</a>
        </div>

        <div class="form-container">
            <form action="login" method="post">
            <h6 class="mb-4" style="color:red;">${errorMsg }</h6>
            <h6 class="mb-4" style="color:orange;">${msg }</h6>
                <div class="form-group">
                    <label for="emailId">Email ID</label>
                    <input type="email" class="form-control" name="emailId" id="emailId" placeholder="Enter email" required>
                </div>

                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" id="password" placeholder="Enter password" required>
                </div>

                <button type="submit" class="btn btn-primary btn-block">Login</button>
            </form>
        </div>
    </div>
</div>

<!-- Bootstrap JS and dependencies 
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
-->
</body>
</html>
