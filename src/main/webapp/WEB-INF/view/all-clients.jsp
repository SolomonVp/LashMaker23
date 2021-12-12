<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All clients:</h2>
<br>

<table>
    <tr>
        <th>Name           </th>
        <th>Family         </th>
        <th>Lash-size      </th>
        <th>Price          </th>
        <th>Phone number   </th>
        <th>Operations     </th>
    </tr>

    <c:forEach var="clnt" items="${allClnts}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="clntId" value="${clnt.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteClient">
            <c:param name="clntId" value="${clnt.id}"/>
        </c:url>

        <tr>

            <td>${clnt.name}</td>
            <td>${clnt.surname}</td>
            <td>${clnt.size}</td>
            <td>${clnt.price}</td>
            <td>${clnt.phoneNumber}</td>

            <td>
                <input type="button" value="Update"
                onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>

        </tr>

    </c:forEach>
</table>

<br>

<input type="button" value="Add new cutie"
    onclick="window.location.href = 'addNewGirl'"/>

</body>
</html>