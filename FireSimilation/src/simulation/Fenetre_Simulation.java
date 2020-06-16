package simulation;

import javax.swing.JFrame;

public class Fenetre_Simulation extends JFrame{
	
	private static final long serialVersionUID = 1L;
	

	
	public Fenetre_Simulation() {
		super();
		propriete_fenetre();
	}
	
	private void propriete_fenetre() {
		this.setTitle("Simulation de feu de forêt");
		this.setSize(600,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Conteneur_Fenetre panneau = new Conteneur_Fenetre();
		this.setContentPane(panneau);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		}


}
