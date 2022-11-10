package personnages.principaux;

public class Samourais extends Ronin{
	
	String seigneur;

	public Samourais(String nom, int argent, String boisson,String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	private void boire(String b) {
		parler("Mmmm, un bon verre de "+ b+ " !GLOUPS !)");
	}

}
