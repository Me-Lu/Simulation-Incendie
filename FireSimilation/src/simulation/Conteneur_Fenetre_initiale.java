package simulation;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;

public class Conteneur_Fenetre_initiale extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 650679601838995285L;
	private JLabel etiquette;
	private JLabel etiquette_erreur;
	public static JButton bouton;
	public static JTextField densite;
	private static  Boolean ok = false;
	
	public Conteneur_Fenetre_initiale() {
		super();
		this.propriete_conteneur();
		
	}

	public static JTextField getTextField(){
		return densite;
	 }
	
	public static Boolean getOk() {
		return ok;
	}
	
	private void propriete_conteneur () {
		this.setLayout(null);
//		this.setBackground(Color.WHITE); // Couleur des traits
		this.propriete_etiquette();
		this.affiche_densite();
		this.affiche_bouton();
		this.propriete_etiquette_erreur();

		
	}
	
	private void affiche_densite() {
		densite = new JTextField();
		densite.setBounds(175,40,50,30);
		this.add(densite);
		
		
	}
	
	private void affiche_bouton(){
		bouton = new JButton("Lancer la simulation");
		bouton.setBounds(100,140, 200,20);
		bouton.addActionListener(this);
		this.add(bouton);
		
	}

	private void propriete_etiquette() {
		etiquette = new JLabel();
		this.etiquette.setBounds(100,5,250,20);
		this.etiquette.setText("Choisir un nombre décimal tel que ]0,1[.");
		this.add(etiquette);	
	}
	
	private void   propriete_etiquette_erreur() {
		etiquette_erreur = new JLabel();
		this.etiquette_erreur.setBounds(100,75,300,20);
		this.etiquette_erreur.setText("zubida");
		this.etiquette_erreur.setForeground(Color.red);
		this.etiquette_erreur.setVisible(false);
		add(etiquette_erreur);		
	}
		
	private void affiche_erreur(int i) {
		
		String tab_erreur[] = new String[3];
		tab_erreur[0] = "Rentres une densité avant de commencer!";
		tab_erreur[1] = "Pas de lettres, ni de virgules!!";
		tab_erreur[2] = "Entre 0 et 1!";
		
 		this.etiquette_erreur.setText(tab_erreur[i]);
		this.etiquette_erreur.setVisible(true);				
		new Thread(new Runnable() {
		      public void run() {				    	  
		    	  try {
					TimeUnit.SECONDS.sleep(2);
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							etiquette_erreur.setVisible(false);
				          }					        	
			          });
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();}				        
		        }
		      }
		  ).start();	
	}

	@Override
	public void actionPerformed(ActionEvent event){		
		if (event.getSource().equals(bouton)) {
			String densite_entree = densite.getText();
			if(densite_entree.isEmpty()) {
				affiche_erreur(0);}
			else{
				try {
					float densite_input = Float.parseFloat(densite_entree);
					if(densite_input > 0 && densite_input < 1 ) {
						ok = true;	
						Fenetre_Simulation_initiale.Close_init();
						}
					else {
						affiche_erreur(2);
					}
					
				}catch(NumberFormatException e) {
					affiche_erreur(1);
					}	
				}							
		}
	}

	

}