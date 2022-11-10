package histoire;

import personnages.Humain;
import personnages.principaux.Commercant;

public class MonHistoire {
	
	public static void main (String [] args ) {
		Commercant c = new Commercant("Paul",500);
		c.direBonjour();
		c.parler ("J'ai "+ c.getArgent());
		c.seFaireExtorquer();
		c.parler ("J'ai "+ c.getArgent());
		
		
		
		
		
	}
}
