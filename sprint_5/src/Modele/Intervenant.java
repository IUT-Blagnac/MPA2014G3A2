package Modele;
/**
 * 
 * @author groupe 3A2
 * @version 3.0
 */

public class Intervenant {
	
	private String prenom;
	private String nom;
	private int client = 0;
	private int superviseur = 0;
	
	/**
	 * Constructeur de la classe Intervenant
	 * Initialise l'objet intervenant
	 */
	public Intervenant (String p_nom, String p_prenom){
		this.prenom = p_prenom;
		this.nom = p_nom;
	}
	
	// GETTEUR
	/**
	 * 
	 * Donne le nom de l'intervenant
	 * @returnn le nom de l'intervenant
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * 
	 * Donne le pr�nom de l'intervenant
	 * @returnn le prenom de l'intervenant
	 */
	public String getPrenom(){
		return this.prenom;
	}
	/**
	 * 
	 * Donne le nombre de fois que l'intervneant est client.
	 * @returnn nombre de fois client
	 */
	public int getClient(){
		return this.client;
	}
	/**
	 * 
	 * Donne le nombre de fois que l'intervneant est superviseur
	 * * @returnn nombre de fois superviseur
	 */
	public int getSuperviseur(){
		return this.superviseur;
	}
	
	//SETTEUR
	/**
	 * 
	 * Permet de modifier le nom
	 */
	public void setNom(String p_nom){
		this.nom = p_nom;
	}
	/**
	 * 
	 * Permet de modifier le prenom
	 */
	public void setPrenom(String p_prenom){
		this.prenom = p_prenom;
	}
	/**
	 * 
	 * Permet d'incrémenter le nombre de fois qu'il est client
	 */
	public void setClient(){
		this.client++;
	}
	/**
	 * 
	 * Permet d'incrémenter le nombre de fois qu'il est superviseur
	 */
	public void setSuperviseur(){
		this.superviseur++;
	}
}
