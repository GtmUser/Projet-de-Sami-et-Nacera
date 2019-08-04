/**
 * 
 */
package Model;

import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * @author Nacera et Sami
 *
 */
public class Conseiller extends Employe {
	private static Logger logger = Logger.getLogger(Conseiller.class);
	
	/**
	 * private properties
	 */
	private int idConseiller;
	private ArrayList listClient;
	/**
	 * Constructeur sans parametre 
	 */
	public Conseiller() {
		super();
		logger.debug("je suis dans le constructeur du conseiller sans parametre");
	}
	/**
	 * 
	 * @param idConseiller
	 * @param listClient
	 */
	public Conseiller(String prenom, String nom, String adresse, int cp, String telephone, String ville, String mail,
			String login, String password,int idConseiller, ArrayList listClient) {
		super(prenom, nom,  adresse,  cp, telephone, ville, mail, login, password);
		this.idConseiller = idConseiller;
		this.listClient = listClient;
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
		Conseiller.logger = logger;
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
	 * @return the listClient
	 */
	public ArrayList getListClient() {
		return listClient;
	}
	/**
	 * @param listClient the listClient to set
	 */
	public void setListClient(ArrayList listClient) {
		this.listClient = listClient;
	}
	
	/**
	 * Methode permetant l'autorisation virement 
	 */
	public void autoriserVirement() {
		
	}
	/**
	 * Methode permettant la validation de patrimoine
	 */
	public void validerPatrimoine() {
		
	}
	/**
	 * Methode permettant la suppression du client
	 */
	public void confirmerSupressionClient() {
}
	/**
	 * Methode permettant la modification des infos d'un client
	 */
	public void confirmerModificationInfoClient(){
		
	}
	/**
	 * Methode permettant la creation d'un client
	 */
	public void confirmerCreationClient(){
	
	}
	
	/**
	 * Methode permettant de lire les infortmations d'un client
	 */
	public void lireInformationsClient(){
		
	}
	
	/**
	 * Methode permettant d'investir
	 */
	public void investir(){
		
	}
	
	
}
	