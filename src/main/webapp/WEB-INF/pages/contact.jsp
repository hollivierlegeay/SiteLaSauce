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
			<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="contact" scope="request"></c:set>
		<jsp:include page="menu.jsp" />	
	<section>
	<article>		
		<div class="cadre1Contact">
			<div class="cadre2Contact">
				<div class="cadre3Contact">
					<div class="cadre4Contact">
						<h1 class="contact">Pour contacter l'association</h1>
						<p class="ListeContact">
						Rejoignez-nous sur Facebook : La sauce d'Hei	<br><br>
						 <a href="https://www.facebook.com/lasauce.dhei" target="new"><img class="fb" src="Images/Icone-facebook.png"/></a>
						<br>
						<br>	
						Ou envoyer-nous un mail : <br><br>
						<a href="mailto:la.sauce@hei.fr" target="new"><img class="mail" src="Images/mail.jpg"/></a>
						<br>
					</div>
				</div>
			</div>
		</div>
	</article>
	<article>
	<p> <br>  <br></p>
	</article>
	</section>
	</div>
	</body>
</html>