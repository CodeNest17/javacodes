import java.text.DecimalFormat;
import java.util.Scanner;

public class Montante {
 int mise;
 int duree;
 double cote;
 double gains;
 
	public Montante() {
		
	}
	
	void setMise() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Somme initiale: ");
		this.mise=sc.nextInt();
		
		System.out.print("Cote de reférence: ");
		this.cote=sc.nextDouble();
		
		System.out.print("Durée de la montante: ");
		this.duree=sc.nextInt();
		
	}
	
	double getGains() {
		this.gains=this.mise;
		
		for(int i=0;i<this.duree;++i) {
			this.gains*=this.cote;
		}
		return this.gains;
	}
	
	void showGains() {
	DecimalFormat df =new DecimalFormat("# ###");
	Eleve.enter(2);
	System.out.println("Vous gagnerez "+df.format(getGains())+" F CFA");
	}

	public static void main(String[] args) {
		Montante m =new Montante();
		m.setMise();
		m.getGains();
		m.showGains();

	}

}
