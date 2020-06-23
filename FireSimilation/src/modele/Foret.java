package modele;


/**
 * Classe qui gère la forêt en tant que tableau de valeurs sur lequel sera appliqué la propagation.
 * @author Melvin
 *
 */

public class Foret {
	
	/**
	 * Contient le nombre d'arbres en flamme pendant toute la durée de vie de l'objet Foret.
	 * @see Foret#setnbArbreenFlamme(int)
	 * @see Foret#getnbArbreenFlamme()
	 */
	public static int nbArbreenFlamme;
	
	/**
	 * Contient le nombre d'arbre créé.
	 */
	public static int nbArbre;
	
	/**
	 * Contient la taille du tableau de la foret.
	 * @see Foret#taille
	 */
	public static final int taille = 140;
	
	/**
	 * Contient la densité entrée par l'utilisateur.
	 * @see Conteneur_Fenetre_initiale#getTextField()
	 */
	float densite;
	
	/**
	 * Contient le tableau de la foret.
	 */
	public static int[][] grille_foret;

	
	/**
	 * Constructeur Foret, initialise grille_foret avec la densité entrée.
	 * @param densite
	 * 		Densité entrée.
	 */
	public Foret(float densite) {
		this.densite = densite;
		grille_foret = init_Foret(new int[taille][taille], densite);
	}

	/**
	 * Initialise grille_foret, rempli le tableau d'arbres suivant la densité entrée.
	 * @param foret
	 * 		Tableau de la forêt à initialiser.
	 * @param d
	 * 		Densitée entrée.
	 * @return nouvelle grille.
	 * 		Tableau de la forêt initialisé.
	 * 
	 * @see Foret#setnbArbreenFlamme(int)
	 */
	public int[][] init_Foret(int[][] foret ,float d){		
		int i,j;
		double hasard;
		setnbArbreenFlamme(0);
		nbArbre = 0;
		for(i=0; i<taille; i++){
			for(j=0; j<taille; j++) {
				hasard = (int)Math.floor(Math.random()*1000);
				if(hasard<(int)(d*1000)) {
					foret[i][j]=1;
					nbArbre++;				 
				}
				else {
					foret[i][j]=0;					
				}
			}
		}
		return foret;
		 
	}
	
	/**
	 * Met à jour le nombre d'arbres en flamme.
	 * @param i
	 * 		Nouveau nombre d'arbres en flamme.
	 * @see Foret#nbArbreenFlamme
	 */
	public static  void setnbArbreenFlamme(int i) {
		nbArbreenFlamme = i;
	}
	
	/**Retourne nbArbreenFlamme.
	 * 
	 * @return Nombre d'arbres en flamme.
	 * @see Foret#nbArbreenFlamme
	 */
	public static int getnbArbreenFlamme() {
		return nbArbreenFlamme;
	}

	/**
	 * Met à jour la grille_foret avec un nouveau tableau.
	 * @param newForet
	 * 		Grille_foret mise à jour pendant le propagation ou l'initialisation.
	 */
	public static void setForet(int [][] newForet){
		grille_foret = newForet;
	} 
	
	/**
	 * Retourne le tableau de la forêt.
	 * @return grille_foret
	 */
	public static int[][] getForet(){
		return grille_foret;
	}
	
}
	


