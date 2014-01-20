<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Online Forum - Register User</title>
<SCRIPT lang="javascript">
	function addContact(tableID) {
		var table = document.getElementById(tableID);

		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);
		var counts = rowCount - 1;

		var cell0 = row.insertCell(0);
		var mobileNumberLabel = document.createElement("label");
		mobileNumberLabel.name = "Mobile Number";
		cell1.appendChild(mobileNumberLabel);
		
		var cell1 = row.insertCell(0);
		var mobileNumber = document.createElement("input");
		mobileNumber.type = "text";
		mobileNumber.name = "userContacts[" + counts + "].mobileNumber";
		cell1.appendChild(mobileNumber);
		
		rowCount = table.rows.length;
		row = table.insertRow(rowCount);
		counts = rowCount - 1;
		
		var cell2 = row.insertCell(0);
		var emailAddressLabel = document.createElement("label");
		emailAddressLabel.name = "Mobile Number";
		cell3.appendChild(emailAddressLabel);

		var cell3 = row.insertCell(1);
		var emailAddress = document.createElement("input");
		emailAddress.type = "text";
		emailAddress.name = "userContacts[" + counts + "].emailAddress";
		cell3.appendChild(emailAddress);;

	}
</SCRIPT>
</head>
<body>

	<h2>User Information</h2>
	<form:form method="POST" modelAttribute="user"
		action="/onlineForum/user/register">
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
