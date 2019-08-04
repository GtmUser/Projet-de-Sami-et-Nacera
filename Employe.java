/**
 * 
 */
package Model;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class Employe extends Personne {
	private static Logger logger = Logger.getLogger(Employe.class);
	
	/**
	 * private properties
	 */
	private String login;
	private String password;
	/**
	 * Constructeur sans parametre
	 */
	
	public Employe() {
		super();
	}
	/**
	 * Constructeur avec parametre 
	 * @param login
	 * @param password
	 */
	public Employe(String nom, String prenom, String adresse,int cp,String telephone,String ville, String mail, String login, String password) {
		super(nom, prenom, adresse, cp, telephone, ville, mail);
		this.login = login;
		this.password = password;
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
		Employe.logger = logger;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Methode qui permet l'authentification
	 * @param login
	 * @param password
	 */
	public void seConnecter(String login, String password){
		logger.debug("je suis dans la methode se connecter");	}
	
	}
