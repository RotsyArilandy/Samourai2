package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourais;

public class Traitre extends Samourais{

	private int traitrise ;

	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		this.traitrise = 0;
	}
	
	public void extorquer( Commercant c ) {
		if (this.traitrise < 3) {
			this.traitrise++;
		}
	}
	
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon niveau de traitrise est "+this.traitrise);
	}
	
	
	public void faireLeGentil(Humain h, int somme) {
		while ( traitrise > 0) {
			this.perdreArgent(somme);
			h.gagnerArgent(somme);
			traitrise -=  0.9*somme;
			this.parler("Je fais ami ami avec "+h.getNom());
		}
			
	}
	

}
