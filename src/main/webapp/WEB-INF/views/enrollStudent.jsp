<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enroll Student</title>
</head>
<body>

	<form:form method="POST" modelAttribute="student"
		action="/coolSchool/student/enroll">
		<table>

			<tr>
				<td><form:label path="name.firstName">First Name</form:label></td>
				<td><form:input path="name.firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="name.surName">Sur Name</form:label></td>
				<td><form:input path="name.surName" /></td>
			</tr>
			<tr>
				<td><form:label path="name.lastName">Last Name</form:label></td>
				<td><form:input path="name.lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="contact.mobileNumber">Phone</form:label></td>
				<td><form:input path="contact.mobileNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="contact.emailAddress">Email</form:label></td>
				<td><form:input path="contact.emailAddress" /></td>
			</tr>
			<tr>
				<td><form:label path="studyingClass">Studying Class</form:label></td>
				<td><form:input path="studyingClass" /></td>
			</tr>
			<tr>
				<td><form:label path="personalBlog">Personal Blog</form:label></td>
				<td><form:input path="personalBlog" /></td>
			</tr>
			<tr>
				<td><form:label path="personalWebsite">Personal Website</form:label></td>
				<td><form:input path="personalWebsite" /></td>
			</tr>
			<tr>
				<td>Parents Details</td>
			</tr>
			<tr>
				<td><form:label path="name.firstName">Father First Name</form:label></td>
				<td><form:input path="name.firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="name.surName">Father Sur Name</form:label></td>
				<td><form:input path="name.surName" /></td>
			</tr>
			<tr>
				<td><form:label path="name.lastName">Father Last Name</form:label></td>
				<td><form:input path="name.lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="name.firstName">Mother First Name</form:label></td>
				<td><form:input path="name.firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="name.surName">Mother Sur Name</form:label></td>
				<td><form:input path="name.surName" /></td>
			</tr>
			<tr>
				<td><form:label path="name.lastName">Mother Last Name</form:label></td>
				<td><form:input path="name.lastName" /></td>
			</tr>
		</table>


		<table>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>