<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<form action="genre/add" method="post">
    <input type="text" name="name">
    <button type="submit">save</button>
</form>

<c:forEach items="${genreList}" var="genre">

    <ul>
        <li>${genre.name} <a href="genre/delete/${genre.id}">del</a></li>
    </ul>

</c:forEach>

<a href="home">home</a>