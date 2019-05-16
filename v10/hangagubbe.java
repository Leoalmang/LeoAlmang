import java.util.Scanner;

public class hangagubbe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//tar in ett ord
		String ordet = input.next();
		//ska visas
		String streckat = "";
		//h�ller koll p� liv
		int liv = 10;
		//s�tter lika m�nga streck som ordet �r l�ngt
		for (int i = 0; i < ordet.length(); i++) {
			streckat += '-';
		}
		//loopar s� l�nge man har liv kvar
		while (liv > 0) {
			//skriver ut ens liv
			System.out.println("Du har " + liv + " liv kvar " );
			//skriver ut det streckade ordet
			System.out.println(streckat);
			//kollar om man gissat r�tt och avslutar d� loopen
			if (streckat.equals(ordet)) {
				System.out.println("Grattis du vann!");
				break;
			}
			//tar in en liten bokstav
			char gissning = input.next().toLowerCase().charAt(0);
			//h�ller koll p� om man gissat r�tt
			boolean ratt = false;
			//nya streckade ordet
			String mario = "";
			//loopar igenom ordet
			for (int i = 0; i < ordet.length(); i++) {
				//j�mf�r varje bokstav i ordet med den man gissat
				if (ordet.toLowerCase().charAt(i) == gissning) {
					//l�gger till bokstaven man gissat
					mario += ordet.charAt(i);
					//markerar att man gissat r�tt
					ratt = true;
				} else {
					//Beh�ller bokstaven fr�n det str�ckade ordet
					mario += streckat.charAt(i);
				}
			}
			//s�tter str�ckade ordet till det nya
			streckat = mario;
			//tar bort ett liv om man gissat fel
			if (!ratt) {
				liv--;
			}
			//skriver ut om man har f�rlorat
			if (liv == 0) {
				System.out.println("AJAJJA nu dog ju grabben");
			}
			
		}
		
	}
	
}

