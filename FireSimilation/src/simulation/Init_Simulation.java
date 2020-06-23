package simulation;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


/**
 * Classe abstraite qui lance la simulation.
 * 
 * @author Melvin
 */
public abstract class Init_Simulation extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -6026420180945471944L;
	
	/**
	 * Lance la fenêtre d'échange avec l'utilisateur.
	 * 
	 *@see Fenetre_Simulation_Initiale
	 */
	
	
	/**
	  * La méthode main
	  * @param args 
	  * 	les arguments de la méthode main
	  */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				
				Fenetre_Simulation_initiale mywindow = new Fenetre_Simulation_initiale();
				mywindow.setVisible(true); 
			}
		});
		

		
	}
	


}
