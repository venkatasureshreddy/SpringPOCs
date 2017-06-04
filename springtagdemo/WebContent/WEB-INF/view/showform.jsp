<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>This Is Student Form</title>
</head>

<form:form action="displayform" modelAttribute="student" >
<labe>First Name ::</labe><form:input path="firstname"/><br><br>
<label>Last Name ::</label><form:input path="lastname"/><br><br>
<input type="submit" value="submit">
</form:form>


</html>