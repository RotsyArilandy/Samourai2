package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, int argent, String boisson , String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = 0;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer( Commercant c ) {
		gagnerArgent(c.getArgent());
		reputation ++;
		parler("J'ai piqué le fric de "+ c.getNom());
	}
	
	public void gagnerDuel() {
		this.gagnerArgent(getArgent());
		reputation ++ ;
		parler("J'ai gangé ! Je suis trop fort!");
	}
	
	public void perdreDuel() {
		parler("J'ai perdu tout mon duel et mes "+ getArgent()+ " sous, Sniff ...");
		perdreArgent(getArgent());
		reputation--;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+this.clan);
		}

	
}
