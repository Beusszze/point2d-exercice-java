package fr.dessin;

public class Point2D {
	
	
	private int x, y;
	private static int compteur;
	
	
	public Point2D () {
		
	}

	
	
	
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}





	void afficher() {
		System.out.println("[" + x + "," + y + "]");
		
	}
	
	
	void translater(int dX, int dY) {
		this.x += dX;
		this.y += dY;
	}
	
	
	
	
	
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public static int getCompteur() {
		return compteur;
	}



	public static void setCompteur(int compteur) {
		Point2D.compteur = compteur;
	}
	
	
	
	
	

}
