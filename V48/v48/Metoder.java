package v48;
import java.util.Scanner;
public class Metoder {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  
		String name;
		String name2;
		System.out.println(" Hej! Vad heter du och din b�sta v�n ? ");
		name = input.nextLine();
		name2 = input.nextLine();
		
		welcomeMessage(name,name2);
		//System.out.println("Hej"+ name + "!v�lkommen hit");
	
	}
	
	
	static void welcomeMessage(String name, String name2) {
	//Skriv en metod som returnerar en h�lsning till en person
	System.out.println("Hej "+ name + "! v�lkommen hit");
	System.out.println("Hej "+ name2 + "! v�lkommen hit ou ocks�");
	}
}

