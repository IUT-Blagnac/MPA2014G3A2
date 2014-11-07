package Modele;
/**
 * 
 * @author groupe 3A2
 * @version 3.0
 */

public class Role {
private Intervenant superviseur;
private Intervenant client;
private Intervenant support_technique;

/**
 * Constructeur de la classe Role
 * Initialise l'objet role
 */
	public Role(Intervenant p_client, Intervenant p_superviseur, Intervenant p_support_technique ){
		this.superviseur = p_superviseur;
		this.client = p_client;
		this.support_technique = p_support_technique;
	}
	
	// GETTEUR
	/**
	 * 
	 * Donne le superviseur 
	 * @returnn le superviseur
	 */
	public Intervenant getSuperviseur(){
		return this.superviseur;
	}
	/**
	 * 
	 * Donne le client 
	 * @returnn le client
	 */
	public Intervenant getClient(){
		return this.client;
	}
	/**
	 * 
	 * Donne le support technique
	 * @returnn le support technique
	 */
	public Intervenant getSupport_Technique(){
		return this.support_technique;
	}
	
	//SETTEUR
	/**
	 * 
	 * Permet de modifier le superviseur
	 */
	public void setSupervisseur(Intervenant p_superviseur){
		this.superviseur = p_superviseur;
	}
	/**
	 * 
	 * Permet de modifier le client
	 */
	public void setClient(Intervenant p_client){
		this.client = p_client;
	}
	/**
	 * 
	 * Permet de modifier le support technique
	 */
	public void setSupport_Technique(Intervenant p_support_technique){
		this.support_technique = p_support_technique;
	}		
}
