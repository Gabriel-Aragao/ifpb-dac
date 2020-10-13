<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Livraria MVC</title>
</head>
<body>
	
		<c:if test="${not empty autor}">
			Autor ${ autor } cadastrado com sucesso!
		</c:if>
		
		<c:if test="${empty autor}">
			Nenhum autor cadastrado!
		</c:if>


	</body>
</html>
