package personnages;


public class humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte) {
		System.out.println("("+this.nom+")-"+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle "+this.nom+" et j'aime boire du "+this.boisson+"et j'ai "+this.argent+" sous en poche"); 
	}
	
	public void boire() {
		parler("hum, un bon verre de "+this.boisson+" ! gloups !");
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}
	
	void gagnerArgent(int n) {
		this.argent+=n;
					
	}
	void perdreArgent(int n) {
		this.argent-=n;
					
	}

}
