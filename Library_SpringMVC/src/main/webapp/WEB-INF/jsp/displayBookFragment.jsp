<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="table-responsive" th:fragment="displayBookFragment">
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
</body>
</html>