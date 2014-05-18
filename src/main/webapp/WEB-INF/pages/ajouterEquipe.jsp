<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Création d'une Equipe</title>
<!--Liens-->
<link rel="stylesheet" href="css/codeCSS.css" />
<link rel="shortcut icon" href="Images/favicon.ico">
</head>
<body>

	<div id="fondblanc">
		<p>
			<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
		</p>
		<!-- Menu de navigation de l'espace membre -->
		<c:set var="pageSelectionnee" value="ajouterEquipe" scope="request" />
		<jsp:include page="menuM.jsp" />

		<h1 class=titreform>Création d'une Equipe</h1>
		<form method="post" action="ajouterEquipe">
			<fieldset>
				<legend>Informations Equipe</legend>

				<!-- Ajout de l'année du mandat-->
				<label for="anneeMandatEquipe">Année du mandat <span
					class="requis">*</span></label> <input type="text"
					placeholder="ex: 2013/2014" id="anneeMandatEquipe"
					name="anneeMandatEquipe"
					value="<c:out value="${param.anneeMandatEquipe}"/>" size="20"
					maxlength="20" /><br /> <span class="erreur">${erreurs['anneeMandatEquipe']}</span>
				<br />

				<!-- Ajout d'une image -->
				<label for="imgEquipe">Photo de l'équipe <span
					class="requis">*</span></label> <input type="text"
					placeholder="URL de l'image - clic droit sur l'image pour l'obtenir"
					id="imgEquipe" name="imgEquipe"
					value="<c:out value="${param.imgEquipe}"/>" size="65"
					maxlength="500" /><br /> <span class="erreur">${erreurs['imgEquipe']}</span>
				<br />

				<!-- Ajout d'une description de l'équipe -->
				<label for="descriptionEquipe">Description</label>
				<textarea name="descriptionEquipe" id="descriptionEquipe" rows="5"
					cols="50">
				</textarea>
				<br />

			</fieldset>

			<!-- Boutons pour valider ou remettr à zéro le formulaire d'ajout -->
			<div class="boutons">
				<input type="submit" value="Valider" /> <input type="reset"
					value="Remettre à zéro" /> <br />
			</div>
		</form>
		<p>
			<br>
		</p>
	</div>
</body>
</html>