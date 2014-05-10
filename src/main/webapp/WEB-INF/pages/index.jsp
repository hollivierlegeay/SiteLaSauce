<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE>
<html>
	
<head>
		<!--Encodage utilisé (pour les accents ...)-->

		<!--Titre s'affichant dans l'onglet du navigateur-->
		<title>LaSauce - Accueil </title>
		
		<!--Liens-->
		<link rel="stylesheet" href="css/codeCSS.css"/>
		<link rel="shortcut icon" href="Images/favicon.ico">
		
		<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">

		<!-- Demo CSS -->
		<link rel="stylesheet" href="demo/css/demo.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="flexslider.css" type="text/css" media="screen" />

		<!-- Modernizr -->
		<script src="demo/js/modernizr.js"></script>

</head>

<body class="loading">

	<div id="fondblanc">
	<p>
	<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
	</p>	
	
	<!-- Menu de navigation -->
	<c:set var="pageSelectionnee" value="index" scope="request"></c:set>
	<jsp:include page="menu.jsp" />
	
	<!--Encadre de bienvenue -->
		<div id="encadreBleu">
			<div id="encadreBienvenue">
			<h3 id="titreBienvenue">Bienvenue <br> sur le site de LaSauce, l'association de cuisine d'Hei</h3>
			<p id="texteBienvenue">Depuis 3 ans, LaSauce redonne aux Heiens le plaisir de bien manger !
					LaSauce d'HEI est une association qui a été créée dans le but de rassembler les élèves de l'école autour du plaisir de la cuisine !
			</div>
		</div>

			<!-- Slider -->
			<div id="container" class="cf">
				<div id="main">
					<section class="slider">
						<div class="flexslider">
							<ul class="slides">
								<li>
									<img src="demo/images/la6.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la5.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la0.jpg" width="400" height="300" />
								</li>
								<li>
									<img src="demo/images/la17.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la21.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la15.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la14.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la13.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la11.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la12.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la10.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la3.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la4.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la2.jpg" width="400" height="300"/>
								</li>
								<li>
									<img src="demo/images/la43.jpg" width="400" height="300"/>
								</li>
							</ul>
						</div>
					</section>  
				</div>
			</div>

		</div>

	  <!-- jQuery -->
	  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	  <script>window.jQuery || document.write('<script src="js/libs/jquery-1.7.min.js">\x3C/script>')</script>

	  <!-- FlexSlider -->
	  <script defer src="jquery.flexslider.js"></script>

	  <script type="text/javascript">
		$(function(){
		  SyntaxHighlighter.all();
		});
		$(window).load(function(){
		  $('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		  });
		});
	  </script>


	  <!-- Syntax Highlighter -->
	  <script type="text/javascript" src="demo/js/shCore.js"></script>
	  <script type="text/javascript" src="demo/js/shBrushXml.js"></script>
	  <script type="text/javascript" src="demo/js/shBrushJScript.js"></script>

	  <!-- Optional FlexSlider Additions -->
	  <script src="demo/js/jquery.easing.js"></script>
	  <script src="demo/js/jquery.mousewheel.js"></script>
	  <script defer src="demo/js/demo.js"></script>
</body>
</html>