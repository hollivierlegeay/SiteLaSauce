package hei.devweb.dao;

import hei.devweb.model.Equipe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * <b>EquipeDaoTestCase est la classe qui teste les méthodes de la classe EquipeDao</b>
 * <p>Rappel : 
 * Une équipe est caractérisée par les informations suivantes :
 * <ul>
 * <li>Un identifiant qui est généré automatiquement par la base de données.</li>
 * <li>Une année de mandat. ex : 2013/2014</li>
 * <li>Une description de l'équipe.</li>
 * <li>Une image de l'équipe.</li>
 * </ul>
 * </p>
 * 
 * @see EquipeDao
 * 
 */

public class EquipeDaoTestCase {

	private EquipeDao equipeDao = new EquipeDao();
	/**
	 * Méthode qui vide le contenu de la base de données
	 * 
	 */
	@Before
	public void purgeBDD() throws Exception {
		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();

		stmt.executeUpdate("DELETE FROM equipe");
		stmt.executeUpdate("INSERT INTO `equipe`(`idEquipe`,`anneeMandat`,`descriptionEquipe`,`imgEquipe`) VALUES (1,'2009/2010','La Team 1 a crée lassociation. Elle se compose de trois membres : ...', 'https://fbcdn-sphotos-f-a.akamaihd.net/hphotos-ak-ash3/t31.0-8/885329_485465288229344_557185732_o.jpg')");
		stmt.close();
		connection.close();
	}
	/**
	 * Méthode qui teste la méthode "listerEquipe" de la classe EquipeDao.
	 * 
	 * @see EquipeDao#listerEquipes()
	 * 
	 */
	@Test
	public void testListerEquipes() {
		List<Equipe> equipes = equipeDao.listerEquipes();
		Assert.assertEquals(1, equipes.size());
		Assert.assertEquals(1, equipes.get(0).getIdEquipe().intValue());
		Assert.assertEquals("2009/2010", equipes.get(0).getAnneeMandat());
		Assert.assertEquals("La Team 1 a crée lassociation. Elle se compose de trois membres : ...",equipes.get(0).getDescriptionEquipe());
		Assert.assertEquals("https://fbcdn-sphotos-f-a.akamaihd.net/hphotos-ak-ash3/t31.0-8/885329_485465288229344_557185732_o.jpg",equipes.get(0).getImgEquipe());
	
	}
	/**
	 * Méthode qui teste la méthode "ajouterEquipe" de la classe EquipeDao.
	 * 
	 * @see EquipeDao#ajouterEquipe(Equipe)
	 * 
	 */
	@Test
	public void testAjouterEquipe() throws Exception {

		Equipe nouvelEquipe = new Equipe(null, "2013/2014", "Description 2","https://fbcdn-sphotos-f-a.akamaihd.net/hphotos-ak-ash3/t31.0-8/885329_485465288229344_557185732_o.jpg");
		equipeDao.ajouterEquipe(nouvelEquipe);

		Connection connection = DataSourceProvider.getDataSource()
				.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet results = stmt.executeQuery("SELECT * FROM equipe");
		results.next();
		results.next();
		Assert.assertEquals("2013/2014", results.getString("anneeMandat"));
		Assert.assertEquals("Description 2",results.getString("descriptionEquipe"));
		Assert.assertEquals("https://fbcdn-sphotos-f-a.akamaihd.net/hphotos-ak-ash3/t31.0-8/885329_485465288229344_557185732_o.jpg",results.getString("imgEquipe"));
		
	}
	/**
	 * Méthode qui teste la méthode "getEquipe" de la classe EquipeDao.
	 * 
	 * @see EquipeDao#getEquipe(Integer)
	 * 
	 */
	@Test
	public void testgetEquipe() {
		Equipe equipe = equipeDao.getEquipe(1);
		Assert.assertEquals(1, equipe.getIdEquipe().intValue());
		Assert.assertEquals("2009/2010", equipe.getAnneeMandat());
		Assert.assertEquals("La Team 1 a crée lassociation. Elle se compose de trois membres : ...",equipe.getDescriptionEquipe());
		Assert.assertEquals("https://fbcdn-sphotos-f-a.akamaihd.net/hphotos-ak-ash3/t31.0-8/885329_485465288229344_557185732_o.jpg",equipe.getImgEquipe());
	}
}
