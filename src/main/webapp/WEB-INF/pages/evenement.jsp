<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE>
<html>

	<!--Informations sur la page, pas affiché sur la page -->
	<head>
		<!--Encodage utilisé (pour les accents ...)-->
		<meta charset="utf-8"/>
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
		
			<div id="cadreBleuEvenements">
				<div id="cadreBlancEvenements">
				<p class="nomEvenement">- Premier Diner : le 27/10/13</p>
				<p class="descriptionEvenement"> Description du premier diner <br> Adresse </p>
				
				<p class="nomEvenement">- Deuxième Diner : le 2/12/13</p>
				<p class="descriptionEvenement"> Description du deuxième diner <br> Adresse </p>
				
				<p class="nomEvenement">- Participation au salon Gastronomique : le 7/12/13</p>
				<p class="descriptionEvenement"> Description du salon <br> Adresse </p>
				</div>
			</div>	
		</div>
	</body>
</html>