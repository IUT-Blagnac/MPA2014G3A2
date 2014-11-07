package Modele;
/**
 * 
 * @author groupe 3A2
 * @version 3.0
 */

public class Groupe {
	private String libelle;
	
	/**
	 * Constructeur de la classe Groupe
	 * Initialise l'objet groupe
	 */
	public Groupe(String p_libelle){
		this.libelle = p_libelle;
	}
	
	// GETTEUR
	/**
	 * 
	 * Donne le libelle du groupe
	 * @returnn le libelle du groupe
	 */
	public String getLibelle(){
		return this.libelle;
	}
	
	//SETTEUR
	/**
	 * 
	 * Permet de modifier le libelle
	 */
	public void setLibelle(String p_libelle){
		this.libelle = p_libelle;
	}
	
}
