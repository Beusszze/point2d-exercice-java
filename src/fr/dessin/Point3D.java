package fr.dessin;

public class Point3D extends Point2D{

	
	private int z;

	public Point3D() {
		super();
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	void afficher() {
		System.out.println("[" + getX() + "," + getY() + "," + z + "]");

	}

	
	void translater(int dX, int dY, int dZ) {
		setX(getX() + dX);
		setY(getY() + dY);
		this.z += dZ;
	}
	

	
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	

	
	
}
