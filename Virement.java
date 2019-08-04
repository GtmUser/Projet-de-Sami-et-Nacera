/**
 * 
 */
package Controler;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class Virement {

	
	private static Logger logger = Logger.getLogger(Virement.class);
	/**
	 * proprietes privées
	 */
	private int idVirement;
	private int idConseiller;
	private int idCompteDebiteur;
	private int idCompteBeneficiaire;
	private double montant;
	
		
	/**
	 * Constructeur par defaut
	 */
	public Virement() {
		logger.debug("Je suis dans le constructeur par défaut de virement");
	}


	/**
	 * @param idVirement
	 * @param idConseiller
	 * @param idCompteDebiteur
	 * @param idCompteBeneficiaire
	 * @param montant
	 */
	public Virement(int idVirement, int idConseiller, int idCompteDebiteur, int idCompteBeneficiaire, double montant) {
		this.idVirement = idVirement;
		this.idConseiller = idConseiller;
		this.idCompteDebiteur = idCompteDebiteur;
		this.idCompteBeneficiaire = idCompteBeneficiaire;
		this.montant = montant;
	}

	/**
	 * Methode permettant d'effectuer un virement
	 */
	public void effectuerVirement(){
		logger.debug("Je suis dans la méthode permettant d'effectuer un virement");
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
		Virement.logger = logger;
	}


	/**
	 * @return the idVirement
	 */
	public int getIdVirement() {
		return idVirement;
	}


	/**
	 * @param idVirement the idVirement to set
	 */
	public void setIdVirement(int idVirement) {
		this.idVirement = idVirement;
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
	 * @return the idCompteDebiteur
	 */
	public int getIdCompteDebiteur() {
		return idCompteDebiteur;
	}


	/**
	 * @param idCompteDebiteur the idCompteDebiteur to set
	 */
	public void setIdCompteDebiteur(int idCompteDebiteur) {
		this.idCompteDebiteur = idCompteDebiteur;
	}


	/**
	 * @return the idCompteBeneficiaire
	 */
	public int getIdCompteBeneficiaire() {
		return idCompteBeneficiaire;
	}


	/**
	 * @param idCompteBeneficiaire the idCompteBeneficiaire to set
	 */
	public void setIdCompteBeneficiaire(int idCompteBeneficiaire) {
		this.idCompteBeneficiaire = idCompteBeneficiaire;
	}


	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}


	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	

}
