import java.util.Scanner;

public class Boucles {

public static void forBoucle() {
	System.out.print("Nombre de fois:");
	Scanner sc = new Scanner(System.in);
	int times=sc.nextInt();
	Eleve.enter(2);
	
	for(int i=1;i<=times;++i) {
	System.out.println("Passage n°"+i+" de la boucle for.");
		
	}
	
	Eleve.enter(2);
}


public static void whileBoucle() {
	System.out.print("Nombre de fois:");
	Scanner sc = new Scanner(System.in);
	int times=sc.nextInt();
	Eleve.enter(2);
	int i=1;
	while( i<=times) {
System.out.println("Passage n°"+i+" de la boucle while.");
		++i;
	}
	Eleve.enter(2);
	
}

public static void doWhileBoucle() {
	System.out.print("Nombre de fois:");
	Scanner sc = new Scanner(System.in);
	int times=sc.nextInt();
	Eleve.enter(2);
	int i=1;
	do {
System.out.println("Passage n°"+i+" de la boucle do-while.");
		++i;
	}while( i<=times);
	
}
	public static void main(String[] args) {
	forBoucle();
	whileBoucle();
    doWhileBoucle();
	}

}
