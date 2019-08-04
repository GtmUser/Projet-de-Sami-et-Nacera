/**
 * 
 */
package Model;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class SimulationCredit {
	
	private static Logger logger = Logger.getLogger(SimulationCredit.class);
	
	/**
	 * Proprietes privees
	 */
	private int idCredit;
	private int idConseiller;
	private int idClient;
	private double montant;
	private double taux;
	private int duree;

	/**
	 * Constructeur par defaut
	 */
	public SimulationCredit() {
		
		logger.debug("Je suis dans le constructeur par défaut de Crédit");
	}

	/**
	 * @param idCredit
	 * @param idConseiller
	 * @param idClient
	 * @param montant
	 * @param taux
	 * @param duree
	 */
	public SimulationCredit(int idCredit, int idConseiller, int idClient, double montant, double taux, int duree) {
		this.idCredit = idCredit;
		this.idConseiller = idConseiller;
		this.idClient = idClient;
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
	}
	
	/**
	 * Methode permettant de simuler un crédit
	 */
	public void simulerCredit(){
		logger.debug("Je suis dans la méthode permettant de simuler une crédit");
	}

	/**
	 * @return the idCredit
	 */
	public int getIdCredit() {
		return idCredit;
	}

	/**
	 * @param idCredit the idCredit to set
	 */
	public void setIdCredit(int idCredit) {
		this.idCredit = idCredit;
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
	 * @return the idClient
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
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

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	

}
