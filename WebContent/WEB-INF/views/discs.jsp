<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="discs/add" method="post">
    <input type="text" name="name">
    <select name="genreId" id="">
        <c:forEach items="${genreList}" var="genre">
            <option value="${genre.id}">${genre.name}</option>
        </c:forEach>
    </select>
    <button type="submit">save</button>
</form>

<c:forEach items="${discList}" var="disc">

    <ul>
        <li>${disc.name} ${disc.genre.name} <a href="discs/delete/${disc.id}">del</a></li>
    </ul>

</c:forEach>

<a href="home">home</a>