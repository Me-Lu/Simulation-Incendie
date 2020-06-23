package modele;

/**
 * Classe qui propage le feu dans le tableau de valeurs de la forêt.
 * @author Melvin
 *
 */


public class Propagation{
	

	
	/**
	 * Constructeur Propagation.
	 * Applique la propagation à la grille de la forêt courante.
	 */
	public Propagation(){
		propagation(Foret.grille_foret);
	}
	
	/**
	 * Met à jour la grille_foret en propageant le feu à travers la grille.
	 * @param tableau_foret
	 * 		grille_foret de valeurs de la forêt.
	 * @see Foret_Tampon#foret_tampon
	 * @see Foret#grille_foret
	 * @see Foret#setnbArbreenFlamme(int)
	 * @see Foret#getnbArbreenFlamme()
	 */
	public static void propagation(int [][] tableau_foret){	
		int nbArbreFlamme = Foret.nbArbreenFlamme;

		for(int i=1; i<Foret.taille-1; i++){
			for(int j=1; j<Foret.taille-1; j++){
				if (tableau_foret[i][j] == 1){
					 if (tableau_foret[i][j+1] == 2) {
						 Foret_Tampon.foret_tampon[i][j]=2;
					 	 nbArbreFlamme++;
					 	 }
					 else if(tableau_foret[i][j-1] == 2){
						 Foret_Tampon.foret_tampon[i][j] = 2;
						 nbArbreFlamme++;
						 } 
					 else if(tableau_foret[i+1][j] == 2){
						 Foret_Tampon.foret_tampon[i][j] = 2;
						 nbArbreFlamme++;
						 }
					 else if(tableau_foret[i-1][j] == 2){
						 Foret_Tampon.foret_tampon[i][j] = 2;
						 nbArbreFlamme++;
						 } 

				}
				else if (tableau_foret[i][j] == 2){
					Foret_Tampon.foret_tampon[i][j] = 3;
					nbArbreFlamme--;
				}
			}
		}
		for(int i1 = 1; i1<Foret.taille; i1++) { 
			for(int j1 = 1; j1<Foret.taille; j1++) {
				if (Foret_Tampon.foret_tampon[i1][j1] != tableau_foret[i1][j1]){
					tableau_foret[i1][j1] = Foret_Tampon.foret_tampon[i1][j1];
				}
			}
		}

		Foret.setForet(tableau_foret);
		Foret.setnbArbreenFlamme(nbArbreFlamme);
	}
	
	
		

}
	



