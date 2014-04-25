<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<!--Informations sur la page, pas affiché sur la page -->
<head>
<!--Encodage utilisé (pour les accents ...)-->
<meta charset="utf-8" />
<!--Lien avec la page CSS-->
<link rel="stylesheet" href="css/codeCSS.css" />
<!--Titre s'affichant dans l'onglet du navigateur-->
<title>LaSauce - Connexion à l'espace Membre</title>
</head>

<!--Contient la majeure partie du code, ce qui est écrit est affiché à l'écran-->
<body>
	<div id="fondblanc">
		<p>
			<img class="baniere" src="Images/baniere.jpg" alt="Banière du site" />
		</p>
		<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="connexion" scope="request"></c:set>
		<jsp:include page="menu.jsp" />

	<form method="post" action="connexion">
		<fieldset>
			<legend>Connexion à l'espace Membre</legend>
			<p>Vous pouvez vous connecter via ce formulaire. [Réservé aux membres de l'équipe LaSauce]</p>

			<label for="email">Adresse email HEI <span class="requis">*</span></label>

			<input type="email" id="email" name="email"
				value="<c:out value="${utilisateur.email}"/>" size="20"
				maxlength="60" /> <span class="erreur">${form.erreurs['email']}</span>
			<br /> 
			<label for="motdepasse">Mot de passe <span class="requis">*</span></label> 
			<input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" /> 
			<span class="erreur">${form.erreurs['motdepasse']}</span> <br /> <input
				type="submit" value="Connexion" class="sansLabel" />

 			<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
			
			<%--Vérification de la présence d'un objet
utilisateur en session--%>

			<c:if test="${!empty sessionScope.sessionUtilisateur}">
				<%--Si l'utilisateur existe en session, alors on affiche son adresse email.--%>

				<p class="succes">Succès de la connexion. <br /> Vous êtes connecté(e) avec l'adresse :
					${sessionScope.sessionUtilisateur.email}
					<br /> 
					<a href="indexM">Accéder à l'espace Membres</a>
					</p> 
			</c:if>

		</fieldset>
	</form>
	
	</div>
</body>
</html>