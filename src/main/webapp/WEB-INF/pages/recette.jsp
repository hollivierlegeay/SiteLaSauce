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
<link rel="stylesheet" href="css/codeCSS.css" />
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
		<jsp:include page="menu.jsp" />

			<a href="listeRecettesPublic"><input  class ="fleche" type="image" src="Images/fleche-isn.gif" /></a>

		<br />
		<section>
		<article>	
		<h1 class = "titreR">${recette.titrePlat}</h1>
		 
		 <br /> <img class="imageR" src="${recette.imgRecette}"
					alt="Photo Recette" /> 
				
				<div>
					
					<h3>Difficulté : </h3><br /><p class="texteR"> ${recette.difficulte}</p>
				</div>
				<div>
					
					<h3>Type de plat : </h3><br /><p class="texteR"> ${recette.typePlat}</p>
				</div>
				<div>
				
					<h3>Ingrédients : </h3><p class="texteR">${recette.ingredients}</p>
				</div>
				<div>
					<h3>Préparation : </h3><p class="texteR">${recette.texteRecette}</p>
				</div>
				
				<div><br />
				<a href="javascript:window.print()"><input class = "retour" type="button" id="button-imprimer" value="Imprimer la Recette" /></a> 
				<a href="listeRecettesPublic"><input class = "retour" type="button" id="button-retour" value="Retour aux Recettes" /></a>
				<br />
				</div>
			</article>
			<article>
			<p>     <br />                  </p>
			</article>
		</section>

	</div>
</body>
</html>