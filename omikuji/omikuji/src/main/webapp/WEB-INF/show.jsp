<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <link rel="stylesheet" type="text/css" href="/css/style2.css">
            <title>Insert title here</title>

        </head>

        <body>
            <h1>Here's your Omikuji</h1>
            <div class="container">
                <p>In
                    <c:out value="${pickM}"></c:out>
                    years, you will live in
                    <c:out value="${cityM}"></c:out>
                    with <c:out value="${personM}"></c:out> as your roommate,
                    <c:out value="${profesionM}"></c:out> for a
                    living. The next time you see a
                    <c:out value="${livingM}"></c:out>, you will have good luck. Also,
                    <c:out value="${someoneM}">.</c:out>
                </p>

            </div>
            <br>
            <a  href="/omikuji">Go Back</a>

        </body>

        </html>