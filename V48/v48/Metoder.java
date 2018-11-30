package v48;
import java.util.Scanner;
public class Metoder {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  
		String name;
		String name2;
		System.out.println(" Hej! Vad heter du och din bästa vän ? ");
		name = input.nextLine();
		name2 = input.nextLine();
		
		welcomeMessage(name,name2);
		//System.out.println("Hej"+ name + "!välkommen hit");
	
	}
	
	
	static void welcomeMessage(String name, String name2) {
	//Skriv en metod som returnerar en hälsning till en person
	System.out.println("Hej "+ name + "! välkommen hit");
	System.out.println("Hej "+ name2 + "! välkommen hit ou också");
	}
}

