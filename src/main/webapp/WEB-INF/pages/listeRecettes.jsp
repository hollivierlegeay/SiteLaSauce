<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!--Informations sur la page, pas affiché sur la page -->
<head>
<!--Encodage utilisé (pour les accents ...)-->
<meta charset="utf-8" />
	<!--Liens-->
		<link rel="stylesheet" href="css/codeCSS.css"/>
		<link rel="shortcut icon" href="Images/favicon.ico">
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
		<jsp:include page="menuM.jsp" />
<br>
<br>
	
<h1> Les Recettes</h1>
		<section>
		<article>
			<table>
			<tr>
				<th>Titre</th>
				<th>Difficulté</th>
				<th>Type Plat</th>
				<th>Image</th>
				<th class="action">Supprimer</th>
				</tr>
				<c:forEach var="recette" items="${recettes}">
					<tr>
						<td><p class=font>${recette.titrePlat}</p></td>
						<td><p class=font>${recette.difficulte}</p></td>
						<td><p class=font>${recette.typePlat}</p></td>
						<td><p class=font><img src="${recette.imgRecette}" alt="${recette.titrePlat}" style="height:80px; border:solid 1px silver; border-radius:10px;"  /></p></td>
						<td class="action"> <a href="supprimerRecette?idRecette=${recette.idRecette}"
												title="Supprimer la Recette : ${recette.idRecette}">
											<img src="Images/supprimer.png" alt="Supprimer" /></a></td>	 
					</tr>
				</c:forEach>
			</table>
		</article>
		<article>
				<p> <br> <br> <br> </p>
		</article>
	</section>	
	</div>
</body>
</html>