<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE>
<html>


	<!--Informations sur la page, pas affiché sur la page -->
	<head>
		<!--Encodage utilisé (pour les accents ...)-->
		<meta charset="utf-8"/>
			<!--Liens-->
		<link rel="stylesheet" href="css/codeCSS.css"/>
		<link rel="shortcut icon" href="Images/favicon.ico">
		<!--Titre s'affichant dans l'onglet du navigateur-->
		<title>LaSauce - Espace Membres</title>
		<script type="text/javascript">
		sfHover = function() {
	        var sfEls = document.getElementById("menuM").getElementsByTagName("LI");
	        for (var i=0; i<sfEls.length; i++) {
	                sfEls[i].onmouseover=function() {
	                        this.className+=" sfhover";
	                }
	                sfEls[i].onmouseout=function() {
	                        this.className=this.className.replace(new RegExp(" sfhover\\b"), "");
	                }
	        }
	}
	if (window.attachEvent) window.attachEvent("onload", sfHover);
		</script>
		
	</head>

<!--Contient la majeure partie du code, ce qui est écrit est affiché à l'écran-->
<body>	
		<div id="fondblanc">
			
			<p>
				<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
			</p>
	
	
<!-- 	<fieldset>
	<legend>Menu de l'espace Membres</legend> -->
	<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="indexM" scope="request"></c:set>
		<jsp:include page="menuM.jsp" />
<!-- 	</fieldset> -->
<br>
<br>
 <br>
<h1 class="indexmembre">Bienvenue à l'espace membre du site La Sauce<br> <br></h1>

<br>
<br>
 <br>
 <p class =presentationindex>Ici, vous aurez la possiblité de consulter les recettes, d'en ajouter ou encore d'en supprimer. <br>
Il en va de même pour les évènements, les équipes lors d'une passation et enfin les membres lors des changements d'équipes. <br>
 Cet espace a été crée afin de vous faciliter la gestion de ce site et de l'assiociation.</p>
 <br>
<br>
 <br>
 
              <p style="text-align:center;" ><a class="retour"  class="${pageSelectionnee == 'index' ? 'active' : ''}"href="index"> 
              			Retour au site</a></p>
      		 <p style="text-align:center;"> <a class="deconnexion" href="deconnexion"> 
              			Se déconnecter</a></p>	
        <br>
        <br>
        <br>
</body>
			
		</div>
	</body>
</html>