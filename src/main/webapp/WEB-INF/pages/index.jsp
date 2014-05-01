<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE>
<html>
	
<head>
		<!--Encodage utilisé (pour les accents ...)-->

		<!--Titre s'affichant dans l'onglet du navigateur-->
		<title>LaSauce - Accueil </title>
		
		<!--Lien avec la page CSS-->
		<link rel="stylesheet" href="css/codeCSS.css"/>
		<link rel="stylesheet" href="css/flexslider.css" />

</head>

<body>
<div>
	<div id="fondblanc">
	<p>
	<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
	</p>	
	<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="index" scope="request"></c:set>
		<jsp:include page="menu.jsp" />

		<div id="encadreBleu">
			<div id="encadreBienvenue">
			<h3 id="titreBienvenue">Bienvenue <br> sur le site de LaSauce, l'association de cuisine d'Hei</h3>
			<p id="texteBienvenue">Depuis 3 ans, LaSauce redonne aux Heiens le plaisir de bien manger !
					LaSauce d'HEI est une association qui a été crée dans le but de rassembler les élèves de l'école autour du plaisir de la cuisine !
			</div>
		</div>

<!-- 	<div >
     	<section class="slider">
     		<div class="flexslider">
     			<ul class="slides">
   				 <li><img src="Images/photo6.jpg" width=636 height=366 /></li>
   				 <li><img src="Images/photo2.jpg"width=636 height=366/></li>
    			 <li><img src="Images/photo3.jpg"width=636 height=366/></li>
   				 <li><img src="Images/photo4.jpg"width=636 height=366/></li>  
      			</ul>
        	</div>
      </section>
  </div> -->
 
  
 <!-- jQuery -->
 <script type="text/javascript" src="jquery.js"></script> 
  
<!-- FlexSlider -->
<script type="text/javascript" src="jquery.flexslider.js"></script>

<!-- <script type="text/javascript">
$(window).load(function() {
	  $('.flexslider').flexslider({
	    animation: "slide"
	  });
	}); 
</script>	 -->	
 </div>
</div>
</body>
</html>