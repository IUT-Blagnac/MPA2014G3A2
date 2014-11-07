package Modele;
/**
 * 
 * @author groupe 3A2
 * @version 3.0
 */

public class Voeu {
private Groupe groupe;
private Sujet sujet;
private int numero;

	/**
	 * Constructeur de la classe Voeu
	 * Initialise l'objets de Voeu
	 */
	public Voeu(Groupe p_groupe,Sujet p_sujet,int p_numero){
		this.groupe = p_groupe;
		this.sujet = p_sujet;
		this.numero = p_numero;
	}
	
	// GETTEUR
	/**
	 * 
	 * Donne le groupe du voeu
	 * @returnn le groupe du voeu
	 */
	public Groupe getGroupe(){
		return this.groupe;
	}
	/**
	 * 
	 * Donne le sujet du voeu
	 * @returnn le sujet du voeu
	 */
	public Sujet getSujet(){
		return this.sujet;
	}
	/**
	 * 
	 * Donne le numero du voeu
	 * @returnn le numero du voeu
	 */
	public int getNumero(){
		return this.numero;
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
	public void setSujet(Sujet p_sujet){
		this.sujet = p_sujet;
	}
	/**
	 * 
	 * Permet de modifier le numero
	 */
	public void setNumero(int p_numero){
		this.numero = p_numero;
	}
}
