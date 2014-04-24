<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="css/codeCSS.css" />

<div class="menu">

	<p class="${pageSelectionnee == 'indexM' ? 'active' : ''}"><a
				href="indexM"> Accueil Espace Membre</a></p>
	
	<p class="${pageSelectionnee == 'ajouterRecette' ? 'active' : ''}"><a
				href="ajouterRecette"> Créer une nouvelle recette</a>
	</p>
		<p class="${pageSelectionnee == 'listeRecettes' ? 'active' : ''}"><a
				href="listeRecettes"> Voir les recettes
			existantes</a>
	</p>
	
	
	<%-- <p>
		<a href="<c:url value="/creationEvenement"/>">Créer un nouvel evenement</a>
	</p>

	<p>
		<a href="<c:url value="/listeEvenements"/>">Voir les évènements
			existants</a>
	</p>
		<p>
		<a href="<c:url value="/creationEvenement"/>">Créer une nouvelle équipe</a>
	</p>

	<p>
		<a href="<c:url value="/listeEquipes"/>">Voir les équipes
			existantes</a>
	</p>
		<p>
		<a href="<c:url value="/creationMembre"/>">Créer un nouveau membre</a>
	</p>

	<p>
		<a href="<c:url value="/listeMembres"/>">Voir les membres
			existants</a>
	</p> --%>
	
</div>