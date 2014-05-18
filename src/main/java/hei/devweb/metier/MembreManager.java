package hei.devweb.metier;

import hei.devweb.dao.MembreDao;
import hei.devweb.model.Membre;

import java.util.List;

/**
 * MembreManager est la classe qui gère les méthodes pour interagir la table
 * "membre" de la base de données sitelasauce.
 * 
 * @see MembreDao
 * 
 */
public class MembreManager {
	private static MembreManager instance;
	/**
	 * Création du lien avec la table "membre" de la base de données.
	 * 
	 * @see MembreDao
	 * 
	 */
	private MembreDao membreDao = new MembreDao();

	/**
	 * Retourne l'instance du Manager Membre.
	 * 
	 * @return L'instance du manager de la table "membre".
	 */
	public static MembreManager getInstance() {
		if (instance == null) {
			instance = new MembreManager();
		}
		return instance;
	}

	/**
	 * Retourne la liste des membres de la table "membre".
	 * 
	 * @return La liste des membres.
	 * 
	 * @see MembreDao#listerMembres()
	 */
	public List<Membre> listerMembres() {
		return membreDao.listerMembres();
	}

	/**
	 * Vérifie les erreurs de saisie et retourne l'objet Membre.
	 * 
	 * @see MembreDao#getMembre(Integer)
	 * 
	 * @param idMembre
	 *            Id du membre qui sera retourné.
	 * 
	 * @return L'objet Membre d'identifiant idMembre.
	 * 
	 * 
	 */
	public Membre getMembre(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException(
					"L'identifiant du membre doit être renseigné.");
		}
		return membreDao.getMembre(id);
	}

	/**
	 * Vérifie les erreurs de saisie et met à jour la table "membre"
	 * 
	 * @see MembreDao#ajouterMembre(Membre)
	 * 
	 * @param membre
	 *            Le nouveau membre ajoutée.
	 * 
	 */
	public void ajouterMembre(Membre membre) {
		if (membre == null) {
			throw new IllegalArgumentException(
					"Le membre doit être renseignée.");
		}
		if (membre.getIdMembre() == null || membre.getNom().equals("") == true
				|| membre.getPrenom().equals("") == true
				|| membre.getMotdePasse().equals("") == true
				|| membre.getMailHEI().equals("") == true
				|| membre.getTelephone().equals("") == true) {
			throw new IllegalArgumentException(
					"Un champ obligatoire du membre n'est pas renseigné.");
		}

		membreDao.ajouterMembre(membre);
	}

	/**
	 * Met à jour la table "membre".
	 * 
	 * @see MembreDao#supprimerMembre(Membre)
	 * 
	 * @param idMembre
	 *            L'id du membre qui sera supprimé.
	 * 
	 */
	public void supprimerMembre(Integer idMembre) {
		membreDao.supprimerMembre(idMembre);
	}

}
