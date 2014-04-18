<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>

<!--Informations sur la page, pas affich� sur la page -->
<head>
<!--Encodage utilis� (pour les accents ...)-->
<meta charset="utf-8" />
<!--Lien avec la page CSS-->
<link rel="stylesheet" href="css/codeCSS.css" />
<!--Titre s'affichant dans l'onglet du navigateur-->
<title>LaSauce</title>
</head>

<!--Contient la majeure partie du code, ce qui est �crit est affich� � l'�cran-->
<body>

	<div id="fondblanc">
			
	<p>
			<img class="baniere" src="Images/baniere.jpg" alt="Bani�re du site" />
		</p>
	
 	<!-- Menu de navigation -->
		<c:set var="pageSelectionnee" value="listeMembres" scope="request"></c:set>
		<jsp:include page="menu.jsp" />	 
		
		<div id="cadreBleuEvenements">
			<div id="cadreBlancEvenements">
					<div>
					<table >
						<thead>
							<tr>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="membre" items="${membres}">
								<tr>
									<td><p class=font>${membre.nom}</p></td>
									<td><p class=font>${membre.prenom}</p></td>
									<td><p>
											<a href="membre?idMembre=${membre.idMembre}"
												title="D�tails ${membre.prenom} "> <span></span>D�tails
												du Membre
											</a>
										</p></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>

			</div>
		</div>
	</div>
</body>
</html>