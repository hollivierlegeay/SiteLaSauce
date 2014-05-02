<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>

<!--Informations sur la page, pas affich� sur la page -->
<head>
<!--Encodage utilis� (pour les accents ...)-->
<meta charset="utf-8" />
<!--Liens-->
<link rel="stylesheet" href="css/codeCSS.css" />
<link rel="shortcut icon" href="Images/favicon.ico">
<!--Titre s'affichant dans l'onglet du navigateur-->
<title>LaSauce</title>
</head>

<!--Contient la majeure partie du code, ce qui est �crit est affich� � l'�cran-->
<body>
	<div id="fondblanc">
		<p>
			<img class="baniere" src="Images/baniere.jpg" alt="Bani�re du site" />
		</p>
		<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="listeEquipes" scope="request"></c:set>
		<jsp:include page="menu.jsp" />

		<h1>Notre Equipe</h1>

		<c:forEach var="equipe" items="${equipes}">

			<p class="nomEquipe">L'Equipe ${equipe.anneeMandat}</p>

			<div class="cadre1Equipe">
				<div class="cadre2Equipe">
					<div class="cadre3Equipe">
						<div class="cadre4Equipe">
							<img class="photoEquipe" src="${equipe.imgEquipe}"alt="L'�quipe  ${equipe.anneeMandat} " />
						</div>
					</div>
				</div>
			</div>
				<p class="descriptionEquipe">
					 ${equipe.descriptionEquipe}<br><br>
				</p>
		</c:forEach>

	</div>
</body>
</html>