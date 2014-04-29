<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Création d'un Evènement</title>
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
				<c:set var="pageSelectionnee" value="ajouterEvenement" scope="request" />
				<jsp:include page="menuM.jsp" />
			</fieldset>


			<h1>Création d'un Evènement</h1>
			<form method="post" action="ajouterEvenement">
				<fieldset>
					<legend>Informations Evènement</legend>

					<label for="titreEvenement">Evènement <span class="requis">*</span></label>
					<input type="text" id="titreEvenement" name="titreEvenement"
						value="" size="20" maxlength="20" /> <br /> 
					<label for="dateEvenement">Date</label> <input type="date" id="dateEvenement" name="dateEvenement"/> <br /> 
					<label
						for="detailEvenement">Description <span class="requis">*</span></label>
					<textarea name="detailEvenement" id="detailEvenement"rows="5" cols="50">
				</textarea>
					<br />
				<label for="lieuEvenement">Lieu <span class="requis">*</span></label>
					<input type="text" id="lieuEvenement" name="lieuEvenement"
						value="" size="65" maxlength="100" /> <br /> 
				</fieldset>
				<input type="submit" value="Valider" /> <input type="reset"
					value="Remettre à zéro" /> <br />

			</form>
			<p class="${pageSelectionnee == 'listeEvenements' ? 'active' : ''}">
				<a href="listeEvenements">Retour à la liste des Evenements</a>
			</p>
		</div>

	</div>

</body>
</html>