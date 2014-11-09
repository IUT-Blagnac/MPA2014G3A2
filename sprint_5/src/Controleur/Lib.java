package Controleur;

import java.io.*;
import java.util.HashMap;
import java.util.HashMap;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Modele.*;

public class Lib {

	private static String csvToString(String chemin) {
		String chaine;
		String res = "";
		try {
			BufferedReader fichierSource = new BufferedReader(new FileReader(
					chemin));
			while ((chaine = fichierSource.readLine()) != null) {
				res += chaine;
				res += ("/n");
			}
			fichierSource.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return res;
	}

	public static HashMap [] lireCSV() {
		String pathFichiers [] = new String [] {"data/etudiants2014_2015.csv", "data/sujets2014_2015.csv", "data/intervenants2014_2015.csv", "data/projets2014_2015.csv", "data/voeux2014_2015.csv"};
		HashMap [] resArray = new HashMap [6];



		String [] chainon;
		String chaine;
		int i = 0;

		try {
			HashMap<Integer, Etudiant> arrayEtu = new HashMap<Integer, Etudiant>();
			HashMap<Integer, Intervenant> arrayInt = new HashMap<Integer, Intervenant>();
			HashMap<Integer, Projet> arrayProj = new HashMap<Integer, Projet>();
			HashMap<Integer, Sujet> arraySuj = new HashMap<Integer, Sujet>();
			HashMap<String, Groupe> arrayGrpe = new HashMap<String, Groupe>();
			HashMap<Integer, Voeu> arrayVoeu = new HashMap<Integer, Voeu>();

			for(i = 0; i < pathFichiers.length; i++){
				BufferedReader fichierSource = new BufferedReader(new FileReader(
						pathFichiers[i]));
				chaine = fichierSource.readLine();
				chainon = chaine.split(";");
				while ((chaine = fichierSource.readLine()) != null) {
					chainon = chaine.split(";");
					if(i == 0){
						if(!arrayGrpe.containsKey(chainon[0])){
							arrayGrpe.put(chainon[0],new Groupe(chainon[0]));
						}
						arrayEtu.put(Integer.parseInt(chainon[1]),new Etudiant (chainon[2], chainon[3], arrayGrpe.get(chainon[0]) ));
						
					}else if(i == 1){
						arraySuj.put(Integer.parseInt(chainon[0]) ,new Sujet (chainon[0], chainon[1], chainon[2], 10 ));
					}else if(i == 2){
						arrayInt.put(Integer.parseInt(chainon[0]), new Intervenant (chainon[2], chainon[1] ));
					}else if (i == 3){
						arrayProj.put(Integer.parseInt(chainon[0]), new Projet (arrayGrpe.get(chainon[1]), arraySuj.get(Integer.parseInt(chainon[2])), new Encadrer(arrayInt.get(Integer.parseInt(chainon[3])), arrayInt.get(Integer.parseInt(chainon[4])), null) ));
						arrayInt.get(Integer.parseInt(chainon[3])).setClient();
						arrayInt.get(Integer.parseInt(chainon[4])).setSuperviseur();
						arraySuj.get(Integer.parseInt(chainon[2])).setGroupe(chainon[1]);
					}
				}
				fichierSource.close();
			}
			resArray[0] = arrayEtu;
			resArray[1] = arrayInt;
			resArray[2] = arrayProj;
			resArray[3] = arraySuj;
			resArray[4] = arrayGrpe;
			resArray[5] = arrayVoeu;
			
			System.out.println(((Sujet)resArray[3].get(2)).getTitre());
			return resArray;
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return new HashMap []{};

	}

	public static void sauvegarderCSV(String[][] content, String destination) {
		try {
			FileWriter fstream = new FileWriter(destination);
			BufferedWriter out = new BufferedWriter(fstream);
			int nRow = content.length, nCol = content[0].length;
			String resultat = new String();
			for (int i = 0 ; i < nRow ; i++){
				for (int j = 0 ; j < nCol ; j++){
					resultat += content[i][j];
					if(j == nCol-1){
						resultat += "\n";
					}else{
						resultat += ";";
					}
				}
			}

			out.write(resultat);
			out.close();
			System.out.println("Sauvegardé avec succes !");
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}

	}

	public static String[][] lireJTable(JTable table){
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
		String[][] tableData = new String[nRow+1][nCol];
		for (int i = 0 ; i < nRow+1 ; i++){
			for (int j = 0 ; j < nCol ; j++){
				if(i == 0){
					tableData[i][j] = (String)dtm.getColumnName(j);
				}else{
					tableData[i][j] = (String)dtm.getValueAt(i-1,j);
				}
			}
		}
		return tableData;
	}
}

