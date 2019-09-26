<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<c:set var="url" value="${pageContext.request.contextPath}"/>
    
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:nav-footer>
	<jsp:attribute name="body">
	    <br>
	    <div class="titulo"><h1>CLASES</h1>
	</div>
	<br>
	<div class="contenedor_principal">
	
	</div>
					<div class="container">
		<div class="row color-invoice">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-12">
						<br>
						<br>
						<table class="table table-bordered">
							<thead>
								<tr>
									<th scope="col">Nombre</th>
									<th scope="col">Profesor</th>
									
									
								</tr>
							</thead>
							<tbody>
								<c:forEach var="clase" items="${listarClases}">
									<tr>
										<td><c:out value="${clase.nombreClase}" /></td>	
										<td><c:out value="${clase.nombreProfesor}" /></td>
										
									
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	


	</jsp:attribute>
</t:nav-footer>