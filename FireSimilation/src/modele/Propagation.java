package modele;

public class Propagation{
	public Foret foret;
	public Feu feu;
	public int [][] grille_foret;
	
	
	public Propagation(Foret foret){
		this.foret = foret;
		propagation(foret);
	}
	public static void propagation(Foret foret){
		int[][] tableau_foret = foret.grille_foret;		
		for(int i=1; i<foret.taille-1; i++){
			for(int j=1; j<foret.taille-1; j++){
				if (tableau_foret[i][j] == 1){
					 if (tableau_foret[i][j+1] == 2) {
						 Foret_Tampon.foret_tampon[i][j]=2;
					 	 foret.setnbArbreenFlamme(foret.nbArbreenFlamme+1);}
					 else if(tableau_foret[i][j-1] == 2){
						 Foret_Tampon.foret_tampon[i][j] = 2;
						 foret.setnbArbreenFlamme(foret.nbArbreenFlamme+1);
						 } 
					 else if(tableau_foret[i+1][j] == 2){
						 Foret_Tampon.foret_tampon[i][j] = 2;
						 foret.setnbArbreenFlamme(foret.nbArbreenFlamme+1);
						 }
					 else if(tableau_foret[i-1][j] == 2){
						 Foret_Tampon.foret_tampon[i][j] = 2;
						 foret.setnbArbreenFlamme(foret.nbArbreenFlamme+1);
						 } 
				}
				else if (tableau_foret[i][j]==2){
					Foret_Tampon.foret_tampon[i][j]=3;
					foret.setnbArbreenFlamme(foret.nbArbreenFlamme-1);
				}
			}
		}
		for(int i1 = 1; i1<foret.taille; i1++) { 
			for(int j1 = 1; j1<foret.taille; j1++) {
				if (Foret_Tampon.foret_tampon[i1][j1]!=tableau_foret[i1][j1]){
					tableau_foret[i1][j1]=Foret_Tampon.foret_tampon[i1][j1];
				}
			}
		}
		foret.setForet(tableau_foret);
	}
	
	
		

}
	



