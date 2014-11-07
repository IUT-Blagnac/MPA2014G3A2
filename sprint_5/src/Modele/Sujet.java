package Modele;
/**
 * 
 * @author groupe 3A2
 * @version 3.0
 */

public class Sujet {
private String id;
private String nom;
private String titre;
private int nbreSujets;
private int nbreGroupe = 0;
private String groupe = "";

	/**
	 * Constructeur de la classe Sujet
	 * Initialise l'objet sujet
	 */
	public Sujet ( String p_id, String p_nom, String p_titre, int p_nbreSujets){
		this.id = p_id;
		this.nom = p_nom;
		this.titre = p_titre;
		this.nbreSujets = p_nbreSujets;
	}
	
	// GETTEUR
	/**
	 * 
	 * Donne le l'identifiant du sujet
	 * @returnn l'identifiant du sujet
	 */
	public String getId(){
		return this.id;
	}
	/**
	 * 
	 * Donne le nom du sujet
	 * @returnn le nom du sujet
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * 
	 * Donne le nombre des sujets
	 * @returnn le nombre des sujets
	 */
	public int getNbrSujets(){
		return this.nbreSujets;
	}
	/**
	 * 
	 * Donne le titre du sujet
	 * @returnn le titre du sujet
	 */
	public String getTitre(){
		return this.titre;
	}
	/**
	 * 
	 * Donne le(s) groupe(s) du sujet
	 * @returnn le(s) groupe(s) du sujet
	 */
	public String getGroupe(){
		return this.groupe;
	}
	
	//SETTEUR
	/**
	 * 
	 * Permet de modifier l'identifiant
	 */
	public void setId(String p_id){
		this.id = p_id;
	}
	/**
	 * 
	 * Permet de modifier le nom
	 */
	public void setNom(String p_nom){
		this.nom = p_nom;
	}
	/**
	 * 
	 * Permet de modifier le nombre de sujets
	 */
	public void setNbrSujets(int p_nbrSujets){
		this.nbreSujets = p_nbrSujets;
	}
	/**
	 * 
	 * Permet d'ajouter un groupe au sujet
	 */
	public void setGroupe(String p_grpe){
		if(this.nbreGroupe >= 1){
			this.groupe += " "+p_grpe;
		}else{this.groupe = p_grpe;}
		this.nbreGroupe++;
	}	
}

