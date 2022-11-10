package histoire;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Yakuza;

public class MonHistoire {
	
	public static void main (String [] args ) {
		Commercant c = new Commercant("Paul",500);
		Ronin r = new Ronin("Ronin Paul",25,"Rhum");
		Yakuza y = new Yakuza ("Yakuza Gérard",50, "Coca","Gauche",0);
		
		/**System.out.println("L'argent du commerçant est "+ c.getArgent());
		System.out.println("L'argent du yakuza est "+ y.getArgent());
		y.extorquer(c);
		System.out.println("Après l'excroquerie , l'argent du commerçant est "+c.getArgent());
		System.out.println("Après l'excroquerie , l'argent du yakuza est "+y.getArgent());
		c.recevoir(5);
		System.out.println(c.getArgent());**/
		
		
		r.direBonjour();
		y.direBonjour();
		System.out.println("Argent Ronin "+r.getArgent());
		System.out.println("Argent Yakuza "+y.getArgent());
		System.out.println("Le ronin va provoquer le yakuza");
		r.provoquer(y);
		System.out.println("Argent Ronin "+r.getArgent());
		System.out.println("Argent Yakuza "+y.getArgent());
		System.out.println("Honneur Ronin "+ r.getHonneur());
		System.out.println("Réputation Yakuza "+ y.getReputation());
		
		
		
		
		
	}
}
