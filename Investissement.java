/**
 * 
 */
package Controler;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class Investissement {
	
	private static Logger logger = Logger.getLogger(Virement.class);
	
	/**
	 * proprietes privees
	 */
	private int idInvestissement;
	private int idConseiller;
	private int idCompte;
	private double argentPlace;

	/**
	 * 
	 */
	public Investissement() {
		logger.debug("Je suis dans le constructeur par défaut de Investissement");
	}

	
	
	/**
	 * @param idInvestissement
	 * @param idConseiller
	 * @param idCompte
	 * @param argentPlace
	 */
	public Investissement(int idInvestissement, int idConseiller, int idCompte, double argentPlace) {
		this.idInvestissement = idInvestissement;
		this.idConseiller = idConseiller;
		this.idCompte = idCompte;
		this.argentPlace = argentPlace;
	}



	/**
	 * Methode permettant d'effecturer une investissement
	 */
	public void investir(){
		
	}
	
	/**
	 * Methode permettant de calculer la fortune
	 */
	public void calculFortune(){
		
	}
	/**
	 * @return the idInvestissement
	 */
	public int getIdInvestissement() {
		return idInvestissement;
	}

	/**
	 * @param idInvestissement the idInvestissement to set
	 */
	public void setIdInvestissement(int idInvestissement) {
		this.idInvestissement = idInvestissement;
	}

	/**
	 * @return the argentPlace
	 */
	public double getArgentPlace() {
		return argentPlace;
	}

	/**
	 * @param argentPlace the argentPlace to set
	 */
	public void setArgentPlace(double argentPlace) {
		this.argentPlace = argentPlace;
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
	
	

}
