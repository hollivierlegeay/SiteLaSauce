package hei.devweb.dao;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
/**
 * <p>DataSourceProvider est la classe qui renseigne les informations de connexion à la base de données sitelasauce.</p>
 */
public class DataSourceProvider {

	private static MysqlDataSource dataSource;
	/**
     * Retourne l'objet datasource.
     * 
     * @return Le lien avec la base de données sitelasauce. 
     */
	public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
			dataSource.setServerName("localhost");
			dataSource.setPort(3306);
			dataSource.setDatabaseName("sitelasauce");
			dataSource.setUser("root");
			dataSource.setPassword("");
		}
		return dataSource;
	}
}

