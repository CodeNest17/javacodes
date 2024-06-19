import java.util.Random;
import java.util.Scanner;

public class Game {

	static Random r =new Random();
	static int just=r.nextInt(10);
	static int essai=1;
	
	static void play() {
	System.out.print("Entrez un nombre entre 0 et 10: ");
	Scanner sc = new Scanner(System.in);
	int choice=sc.nextInt();
	if(just<choice) {
	System.out.println("C'est moins que ça !");
	++essai;
	Eleve.enter(2);
	play();
	}else if(just>choice) {
	System.out.println("C'est plus que ça !");
	++essai;
	Eleve.enter(2);
	play();
			
	}else {
		System.err.println("Bravo ! "+choice+" c'est la bonne réponse!");
		System.out.println("Votre score: "+(11-essai));
		
	}
	
	sc.close();
	
}


	public static void main(String[] args) {
		play();
		
       }
}
