package modele;
import java.awt.Color;



public class Arbre{
	
	public  static final Color arbre = Color.GREEN;
	public  static final Color rien = Color.WHITE;
	public  static final Color enFeu = Color.RED;
	public  static final Color brule = Color.GRAY;
//	public int coordX;
//	public int coordY;
	
	public Arbre() {
		}
	
//	public int getX() {
//		return this.coordX;
//	}
//	public int getY() {
//		return this.coordY;
//	}
	public static Color getColor(int i) {
		 if(i == 0) {
	        	return rien;
	        	}
	        if(i == 1) {
	        	return arbre;
	        	}
	        if(i == 2) {
	        	return enFeu;}
	        else {
	        	return brule;
	        }
	}


	

}
