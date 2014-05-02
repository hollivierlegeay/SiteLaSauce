<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>

<!--Informations sur la page, pas affiché sur la page -->
<head>
<!--Encodage utilisé (pour les accents ...)-->
<meta charset="utf-8" />
	<!--Liens-->
		<link rel="stylesheet" href="css/codeCSS.css"/>
		<link rel="shortcut icon" href="Images/favicon.ico">
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
		<jsp:include page="menuM.jsp" />

<br>
<br>	
<h1> Les équipes</h1>
		<section>
		<article>	
			<table>
				<tr>
					<th>Année de mandat</th>
					<th>Description</th>
					<th>Photo</th>
					<th class="action">Supprimer</th>
					
		<c:forEach var="equipe" items="${equipes}">
			<tr>
				<td><p class=font>${equipe.anneeMandat}</p></td>
				<td><p class=font>${equipe.descriptionEquipe}</p></td>
				<td><p class=font><img src="${equipe.imgEquipe}" alt="${equipe.anneeMandat}" style="height:80px; border:solid 1px silver; border-radius:10px;"  /></p></td>
				<td class="action"><a href="supprimerEquipe?idEquipe=${equipe.idEquipe}"
									title="Supprimer l'Equipe : ${equipe.idEquipe}"> 
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