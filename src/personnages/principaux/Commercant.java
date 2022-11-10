package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("Le monde est très injuste");
		return  getArgent();
				
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
	}
}
