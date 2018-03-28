<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head>
	<title></title>
</head>
<body>
	<h1>Current Listings</h1>
	
	<table>
		<tr>
			<td>Address</td>
			<td>Size</td>
			<td>Cost</td>
			<td>Details</td>
	
		</tr>
	
	<c:forEach items="${user.listings}" var="listing">
		<tr>
			<td>${listing.address }</td>
			<td>${listing.size }</td>
			<td>${listing.cost }</td>
			<td>${listing.description }</td>
			
		</tr>
	
	</c:forEach>
	</table>
	<form:errors path="listing.errors.*"></form:errors>
	
	<form:form method="POST" action="/listings" modelAttribute="listing">
		<form:label path="address">Address
			<form:input path="address"></form:input>
		</form:label>
		
		<form:label path="description">Description
			<form:input path="description"></form:input>
		</form:label>
		
		<form:label path="cost">Cost
			<form:input type="number" path="cost"></form:input>
		</form:label>
		
		<form:label path="Size">Size
			<form:select path="size">
				<form:option value="small">Small</form:option>
				<form:option value="medium">Medium</form:option>
				<form:option value="large">Large</form:option>
			</form:select>
		</form:label>
		<input type="submit" value="New Listing">
	</form:form>

</body>
</html>