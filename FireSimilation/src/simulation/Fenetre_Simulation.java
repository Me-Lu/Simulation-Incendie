package simulation;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import modele.Feu;
import modele.Foret;
import modele.Propagation;

/**
 * Cette classe gère l'affichage de la simulation
 * @author Melvin
 *
 */

public class Fenetre_Simulation extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	/**
	 * Contient le bouton qui lance la simulation.
	 */
	public JButton demarrer;
	
	/**
	 * Contient la grille de la forêt
	 * @see Grille
	 */
	public static Grille grille;
	
	/**
	 * Compteur du nombre d'étapes de la simulation
	 */
	public int nombreetapes = 0;
	
	/**
	 * Indicateur de transition.
	 */
	public static Boolean lancer_simu = false;

	
	/**
	 * Constructeur Fenetre_Simulation
	 */
	public Fenetre_Simulation() {
		super();
		propriete_fenetre();
	}
	
	/**
	 * Définit les propriétés de la fenêtre.
	 * Initialise la forêt et la grille.
	 * 
	 * @see Foret
	 * @see Feu
	 * @see Grille
	 */
	public void propriete_fenetre() {
		this.setTitle("Simulation de feu de forêt");
		this.setSize(600,660);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(null);		
		
		JTextField densite = Conteneur_Fenetre_initiale.densite;
		Foret foret = new Foret(Float.parseFloat(densite.getText()));
		Foret.setForet(Feu.init_Feu(foret));
		grille = new Grille();
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
	
	/**
	 * Retourne un indicateur de lancement de la simulation propre.
	 * @return Indicateur
	 * 					Indicateur de lancement des itérations.
	 */
	public static Boolean getReady() {
		return lancer_simu;
	}
	
	/**
	 * Ecouteur de l'évènement "clic" sur le bouton démarrer, et lance la propagation du feu.
	 * @see dmarrer
	 * @see Propagation
	 * @see Feu
	 * @see Foret
	 */
	@Override
	public void actionPerformed(ActionEvent event){	
		if (event.getSource().equals(demarrer)){
			int nbArbreflamme;
			do {			
				nbArbreflamme = Foret.getnbArbreenFlamme();
				try { Thread.sleep( 200 );} // Pause de 20ms entre chaque déplacement
				catch( Exception e ) {}
				new Thread(new Runnable(){
					public void run() {
							Propagation.propagation(Foret.getForet());
				    		SwingUtilities.invokeLater(new Runnable() {
				    		 	public void run() {
				    		 		grille.revalidate();
					 			}
				    	 	});
							}       
						}).start();
		    System.out.println(nbArbreflamme);
			this.repaint();
			}while(Feu.stop_Feu(nbArbreflamme));
			System.out.println("End");
		}			 
	}
	

	
}
	

			 
		


	




