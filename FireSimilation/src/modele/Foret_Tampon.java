package modele;

/**
 * Classe servant de tampon pour la propagation du feu
 * @author Melvin
 *
 */
public class Foret_Tampon {
	
	/**
	 * Contient la foret tampon pour la propagation
	 * @see Propagation
	 */
	public static int[][] foret_tampon;
	
	/**
	 * Constructeur Foret_Tampon
	 * @param i
	 * 		Taille du tableau, est initialisé avec la taille du tableau Foret.
	 * @see Foret#taille
	 */
	public Foret_Tampon(int i) {
		Foret_Tampon.foret_tampon = new int[i][i];
	}
	
	/**
	 * Récupère le tableau de la forêt tampon 
	 * @return Tableau des valeurs de la foret tampon
	 */
	public int[][] getForet_Tampon(){
		return foret_tampon;
	}
	
	

}
