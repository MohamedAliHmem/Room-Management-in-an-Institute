package examen2019;

import java.util.Arrays;

public class Bureau extends Salle{
	String enseignants[] ;
	
	public Bureau(float s, String d, boolean c, int n, String ens[]) {
		super(s,d,c,n);
		if (ens.length>5) {
			System.out.println("beaucoup d'enseignant");
			System.exit(0);
		}else
			this.enseignants = ens ;
	}
	
	@Override
	void decrire() {
		System.out.println("Salle de type : "+this.getClass().getSimpleName()+", de surface : "+this.getSurface()+", et de numero : "+this.num+", departement : "+this.departement+", enseignants : "+Arrays.toString(this.enseignants));
	}
	
	void ajoutEnseignant (String nomEns) throws BureauPleinException{
		if (this.enseignants.length==5) {
			throw new BureauPleinException("on peut pas ajouter un autre enseigant");
		}else {
			String [] nouveauTab = Arrays.copyOf(this.enseignants, this.enseignants.length+1) ;
			nouveauTab[this.enseignants.length] = nomEns ;
			this.enseignants = nouveauTab ;
		}
	}
	
	public static void main(String[] args) {
		/*String [] tab = {"aa","bb"};
		Bureau b = new Bureau(20,"info",true,5,tab);
		b.ajoutEnseignant("dali");
		b.decrire();*/
	}

}
