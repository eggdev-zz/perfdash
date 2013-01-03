<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="template/header.jsp" />

<div class="row-fluid">

	<div class="span12">
		<form method="POST">
			<label>File:</label>
			<div>
				<input type="file" name="file" class="span3" />
			</div>
			
			<div>
				<button type="submit" class="btn btn-inverse">Upload</button>
			</div>
		</form>
	</div>

</div>

<c:import url="template/footer.jsp" />