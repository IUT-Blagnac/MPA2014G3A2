

package Modele;


/**
 * 
 * @author groupe 3A2
 * @version 3.0
 */

public class Encadrer {
private Role role;

	public Encadrer(Intervenant p_client, Intervenant p_superviseur, Intervenant p_support_technique){
		this.role = new Role(p_client, p_superviseur, p_support_technique);
	}
	
	/**
     * Donne le superviseur, le client et le support technique des projets.
     * 
     * @returnn un objet de type role 
     *           
     */
	public Role getRole(){
		return this.role;
	}
	
	/**
     * Permet de modifier le champs role de la classe encadrer.
     */
	public void setRole(Role p_role){
		this.role = p_role;
	}		
}
