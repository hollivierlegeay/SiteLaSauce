<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Création d'un Membre</title>
	<!--Liens-->
		<link rel="stylesheet" href="css/codeCSS.css"/>
		<link rel="shortcut icon" href="Images/favicon.ico">
</head>
<body>
	<div>
		<div id="fondblanc">
			<p>
				<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
			</p>
				<!-- Menu de navigation de l'espace membre -->
				<c:set var="pageSelectionnee" value="ajouterMembre" scope="request" />
				<jsp:include page="menuM.jsp" />

			<!-- Titre de la page -->
			<h1 class=titreform>Création d'un Membre</h1>
			
			
			<form method="post" action="ajouterMembre">
				<fieldset>
					<legend>Informations Membre</legend>
					
					<!-- Ajout du nom -->
					<label for="nomMembre">Nom <span class="requis">*</span></label> <input
						type="text" id="nomMembre" name="nomMembre" value="<c:out value="${param.nomMembre}"/>" size="40"
						maxlength="50" /> <br />
						<span class="erreur">${erreurs['nomMembre']}</span> <br />
						 
					<!-- Ajout du prenom -->	
					<label for="prenomMembre">Prénom <span
						class="requis">*</span> </label>
					<input type="text" id="prenomMembre" name="prenomMembre" value="<c:out value="${param.prenomMembre}"/>"
						size="40" maxlength="50" /> <br /> <span class="erreur">${erreurs['prenomMembre']}</span><br /> 
					
					<!-- Ajout du mail -->	
					<label for="mailHEIMembre">
						Mail HEI <span class="requis">*</span>
					</label> <input type="email" id="mailHEIMembre" name="mailHEIMembre"
						value="<c:out value="${param.mailHEIMembre}"/>" size="40" maxlength="100" />
						 <br /><span class="erreur">${erreurs['mailHEIMembre']}</span> <br /> 
					
					<!-- Ajout du mot de passe -->
					<label for="motdePasseMembre"> Mot de passe <span class="requis">*</span></label>
					<input type="password" name="motdePasseMembre"
						id="motdePasseMembre" value="<c:out value="${param.motdePasseMembre}"/>" size="40" maxlength="20" />
						 <br /><span class="erreur">${erreurs['motdePasseMembre']}</span> <br />
					
					<!-- Ajout du numéro de telephone -->
					<label for="telephoneMembre"> Téléphone <span
						class="requis">*</span></label> <input type="number"
						name="telephoneMembre" id="telephoneMembre" value="<c:out value="${param.telephoneMembre}"/>" size="40"
						maxlength="20" />
						 <br /><span class="erreur">${erreurs['telephoneMembre']}</span> <br />
						
						<p class="${empty erreurs ? 'succes' : 'erreur'}">${resultat}</p>
				</fieldset>
				
				<!-- Bouton Valider-->
				<div class="boutons">
				<input type="submit" value="Valider" /> <input type="reset"
					value="Remettre à zéro" /> <br />
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