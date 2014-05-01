<link rel="stylesheet" href="css/codeCSS.css" />

<header>
	<nav>
		<ul id = "menu">
			<li class="${pageSelectionnee == 'index' ? 'active' : ''}"><a
				href="index"> Accueil </a></li>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'listeRecettesPublic' ? 'active' : ''}"><a
				href="listeRecettesPublic"> Les Recettes </a>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'listeEvenementsPublic' ? 'active' : ''}"><a
				href="listeEvenementsPublic"> Les Evènements  </a></li>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'listeEquipesPublic' ? 'active' : ''}"><a
				href="listeEquipesPublic"> Notre Equipe </a></li>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'contact' ? 'active' : ''}"><a
				href="contact"> Contact </a></li>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'connexion' ? 'active' : ''}"><a
				href="connexion">Membres</a></li>
			
		</ul>
	</nav>
</header>
