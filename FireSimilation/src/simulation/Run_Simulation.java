package simulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import modele.Foret;

public class Run_Simulation{
	
	public static int nbArbreenFlamme;
	public static int taille;
	public float densite;
	public Foret foret;
	public Fenetre
	
	@Override
	public void actionPerformed(ActionEvent event){		
		if (event.getSource().equals(this.demarrer)) {
			int nbArbreflamme = foret.getnbArbreenFlamme();
			if(Feu.stop_feu(nbArbreflamme()))
				 new Thread(new Runnable() {
			     public void run() {				    	  
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								etiquette_erreur.setVisible(false);
					          }	}			        	
				          );
				}).start();}	
				 
				 new Propagation(this.foret);
				 this.grille = new Grille(foret);
				 nombreetapes++; 
			 
	}
		}
			 
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {	
//		 foret();
//		 miseafeu(); nombreetapes=0; /* la variable nombeetapes permet de connaître le temps jusqu’à
//		 l’extinction finale */
//		 do { propagation(); nombreetapes++; }
//		 while(nbarbresenfeu!=0); 
//
//	}

}
	

