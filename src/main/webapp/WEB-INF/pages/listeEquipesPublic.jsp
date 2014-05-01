<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>

<!--Informations sur la page, pas affiché sur la page -->
<head>
<!--Encodage utilisé (pour les accents ...)-->
<meta charset="utf-8" />
<!--Lien avec la page CSS-->
<link rel="stylesheet" href="css/codeCSS.css" />
<!--Titre s'affichant dans l'onglet du navigateur-->
<title>LaSauce</title>
</head>

<!--Contient la majeure partie du code, ce qui est écrit est affiché à l'écran-->
<body>
	<div id="fondblanc">
		<p>
			<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
		</p>
		<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="listeEquipes" scope="request"></c:set>
		<jsp:include page="menu.jsp" />
		<c:forEach var="equipe" items="${equipes}">
			<div class="cadre1Equipe">
				<div class="cadre2Equipe">
					<div class="cadre3Equipe">
						<div class="cadre4Equipe">
							<img class="photoEquipe" src="${equipe.imgEquipe}"
								alt="L'équipe 2013-2014" />
							<div class="nomEquipe">
								<p class="descriptionEquipe">
									${equipe.anneeMandat}<br>
									${equipe.descriptionEquipe}
								</p>
							</div>
		</c:forEach>
	</div>
	</div>
	</div>
	</div>
	</div>
</body>
</html>