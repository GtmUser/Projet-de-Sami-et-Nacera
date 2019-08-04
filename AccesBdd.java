package Controler;


import java.sql.*;

import org.apache.log4j.Logger;
/**
 * 
 * @author Nacera et Sami
 *
 */
public class AccesBdd {
	private static Logger logger = Logger.getLogger(AccesBdd.class);
	/**
	 * private properties
	 */
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String driver = "com.mysql.jdbc.Driver";
	private String adresse = null;
	private String id = null;
	private String pwd = null;
	
	/**
	 * constructeur avec parametres 
	 * @param adresse : adresse de la BDD
	 * @param id : identifiant de la BDD
	 * @param pwd : mot de passe de la BDD
	 */
	public AccesBdd(String adresse, String id, String pwd) {		
		this.adresse = adresse;
		this.id = id;
		this.pwd = pwd;
	}
	
	/**
	 * se connecte à la BDD
	 * @return Réponse de la connexion a la BDD
	 */
	public Connection connecter() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(this.adresse, this.id, this.pwd);
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			logger.debug("adresse driver introuvable.");
			this.con = null;
		} catch (SQLException e) {
			logger.debug("echec connexion.");
			this.con = null;
		}
		return this.con;
	}
	
	/**
	 * Methode de deconnxion de la BDD
	 */
	public void deconnecter() {
		if (con != null) {
		 try {
				con.close();
			} catch (SQLException e) {
				logger.debug("Erreur SQL.");
			}
		}	
	}
		
	/**
	 * Methode de requete type Update
	 * @param query :requête SQL
	 */
	public void update(String query) {
		try {
			this.stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Methode de requête de type executeQuery
	 * @param query : requête SQL
	 * @return données
	 */
	public ResultSet query(String query) {
		try {
			this.rs = this.stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("Erreur SQL.");
		}
		return rs;
	}

	/**
	 * @return the logger
	 */
	public static Logger getLogger() {
		return logger;
	}

	/**
	 * @param logger the logger to set
	 */
	public static void setLogger(Logger logger) {
		AccesBdd.logger = logger;
	}

	/**
	 * @return the con
	 */
	public Connection getCon() {
		return con;
	}

	/**
	 * @param con the con to set
	 */
	public void setCon(Connection con) {
		this.con = con;
	}

	/**
	 * @return the stmt
	 */
	public Statement getStmt() {
		return stmt;
	}

	/**
	 * @param stmt the stmt to set
	 */
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	/**
	 * @return the rs
	 */
	public ResultSet getRs() {
		return rs;
	}

	/**
	 * @param rs the rs to set
	 */
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}

