import java.util.Scanner;

public class Greeting {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//These lines code ask and display a message to greet him user name
		System.out.print("Enter your name: ");
		String name= sc.nextLine();
		System.out.println("Hello "+name);
		System.out.println();
		
		//These lines code ask user birthday and display his age after calculating
		System.out.print(name+", give us your birthday:");
		int date=sc.nextInt();
		int age = 2024-date;
		System.out.println(name+" you are "+age+" years old !");

	}

}
