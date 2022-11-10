package personnages.principaux;
import personnages.humain;

public class Commercant1 extends humain{
	
	public Commercant1(String nom, int argent) {
		super(nom, argent);
		// TODO Auto-generated constructor stub
	}

	public Commercant (String nom, int argent){
		
		this.nom=nom;
		
		
	}
	
	void seFaireExtorquer() {
		this.setArgent(0);
	}
	

}
