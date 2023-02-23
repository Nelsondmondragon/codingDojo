<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="ISO-8859-1">
			<link rel="stylesheet" type="text/css" href="/css/style.css">
			<title>Insert title here</title>

		</head>

		<body>
			<h1>Send an Omikuji</h1>
			<div class="container">
				<form action="/omikuji" method="POST">
					<p>Pick any number from 5 to 20</p>
					<input class="number" type="number" name="pick">
					<br>
					<p>Enter the name of any city.</p>
					<input class="text" type="text" name="city">
					<br>
					<p>Enter the name of any real person</p>
					<input class="text" type="text" name="person">
					<p>Entr profssional andeavor or habby.</p>
					<input class="text" type="text" name="profesion">
					<p>Enter any type of living thing.</p>
					<input class="text" type="text" name="living" id="">
					<p>Say somenthing nice to someone.</p>
					<textarea name="someone" cols="30" rows="10"></textarea>
					<p>Send and show a friend.</p>
					<input class="button" type="submit"></input>
				</form>
			</div>
		</body>

		</html>