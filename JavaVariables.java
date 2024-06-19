import java.util.Scanner;
public class JavaVariables {
	
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.print("Ecrire votre phrase :");
		sb.append(sc.nextLine());
		System.out.println("Resultat: "+sb.reverse());

	}

}
