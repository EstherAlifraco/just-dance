<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="url" value="${pageContext.request.contextPath}"/>


<!DOCTYPE html>
<%@attribute name="body" fragment="true"%>
<%@attribute name="scripts" fragment="true"%>
<html>
	<head>
	    <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	    <link href="${url}/css/bootstrap.min.css" rel="stylesheet" >
	    <link href="${url}/css/estilo.css" rel="stylesheet" >
	    <link href="${url}/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" rel="stylesheet">
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	    <link href="${url}/js/bootstrap.min.js">
	    
	</head>
	<body>
         <nav class="navbar navbar-inverse">
			 <div class="container-fluid" style="background-color: #BB33FF">
			  <ul class="nav navbar-nav navbar-left">
      <li class="active"><a href="${url}/" style="color: white">Home</a></li>
      <li><a href="${url}/clase" style="color: white">Clases</a></li>
      <li><a href="${url}/misClases" style="color: white">Mis Clases</a></li>
        </ul>
         <br>
          <br>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="${url}/login"><span class="glyphicon glyphicon-log-in"
							style="color: white"></span> Login</a></li>
				 </ul>
				 <br>
					<span class="nav navbar-nav navbar-center" style="color: white">logeado como: ${sessionScope.usuarioNombre}</span>
    </div>
		  </nav>
		  <div class="row">
				<div class="col-md-12">
					<jsp:invoke fragment="body"/>
				</div>
			</div>
	<footer>		

      </footer>
		<script src="${url}/js/jquery-3.0.0.min.js"></script>
		<script src="${url}/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="${url}/js/jquery.dataTables.min.js" type="text/javascript"></script>
		<script src="${url}/js/datatable.js" type="text/javascript"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
		<jsp:invoke fragment="scripts"/>
	</body>
</html>

