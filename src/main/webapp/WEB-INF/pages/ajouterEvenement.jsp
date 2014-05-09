<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Création d'un Evènement</title>
<!--Liens-->
<link rel="stylesheet" href="css/codeCSS.css" />
<link rel="shortcut icon" href="Images/favicon.ico">
</head>
<body>
	<div>

		<div id="fondblanc">
			<p>
				<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
			</p>
			<!-- Menu de navigation de l'espace membre -->
			<c:set var="pageSelectionnee" value="ajouterEvenement"
				scope="request" />
			<jsp:include page="menuM.jsp" />
			
			<!-- Titre de la page -->
			<h1 class=titreform>Création d'un évènement</h1>
			
			<form method="post" action="ajouterEvenement">
				<fieldset>
					<legend>Informations Evènement</legend>
					
					<!-- Ajout du titre -->
					<label for="titreEvenement">Evènement <span class="requis">*</span></label>
					<input type="text" id="titreEvenement" name="titreEvenement"
						value="<c:out value="${param.titreEvenement}"/>" size="20" maxlength="50" /> <br />
					<span class="erreur">${erreurs['titreEvenement']}</span><br /> 
					
					<!-- Ajout de la date -->
					<label for="dateEvenement">Date</label> 
					<input type="date"id="dateEvenement" name="dateEvenement" value="<c:out value="${param.dateEvenement}"/>"/> 
					<br /><br /> 
						
					<!-- Ajout de la description -->
					<label for="detailEvenement">Description <span class="requis">*</span></label>
					<textarea name="detailEvenement" id="detailEvenement" value="<c:out value="${param.detailEvenement}"/>" rows="5"
						cols="50">
					</textarea>
					<br />
					<span class="erreur">${erreurs['detailEvenement']}</span>
					<br /> 
					
					<!-- Ajout du lieu -->
					<label for="lieuEvenement">Lieu <span
						class="requis">*</span></label> <input type="text" id="lieuEvenement"
						name="lieuEvenement" value="<c:out value="${param.lieuEvenement}"/>" size="65" maxlength="100" />
						<br />
					<span class="erreur">${erreurs['lieuEvenement']}</span> <br />
				
				</fieldset>
				
				<!-- Bouton Valider -->
				<div class="boutons">
					<input type="submit" value="Valider" /> 
					<input type="reset" value="Remettre à zéro" />
				</div>
				<br />
			</form>
			<p>
				<br>
			</p>
		</div>
	</div>
</body>
</html>