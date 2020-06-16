package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauGrille extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = -6754280283986492476L;
	
	public JButton boutonPlay;
	public JLabel label;
	
	public PanneauGrille() {
		setSize(500,10);
		setLayout(new FlowLayout());
		
		this.boutonPlay =new JButton("play");
		boutonPlay.addActionListener(this);
		add(boutonPlay);
		
		
//		this.label = new JLabel("");
//		label.setIcon(new ImageIcon(MonAppli.class.getResource("/tete.png")));
//		add(label);
		
		this.setVisible(true);
		
	}
	

	
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(boutonPlay)) {
			CalculLong algo = new CalculLong();
			Thread t = new Thread(algo);
			t.start();
		} else {
			System.out.println("Autre action");
		}
	}
	
}
