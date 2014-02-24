package hei.devweb.metier;

import hei.devweb.dao.EvenementDao;
import hei.devweb.model.Evenement;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class EvenementManager {

	private static EvenementManager instance;

	private EvenementDao evenementDao = new EvenementDao();

	public static EvenementManager getInstance() {
		if (instance == null) {
			instance = new EvenementManager();
		}
		return instance;
	}

	public List<Evenement> listerEvenements() {
		return evenementDao.listerEvenements();
	}

	public Evenement getEvenement(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException(
					"L'identifiant du evenement doit etre renseigné.");
		}
		return evenementDao.getEvenement(id);
	}

	public void ajouterEvenement(Evenement evenement) {
		if (evenement == null) {
			throw new IllegalArgumentException(
					"Le evenement doit être renseigné.");
		}
		if (evenement.getIdEvenement() == null
				|| evenement.getTitreEvenement() == null
				|| evenement.getDateEvenement() == null
				|| evenement.getDetailEvenement() == null
				|| evenement.getLieuEvenement() == null) {
			throw new IllegalArgumentException(
					"Un champ obligatoire du evenement n'est pas renseigné.");
		}

		evenementDao.ajouterEvenement(evenement);
	}

	public void supprimerEvenement(Integer idEvenement) {
		evenementDao.supprimerEvenement(idEvenement);
	}
	
	private Date creerDate(Integer jour, Integer mois, Integer annee) {
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(Calendar.YEAR, annee);
		cal.set(Calendar.MONTH, mois);
		cal.set(Calendar.DATE, jour);
		
		return cal.getTime();
	}

}
