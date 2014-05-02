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
		<c:set var="pageSelectionnee" value="listeEquipes" scope="request"></c:set>
		<jsp:include page="menu.jsp" />	
		<div class="cadre1Contact">
					<div class="cadre2Contact">
						<div class="cadre3Contact">
							<div class="cadre4Contact">
								<p class="ListeContact">
									<br>
									<br>
									<u>Facebook :</u> https://www.facebook.com/lasauce.dhei
									<br>
									<br>
									<u>Mail :</u>
									<br>
									<br>
									<span class="marge">- Présidente : juliette.grosleron@hei.fr</span>
									<br>
									<span class="marge">- Vice-Prez' : william.serre@hei.fr</span>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</body>
</html>