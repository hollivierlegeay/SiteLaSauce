<link rel="stylesheet" href="css/codeCSS.css" />

<header>
	<nav>
		<ul id = "menu">
			<li class="${pageSelectionnee == 'index' ? 'active' : ''}"><a
				href="index"> Accueil </a></li>
			<li class= alinea>~</li>
			<li class="${pageSelectionnee == 'listeRecettesPublic' ? 'active' : ''}"><a
				href="listeRecettesPublic"> Les Recettes </a>
			<li class= alinea>~</li>
			<li class="${pageSelectionnee == 'listeEvenementsPublic' ? 'active' : ''}"><a
				href="listeEvenementsPublic"> Les Ev�nements  </a></li>
			<li class= alinea>~</li>
			<li class="${pageSelectionnee == 'listeEquipesPublic' ? 'active' : ''}"><a
				href="listeEquipesPublic"> Notre Equipe </a></li>
			<li class= alinea>~</li>
			<li class="${pageSelectionnee == 'contact' ? 'active' : ''}"><a
				href="contact"> Contact </a></li>
			<li class= alinea>~</li>
			<li class="${pageSelectionnee == 'connexion' ? 'active' : ''}"><a
				href="connexion">Membres</a></li>
			
		</ul>
	</nav>
</header>
