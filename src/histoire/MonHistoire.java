package histoire;

import personnages.Humain;

public class MonHistoire {
	
	public static void main (String [] args ) {
		Humain h = new Humain("Rotsy",500,"thé");
		h.direBonjour();
		h.parler("J'ai "+ h.getArgent());
		h.gagnerArgent(40);
		h.parler("J'ai "+ h.getArgent());
		h.perdreArgent(50);
		h.parler("J'ai "+ h.getArgent());
		
	}
}
