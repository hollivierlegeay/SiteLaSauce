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
		<title>LaSauce - Accueil </title>
	</head>

<!--Contient la majeure partie du code, ce qui est écrit est affiché à l'écran-->
<body>	
		<div id="fondblanc">
		
			<p>
				<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
			</p>
	
	<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="index" scope="request"></c:set>
		<jsp:include page="menu.jsp" />

</body>
			<div id="encadreBleu">
				<div id="encadreBienvenue">
					<h3 id="titreBienvenue">Bienvenue <br> sur le site de LaSauce, l'association de cuisine d'Hei</h3>
					<p id="texteBienvenue">Depuis 3 ans, LaSauce redonne aux Heiens le plaisir de bien manger !
					LaSauce d'HEI est une association qui a été crée dans le but de rassembler les élèves de l'école autour du plaisir de la cuisine !
				</div>
			</div>
		</div>
	</body>
</html>