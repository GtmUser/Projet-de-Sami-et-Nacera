/**
 * 
 */
package Controler;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;

/**
 * @author Nacera et Sami
 *
 */
public class Authentification {
	private static Logger logger = Logger.getLogger(Authentification.class);
	
	/**
	 * identifiant de connexion de l'employé
	 */
	private String login;
	
	/**
	 * mot de passe de connexion de l'employé
	 */
	private String password;
	
	
	private Connection con;

	

	/**
	 * @param id
	 * @param pwd
	 * @param con
	 */
	public Authentification(String id, String pwd, Connection con) {
		logger.debug("je suis dans le contructeur d'autentification");
		this.login = id;
		this.password = pwd;
		this.con = con;
	}
	
	/**
	 * Methode permetant d'envoyer une requete a la BDD pour vérifier les identifiants des utilisateurs
	 * @return resultats requete
	 */
	public void connecter(String id, String pwd) {
		
	}
	
	/**
	 * Methode permetant de deconnecter un employe
	 * @return resultats requete
	 */
	public void deconnecter(String id, String pwd) {
		
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return login;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.login = id;
	}


	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return password;
	}


	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.password = pwd;
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

}
