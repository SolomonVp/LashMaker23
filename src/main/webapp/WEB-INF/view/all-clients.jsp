<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All your clients!</h2>
<br>

<table>
    <tr>
        <th>Name</th>
        <th>Family</th>
        <th>Lash-size</th>
        <th>price</th>
    </tr>

    <c:forEach var="clnt" items="${allClnts}">

        <tr>
            <td>${clnt.name}</td>
            <td>${clnt.surname}</td>
            <td>${clnt.size}</td>
            <td>${clnt.price}</td>
        </tr>

    </c:forEach>



</table>

</body>
</html>