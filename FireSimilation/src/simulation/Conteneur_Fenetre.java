package simulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Conteneur_Fenetre extends JPanel implements ActionListener{
	
		private static final long serialVersionUID = 650679601838995285L;
		private JButton bouton;
		
		
		public Conteneur_Fenetre() {
			super();
			this.propriete_conteneur();
		}

		
		private void propriete_conteneur () {
			this.setLayout(null);
			this.setSize(200,20);
			this.affiche_bouton();	
			
		}
//		private void affiche_grille() {      
//		         
//		for(int row=0; row<i; row++) {
//			for(int col=0; col<i; col++) {
//				Rectangle rec = new Rectangle(50,50);
//		        rec.setColor(Color.GRAY);
//		        GridPane.setRowIndex(rec, row);
//		        GridPane.setColumnIndex(rec, col);
//		        grid.getChildren().addAll(rec);
//		                 
//		            }
//		        }
//		}
		

		
		private void affiche_bouton(){
			bouton = new JButton("Démarrer");
			this.bouton.setSize(200,20);
			bouton.addActionListener(this);
			this.add(bouton);	
		}


		
		@Override
		public void actionPerformed(ActionEvent event){	
			if(event.getSource().equals(bouton)) {
				JTextField densite = Conteneur_Fenetre_initiale.densite;
				Run_Simulation demarrer = new Run_Simulation(Float.parseFloat(densite.getText()),0);	
				Grille grille = new Grille(demarrer.foret);
				
			}		
					
		}
		

}
