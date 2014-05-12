package hei.devweb.metier;

import hei.devweb.dao.EquipeDao;
import hei.devweb.model.Equipe;

import java.util.List;

/**
 * EquipeManager est la classe qui gère les méthodes pour interagir la table
 * "equipe" de la base de données sitelasauce.
 * 
 * @see EquipeDao
 * 
 */
public class EquipeManager {

	private static EquipeManager instance;
	/**
	 * Création du lien avec la table "equipe" de la base de données.
	 * 
	 * @see EquipeDao
	 * 
	 */
	private EquipeDao equipeDao = new EquipeDao();

	/**
	 * Retourne l'instance du Manager Equipe.
	 * 
	 * @return L'instance du manager de la table "equipe".
	 */
	public static EquipeManager getInstance() {
		if (instance == null) {
			instance = new EquipeManager();
		}
		return instance;
	}

	/**
	 * Retourne la liste des équipes de la table "equipe".
	 * 
	 * @return La liste des équipes.
	 * 
	 * @see EquipeDao#listerEquipes()
	 */
	public List<Equipe> listerEquipes() {
		return equipeDao.listerEquipes();
	}

	/**
	 * Vérifie les erreurs de saisie et retourne l'objet Equipe.
	 * 
	 * @see EquipeDao#getEquipe(Integer)
	 * 
	 * @param idEquipe
	 *            Id de l'équipe qui sera retournée.
	 * 
	 * @return L'objet Equipe d'identifiant idEquipe.
	 * 
	 * 
	 */
	public Equipe getEquipe(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException(
					"L'identifiant de l'équipe doit être renseigné.");
		}
		return equipeDao.getEquipe(id);
	}

	/**
	 * Vérifie les erreurs de saisie et met à jour la table "equipe"
	 * 
	 * @see EquipeDao#ajouterEquipe(Equipe)
	 * 
	 * @param equipe
	 *            La nouvelle équipe ajoutée.
	 * 
	 */
	public void ajouterEquipe(Equipe equipe) {
		if (equipe == null) {
			throw new IllegalArgumentException("L'équipe doit être renseignée.");
		}
		if (equipe.getIdEquipe() == null
				|| equipe.getAnneeMandat().equals("") == true) {
			throw new IllegalArgumentException(
					"Un champ obligatoire de l'équipe n'est pas renseigné.");
		}

		equipeDao.ajouterEquipe(equipe);
	}

	/**
	 * Met à jour la table "equipe".
	 * 
	 * @see EquipeDao#supprimerEquipe(Equipe)
	 * 
	 * @param idEquipe
	 *            L'id de l'équipe qui sera supprimée.
	 * 
	 */
	public void supprimerEquipe(Integer idEquipe) {
		equipeDao.supprimerEquipe(idEquipe);
	}

}
