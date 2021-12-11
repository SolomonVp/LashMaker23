<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Client Info</h2>
<br>

<form:form action="saveClient" modelAttribute="client">

    <form:hidden path="id"/>

    Name          <form:input path="name"/>
    <br><br>
    Surname       <form:input path="surname"/>
    <br><br>
    Size          <form:input path="size"/>
    <br><br>
    Price         <form:input path="price"/>
    <br><br>
    PhoneNumber   <form:input path="phoneNumber"/>
    <br><br>

    <input type="submit", value="OK">

</form:form>

</body>
</html>