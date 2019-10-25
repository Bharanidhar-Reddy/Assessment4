<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>View</title>
<link rel="stylesheet" href="styling.css">
<!-- Bootstrap CSS -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1 style="text-align: center; margin-bottom: 30px">Avaliable
			data</h1>
		<c:if test="${not found }">
			<h1
				style="text-align: center; margin-top: 30px; color: red; font-weight: 400;">No
				Records Found</h1>
		</c:if>
		<c:if test="${found}">
			<table border="1">
				<thead>
					<tr>
						<td class="columns" style="font-weight: bold;">Title</td>
						<td class="columns" style="font-weight: bold;">City</td>
						<td class="columns" style="font-weight: bold;">Postal Code</td>
						<td class="columns" style="font-weight: bold;">Description</td>
						<td class="columns" style="font-weight: bold;">Email ID</td>
						<td class="columns" style="font-weight: bold;">Phone Number</td>
						<td class="columns" style="font-weight: bold;">Action</td>
					</tr>
				</thead>
				<form action="req" method="get">
					<c:forEach var="b" items="${input}">
						<tr>
							<td class="columns" style="font-weight: bold;">${b.title}</td>
							<td class="columns" style="font-weight: bold;">${b.city}</td>
							<td class="columns" style="font-weight: bold;">${b.postal}</td>
							<td class="columns" style="font-weight: bold;">${b.desc}</td>
							<td class="columns" style="font-weight: bold;">${b.email}</td>
							<td class="columns" style="font-weight: bold;">${b.phone}</td>
							<td class="columns"><button type="submit" name= "title" value= ${b.title} class="btn btn-info">Make a Request</button></td>
						</tr>
					</c:forEach>
				</form>
			</table>
		</c:if>
	</div>


</body>
</html>