<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Post</title>
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
	<h1 style="text-align: center;margin-bottom: 20px">Fill The Details</h1>
	<form action="post" method="post">
	<div class="row">
	<div class="col-md-3 offset-md-1">
	<div>Posting Title</div>
	<div><input type="text" name="title"></div>
	</div>
	<div class="col-md-3 offset-md-1">
	<div>City</div>
	<div><input type="text" name="city"></div>
	</div>
	<div class="col-md-2 offset-md-1">
	<div>Postal Code</div>
	<div><input type="text" name="postal"></div>
	</div>
	</div>
	
	<div class="row" style="margin-top: 10px">
	<div class="col-md-10 offset-md-1">
	<div>Description</div>
	<div><textarea rows="5" cols="100" name="desc"></textarea></div>
	</div>
	</div>
	
	<div class="row" style="margin-top: 10px">
	<div style="font-weight:  bold;margin-left: 15px">Contact Info</div>
	<div class="col-md-3 offset-md-1">
	<div>Email Address</div>
	<div><input type="text" name="email"></div>
	</div>
	<div class="col-md-3 offset-md-1">
	<div>Phone Number</div>
	<div><input type="text" name="phone"></div>
	</div>
	</div>
	<button style="margin-top: 30px;margin-left:100px;text-align: center;" type="submit" class="btn btn-info">Post The Advertisiment</button>
	
	</form>
	
</div>
</body>
</html>