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
		<c:set var="pageSelectionnee" value="contact" scope="request"></c:set>
		<jsp:include page="menu.jsp" />	
			
	<div class="cadre1Contact">
					<div class="cadre2Contact">
						<div class="cadre3Contact">
							<div class="cadre4Contact">
								<p class="ListeContact">
								
									<img src="Images/Icone-facebook.png"/> <a href="https://www.facebook.com/lasauce.dhei" target="new">La sauce d'Hei</a>
									<br>
									<br>
									<u>Mails :</u>
									<br>
									<br>
									<span class="marge">- Présidente : <a href="mailto:juliette.grosleron@hei.fr" target="new">Juliette</a></span>
									<br>
									<span class="marge">- Vice-Prez' : <a href="mailto:william.serre@hei.fr" target="new">William</a></span>
									<br>
									<span class="marge">- Trésorier : <a href="mailto:dimitri.laquet@hei.fr" target="new">Dimitri</a></span>
									<br>
									<span class="marge">- Responsable Com' : <a href="mailto:marine.barbieux@hei.fr" target="new">Marine</a></span>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</body>
</html>