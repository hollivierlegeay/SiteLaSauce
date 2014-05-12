package hei.devweb.dao;

import hei.devweb.model.Membre;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * <b>MembreDaoTestCase est la classe qui teste les méthodes de la classe MembreDao</b>
 * <p>Rappel : 
 * Un membre est caractérisé par les informations suivantes :
 * <ul>
 * <li>Un identifiant qui est généré automatiquement par la base de données.</li>
 * <li>Un nom.</li>
 * <li>Une prénom.</li>
 * <li>Un mot de passe.</li>
 * <li>Un email HEI.</li>
 * <li>Un numéro de téléphone.</li>
 * </ul>
 * </p>
 * 
 * @see MembreDao
 * 
 */
public class MembreDaoTestCase {

	private MembreDao membreDao = new MembreDao();
	/**
	 * Méthode qui vide le contenu de la base de données
	 * 
	 */
	@Before
	public void purgeBDD() throws Exception {
		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();

		stmt.executeUpdate("DELETE FROM membre");
		stmt.executeUpdate("INSERT INTO `membre`(`idMembre`,`nom`,`prenom`,`motdePasse`,`mailHEI`,`telephone`) VALUES (1,'Grosleron','Juliette','julietteG','juliette.grosleron@hei.fr','0621635998')");
		stmt.close();
		connection.close();
	}
	/**
	 * Méthode qui teste la méthode "listerMembre" de la classe MembreDao.
	 * 
	 * @see MembreDao#listerMembres()
	 * 
	 */
	@Test
	public void testListerMembres() {
		List<Membre> membres = membreDao.listerMembres();
		Assert.assertEquals(1, membres.size());
		Assert.assertEquals(1, membres.get(0).getIdMembre().intValue());
		Assert.assertEquals("Grosleron", membres.get(0).getNom());
		Assert.assertEquals("Juliette",membres.get(0).getPrenom());
		Assert.assertEquals("julietteG",membres.get(0).getMotdePasse());
		Assert.assertEquals("juliette.grosleron@hei.fr",membres.get(0).getMailHEI());
		Assert.assertEquals("0621635998",membres.get(0).getTelephone());
	}
	/**
	 * Méthode qui teste la méthode "ajouterMembre" de la classe MembreDao.
	 * 
	 * @see MembreDao#ajouterMembre(Membre)
	 * 
	 */
	@Test
	public void testAjouterMembre() throws Exception {

		Membre nouveauMembre = new Membre(null,"Barbieux","Marine","marineB","marine.barbieux@hei.fr","0621635998");
		membreDao.ajouterMembre(nouveauMembre);

		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet results = stmt.executeQuery("SELECT * FROM membre");
		results.next();
		results.next();
		Assert.assertEquals("Barbieux", results.getString("nom"));
		Assert.assertEquals("Marine",results.getString("prenom"));
		Assert.assertEquals("marineB",results.getString("motdePasse"));
		Assert.assertEquals("marine.barbieux@hei.fr",results.getString("mailHEI"));
		Assert.assertEquals("0621635998",results.getString("telephone"));
	}
	/**
	 * Méthode qui teste la méthode "getMembre" de la classe MembreDao.
	 * 
	 * @see MembreDao#getMembre(Integer)
	 * 
	 */
	@Test
	public void testgetMembre() {
		Membre membre = membreDao.getMembre(1);
		Assert.assertEquals(1, membre.getIdMembre().intValue());
		Assert.assertEquals("Grosleron", membre.getNom());
		Assert.assertEquals("Juliette",membre.getPrenom());
		Assert.assertEquals("julietteG",membre.getMotdePasse());
		Assert.assertEquals("juliette.grosleron@hei.fr",membre.getMailHEI());
		Assert.assertEquals("0621635998",membre.getTelephone());
	}
}
