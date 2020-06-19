package simulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import modele.Feu;
import modele.Foret;
import modele.Propagation;

public class Fenetre_Simulation extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	public JButton demarrer;
	public JPanel grille;
	public static int nbArbreflamme;
	public Foret foret;
	public int nombreetapes = 0;

	
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
		
		JTextField densite = Conteneur_Fenetre_initiale.densite;
		Foret foret = new Foret(0, Float.parseFloat(densite.getText()));
		Feu.init_Feu(foret);
		grille = new Grille(foret);
		grille.setBounds(10, 10, 560, 560);
		this.add(grille);
		
		demarrer = new JButton("Démarrer");
		demarrer.addActionListener(this);
		demarrer.setBounds(200, 600, 200, 20);
		demarrer.setVisible(true);
		this.add(demarrer);
		
		this.setAlwaysOnTop(true);
		this.repaint();
		this.setVisible(true);
		}
	
	@Override
	public void actionPerformed(ActionEvent event){	
		if (event.getSource().equals(demarrer)){
			int nbArbreflamme = foret.getnbArbreenFlamme();
			do {
				
				new Thread(new Runnable(){
				     public void run() {
				    	 new Propagation(foret);
				    	 
				    	 SwingUtilities.invokeLater(new Runnable() {
				    		 public void run() {
					    		 grille = new Grille(foret);
				    		 }
				    	 });
				    }       
				}).start();
			this.add(grille);
			grille.setVisible(true);
			this.repaint();
			this.setVisible(true);
			System.out.println(nbArbreflamme);
			}while(Feu.stop_Feu(nbArbreflamme));
		}
				 
	}
}
	

			 
		


	




