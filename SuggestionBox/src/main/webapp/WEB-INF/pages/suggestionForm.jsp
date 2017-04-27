<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suggestion Form</title>
</head>
<body>
	<h2>Suggestion Form</h2>
	<mvc:form modelAttribute="suggestion" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="name">Name</mvc:label></td>
				<td><mvc:input path="name" /></td>
			</tr>
			<tr>
				<td><mvc:label path="phoneNum">Phone Number</mvc:label></td>
				<td><mvc:input path="phoneNum" /></td>
			</tr>
			<tr>
				<td><mvc:label path="suggestionText">Suggestion</mvc:label></td>
				<td><mvc:textarea path="suggestionText" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>
	<a href="viewAll.mvc">View all Suggestions</a>

</body>
</html>