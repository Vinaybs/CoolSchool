<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
				<td></td>
			</tr>
			<tr>
				<td><form:label path="mobileNumber">Phone</form:label></td>
				<td><form:input path="mobileNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="emailAddress">Email</form:label></td>
				<td><form:input path="emailAddress" /></td>
			</tr>
			<tr>
				<td></td>
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
				<td></td>
			</tr>
			<tr>
				<td>Parents Details</td>
			</tr>
			<tr>
				<td><form:label path="father.firstName">Father First Name</form:label></td>
				<td><form:input path="father.firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="father.surName">Father Sur Name</form:label></td>
				<td><form:input path="father.surName" /></td>
			</tr>
			<tr>
				<td><form:label path="father.lastName">Father Last Name</form:label></td>
				<td><form:input path="father.lastName" /></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td><form:label path="mother.firstName">Mother First Name</form:label></td>
				<td><form:input path="mother.firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="mother.surName">Mother Sur Name</form:label></td>
				<td><form:input path="mother.surName" /></td>
			</tr>
			<tr>
				<td><form:label path="mother.lastName">Mother Last Name</form:label></td>
				<td><form:input path="mother.lastName" /></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td><form:label path="guardian.firstName">Guardian First Name</form:label></td>
				<td><form:input path="guardian.firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="guardian.surName">Guardian Sur Name</form:label></td>
				<td><form:input path="guardian.surName" /></td>
			</tr>
			<tr>
				<td><form:label path="guardian.lastName">Guardian Last Name</form:label></td>
				<td><form:input path="guardian.lastName" /></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>Address</td>
			</tr>
			<tr>
				<td><form:label path="address.unit">Unit</form:label></td>
				<td><form:input path="address.unit" /></td>
			</tr>
			<tr>
				<td><form:label path="address.street">Street</form:label></td>
				<td><form:input path="address.street" /></td>
			</tr>
			<tr>
				<td><form:label path="address.region">Region</form:label></td>
				<td><form:input path="address.region" /></td>
			</tr>
			<tr>
				<td><form:label path="address.city">City</form:label></td>
				<td><form:input path="address.city" /></td>
			</tr>
			<tr>
				<td><form:label path="address.country">Country</form:label></td>
				<td><form:input path="address.country" /></td>
			</tr>
			<tr>
				<td><form:label path="address.zipCode">Zipcode</form:label></td>
				<td><form:input path="address.zipCode" /></td>
			</tr>
			<tr>
				<td><form:label path="address.isPrimary">Is Primary Address</form:label></td>
				<td><form:radiobutton path="address.isPrimary" value="true" /></td>
				<td><form:radiobutton path="address.isPrimary" value="false" /></td>
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