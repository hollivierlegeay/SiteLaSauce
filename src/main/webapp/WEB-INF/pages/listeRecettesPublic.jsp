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
<div id="fondblanc">
<body>
	

		<p>
			<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
		</p>

		<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="listeRecettesPublic" scope="request"></c:set>
		<jsp:include page="menu.jsp" />

		<h1>Les Recettes</h1>
<section>
	<article>
			<div>
				<c:forEach var="recette" items="${recettes}">
				<div class ="carouselRecettes" >
        			<div class = "recette"><a class = info href="recette?idRecette=${recette.idRecette}"
												title="Recette ${recette.titrePlat}"><input class = imgrecette type="image" src="${recette.imgRecette}" />
												<span class = titreRecette> ${recette.titrePlat} </span></a>
												</div>
       				</div>
					</c:forEach>
			</div>	
			
	</article>
	<article>
	<div><p>     <br />                  </p></div>
	</article>
	
</section>
</body>
</div>
</html>