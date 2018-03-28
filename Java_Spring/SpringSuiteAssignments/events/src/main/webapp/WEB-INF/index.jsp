<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login Registration</title>
</head>
<body>
	<c:if test="${errors != null }">
		<c:forEach items="${errors }" var="err">
			<h2>${err.defaultMessage }</h2>
		</c:forEach>
	</c:if>
	
	<form:form action="/" method="post" modelAttribute = "user">
		<p>
			<form:label path="firstName">First Name:
				<form:errors path="firstName"></form:errors>
				<form:input type="text" path="firstName"></form:input>
			</form:label>
		</p>
		<p>
			<form:label path="lastName">Last Name:
				<form:errors path="lastName"></form:errors>
				<form:input type="text" path="lastName"></form:input>
			</form:label>
		</p>
		<p>
			<form:label path="email">Email:
				<form:errors path="email"></form:errors>
				<form:input type="text" path="email"></form:input>
			</form:label>
		</p>
			<p>
				<form:label path="city">City:
					<form:errors path="city"></form:errors>
					<form:input type="text" path="city"></form:input>
				</form:label>
			</p>
			<p>
				<form:label path="state">State:
					<form:errors path="state"></form:errors>
					<form:input type="text" path="state"></form:input>
				</form:label>
			</p>
			<p>
			
				
				
				<form:label path="password">Password:
					<form:errors path="password"></form:errors>
					<form:input type="password" path="password"></form:input>
				</form:label>
			</p>
			

			<input type="submit" value="Register">
		</form:form>

	    <c:if test="${error != null}">
    		<h2>${error}</h2>
	    </c:if>

		<form action="/login" method="post">
			<p>
				<label>Email:
					<input type="text" name="email">
				</label>
			</p>
			<p>
				<label>Password:
					<input type="password" name="password">
				</label>
			</p>

			<input type="submit" value="Login">
		</form>
	</body>
</html>
	
	
	
	
	
</body>
</html>
