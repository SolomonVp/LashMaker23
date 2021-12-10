<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All your clients!</h2>
<br>

<table>
    <tr style="color: yellowgreen">
        <th>Name</th>
        <th>Family</th>
        <th>Lash-size</th>
        <th>Price</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="clnt" items="${allClnts}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="clntId" value="${clnt.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteClient">
            <c:param name="clntId" value="${clnt.id}"/>
        </c:url>

        <tr>

            <td style="color: red">${clnt.name}</td>
            <td style="color: lightseagreen">${clnt.surname}</td>
            <td style="color: mediumblue">${clnt.size}</td>
            <td style="color: chocolate">${clnt.price}</td>

            <td>
                <input type="button" value="Update" style="color: rebeccapurple"
                onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete" style="color: rebeccapurple"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>

        </tr>

    </c:forEach>
</table>

<br>

<input type="button" value="Add new beautiful girl"
    onclick="window.location.href = 'addNewGirl'"/>

</body>
</html>