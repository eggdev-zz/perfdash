<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="template/header.jsp" />

<div class="row-fluid">

	<div class="span4">
		
		<img src="${pageContext.request.contextPath}/resources/img/pmap.gif" />
		
	</div>
	
	<div class="span8">
	
		<div class="row-fluid">
		
			<div class="span6">
				<img src="${pageContext.request.contextPath}/resources/img/pie.gif" />
			</div>
			
			<div class="span6">
				<img src="${pageContext.request.contextPath}/resources/img/bar.gif" />
			</div>
		
		</div>
		
		<div class="row-fluid">
		
			<div class="span12">
				<div class="alert alert-warning" style="border:1px solid #000">
					<span style="font-weight:bold;font-size:15px;color:#333;letter-spacing:1px">Guidelines</span>
				</div>
				
				<div>
					<ul class="styled">
						<li>Guide 1</li>
						<li>Guide 2</li>
						<li>Guide 3</li>
					</ul>
				</div>
			</div>
		
		</div>
	
	</div>

</div>

<c:import url="template/footer.jsp" />