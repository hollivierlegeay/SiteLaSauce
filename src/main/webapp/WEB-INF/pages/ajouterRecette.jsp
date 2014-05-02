<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Création d'une Recette</title>
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
			<c:set var="pageSelectionnee" value="ajouterRecette" scope="request" />
			<jsp:include page="menuM.jsp" />

			<h1 class=titreform>Création d'une recette</h1>
			<form method="post" action="ajouterRecette">
				<fieldset>
					<legend>Informations Recette</legend>

					<label for="titrePlatRecette">Titre <span class="requis">*</span></label>
					<input type="text" id="titrePlatRecette" name="titrePlatRecette"
						value="" size="20" maxlength="50" /> <br /> <label
						for="difficulteRecette">Difficulté</label> <input type="text"
						id="difficulteRecette" name="difficulteRecette" value="" size="20"
						maxlength="20" /> <br /> <label for="typePlatRecette">Type
						de plat <span class="requis">*</span>
					</label> <input type="text" id="typePlatRecette" name="typePlatRecette"
						value="" size="20" maxlength="20" /> <br /> <label
						for="imgRecette">Photo<span class="requis">*</span></label> <input
						type="text" placeholder="URL de l'image - clic droit sur l'image pour l'obtenir" id="imgRecette" name="imgRecette" value="" size="65"
						maxlength="500" /> <br /> <label for="ingredientsRecette">Ingrédients
						<span class="requis">*</span>
					</label>
					<textarea name="ingredientsRecette" id="ingredientsRecette"
						rows="5" cols="50">
					</textarea>
					<br /> <label for="texteRecette"> Préparation <span
						class="requis">*</span></label>
					<textarea name="texteRecette" id="texteRecette" rows="10" cols="50">
					</textarea>
					<br />

				</fieldset>
				<div class="boutons">
				<input  type="submit" value="Valider" /> <input type="reset"
					value="Remettre à zéro" /> </div><br />

			</form>
		<p><br></p>
		</div>
	</div>
</body>
</html>