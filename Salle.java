package examen2019;

public abstract class Salle {
	protected int num = 100 ;
	protected float surface ;
	protected int nbPlaces ;
	protected String departement ;
	protected boolean connected ;
	
	public Salle (float s, String d, boolean c, int n) {
		this.num++;
		this.surface = s ;
		this.departement = d ;
		this.connected = c ;
		this.nbPlaces = n ;
	}
	
	float getSurface() {
		return this.surface ;
	}
	
	boolean isConnected() {
		return this.connected ;
	}
	
	abstract void decrire();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
