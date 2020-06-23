package modele;

/**
 * Classe Feu.
 * @author Melvin
 *
 */

public class Feu {

	/**
	 * Constructeur Feu
	 */
	public Feu() {
	}
	
	/**
	 * Initialise le feu sur une case dans la grille de la forêt.
	 * @param foret
	 * 			Permet d'appliquer l'initialisation dans la fenêtre de simualtion avec setForet().
	 * @return Tableau de l'état de la forêt
	 * @see Foret_Tampon
	 * @see Foret_Tampon#foret_tampon
	 * @see Foret#setForet(int[][])
	 * @see Foret#grille_foret
	 */
	public static int[][] init_Feu(Foret foret) {
		 int[][] tableau_foret = Foret.grille_foret;
		 for(int j=1; j< Foret.taille; j++) {
			 for(int i=1; i<Foret.taille; i++) {
				 if (tableau_foret[j][i] == 1) { 
					 tableau_foret[j][i] = 2;  
					 Foret.setnbArbreenFlamme(1);
					 j = Foret.taille;
					 i = Foret.taille;
					 break;}
				 }			 
		 }
		 new Foret_Tampon(Foret.taille);
		 for(int i=0; i<Foret.taille; i++) {
			 for(int j=0; j<Foret.taille; j++) {
				 Foret_Tampon.foret_tampon[i][j] = tableau_foret[i][j];
				 }
		 }
		 return tableau_foret;
	}
	
	/**
	 * Vérifie que le nombre d'arbres en feu n'est pas nul.
	 * @param i
	 * 		Le nombre d'arbres en flammes.
	 * @return booléen
	 */
	public static Boolean stop_Feu(int i) {
		return i != 0;
	}
	
	
	
	
}
