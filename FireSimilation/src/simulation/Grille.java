package simulation;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import modele.Arbre;
import modele.Foret;

/**
 * Grille est la classe qui gère le contenu de la grille
 * 
 * @author Melvin
 */

public class Grille extends JPanel{


	private static final long serialVersionUID = 8510386589653053710L;
	
	/**
	 * Nombre de pixels dédiés à un arbre.
	 * @see Arbre
	 */
	static final int pas = 4;

	
	/**
     * Constructeur Grille.
     * 
     *            Construteur de l'objet Grille.
     */
	public Grille() {
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}
	
	/**
	 * Paint l'objet Grille avec le tableau de Foret
	 * @param Element Graphique
	 * @see Foret#grille_foret
	 * @see Arbre#getColor(int)
	 * 
	 */
	@Override
    public void paintComponent(Graphics g1){ 
		super.paintComponent(g1);
		Graphics2D g = (Graphics2D) g1;
    	int [][] tableau_foret = Foret.grille_foret;
        int coordX = 0;
        int coordY = 0;
        for (coordX = 0; coordX < 140; coordX ++) {
            for (coordY = 0; coordY < 140; coordY ++) {
            	g.setColor(Arbre.getColor(tableau_foret[coordX][coordY]));
                g.fillRect(coordX*4, coordY*4, pas, pas);
 
                }            	
        }

    }

}
