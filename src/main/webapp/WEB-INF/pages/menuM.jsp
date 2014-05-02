<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="css/codeCSS.css" />

<ul id="menuM">

	<li><a class="${pageSelectionnee == 'indexM' ? 'active' : ''}"
		href="indexM"> Accueil Membre</a></li>

	<li><a
		class="${pageSelectionnee == 'listeRecettes' ? 'active' : ''}"
		href="listeRecettes"> Recettes</a>
		<ul>
			<li><a
				class="${pageSelectionnee == 'ajouterRecette' ? 'active' : ''}"
				href="ajouterRecette"> Création recette</a></li>
			<li><a
				class="${pageSelectionnee == 'listeRecettes' ? 'active' : ''}"
				href="listeRecettes"> Liste recettes</a></li>
		</ul></li>

	<li><a
		class="${pageSelectionnee == 'listeEvenements' ? 'active' : ''}"
		href="listeEvenements"> Evènements</a>
		<ul>
			<li><a
				class="${pageSelectionnee == 'ajouterEvenement' ? 'active' : ''}"
				href="ajouterEvenement"> Création évènement</a></li>
			<li><a
				class="${pageSelectionnee == 'listeEvenements' ? 'active' : ''}"
				href="listeEvenements"> Listes évènements</a></li>
		</ul></li>

	<li><a
		class="${pageSelectionnee == 'listeEquipes' ? 'active' : ''}"
		href="listeEquipes"> Equipes</a>
		<ul>
			<li><a
				class="${pageSelectionnee == 'ajouterEquipe' ? 'active' : ''}"
				href="ajouterEquipe"> Création équipe</a></li>
			<li><a
				class="${pageSelectionnee == 'listeEquipes' ? 'active' : ''}"
				href="listeEquipes"> Listes équipes</a></li>
		</ul></li>
	<li><a
		class="${pageSelectionnee == 'listeMembres' ? 'active' : ''}"
		href="listeMembres"> Membres</a>
		<ul>
			<li><a
				class="${pageSelectionnee == 'ajouterMembre' ? 'active' : ''}"
				href="ajouterMembre"> Création membre</a></li>
			<li><a
				class="${pageSelectionnee == 'listeMembres' ? 'active' : ''}"
				href="listeMembres"> Liste membres</a></li>
		</ul></li>

</ul>
