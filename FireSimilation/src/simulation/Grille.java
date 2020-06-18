package simulation;

import java.awt.Color;
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
		this.setSize(560,560);
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
        int c = 1;
//        g.setColor(Arbre.getColor(tableau_foret[coordX][coordY]));
//        g.fillRect(0, 0, pas, pas);
//        repaint();

        for (coordX = 0; coordX < 140; coordX ++) {
            for (coordY = 0; coordY < 140; coordY ++) {
//            	if(i%pas == 0 && j%pas == 0) {
//            		coordX += 1;
//            		coordY += 1;
//            		}
//            	else if(i%pas == 0){
//            		coordX += 1;
//            	}
//            	else if(j%pas == 0) {
//            		coordY += 1;
//            	}
//            	else {
//            		;
//            	}
            	if(coordX == 140 || coordY == 140) {
            		break;
            	}

            	g.setColor(Arbre.getColor(tableau_foret[coordX][coordY]));
                g.fillRect(coordX*4, coordY*4, pas, pas);
                c++;
                }            	
        }
        System.out.println(coordX);
        System.out.println(coordY);
        System.out.println(c);
        System.out.println(140*140);

        
    }
	
//    public static void main(String[] args) {
//    	JFrame frame =new JFrame();
//    	 
//         frame.setSize(700, 700);
//         frame.setResizable(false);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    	Foret foret = new Foret(0,(float) 0.6);
//		Grille grille = new Grille(foret);
//		frame.setContentPane(grille);
//    	frame.setContentPane(grille);
//    	grille.setVisible(true);
//    	frame.setVisible(true);
//
//    }
	

}
