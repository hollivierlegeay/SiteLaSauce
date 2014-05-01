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
		<c:set var="pageSelectionnee" value="listeEvenements" scope="request"></c:set>
		<jsp:include page="menu.jsp" />

		<div id="cadreBleuEvenements">
			<div id="cadreBlancEvenements">
				<c:forEach var="evenement" items="${evenements}">
					<tr>
						<td><div class="lienEvenement">
								<p class="nomEvenement">${evenement.titreEvenement}</p>
								<p class="descriptionEvenement">
									${evenement.dateEvenement}<br>
									${evenement.detailEvenement}<br>
									${evenement.lieuEvenement}
								</p>
							</div></td>
						
					</tr>
				</c:forEach>


			</div>
		</div>
	</div>
</body>
</html>