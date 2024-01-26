package examen2019;

public class Labo extends Salle{
	private int nbPC ;
	public Labo(float s, String d, boolean c, int n, int nbPC) {
		super(s,d,c,n);
		this.nbPC = nbPC ;
	}
	
	void decrire() {
		System.out.println("Salle de type : "+this.getClass().getSimpleName()+", de surface : "+this.getSurface()+", et de numero : "+this.num+", departement : "+this.departement+", nbPC : "+this.nbPC);
	}
	

}
