package Modele;
/**
 * 
 * @author groupe 3A2
 * @version 3.0
 */

public class Etudiant {
	private Groupe groupe;
	private String nom;
	private String prenom;
	
	
	
	/**
	 * Constructeur de la classe Etudiant
	 * Initialise  l'objet étudiant
	 */
	public Etudiant (String p_nom, String p_prenom, Groupe p_groupe){
		this.prenom = p_prenom;
		this.nom = p_nom;
		this.groupe = p_groupe;
	}
	
	// GETTEUR
	/**
	 * 
	 * Donne le nom de l'étudiant
	 * @returnn le nom de l'étudiant
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * 
	 * Donne le prenom de l'étudiant
	 * @returnn le prenom de l'étudiant
	 */
	public String getPrenom(){
		return this.prenom;
	}
	/**
	 * 
	 * Donne le groupe de l'étudiant
	 * @returnn le groupe de l'étudiant
	 */
	public Groupe getGroupe(){
		return this.groupe;
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
	 * Permet de modifier le groupe
	 */
	public void setGroupe(Groupe p_groupe){
		this.groupe = p_groupe;
	}
}
