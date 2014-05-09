package hei.devweb.metier;

import hei.devweb.dao.MembreDao;
import hei.devweb.model.Membre;

import java.util.List;

public class MembreManager {
	private static MembreManager instance;

	private MembreDao membreDao = new MembreDao();

	public static MembreManager getInstance() {
		if (instance == null) {
			instance = new MembreManager();
		}
		return instance;
	}

	public List<Membre> listerMembres() {
		return membreDao.listerMembres();
	}

	public Membre getMembre(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException(
					"L'identifiant du membre doit être renseigné.");
		}
		return membreDao.getMembre(id);
	}

	public void ajouterMembre(Membre membre) {
		if (membre == null) {
			throw new IllegalArgumentException("Le membre doit être renseignée.");
		}
		if (membre.getIdMembre() == null || membre.getNom().equals("")!=true
				|| membre.getPrenom().equals("")!=true|| membre.getMotdePasse().equals("")!=true
				|| membre.getMailHEI().equals("")!=true
				||  membre.getTelephone().equals("")!=true) {
			throw new IllegalArgumentException(
					"Un champ obligatoire du membre n'est pas renseigné.");
		}

		membreDao.ajouterMembre(membre);
	}
	public void supprimerMembre(Integer idMembre) {
		membreDao.supprimerMembre(idMembre);
	}

}
