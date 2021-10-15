package fr.dessin;

public class Main {

	public static void main(String[] args) {

		Point2D point1 = new Point2D(4, 34);
		point1.afficher();
		point1.translater(2, 5);
		point1.afficher();
		
		Point3D point2 = new Point3D(4, 5, 6);
		point2.afficher();
		point2.translater(1, 1, 1);
		point2.afficher();
	}

}
