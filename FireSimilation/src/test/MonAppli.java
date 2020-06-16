package test;


import java.awt.GridLayout;

import javax.swing.JFrame;



public class MonAppli extends JFrame  {
	
	private static final long serialVersionUID = -6754280283986492476L;
	
	public MonAppli() {
	
		super("fenetre");
		this.setTitle("Simulation de feu de forêt");
		
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new GridLayout(0,1));
		PanneauGrille grillePan = new PanneauGrille();
		this.getContentPane().add(grillePan);
		
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MonAppli appli = new MonAppli();
	}
	
}
