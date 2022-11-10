package personnages.principaux;
import personnages.humain;

public class Commercant  extends humain{
	Commercant (String nom, int argent) {
		super(nom, argent, "thé");
	}
	public int seFaireExtorquer() {
		int n=getArgent();
		perdreArgent(n);
		parler("J'ai tout perdu : Le monde est injuste !");
		return n;
				
	}
	
	public void recevoir(int n) {
		gagnerArgent(n);
		
	}
	
	
		
	

}
