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
			
			<!-- Titre de la page -->
			<h1 class=titreform>Création d'une recette</h1>

			<form method="post" action="ajouterRecette">
				<fieldset>
					<legend>Informations Recette</legend>
					
					<!-- Ajout du titre -->
					<label for="titrePlatRecette">Titre <span class="requis">*</span></label>
					<input type="text" id="titrePlatRecette" name="titrePlatRecette"
						value="<c:out 
						value="${param.titrePlatRecette}"/>"
						size="20" maxlength="50" /> <span class="erreur">${erreurs['titrePlatRecette']}</span><br />
					
					<!-- Ajout de la difficulté de la recette -->
					<label for="difficulteRecette">Difficulté <span
						class="requis">*</span></label> <input
						type="text" id="difficulteRecette" name="difficulteRecette"
						value="<c:out value="${param.difficulteRecette}"/>"
						size="20" maxlength="20" /> <span class="erreur">${erreurs['difficulteRecette']}</span>
					<br />
					
					<!-- Ajout du type de plat -->
					<label for="typePlatRecette">Type de plat <span
						class="requis">*</span>
					</label> <input type="text" id="typePlatRecette" name="typePlatRecette"
						value="<c:out 
						value="${param.typePlatRecette}"/>"
						size="20" maxlength="20" /> <span class="erreur">${erreurs['typePlatRecette']}</span><br />
				
					<!-- Ajout d'une image -->
					<label for="imgRecette">Photo<span class="requis">*</span></label>
					<input type="text"
						placeholder="URL de l'image - clic droit sur l'image pour l'obtenir"
						id="imgRecette" name="imgRecette"
						value="<c:out 
						value="${param.imgRecette}"/>" size="65"
						maxlength="500" /><br /> <span class="erreur">${erreurs['imgRecette']}</span><br />
					
					<!-- Ajout de la liste des ingrédients  -->
					<label for="ingredientsRecette">Ingrédients <span
						class="requis">*</span>
					</label>
					<textarea name="ingredientsRecette" id="ingredientsRecette"
						rows="5" cols="50"
						value="<c:out 
						value="${param.ingredientsRecette}"/>">
					</textarea><br />
					<span class="erreur">${erreurs['ingredientsRecette']}</span> <br />
					
					<!-- Ajout du texte de la recette -->
					<label for="texteRecette"> Préparation <span class="requis">*</span></label>
					<textarea name="texteRecette" id="texteRecette"
						value="<c:out 
						value="${param.texteRecette}"/>" rows="10"
						cols="50">
					</textarea><br />
					<span class="erreur">${erreurs['texteRecette']}</span> <br />
					<p class="${empty erreurs ? 'succes' :
					'erreur'}">${resultat}</p>
				</fieldset>
				
				<!-- Bouton pour valider-->
				<div class="boutons">
					<input style = "text-align : center;"type="submit" value="Valider" /> 
					<input type="reset"value="Remettre à zéro" /> 
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