/**
 * 
 */
package Controler;

import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class Audit {
	
	private static Logger logger = Logger.getLogger(Audit.class);
	
	/**
	 * proprietes privees
	 */
	private int idAudit;
	private int idGerant;
	private ArrayList listComptes;
	private String dateAudit;
	private String resultatAudit;
	

	/**
	 * Constructeur par defaut de Audit
	 */
	public Audit() {
		logger.debug("Je suis dans le constructeur par defaut de l'Audit");
	}


	/**
	 * @param idAudit
	 * @param idGerant
	 * @param listComptes
	 * @param dateAudit
	 * @param resultatAudit
	 */
	public Audit(int idAudit, int idGerant, ArrayList listComptes, String dateAudit, String resultatAudit) {
		this.idAudit = idAudit;
		this.idGerant = idGerant;
		this.listComptes = listComptes;
		this.dateAudit = dateAudit;
		this.resultatAudit = resultatAudit;
	}
	
	/**
	 * Methode permettant d'effectuer l'Audit (analyser la liste des comptes)
	 */
	public void analyserComptes(){
		
	}


	/**
	 * @return the idAudit
	 */
	public int getIdAudit() {
		return idAudit;
	}


	/**
	 * @param idAudit the idAudit to set
	 */
	public void setIdAudit(int idAudit) {
		this.idAudit = idAudit;
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


	/**
	 * @return the listComptes
	 */
	public ArrayList getListComptes() {
		return listComptes;
	}


	/**
	 * @param listComptes the listComptes to set
	 */
	public void setListComptes(ArrayList listComptes) {
		this.listComptes = listComptes;
	}


	/**
	 * @return the dateAudit
	 */
	public String getDateAudit() {
		return dateAudit;
	}


	/**
	 * @param dateAudit the dateAudit to set
	 */
	public void setDateAudit(String dateAudit) {
		this.dateAudit = dateAudit;
	}


	/**
	 * @return the resultatAudit
	 */
	public String getResultatAudit() {
		return resultatAudit;
	}


	/**
	 * @param resultatAudit the resultatAudit to set
	 */
	public void setResultatAudit(String resultatAudit) {
		this.resultatAudit = resultatAudit;
	}
	

}
