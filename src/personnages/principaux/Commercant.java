package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(getArgent());
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return  getArgent();
				
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		parler("Je te remercie généreux donateur!");
	}
}
