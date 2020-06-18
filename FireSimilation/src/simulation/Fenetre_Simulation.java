package simulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modele.Foret;

public class Fenetre_Simulation extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	public JButton demarrer;
	public JPanel grille;

	
	public Fenetre_Simulation() {
		super();
		propriete_fenetre();
	}
	
	public void propriete_fenetre() {
		this.setTitle("Simulation de feu de forêt");
		this.setSize(600,660);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null);
		
		
		
//		JButton demarrer = new JButton("Démarrer");
//		demarrer.setSize(200,20);
//		demarrer.addActionListener(this);
//		this.add(demarrer);
		JTextField densite = Conteneur_Fenetre_initiale.densite;
		Foret foret = new Foret(0, Float.parseFloat(densite.getText()));
		grille = new Grille(foret);
		this.add(grille);
		this.setAlwaysOnTop(true);
		this.repaint();
		this.setVisible(true);
		}

	



}
