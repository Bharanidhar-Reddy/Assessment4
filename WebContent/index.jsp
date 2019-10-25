<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Assessment 4</title>
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
	<div class="container" style="margin-left: 30px">
	<h1 style="text-align: center;margin-bottom: 30px">Find Your need</h1>
	<form style="margin-left: 100px" action="process" method="post">
	<table border="1" style="padding: 5px">
	<thead>
	<tr>
	<td class="columns" style="font-weight: bold;">Categories</td>
	<td class="columns" style="font-weight: bold;">post</td>
	<td class="columns" style="font-weight: bold;">view</td>
	</tr>
	</thead>
	<tbody>
	<tr>
	<td class="columns">Jobs</td>
	<td class="columns"><button type="submit" name="button" value="j1" class="btn btn-info">Post</button></td>
	<td class="columns"><button type="submit" name="button" value="j2" class="btn btn-info">view</button></td>
	</tr>
	
	<tr>
	<td class="columns">Housing</td>
	<td class="columns"><button type="submit" name="button" value="h1" class="btn btn-info">Post</button></td>
	<td class="columns"><button type="submit" name="button" value="h2" class="btn btn-info">view</button></td>
	</tr>
	
	<tr>
	<td class="columns">For Sale</td>
	<td class="columns"><button type="submit" name="button" value="f1" class="btn btn-info">Post</button></td>
	<td class="columns"><button type="submit" name="button" value="f2" class="btn btn-info">view</button></td>
	</tr>
	
	<tr>
	<td class="columns">Services</td>
	<td class="columns"><button type="submit" name="button" value="s1" class="btn btn-info">Post</button></td>
	<td class="columns"><button type="submit" name="button" value="s2" class="btn btn-info">view</button></td>
	</tr>
	
	<tr>
	<td class="columns">Community</td>
	<td class="columns"><button type="submit" name="button" value="c1" class="btn btn-info">Post</button></td>
	<td class="columns"><button type="submit" name="button" value="c2" class="btn btn-info">view</button></td>
	</tr>
	
	</tbody>
	</table>
	
	</form>
	</div>
</body>
</html>