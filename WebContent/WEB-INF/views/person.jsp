<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <form action="person/add" method="post">
       firstname <input type="text" name="firstName">
        <br>
        lastname <input type="text" name="lastName">
        <br>
        <button type="submit">save</button>
    </form>
</div>

<c:forEach items="${personList}" var="person">

    <ul>
        <li>${person.firstName} ${person.lastName}<a href="person/delete/${person.id}">del</a></li>
    </ul>

</c:forEach>

<a href="home">home</a>