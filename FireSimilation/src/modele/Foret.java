package modele;

public class Foret {
	
	public int nbArbreenFlamme;
	public int nbArbre;
	public int taille = 140;
	float densite;
	int[][] grille_foret;

	
	public Foret(int nbArbreenFlamme,float densite) {
		this.nbArbreenFlamme = nbArbreenFlamme;
		this.densite = densite;
		this.grille_foret = new int[taille][taille];
		grille_foret = init_Foret(grille_foret, densite);
	}
	
	

	public int[][] init_Foret(int[][] foret ,float d){		
		int i,j;
		double hasard;
		nbArbre = 0;
		for(i=1; i<taille; i++){
			for(j=1; j<taille; j++) {
				hasard = Math.random()*1000;
				if(hasard<(int)(d*1000.)) {
					foret[i][j]=1;
					nbArbre++;				 
				}
			}
		}
		return foret;
		 
	} 
	public static void main(String[] args) {
	float densite = (float) 0.6;
	Foret foret = new Foret(0,densite);
	System.out.println(foret.nbArbreenFlamme);
	System.out.println(foret.grille_foret);
	
	
	}
	
	

		
}
	


