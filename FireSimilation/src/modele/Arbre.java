package modele;
import java.awt.Color;

/**
 * Classe qui transmet les couleurs.
 * @author Melvin
 *
 */

public class Arbre{
	
	/**
	 * Couleur d'un arbre.
	 */
	public  static final Color arbre = Color.GREEN;
	
	/**
	 * Couleur d'un vide.
	 */
	public  static final Color rien = Color.WHITE;
	
	/**
	 * Couleur d'un arbre en feu.
	 */
	public  static final Color enFeu = Color.RED;
	
	/**
	 * Couleur d'un arbre consumé.
	 */
	public  static final Color brule = Color.GRAY;

	
	/**
	 * Constructeur Arbre.
	 */
	public Arbre() {
		}
	
	/**
	 * Retourne la couleur selon la valeur de la case de la grille.
	 * @param i
	 * 		Case du tableau de la forêt
	 * @return Color
	 * 		Retourne une couleur correspondant à l'état d'une case.
	 */
	public static Color getColor(int i) {
		 if(i == 0) {
	        	return rien;
	        	}
	        if(i == 1) {
	        	return arbre;
	        	}
	        if(i == 2) {
	        	return enFeu;}
	        else {
	        	return brule;
	        }
	}


	

}
