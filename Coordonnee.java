import java.util.Scanner;

public class Coordonnee {
 char name;
 int x;
 int y;
 static int ORIGIN =0;
 

 
    public Coordonnee() {
    	this.x=ORIGIN;
		this.y=ORIGIN;
    }
	public Coordonnee(int xy) {
		this.x=xy;
		this.y=xy;
	}
	
	public Coordonnee(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setPoint() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nom du point: ");
		String entry=sc.nextLine();
		this.name=entry.charAt(0);
		
		System.out.print("Saisir l'abscisse: ");
		this.x=sc.nextInt();
		
		System.out.print("Saisir l'ordonnée: ");
		this.y=sc.nextInt();
		
		sc.close();
	}
	
	public void repeat(int times) {
		int i=0;
		do {
			this.setPoint();
			this.getPoint();
			++i;
		}while(i<times);
	}
	
	public void getPoint() {
	System.out.println("\nCoordonnée: "+this.name+"("+this.x+";"+this.y+")\n\n");}

	public static void main(String[] args) {
		
	  new Coordonnee().repeat(5);
		

	}

}
