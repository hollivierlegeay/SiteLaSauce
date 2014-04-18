<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<title>LaSauce</title>
	</head>
	
	<!--Contient la majeure partie du code, ce qui est écrit est affiché à l'écran-->
	<body>
			
		<div id="fondblanc">
				
			<p>
				<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
			</p>
		<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="listeMembres" scope="request"></c:set>
		<jsp:include page="menu.jsp" />	 
		
			<div id="cadreBleuEvenements">
				<div id="cadreBlancEvenements">

			<article>
				<h3>Detail du Membre</h3>
				<div>
					<h2>Nom</h2>
						<div>
							<br />
							<p>${membre.nom}</p>
							<br />
						</div>
				</div>
				<div>
					<h2>Prénom</h2>
						<div>
							<br />
							<p>${membre.prenom}</p>
							<br />
						</div>
				</div>
				<div>
					<h2>Mail HEI</h2>
						<div>
							<br />
							<p>${membre.mailHEI}</p>
							<br />
						</div>
				</div>
				<div>
					<h2>Téléphone</h2>
						<div>
							<br />
							<p>${membre.telephone}</p>
							<br />
						</div>
				</div>
				<div>
					<p>
						<a href="listeMembres">Retour à la liste des Membres</a>
					</p>
				</div>
			</article>

				</div>
			</div>	
		</div>
	</body>
</html>