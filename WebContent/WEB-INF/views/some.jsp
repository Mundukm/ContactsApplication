<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${personList}" var="person">

    <span>${person.firstName}</span>

</c:forEach>
