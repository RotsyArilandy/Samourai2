package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteurs extends Commercant{

	public Colporteurs(String nom, int argent) {
		super(nom, argent);
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(getArgent()/2);
		parler("J'ai tout perdu! Le monde est trop injuste...(hihi, j'ai caché la moitié ..... mais chuuut!");
		return  getArgent();
	}

}
