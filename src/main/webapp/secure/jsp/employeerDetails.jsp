<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Information Management System</title>
</head>
<body>
<form action="createEmployer.spring" method="post">
<table>
      
      <tr><td align="center" colspan="2">Employer Details</td></tr>
      <tr>
      <td>Name:</td>
      <td><input type="text" name="name"></td>
      </tr>
      
      <tr>
      <td>Address:</td>
      <td><input type="text" name="address"></td>
      </tr>
      
      <tr>
      <td>From Date:</td>
      <td><input type="text" name="fdate"></td>
      </tr>
      
      <tr>
      <td>To Date:</td>
      <td><input type="text" name="toDate"></td>
      </tr>
      
      <tr>
      <td>PF Number:</td>
      <td><input type="text" name="pfNumber"></td>
      </tr>
      
      <tr>
      <td>Tan Number:</td>
      <td><input type="text" name="tanNo"></td>
      </tr>
      
      <tr>
      <td>Employee Id:</td>
      <td><input type="text" name="employeeId"></td>
      </tr>
      
      <tr>
      <td>Current Company:</td>
      <td>
      <select name="isCurrentCompany">
      <option value="-">--Select--</option>
      <option value="Yes">Yes</option>
      <option value="No">No</option>
      </select>
      </td>
      </tr>
      
      <tr>
      <td align="center" colspan="2">
      <input type="submit" value="Save"/></td>
      </tr>
      
      
</table>
</form>
</body>
</html>