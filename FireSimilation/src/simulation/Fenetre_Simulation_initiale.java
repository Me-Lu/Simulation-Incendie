package simulation;


import javax.swing.JFrame;


/**
 * Classe qui g�re l'affichage de la permi�re fen�tre de dialogue avec l'utilisateur, et demande la densit�.
 * 
 * @author Melvin
 */


public class Fenetre_Simulation_initiale extends JFrame{
	

	private static final long serialVersionUID = -1592074512857420589L;

	/**
	 * Constructeur Fenetre_Simulation_initiale.
	 */
	public Fenetre_Simulation_initiale() {
		super();
		propriete_fenetre_init();
	}
	
	/**
	 * Fonction qui d�finit les propri�t�s de la fen�tre.
	 * @see Conteneur_Fenetre_initiale
	 * 
	 */
	
	private void propriete_fenetre_init() {
		this.setTitle("Simulation de feu de for�t");
		this.setSize(400,200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Conteneur_Fenetre_initiale panneau = new Conteneur_Fenetre_initiale();
		this.setContentPane(panneau);
		this.setAlwaysOnTop(true);	
}

	/**
	 * Fonction qui va chercher l'attribut "ok" du Conteneur.
	 * Lance la deuxi�me �tape de la simulation si ok == true.
	 * 
	 * @see Conteneur_Fenetre_initiale#getOk()
	 * @see Fenetre_Simulation
	 * 
	 * 
	 */
	public static void Close_init() {
		new Thread(new Runnable() {
		public void run() {
			Boolean isOk = Conteneur_Fenetre_initiale.getOk();
			if(isOk) {
				Fenetre_Simulation simu = new Fenetre_Simulation();
				simu.setVisible(true);


						}
			}				        	
          }).start();		
}

	
}
