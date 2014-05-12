package hei.devweb.metier;

import hei.devweb.dao.EvenementDao;
import hei.devweb.model.Evenement;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class EvenementManager {
	/**
	 * EvenementManager est la classe qui gère les méthodes pour interagir la table "evenement" de la base de données sitelasauce.
	 * @see EvenementDao
	 *
	 */
	private static EvenementManager instance;
	 /**
     * Création du lien avec la table "evenement" de la base de données.
     * 
     * @see EvenementDao
     * 
     */
	private EvenementDao evenementDao = new EvenementDao();
	/**
     * Retourne l'instance du Manager Evenement.
     * 
     * @return L'instance du manager de la table "evenement". 
     */
	public static EvenementManager getInstance() {
		if (instance == null) {
			instance = new EvenementManager();
		}
		return instance;
	}
	  /**
     * Retourne la liste des évènements de la table "evenement".
     * 
     * @return La liste des évènements.
     * 
     * @see EvenementDao#listerEvenements()
     */
	public List<Evenement> listerEvenements() {
		return evenementDao.listerEvenements();
	}
	/**
     * Vérifie les erreurs de saisie et retourne l'objet Evenement.
     * @see EvenementDao#getEvenement(Integer)
     * 
     * @param idEvenement
     * 			Id de l'évènement qui sera retournée.
     * 
     * @return L'objet Evenement d'identifiant idEvenement. 
     * 
     *
     */
	public Evenement getEvenement(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException(
					"L'identifiant du evenement doit etre renseign�.");
		}
		return evenementDao.getEvenement(id);
	}
	/**
     * Vérifie les erreurs de saisie et met à jour la table "evenement"
     * 
     * @see EvenementDao#ajouterEvenement(Evenement)
     * 
     * @param evenement 
     *            Le nouvel évènement ajoutée.
     * 
     */
	public void ajouterEvenement(Evenement evenement) {
		if (evenement == null) {
			throw new IllegalArgumentException(
					"Le evenement doit �tre renseign�.");
		}
		if (evenement.getIdEvenement() == null
				|| evenement.getTitreEvenement().equals("") == true
				|| evenement.getDateEvenement() == null
				|| evenement.getDetailEvenement().equals("") == true
				|| evenement.getLieuEvenement().equals("") == true) {
			throw new IllegalArgumentException(
					"Un champ obligatoire du evenement n'est pas renseign�.");
		}

		evenementDao.ajouterEvenement(evenement);
	}
	/**
     * Met à jour la table "evenement".
     * 
     * @see EvenementDao#supprimerEvenement(Evenement)
     * 
     * @param idEvenement 
     *            L'id de l'évènement qui sera supprimé.
     * 
     */
	public void supprimerEvenement(Integer idEvenement) {
		evenementDao.supprimerEvenement(idEvenement);
	}
	/**
     * Méthode qui permet de créer une date.
     * 
     * @return la date créée. 
     */
	private Date creerDate(Integer jour, Integer mois, Integer annee) {
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(Calendar.YEAR, annee);
		cal.set(Calendar.MONTH, mois);
		cal.set(Calendar.DATE, jour);

		return cal.getTime();
	}

}
