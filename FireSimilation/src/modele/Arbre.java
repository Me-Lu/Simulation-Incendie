package modele;

public class Arbre {
	public int couleur;
	public int coordX;
	public int coordY;
	
	public void arbre(int coordX,int coordY, int couleur) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.couleur = couleur;
		}
		
	public void setCouleur(int x, int y) {
		int i,j;
		int pas = 4;
		for(i = 0; i < pas; i++) for(j = 0; j < pas; j++) {
			putpixel(pas*x+i,pas*y+j,couleur[color]);
		}
	} 

	

}
