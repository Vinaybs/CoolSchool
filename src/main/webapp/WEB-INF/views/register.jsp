<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Online Forum - Register User</title>
</head>
<body>

	<h2>User Information</h2>
	<form:form method="POST" modelAttribute="user"
		action="/coolSchool/user/register">
		<table>
			<tr>
				<td><form:label path="userId">User Id </form:label></td>
				<td><form:input path="userId" /></td>
			</tr>
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
		</table>


		<table id="contactDetails">
			<tr>
				<td><label>Mobile Number</label></td>
				<td><input name="userContacts[0].mobileNumber" value="" /></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input name="userContacts[0].emailAddress" /></td>
			</tr>
		</table>
		<input type="button" name="Add another contact"
			onclick="addContact('contactDetails')" />
		<table>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
