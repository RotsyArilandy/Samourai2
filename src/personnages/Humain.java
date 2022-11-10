package personnages;

public class Humain {
	
	private String  nom;
	private int argent;
	private String boisson;
	
	/**
	 * @param nom
	 * @param argent
	 * @param boisson
	 */
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler( String texte) {
		String s = "( " + this.nom + " )-";
		s += texte;
		System.out.println(s);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " +this.nom + " et j'aime boire du "+ this.boisson);
	}
	
	public void boire () {
		parler("Mmmm, un bon verre de "+ this.boisson + " !GLOUPS !)");
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the argent
	 */
	public int getArgent() {
		return argent;
	}

	/**
	 * @return the boisson
	 */
	public String getBoisson() {
		return boisson;
	}
	
	public void gagnerArgent ( int somme) {
		this.argent += somme;
	}
	
	public void perdreArgent (int somme) {
		this.argent -= somme;
	}

}
