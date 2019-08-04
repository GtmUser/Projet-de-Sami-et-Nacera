/**
 * 
 */
package Controler;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class Compte {
	
	private static Logger logger = Logger.getLogger(Compte.class);
	/**
	 * Proprietes privées
	 */
	
	private int idCompte;
	private int idConseiller;
	private String dateOuvertureCompte;
	private double solde;
	private boolean typeCarte;
	

	
	/**
	 * Constructeur par defaut
	 */
	public Compte() {
		logger.debug("Je suis dans le constructeur de compte sans paramètres");
	}

	/**
	 * @param idCompte
	 * @param idConseiller
	 * @param dateOuvertureCompte
	 * @param solde
	 * @param typeCarte
	 */
	public Compte(int idCompte, int idConseiller, String dateOuvertureCompte, double solde, boolean typeCarte) {
		this.idCompte = idCompte;
		this.idConseiller = idConseiller;
		this.dateOuvertureCompte = dateOuvertureCompte;
		this.solde = solde;
		this.typeCarte = typeCarte;
		logger.debug("Je suis dans le constructeur compte avec paramètres");
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
		Compte.logger = logger;
	}

	/**
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}

	/**
	 * @param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	/**
	 * @return the idConseiller
	 */
	public int getIdConseiller() {
		return idConseiller;
	}

	/**
	 * @param idConseiller the idConseiller to set
	 */
	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	/**
	 * @return the dateOuvertureCompte
	 */
	public String getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}

	/**
	 * @param dateOuvertureCompte the dateOuvertureCompte to set
	 */
	public void setDateOuvertureCompte(String dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the typeCarte
	 */
	public boolean isTypeCarte() {
		return typeCarte;
	}

	/**
	 * @param typeCarte the typeCarte to set
	 */
	public void setTypeCarte(boolean typeCarte) {
		this.typeCarte = typeCarte;
	}
	
	/**
	 * Methode permettant la création d'un compte
	 */
	public void creerCompte(){
		
	}
	
	/**
	 *  Methode permettant la lecture des informations d'un compte
	 */
	public void lireinformationCompte(){
		
	}
	
	/**
	 *  Methode permettant la suppression d'un compte
	 */
	public void supprimerCompte(){
		
	}
	/**
	 *  Methode permettant de choisir une carte
	 */
	public void choisirCarte(){
		
	}
	
	/**
	 *  Methode permettant de faire l'analyse du crédit
	 */
	public void analyserCredit(){
		
	}
	
	/**
	 *  Methode permettant de faire un virement 
	 */
	public void effectuerVirement(){
		
	}
	
	/**
	 * 
	 */
	public void effectuerInvestissement(){
		
		
	}
	
	
	

}
