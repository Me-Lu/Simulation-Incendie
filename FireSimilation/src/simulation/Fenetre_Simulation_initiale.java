package simulation;
//import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
//import javax.swing.SwingUtilities;

public class Fenetre_Simulation_initiale extends JFrame{
	

	private static final long serialVersionUID = -1592074512857420589L;

	public Fenetre_Simulation_initiale() {
		super();
		propriete_fenetre_init();
	}
	
	private void propriete_fenetre_init() {
		this.setTitle("Simulation de feu de forêt");
		this.setSize(400,200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Conteneur_Fenetre_initiale panneau = new Conteneur_Fenetre_initiale();
		this.setContentPane(panneau);
		this.setAlwaysOnTop(true);	
}

	public static void Close_init() {
		new Thread(new Runnable() {
		public void run() {
			Boolean isOk = Conteneur_Fenetre_initiale.getOk();
			if(isOk) {
				Fenetre_Simulation mywindowSimulation = new Fenetre_Simulation();
				mywindowSimulation.setVisible(true);
						}
			}				        	
          }).start();		
}

	
}
