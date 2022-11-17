package personnages.secondaires;

import personnages.*;
import personnages.principaux.*;

import java.util.Random;

public class GrandMere extends Humain {
	public GrandMere(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}

	private Humain[] memoire = new Humain[30];
	
	private String humainHasard() {
		String type = "";
		Random ran = new Random();
		int valeur = ran.nextInt(4);
		
		switch(valeur) {
			case 0 : 
				type = "Commerçant"; break ;
			case 1 : 
				type = "Yakuza";break;
			case 2 : 
				type = "Ronin";break; 
			case 3 : 
				type = "Samourai";break;
		}
		return type;
	}
	
	
	public void faireConnaissanceAvec( Humain humain) {
		int i = 0;
		if ( memoire.length >= 30) {
			super.parler("Oups !! Ta memoire est pleine. Tu ne peux plus memoriser d'autres humains");}
		else {
			while (memoire[i] != null) {
				i++;
			}
			memoire[i]=humain;
			parler("Ravi de vous rencontrer "+ humain.getNom());
			
			
			}
	}
		
	public void ragoter() {
		for (int i = 0 ; i<memoire.length; i++) {
			if (memoire[i] instanceof Traitre) {
				this.parler("Méfiez-vous!!!Je sais que "+ memoire[i].getNom()+" est un traitre.");}
			else {
				this.parler("Je crois que "+ memoire[i].getNom()+" est un "+ humainHasard());}
				
			}
	}
		
}
