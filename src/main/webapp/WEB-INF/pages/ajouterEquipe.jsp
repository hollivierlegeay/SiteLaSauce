<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Création d'une Equipe</title>
	<!--Liens-->
		<link rel="stylesheet" href="css/codeCSS.css"/>
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

					<label for="anneeMandatEquipe">Année du mandat <span class="requis">*</span></label>
					<input type="text" id="anneeMandatEquipe" name="anneeMandatEquipe"
						value="" size="20" maxlength="20" /> <br /> 
					<label for="imgEquipe">Photo de l'équipe</label> <input type="text" placeholder="URL de l'image - clic droit sur l'image pour l'obtenir"
						id="imgEquipe" name="imgEquipe" value="" size="65"
						maxlength="500" /> <br /> 
					<label
						for="descriptionEquipe">Description <span class="requis">*</span></label>
					<textarea name="descriptionEquipe" id="descriptionEquipe"
						rows="5" cols="50">
				</textarea>
					<br />
				</fieldset>
				<div class="boutons">
				<input type="submit" value="Valider" /> <input type="reset"
					value="Remettre à zéro" /> <br />
				</div>
			</form>
		<p><br></p>
	</div>
</body>
</html>