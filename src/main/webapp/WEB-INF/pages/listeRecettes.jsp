<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!--Informations sur la page, pas affiché sur la page -->
<head>
<!--Encodage utilisé (pour les accents ...)-->
<meta charset="utf-8" />
<!--Lien avec la page CSS-->
<link rel="stylesheet" href="css/codeCSS.css" />
<!--Titre s'affichant dans l'onglet du navigateur-->
<title>LaSauce - Les Recettes</title>
</head>

<!--Contient la majeure partie du code, ce qui est écrit est affiché à l'écran-->
<body>
	<div id="fondblanc">

		<p>
			<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
		</p>

		<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="listeRecettes" scope="request"></c:set>
		<jsp:include page="menu.jsp" />

		<div>
			<table>
				<tbody>
					<c:forEach var="recette" items="${recettes}">
						<tr>
						<td><div class="lienRecette"> 
							<p>${recette.titrePlat}</p>
							 </div></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>