package modele;


public class Foret_Tampon {
	
	public static int[][] foret_tampon;
	
	
	public Foret_Tampon(int i) {
		Foret_Tampon.foret_tampon = new int[i][i];
	}
	
	public int[][] getForet_Tampon(){
		return foret_tampon;
	}

}
