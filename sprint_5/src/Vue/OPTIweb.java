package Vue;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import Controleur.Lib;
import Controleur.Pages;

public class OPTIweb {

	static String destination;
	
	public static void makeOPTIweb(String contenu, String destination){
		
		BufferedWriter out;
		
		try{
			destination = "sprint_5/OPTIweb/test/OPTIweb.html";
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destination),"UTF-8"));
			out.write(contenu);
			out.close();
			System.out.println(destination + " créé.");
		} catch(IOException e){System.err.println("Error: " + e.getMessage());}
		
	}
	
	public static void main(String[] args) {
		makeOPTIweb(new Pages().html(), destination);
	}

}
