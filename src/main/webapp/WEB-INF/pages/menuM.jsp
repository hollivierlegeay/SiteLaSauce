<link rel="stylesheet" href="css/codeCSS.css" />

<header>
	<nav>
		<ul>
			<li class="${pageSelectionnee == 'indexM' ? 'active' : ''}"><a
				href="indexM"> Espace Membres </a></li>

			<li class="${pageSelectionnee == 'listeMembres' ? 'active' : ''}"><a
				href="listeMembres"> Liste des Membres </a>

			<li class="${pageSelectionnee == 'ajouterMembre' ? 'active' : ''}"><a
				href="ajouterMembre"> Les Ev�nements  </a></li>
	
			<li class="${pageSelectionnee == 'ajouterEquipe' ? 'active' : ''}"><a
				href="ajouterEquipe"> Cr�er une nouvelle �quipe </a></li>
	
			<li class="${pageSelectionnee == 'ajouterRecette' ? 'active' : ''}"><a
				href="ajouterRecette"> Cr�er une nouvelle recette </a></li>
	
			<li class="${pageSelectionnee == 'connexion' ? 'active' : ''}"><a
				href="connexion">Membres</a></li>
		</ul>
	</nav>
</header>
