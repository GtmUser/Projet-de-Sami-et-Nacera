/**
 * 
 */
package Model;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class Gerant extends Employe{
	
	private static Logger logger = Logger.getLogger(Gerant.class);
	
	/**
	 * proprietes privees
	 */
	private int idGerant;
	

	/**
	 * constructeur par defaut
	 */
	public Gerant() {
		logger.debug("Je suis dans le constructeur par defaut du gérant");
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param cp
	 * @param telephone
	 * @param ville
	 * @param mail
	 * @param login
	 * @param password
	 * @param idGerant
	 */
	public Gerant(String nom, String prenom, String adresse, int cp, String telephone, String ville, String mail,
			String login, String password, int idGerant) {
		super(nom, prenom, adresse, cp, telephone, ville, mail, login, password);
		this.idGerant = idGerant;
	}




	/**
	 * Methode permettant d'afficher l'audit
	 */
	public void afficherAudit(){
		logger.debug("Je suis dans la méthode permettant d'afficher l'audit");
	}


	/**
	 * @return the idGerant
	 */
	public int getIdGerant() {
		return idGerant;
	}


	/**
	 * @param idGerant the idGerant to set
	 */
	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
	}
	

}
