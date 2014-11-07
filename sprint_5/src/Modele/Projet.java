package Modele;
/**
 * 
 * @author groupe 3A2
 * @version 3.0
 */

public class Projet {
private Groupe groupe;
private Sujet sujet;
private Encadrer encadrants;

/**
 * Constructeur de la classe Projet
 * Initialise l'objet projet
 */
	public Projet( Groupe p_groupe,Sujet p_sujet, Encadrer p_encadrants){
		this.groupe = p_groupe;
		this.sujet = p_sujet;
		this.encadrants = p_encadrants;
	}
	
	// GETTEUR
	/**
	 * 
	 * Donne le groupe du projet
	 * @returnn le groupe du projet
	 */
	public Groupe getGroupe(){
		return this.groupe;
	}
	/**
	 * 
	 * Donne le sujet du projet
	 * @returnn le sujet du projet
	 */
	public Sujet getSujet(){
		return this.sujet;
	}
	/**
	 * 
	 * Donne les encadrants du projet
	 * @returnn les encadrants du projet
	 */
	public Encadrer getEncadrer(){
		return this.encadrants;
	}
	
	//SETTEUR
	/**
	 * 
	 * Permet de modifier le groupe
	 */
	public void setGroupe(Groupe p_groupe){
		this.groupe = p_groupe;
	}
	/**
	 * 
	 * Permet de modifier le sujet
	 */
	public void setPrenom(Sujet p_sujet){
		this.sujet = p_sujet;
	}
	/**
	 * 
	 * Permet de modifier le sujet
	 */
	public void setEncadrer(Encadrer p_encadrants){
		this.encadrants = p_encadrants;
	}
}
