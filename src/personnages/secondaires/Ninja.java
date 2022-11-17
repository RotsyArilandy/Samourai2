package personnages.secondaires;

import java.util.Random;

import personnages.principaux.*;

public class Ninja extends Yakuza{
	
	private static final String[] clansNinja =  { "of Shadows","of Mist", "of Clouds", "of Fog","of Darkness"};

	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
	}
	
	public void direBonjour() {
		String cl = "";
		Random r = new Random();
		int valeur = r.nextInt(1,5);
		switch (valeur) {
			case 1 : 
				cl = clansNinja[1];
				break;
			case 2 :
				cl = clansNinja[2];
			case 3 :
				cl = clansNinja[3];
			case 4 :
				cl = clansNinja[4];
		}
		super.direBonjour();
		parler("mon clan secret est "+this.getClan()+".\n (mon clan secret est "+this.getClan()+" "+cl+ "et maintenant que tu les sais, je vais devoir te tuer");
	}
	
	
}
