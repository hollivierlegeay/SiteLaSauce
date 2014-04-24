<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE>
<html>


	<!--Informations sur la page, pas affiché sur la page -->
	<head>
		<!--Encodage utilisé (pour les accents ...)-->
		<meta charset="utf-8"/>
		<!--Lien avec la page CSS-->
		<link rel="stylesheet" href="css/codeCSS.css"/>
		<!--Titre s'affichant dans l'onglet du navigateur-->
		<title>LaSauce - Espace Membres</title>
	</head>

<!--Contient la majeure partie du code, ce qui est écrit est affiché à l'écran-->
<body>	
		<div id="fondblanc">
		
			<p>
				<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
			</p>
	
	<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="indexM" scope="request"></c:set>
		<jsp:include page="menuM.jsp" />

</body>
			
		</div>
	</body>
</html>