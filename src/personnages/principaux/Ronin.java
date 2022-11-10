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
		this.perdreArgent(n);
		c.gagnerArgent(n);
		parler("Tiens "+ c.getNom()+ " voilà " + c.getArgent()+ " sous");
	}
	
	public void provoquer(Yakuza y) {
		if (2*this.honneur > y.getReputation()){
			gagnerArgent(y.getArgent());
			y.perdreDuel();
			honneur++;
			parler("Je t’ai eu petit yakusa!");
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
