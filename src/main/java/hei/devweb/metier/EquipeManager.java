package hei.devweb.metier;

import hei.devweb.dao.EquipeDao;
import hei.devweb.model.Equipe;

import java.util.List;

public class EquipeManager {
	private static EquipeManager instance;

	private EquipeDao equipeDao = new EquipeDao();

	public static EquipeManager getInstance() {
		if (instance == null) {
			instance = new EquipeManager();
		}
		return instance;
	}

	public List<Equipe> listerEquipes() {
		return equipeDao.listerEquipes();
	}

	public Equipe getEquipe(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException(
					"L'identifiant de l'équipe doit être renseigné.");
		}
		return equipeDao.getEquipe(id);
	}

	public void ajouterEquipe(Equipe equipe) {
		if (equipe == null) {
			throw new IllegalArgumentException("L'équipe doit être renseignée.");
		}
		if (equipe.getIdEquipe() == null 
				|| equipe.getAnneeMandat() == null
				|| equipe.getDescriptionEquipe() == null) {
			throw new IllegalArgumentException(
					"Un champ obligatoire de l'équipe n'est pas renseigné.");
		}

		equipeDao.ajouterEquipe(equipe);
	}


	public void supprimerEquipe(Integer idEquipe) {
		equipeDao.supprimerEquipe(idEquipe);
	}

}
