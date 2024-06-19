import java.util.ArrayList;
import java.util.Scanner;

public class Eleve {
	
 String name;
 char sexe;
 int age;
 
 // Création de liste d'élèves
 ArrayList<Eleve> salle = new ArrayList<>();
 ArrayList<Eleve> majeur = new ArrayList<>();
 ArrayList<Eleve> filles = new ArrayList<>();
 
	public Eleve() {
		
	}
	
	// Saisir les informations d'un élève
	public void setInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nom: ");
		this.name=sc.nextLine();
		
		System.out.print("Sexe: ");
		this.sexe=sc.nextLine().charAt(0);
		
		System.out.print("Age: ");
		this.age=sc.nextInt();
		enter(1);
		
	}
	
	//Récupérer les informations d'un élève
	public String getInfo() {
		return this.name+", "+this.sexe+", "+this.age+" ans";	
	}
	
	//Lister un élève inscrit
	void showInfo(int index, String info) {
		System.out.println((index + 1)+". "+info);
	}
	
	//Inscrire des élèves
	public void inscrire() {
		System.err.print("Effectif de la classe: ");
		Scanner sc = new Scanner(System.in);
		int eff= sc.nextInt();
                  enter(1);
		for(int i=0;i<eff;++i) {
			Eleve e = new Eleve();
			e.setInfo();
			salle.add(e);
		}
		sc.close();
	}
	
	//Afficher la liste des élèves inscrits
	public void appel() {
		System.err.println("Les étudiants inscrits sont:");
		for(Eleve e:salle) {
			e.showInfo(salle.indexOf(e),e.getInfo());
		}
	}
	
	//Rechercher les élèves majeurs
	public void setMajeur() {
		for(Eleve e:salle) {
			if(e.age>18) {
				majeur.add(e);
			}
		}
	}
	
	//Rechercher les filles
	public void setFilles() {
		for(Eleve e:salle) {
			if(e.sexe=='F') {
				filles.add(e);
			}
		}
	}
	
	//Afficher la liste des élèves majeurs
	public void getMajeur() {
		System.err.println("Les étudiants majeurs sont:");
		for(Eleve e:majeur) {
			e.showInfo(majeur.indexOf(e),e.getInfo());
		}
	}
	
	public void getFilles() {
		System.err.println("Les étudiantes sont:");
		for(Eleve e:filles) {
			e.showInfo(filles.indexOf(e),e.getInfo());
		}
	}
	
	static void enter(int line) {
		for(int i=0;i<line;++i) {
			System.out.println("");
		}
	}

	public static void main(String[] args) {
	    Eleve e=new Eleve();
	    e.inscrire();
	    e.appel();
	    e.setMajeur();
	    enter(2);
	    e.getMajeur();
	    enter(2);
	    e.setFilles();
	    enter(2);
	    e.getFilles();
	}

}
