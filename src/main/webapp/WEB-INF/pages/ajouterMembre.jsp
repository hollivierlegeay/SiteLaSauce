<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Création d'un Membre</title>
<link rel="stylesheet" href="css/codeCSS.css" />
</head>
<body>
	<div>
		<div id="fondblanc">
			<p>
				<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
			</p>
			<!-- Menu de navigation général-->
			<c:set var="pageSelectionnee" value="connexion" scope="request"></c:set>
			<jsp:include page="menu.jsp" />
			<fieldset>
				<legend>Espace Membre</legend>
				<!-- Menu de navigation de l'espace membre -->
				<c:set var="pageSelectionnee" value="ajouterMembre" scope="request" />
				<jsp:include page="menuM.jsp" />
			</fieldset>

			<h1>Création d'un Membre</h1>
			<form method="post" action="ajouterMembre">
				<fieldset>
					<legend>Informations Membre</legend>

					<label for="nomMembre">Nom <span class="requis">*</span></label> <input
						type="text" id="nomMembre" name="nomMembre" value="" size="20"
						maxlength="20" /> <br /> <label for="prenomMembre">Prénom</label>
					<input type="text" id="prenomMembre" name="prenomMembre" value=""
						size="20" maxlength="20" /> <br /> <label for="mailHEIMembre">
						Mail HEI <span class="requis">*</span>
					</label> <input type="email" id="mailHEIMembre" name="mailHEIMembre"
						value="" size="20" maxlength="60" /> <br /> <label
						for="motdePasseMembre"> Mot de passe <span class="requis">*</span></label>
					<input type="password" name="motdePasseMembre"
						id="motdePasseMembre" value="" size="20" maxlength="20" /> <br />
					<label for="telephoneMembre"> Téléphone <span
						class="requis">*</span></label> <input type="number"
						name="telephoneMembre" id="telephoneMembre" value="" size="20"
						maxlength="20" /> <br />
				</fieldset>
				<input type="submit" value="Valider" /> <input type="reset"
					value="Remettre à zéro" /> <br />

			</form>
			<p class="${pageSelectionnee == 'listeRecettes' ? 'active' : ''}">
				<a href="listeRecettes">Retour à la liste des recettes</a>
			</p>
		</div>

	</div>
</body>
</html>