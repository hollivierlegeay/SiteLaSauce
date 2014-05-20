
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<!--Informations sur la page, pas affiché sur la page -->
<head>
<!--Encodage utilisé (pour les accents ...)-->
<meta charset="utf-8" />
<!--Liens-->
<link rel="stylesheet" href="css/codeCSS.css" />
<link rel="shortcut icon" href="Images/favicon.ico">
<!--Titre s'affichant dans l'onglet du navigateur-->
<title>Connexion à l'espace Membre</title>
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

		<!-- Titre de la page -->
		<h1 class="contact">Espace réservé aux membres de l'association</h1>

		<!-- Formulaire de connexion -->
		<form method="post" action="connexion">
			<fieldset>
				<legend>Connexion à l'espace Membre</legend>
				<p>Vous pouvez vous connecter via ce formulaire. [Réservé aux
					membres de l'équipe LaSauce]</p>

				<!-- Saisie du mail -->
				<label for="email">Adresse email HEI <span class="requis">*</span></label>

				<input type="email" id="email" name="email"
					value="<c:out value="${utilisateur.email}"/>" size="20"
					maxlength="60" /> <span class="erreur">${form.erreurs['email']}</span>
				<br />

				<!-- Saisie du mot de passe -->
				<label for="motdepasse">Mot de passe <span class="requis">*</span></label>
				<input type="password" id="motdepasse" name="motdepasse" value=""
					size="20" maxlength="20" /> <span class="erreur">${form.erreurs['motdepasse']}</span>
				<br /> <input type="submit" value="Connexion" class="sansLabel" />

				<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>

				<%--Vérification de la présence d'un objet utilisateur en session--%>

				<c:if test="${!empty sessionScope.sessionUtilisateur}">
					<%--Si l'utilisateur existe en session, alors on affiche son adresse email.--%>

					<p class="succes">
						Succès de la connexion. <br>
						Vous êtes connecté(e) avec l'adresse :
						${sessionScope.sessionUtilisateur.email} <br /> <br /> <a
							href="indexM"><input class="acces" type="button"
							id="button-membre" value="Accéder à l'espace Membres" /></a>
					</p>
				</c:if>

			</fieldset>
		</form>

	</div>
</body>
</html>