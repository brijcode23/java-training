<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog Posts</title>
</head>
<body>
<h2>All Blog Posts</h2>
    <c:forEach var="blogPost" items="${blogPosts}">
        <div>
            <h3>${blogPost.title}</h3>
            <p>${blogPost.content}</p>
        </div>
        <hr>
    </c:forEach>
<h2>Add a New Blog Post</h2>
<form action="/blog/add" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required>
    <br>
    <label for="content">Content:</label>
    <textarea id="content" name="content" required></textarea>
    <br>
    <button type="submit">Add Blog Post</button>
</form>
</body>
</html>

