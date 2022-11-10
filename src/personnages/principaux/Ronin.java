package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	private int honneur ;

	
	/**
	 * @param nom
	 * @param argent
	 * @param boisson
	 * @param honneur
	 */
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}
	
	public void donner (int n, Commercant c) {
		perdreArgent(n);
		c.gagnerArgent(n);
	}
	
	public void provoquer(Yakuza y) {
		if (2*this.honneur > y.getReputation()){
			y.perdreDuel();
			gagnerArgent(y.getArgent());
			honneur++;
			parler("Je suis trop fort!! J'ai gagné contre le Yakuza "+y.getNom());
		}
		
		else {
			y.gagnerDuel();
			honneur--;
			parler("Miincee!! J'ai perdu contre le Yakuza "+y.getNom());
		}
			
	}

	
	public int getHonneur() {
		return honneur;
	}
	
	
	
	
	
	
	
}
