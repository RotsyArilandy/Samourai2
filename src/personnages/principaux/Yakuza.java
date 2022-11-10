package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson , String clan , int reputation) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = reputation;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer( Commercant c ) {
		c.perdreArgent(c.getArgent());
		this.gagnerArgent(c.getArgent());
		reputation ++;
		parler("Je viens d'extorquer "+ c.getNom()+ " !!!");
	}
	
	public void gagnerDuel() {
		reputation ++ ;
		parler("J'ai gangé ! Je suis trop fort!");
	}
	
	public void perdreDuel() {
		this.perdreArgent(getArgent());
		reputation--;
		parler("Minceeee !!!J'ai perdu tout mon argent ! Sniff sniff");
	}
	
	public void direBonjour() {
		super.direBonjour();
	}

	
	
	

}
