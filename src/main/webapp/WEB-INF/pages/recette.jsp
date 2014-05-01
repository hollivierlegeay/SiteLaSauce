<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>

<!--Informations sur la page, pas affiché sur la page -->
<head>
<!--Encodage utilisé (pour les accents ...)-->
<meta charset="utf-8" />
<!--Lien avec la page CSS-->
<link rel="stylesheet" href="css/codeCSS.css" />
<!--Titre s'affichant dans l'onglet du navigateur-->
<title>LaSauce - Les Recettes</title>
</head>

<!--Contient la majeure partie du code, ce qui est écrit est affiché à l'écran-->
<body>
	<div id="fondblanc">

		<p>
			<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
		</p>

		<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="listeRecettes" scope="request"></c:set>
		<jsp:include page="menu.jsp" />

		<section>
			<article>
				<div>
					<h3>Detail de la Recette</h3>
					<div>
						<br />
						<h2>
							<p>${recette.titrePlat}</p>
						</h2>
					</div>
					<img src="${recette.imgRecette}" alt="Photo Recette" />
					
					<div>
						<br />
						<p>
						<h3>Difficulté :</h3>

						${recette.difficulte}
						</p>

					</div>
					<div>
						<br />
						<p>
						<h3>Type de plat :</h3>

						${recette.typePlat}
						</p>

					</div>
					<div>
						<br />
						<h3>Ingrédients :</h3>
						<div>
							<p>${recette.ingredients}</p>
						</div>
					</div>
					<div>
						<br />
						<h2>Préparation :</h2>
						<div>
							<p>${recette.texteRecette}</p>
						</div>
					</div>
					<div>
						<div>
							<br />
							<p>
								<a href="listeRecettesPublic">Retour à la liste des Recettes</a>
							</p>
							<br />
						</div>
					</div>
				</div>
				<div></div>
			</article>
		</section>

	</div>
</body>
</html>