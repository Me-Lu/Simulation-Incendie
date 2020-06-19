package simulation;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import modele.Arbre;
import modele.Foret;

public class Grille extends JPanel{


	private static final long serialVersionUID = 8510386589653053710L;
	public  Foret foret;
	static final int pas = 4;
	public Arbre arbre;

	
	public Grille(Foret foret) {
		this.foret = foret;
//		this.setSize(560,560);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}
	@Override
    public void paint(Graphics g1){ 
		super.paint(g1);
		Graphics2D g = (Graphics2D) g1;
    	Foret foret = this.foret;
    	int [][] tableau_foret = foret.grille_foret;
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
