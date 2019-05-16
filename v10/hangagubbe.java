import java.util.Scanner;

public class hangagubbe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//tar in ett ord
		String ordet = input.next();
		//ska visas
		String streckat = "";
		//håller koll på liv
		int liv = 10;
		//sätter lika många streck som ordet är långt
		for (int i = 0; i < ordet.length(); i++) {
			streckat += '-';
		}
		//loopar så länge man har liv kvar
		while (liv > 0) {
			//skriver ut ens liv
			System.out.println("Du har " + liv + " liv kvar " );
			//skriver ut det streckade ordet
			System.out.println(streckat);
			//kollar om man gissat rätt och avslutar då loopen
			if (streckat.equals(ordet)) {
				System.out.println("Grattis du vann!");
				break;
			}
			//tar in en liten bokstav
			char gissning = input.next().toLowerCase().charAt(0);
			//håller koll på om man gissat rätt
			boolean ratt = false;
			//nya streckade ordet
			String mario = "";
			//loopar igenom ordet
			for (int i = 0; i < ordet.length(); i++) {
				//jämför varje bokstav i ordet med den man gissat
				if (ordet.toLowerCase().charAt(i) == gissning) {
					//lägger till bokstaven man gissat
					mario += ordet.charAt(i);
					//markerar att man gissat rätt
					ratt = true;
				} else {
					//Behåller bokstaven från det sträckade ordet
					mario += streckat.charAt(i);
				}
			}
			//sätter sträckade ordet till det nya
			streckat = mario;
			//tar bort ett liv om man gissat fel
			if (!ratt) {
				liv--;
			}
			//skriver ut om man har förlorat
			if (liv == 0) {
				System.out.println("AJAJJA nu dog ju grabben");
			}
			
		}
		
	}
	
}

