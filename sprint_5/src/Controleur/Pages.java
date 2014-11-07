package Controleur;

import java.util.HashMap;
import java.util.Map.Entry;

import Modele.Etudiant;
import Modele.Groupe;
import Modele.Intervenant;
import Modele.Projet;
import Modele.Sujet;

public class Pages {
	private String res;
	
	public Pages(){
		this.res = doctype + accueil + credits + projets + sujets + etudiants + intervenants + "<script>    // 7\n"+ "\n" +
				" // li click handler which fills the projects search bar\n"+ "\n" +
				" // with the value of the current data-find attribute\n"+ "\n" +
				" $( 'li[data-find]' ).on( 'click',function(event){\n"+ "\n" +
				"  $(\"#autocomplete-input-projet\").val($(this).attr('data-find')).trigger('change');\n"+ "\n" +
				" });\n"+ "\n" +
				"</script>\n"+ "\n" +
				"</body>\n"+ "\n" +
				"</html>";
		
	}
	
	static final HashMap [] tabArray = Lib.lireCSV();
	static final HashMap<Integer, Etudiant> tempEtu = tabArray[0];
	static final HashMap<Integer, Projet> tempProj = tabArray[2];
	
	String doctype =
			"<!DOCTYPE html>\n"+ "\n" +
					"<html>\n"+ "\n" +
					"<head>\n"+ "\n" +
					"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"+ "\n" +
					"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"+ "\n" +
					"<meta name=\"generator\" content=\"OPTIweb VOPTIweb\" />\n"+ "\n" +
					"<title>0.1 - V0.1</title>\n"+ "\n" +
					"<link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" />    <!-- 1 -->\n"+ "\n" +
					"<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css\" />    <!-- 2 -->\n"+ "\n" +
					"<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>    <!-- 3 -->\n"+ "\n" +
					"<script src=\"http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js\"></script>    <!-- 4 -->\n"+ "\n" +
					"<style type='text/css'>    /* 5 */\n"+ "\n" +
					"@media all and (orientation:portrait) { .landscape {display: none;} }\n"+ "\n" +
					"@media all and (orientation:landscape) { .landscape {display: inline;} }\n"+ "\n" +
					"</style>\n"+ "\n" +
					"</head><body>\n"+ "\n" +
					"\n"+ "\n" +
					"    <!-- 6 -->\n"+ "\n" +
					"\n"+ "\n";
	
	String accueil = 
			"\n\n<!-- DEBUT page accueil -->\n"+
					"<div data-role=\"page\" id=\"accueil\" data-title=\"OPTIweb - V0.1\">\n"+
					"<div data-role=\"header\" data-add-back-btn=\"true\">\n"+
					"<h1>P<span class=\"landscape\">rojets </span>tut<span class=\"landscape\">orés</span> 2014-2015<br/>Département INFO<span class=\"landscape\">RMATIQUE</span><br/>IUT de Blagnac</h1>\n"+
					"<a href=\"#credits\" data-theme=\"b\" class=\"ui-btn-right\">Crédits</a>   <!-- 1 -->\n"+
					"</div>\n"+
					"<div data-role=\"content\">\n"+
					"<ul data-role=\"listview\" data-inset=\"true\" id=\"listeSources\">\n"+
					"  <li><a href=\"#projets\"><i class=\"fa fa-tasks\"></i> Projets</a></li>   <!-- 1 -->\n"+
					"  <li><a href=\"#sujets\"><i class=\"fa fa-copy\"></i> Sujets</a></li>   <!-- 1 -->\n"+
					"  <li><a href=\"#etudiants\"><i class=\"fa fa-group\"></i> Etudiants</a></li>   <!-- 1 -->\n"+
					"  <li><a href=\"#intervenants\"><i class=\"fa fa-group\"></i> Intervenants</a></li>   <!-- 1 -->\n"+
					"</ul>\n"+
					"</div>\n"+
					"<div data-role=\"footer\">\n"+
					" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa- fa-2x\"></i></h4>\n"+
					"</div>\n"+
					"</div>\n"+
					"<!-- FIN page accueil -->";

	String credits = 
			"\n\n<!-- DEBUT page credits -->\n"+
					"<div data-role=\"page\" id=\"credits\" data-title=\"OPTIweb - V0.1 - Crédits\">\n"+
					"<div data-role=\"header\" data-add-back-btn=\"true\">    <!-- 1 -->\n"+
					"<h1>Crédits</h1>\n"+
					"</div>\n"+
					"<div data-role=\"content\">\n"+
					"<p>Cette application a été réalisée dans le cadre du module M3301/MPA du DUT Informatique à l'IUT de Blagnac.</p>\n"+
					"<ul data-role=\"listview\" data-inset=\"true\" id=\"contacts\" data-theme=\"a\" data-divider-theme=\"b\">\n"+
					"    <li data-role=\"list-divider\">Product Owner</li>\n"+
					"    <li>André PÉNINOU</li>\n"+
					"    <li>Université Toulouse 2 - IUT de Blagnac\n"+
					"    <br/>Département INFORMATIQUE</li>\n"+
					"</ul>\n"+
					"<ul data-role=\"listview\" data-inset=\"true\" id=\"listecredits\" data-theme=\"a\" data-divider-theme=\"b\">\n"+
					"<li data-role=\"list-divider\">Membres de l'équipe enseignante</li>\n"+
					"<li>Jean-Michel BRUEL</li><li>Jean-Michel INGLEBERT</li><li>André PÉNINOU</li><li>Olivier ROQUES</li>\n"+
					"</ul>\n"+
					"<ul data-role=\"listview\" data-inset=\"true\" id=\"listepowered\" data-theme=\"a\" data-divider-theme=\"b\">\n"+
					"<li data-role=\"list-divider\">Propulsé par</li>\n"+
					"<li><a href=\"http://jquerymobile.com/\" target=\"autrePage\">http://jquerymobile.com/</a></li>\n"+
					"<li><a href=\"http://fortawesome.github.io/Font-Awesome/\" target=\"autrePage\">http://fortawesome.github.io/Font-Awesome/</a></li>\n"+
					"</ul>\n"+
					"</div>\n"+
					"<div data-role=\"footer\">\n"+
					"<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa- fa-2x\"></i></h4>\n"+
					"</div>\n"+
					"</div>\n"+
					"<!-- FIN page credits -->";

	String projets= 
			"\n\n<!-- DEBUT page projets -->\n"+
					"<div data-role=\"page\" id=\"projets\" data-title=\"OPTIweb - V0.1\">\n"+
					"<div data-role=\"header\" data-add-back-btn=\"true\">\n"+
					"<h1>Projets 2014-2015</h1>\n"+
					"\n"+
					"</div>\n"+
					"<div data-role=\"content\">\n"+
					"<form class=\"ui-filterable\">\n"+
					"<input id=\"autocomplete-input-projet\" name=\"projet\" data-type=\"search\" placeholder=\"Vous cherchez ?...\">   <!-- 1 -->\n"+
					"</form>\n"+
					"<ol id=\"listeprojets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-projet\">"
					+ ajouterDonnees(tabArray[2], 0) +
					"</ol>\n"+
					"</div>\n"+
					"<div data-role=\"footer\">\n"+
					" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-tasks fa-2x\"></i></h4>\n"+
					"</div>\n"+
					"</div>\n"+
					"<!-- FIN page projets -->" ;

	String sujets =
			"\n\n<!-- DEBUT page sujets -->\n"+
					"<div data-role=\"page\" id=\"sujets\" data-title=\"OPTIweb - V0.1\">\n"+
					"<div data-role=\"header\" data-add-back-btn=\"true\">    <!-- 1 -->\n"+
					"<h1>Sujets 2014-2015</h1>\n"+
					"\n"+
					"</div>\n"+
					"<div data-role=\"content\">\n"+
					"\n"+
					"<form class=\"ui-filterable\">\n"+
					"<input id=\"autocomplete-input-sujet\" name=\"sujet\" data-type=\"search\" placeholder=\"Vous cherchez ?\">    <!-- 2 -->\n"+
					"</form>\n"+
					"<ol id=\"listesujets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-sujet\" data-divider-theme=\"b\" data-count-theme=\"a\">"
					+ ajouterDonnees(tabArray[3], 1) + 
					"</ol>\n"+
					"</div>\n"+
					"<div data-role=\"footer\">\n"+
					" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-copy fa-2x\"></i></h4>\n"+
					"</div>\n"+
					"</div>\n"+
					"<!-- FIN page sujets -->";

	String etudiants =
			"\n\n<!-- DEBUT page etudiants -->\n"+
					"<div data-role=\"page\" id=\"etudiants\" data-title=\"OPTIweb - V0.1\">\n"+
					"<div data-role=\"header\" data-add-back-btn=\"true\">    <!-- 1 -->\n"+
					"<h1>Etudiants 2014-2015</h1>\n"+
					"\n"+
					"</div>\n"+
					"<div data-role=\"content\">\n"+
					"\n"+
					"<form class=\"ui-filterable\">\n"+
					"<input id=\"autocomplete-input-etudiant\" name=\"etudiant\" data-type=\"search\" placeholder=\"Etudiant ou Groupe X\">    <!-- 2 -->\n"+
					"</form>\n"+
					"<ol id=\"listeetudiants\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-etudiant\" data-divider-theme=\"b\">"
					+ ajouterDonnees(tabArray[0], 2) +
					"</ol>\n"+
					"</div>\n"+
					"<div data-role=\"footer\">\n"+
					" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-group fa-2x\"></i></h4>\n"+
					"</div>\n"+
					"</div>\n"+
					"<!-- FIN page etudiants -->";

	String intervenants = 
			"\n\n<!-- DEBUT page intervenants -->\n"+
					"<div data-role=\"page\" id=\"intervenants\" data-title=\"OPTIweb - V0.1\">\n"+
					"<div data-role=\"header\" data-add-back-btn=\"true\">    <!-- 1 -->\n"+
					"<h1>Intervenants 2014-2015</h1>\n"+
					"\n"+
					"</div>\n"+
					"<div data-role=\"content\">\n"+
					"\n"+
					"<form class=\"ui-filterable\">\n"+
					"<input id=\"autocomplete-input-intervenant\" name=\"intervenant\" data-type=\"search\" placeholder=\"Intervenant\">    <!-- 2 -->\n"+
					"</form>\n"+
					"<ul id=\"listeintervenants\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-intervenant\" data-divider-theme=\"b\">"
					+ ajouterDonnees(tabArray[1], 3) +
					"</ul>\n"+
					"</div>\n"+
					"<div data-role=\"footer\">\n"+
					" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-group fa-2x\"></i></h4>\n"+
					"</div>\n"+
					"</div>\n"+
					"<!-- FIN page intervenants -->";


	@SuppressWarnings("rawtypes")
	private static String ajouterDonnees(HashMap<Object, Object> tmpHash, int indice) {

		String [] tabString = new String[4];
		String tempoStringProjet = "";
		String tempoStringSujet ="";
		String tempoStringEtudiant ="";
		String tempoStringIntervenant="";

		if (indice == 0){
			//projet 
			Projet projetTmp ;

			for ( Entry entry : tmpHash.entrySet()){
				projetTmp = (Projet) entry.getValue();
				tempoStringProjet += "<li> "
						+ "<p>"
						+ "<b>["
						+ projetTmp.getSujet().getNom()
						+ "]</b> "
						+ projetTmp.getSujet().getTitre()
						+ "</p>"
						+ "<p>"
						+ "<b>Client :</b> "
						+ projetTmp.getEncadrer().getRole().getClient().getNom()
						+ " "
						+ projetTmp.getEncadrer().getRole().getClient().getPrenom()
						+ "</p>"
						+ "<p>"
						+ "<b>Superviseur :</b> "
						+ projetTmp.getEncadrer().getRole().getSuperviseur().getNom()
						+ " "
						+ projetTmp.getEncadrer().getRole().getSuperviseur().getPrenom()
						+ "</p>"
						+ "<p>"
						+ "<b>Groupe " 
						+ projetTmp.getGroupe().getLibelle() 
						+ " :</b>";

				Groupe EtuGroupeTmp;
				for (Entry entryEtu : tempEtu.entrySet()){
					EtuGroupeTmp = (Groupe) ((Etudiant)entryEtu.getValue()).getGroupe();
					if ( EtuGroupeTmp.equals(projetTmp.getGroupe()) ){
						tempoStringProjet += ((Etudiant) entryEtu.getValue()).getPrenom()
								+ " - "
								+ ((Etudiant) entryEtu.getValue()).getNom()
								+ " - ";
					}
				}
				tempoStringProjet += "</p>"
						+ "</li>";
			}
			return tempoStringProjet;
		}

		if (indice == 1){
			//Sujets 
			Sujet sujetTmp;
			tempoStringSujet+= "<li data-role=\"list-divider\">    <!-- 3 -->"
					+ "Sujet<span class=\"ui-li-count\" title=\"Groupe\" style=\"right: 40px !important;\">Groupe</span>"
					+ "</li>";

			for ( Entry entry : tmpHash.entrySet()){
				sujetTmp = (Sujet) entry.getValue();

				tempoStringSujet += "<li data-find=\"["
						+ sujetTmp.getNom()
						+ "]\"> "
						+ "<a href=\"#projets\">["
						+ sujetTmp.getNom()
						+ "] <br/>"
						+ "<div style=\"white-space:normal;\">"
						+ "<span><b>"
						+ sujetTmp.getTitre()
						+ "</b>"
						+ "</span><span class=\"ui-li-count\">"+sujetTmp.getGroupe()+"</span>"
						+ "</div>"
						+ "</a>"
						+ "</li>";
			}	
			return tempoStringSujet;
		}

		if (indice == 2){
			//Etudiant
			Etudiant etuTmp;
			tempoStringEtudiant+= "<li data-role=\"list-divider\">    <!-- 3 -->"
					+ "Etudiant<span class=\"ui-li-count\" title=\"Groupe\" style=\"right: 40px !important;\">Groupe</span>"
					+ "</li>";

			for ( Entry entry : tmpHash.entrySet())
			{
				etuTmp =   (Etudiant) entry.getValue();

				tempoStringEtudiant+="<li data-find=\""
						+ etuTmp.getNom()
						+ " "
						+ etuTmp.getPrenom()
						+ "\">    <!-- 4 -->"
						+ "<a href=\"#projets\">"
						+ etuTmp.getNom()
						+ " "
						+ etuTmp.getPrenom()
						+ "<span class=\"ui-li-count\" title=\"Groupe\">Groupe "
						+ etuTmp.getGroupe().getLibelle()
						+ "</span>"
						+ "</a>"
						+ "</li>";
			}
			return tempoStringEtudiant;
		}	

		if (indice == 3){
			//Intervenants 
			Intervenant interTmp;
			tempoStringIntervenant +="<li data-role=\"list-divider\">    <!-- 3 -->"
					+"Intervenant<span class=\"ui-li-count\" style=\"right: 110px !important;\" title=\"Client\">Client</span><span class=\"ui-li-count\" title=\"Superviseur\">Superviseur</span>"
					+"</li>";

			for ( Entry entry : tmpHash.entrySet()){
				interTmp =  (Intervenant) entry.getValue();

				tempoStringIntervenant+= "<li data-find=\""
						+ interTmp.getNom()
						+ " "
						+ interTmp.getPrenom()
						+ "\">    <!-- 4 -->"
						+ "<a href=\"#projets\">"
						+ interTmp.getNom()
						+ " "
						+ interTmp.getPrenom()
						+ "<span class=\"ui-li-count\" style=\"right: 120px !important;\" title=\"Client\">"+interTmp.getClient()+"</span>"
						+ "<span class=\"ui-li-count\" title=\"Superviseur\">"+interTmp.getSuperviseur()+"</span>"
						+ "</a>"
						+ "</li>";
			}
			return tempoStringIntervenant;
		}

		return "";

	}
	
	public String html (){
		return this.res;
	}
}


