package modele;



public class Feu {
	
	public Foret foret;
	public Arbre arbre;
	
	public Feu(Foret foret) {
		this.foret = foret;
	}
	

	public static int[][] init_Feu(Foret foret) {
		 int[][] tableau_foret = foret.grille_foret;
		 int nbarbreFlamme = foret.nbArbreenFlamme;
		 for(int j=1; j< foret.taille; j++) {
			 for(int i=1; i<foret.taille; i++) {
				 if (tableau_foret[j][i] == 1) { 
					 tableau_foret[j][i] = 2;  
					 foret.setnbArbreenFlamme(nbarbreFlamme+1);
					 j = foret.taille;
					 i = foret.taille;
					 break;}
				 }			 
		 }
		 new Foret_Tampon(foret.taille);
		 for(int i=1; i<foret.taille; i++) {
			 for(int j=1; j<foret.taille; j++) {
				 Foret_Tampon.foret_tampon[i][j] = tableau_foret[i][j];
				 }
		 }
		 return tableau_foret;
	}
	
	public static Boolean stop_Feu(int i) {
		return i != 0;
	}
	
	
	
	
}
