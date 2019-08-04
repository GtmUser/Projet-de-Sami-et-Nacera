/**
 * 
 */
package Controler;

import org.apache.log4j.Logger;

import Model.Personne;

/**
 * @author Nacera et Sami
 *
 */
public class GestionClient extends Personne {
	
	private static Logger logger = Logger.getLogger(GestionClient.class);
	/**
	 * Proprités privées
	 */
	private int iClient;
	private int idConseiller;
	private boolean typeclient;
	private boolean compteCourant;
	private boolean compteEpargne;
	private boolean clientFortune;
	private double decouvert;
	private double remuneration;
	private Compte compte;
	/**
	 * 
	 */
	public GestionClient() {
		super();
		logger.debug("Je suis dans le constructeur sans paramètres du client");
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param cp
	 * @param ville
	 * @param tel
	 * @param mail
	 * @param iClient
	 * @param idConseiller
	 * @param typeclient
	 * @param compteCourant
	 * @param compteEpargne
	 * @param clientfortune
	 * @param decouvert
	 * @param remuneration
	 * @param compte
	 */
	public GestionClient(String nom, String prenom, String adresse, int cp, String ville, String tel, String mail, int iClient,
			int idConseiller, boolean typeclient, boolean compteCourant, boolean compteEpargne, boolean clientfortune,
			double decouvert, double remuneration, Compte compte) {
		super(nom, prenom, adresse, cp, ville, tel, mail);
		this.iClient = iClient;
		this.idConseiller = idConseiller;
		this.typeclient = typeclient;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.clientFortune = clientfortune;
		this.decouvert = decouvert;
		this.remuneration = remuneration;
		this.compte = compte;
		logger.debug("Je suis dans le constructeur avec paramètres du client");
	}
	
	/**
	 * Methode permettant de creer un client
	 * 
	 */
	public void CreerClient(){
		
	}
	/**
	 * Methode permettant de supprimer un client
	 */
	public void supprimerClient(){
		
	}
	/**
	 * Methode permettant de modifier les informations client
	 */
	public void modifierInformationsClient(){
		
	}
	/**
	 * Methode permettant de lire les informations client
	 */
	public void lireInformationClient(){
		
	}

	/**
	 * @return the iClient
	 */
	public int getiClient() {
		return iClient;
	}

	/**
	 * @param iClient the iClient to set
	 */
	public void setiClient(int iClient) {
		this.iClient = iClient;
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
	 * @return the typeclient
	 */
	public boolean isTypeclient() {
		return typeclient;
	}

	/**
	 * @param typeclient the typeclient to set
	 */
	public void setTypeclient(boolean typeclient) {
		this.typeclient = typeclient;
	}

	/**
	 * @return the compteCourant
	 */
	public boolean isCompteCourant() {
		return compteCourant;
	}

	/**
	 * @param compteCourant the compteCourant to set
	 */
	public void setCompteCourant(boolean compteCourant) {
		this.compteCourant = compteCourant;
	}

	/**
	 * @return the compteEpargne
	 */
	public boolean isCompteEpargne() {
		return compteEpargne;
	}

	/**
	 * @param compteEpargne the compteEpargne to set
	 */
	public void setCompteEpargne(boolean compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	/**
	 * @return the clientfortune
	 */
	public boolean isClientfortune() {
		return clientFortune;
	}

	/**
	 * @param clientfortune the clientfortune to set
	 */
	public void setClientfortune(boolean clientfortune) {
		this.clientFortune = clientfortune;
	}

	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * @return the remuneration
	 */
	public double getRemuneration() {
		return remuneration;
	}

	/**
	 * @param remuneration the remuneration to set
	 */
	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

	/**
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	
	
	
	
}
