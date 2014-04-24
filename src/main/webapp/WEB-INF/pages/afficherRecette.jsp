<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Affichage d'une recette</title>
<link rel="stylesheet" href="css/codeCSS.css" />
</head>
<body>
	<c:import url="/WEB-INF/pages/menuM.jsp" />
	<div id="corps">
		<p class="info">${ form.resultat }</p>
		<p>
			Titre :
			<c:out value="${ recette.titrePlat }" />
		</p>
		<p>
			Difficulté :
			<c:out value="${ recette.difficulte }" />
		</p>
		<p>
			Type de plat :
			<c:out value="${ recette.typePlat}" />
		</p>
		<p>
			Ingrédients :
			<c:out value="${recette.ingredients }" />
		</p>
		<p>
			Préparation :
			<c:out value="${ recette.texteRecette }" />
		</p>
	</div>
</body>
</html>