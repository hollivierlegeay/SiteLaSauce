<link rel="stylesheet" href="css/codeCSS.css" />

<header>
	<nav>
		<ul id = "menu">
			<li class="${pageSelectionnee == 'index' ? 'active' : ''}"><a
				href="index"> Accueil </a></li>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'listeRecettes' ? 'active' : ''}"><a
				href="listeRecettes"> Les Recettes </a>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'listeEvenements' ? 'active' : ''}"><a
				href="listeEvenements"> Les Evènements  </a></li>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'listeEquipes' ? 'active' : ''}"><a
				href="listeEquipes"> Notre Equipe </a></li>
			<li><a>~</a></li>
			<li class="${pageSelectionnee == 'contact' ? 'active' : ''}"><a
				href="contact"> Contact </a></li>
		<li><a>~</a></li>
			<%-- 	<%if(request.getSession().getAttribute("mailHEI").equals("")||request.getSession().getAttribute("mailHEI").equals(null)){ %>
			--%><li class="${pageSelectionnee == 'connexion' ? 'active' : ''}"><a
				href="connexion">Membres</a></li>
			<%-- %}else{ %>
			<li class="${pageSelectionnee == 'connexion' ? 'active' : ''}"><a
				href="indexM">Membres</a></li>
				<%} %>  --%>
		</ul>
	</nav>
</header>
