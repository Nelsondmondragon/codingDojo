<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Insert title here</title>

</head>
<body>
	<h1>Fruit Store</h1>
	<table>
		<tbody>
			<tr>
				<th>Name</th>
				<th>price</th>
			</tr>

			<c:forEach var="fruit" items="${itemController}">

				<tr>
					<th><c:out value="${fruit.getName()}"></c:out></th>
					<th><c:out value="${fruit.getPrice()}"></c:out></th>
				</tr>

			</c:forEach>

		</tbody>
	</table>
</body>
</html>