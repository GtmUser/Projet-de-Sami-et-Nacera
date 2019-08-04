/**
 * 
 */
package Model;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class Personne {
	private static Logger logger = Logger.getLogger(Personne.class);
	/**
	 * private properties
	 */
	private String nom;
	private String prenom;
	private String adresse;
	private int cp;
	private String ville;
	private String tel;
	private String mail;
	
	
	/**
	 * constructeur sans parametres
	 */
	public Personne() {
		logger.debug("je suis dans le constructeur de personne sans parametres");
	}


	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param cp
	 * @param ville
	 * @param tel
	 * @param mail
	 */
	public Personne(String nom, String prenom, String adresse, int cp, String ville, String tel, String mail) {
		logger.debug("je suis dans le constructeur de personne avec parametres");
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.tel = tel;
		this.mail = mail;
	}
	
	/**
	 *Methode permettant la lecture pour une personne 
	 */
	public void lire() {
		
	}
	
	/**
	 * Mthose permettant l'ecriture pour une personne
	 */
	public void ecrire() {
		
	}
	
	/**
	 * Mthode permettant la commercialisation pour une personne
	 */
	public void commercialiser() {
		
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
		Personne.logger = logger;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	 * @return the cp
	 */
	public int getCp() {
		return cp;
	}


	/**
	 * @param cp the cp to set
	 */
	public void setCp(int cp) {
		this.cp = cp;
	}


	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}


	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}


	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}


	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}


	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}


	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
