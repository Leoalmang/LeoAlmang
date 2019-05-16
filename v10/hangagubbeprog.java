import java.util.Scanner;
import hangman.HangmanConsoleWindow;

public class hangagubbeprog {

	static HangmanConsoleWindow hangman = new HangmanConsoleWindow();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String secretword = "Bert".toUpperCase();
		String triedChar = "Gissat på: ";
		String secretword_changed = secretword.toLowerCase().replaceAll(".", "_");

		welcomeWords();
		hangman.print("Secret word: ");
		hangman.println(secretword_changed.replaceAll(".(?!$)", "$0 "));
		int guess = 0;
		int antGissninar = 7;
		String guessedChar = "";

		while (guess < antGissninar) {

			// kontrollera om man vann och i så fall skriver ut att hen har vunnit
			if (!secretword_changed.contains("_")) {
				winnerWords();
				break;
			}

			hangman.println(" ");
			hangman.println("Gissa en bokstav !");
			// Bara ett bokstav och får inte vara ett tal.
			guessedChar = hangman.nextString().trim().toUpperCase();

			
			if (checkingChar(guessedChar)) {
				if (secretword.contains(guessedChar)) {
					hangman.clear();
					// Iterera över secretword och markera där bokstaven finns
					for (int i = 0; i < secretword.length(); i++) {
						String secretword_char = Character.toString(secretword.charAt(i));
						if (secretword_char.equals(guessedChar)) {
							// convert to chararray
							char c = guessedChar.charAt(0);
							char[] secretword_blank_chars = secretword_changed.toCharArray();
							secretword_blank_chars[i] = c;
							secretword_changed = String.valueOf(secretword_blank_chars) + " ";
						}
					}
				} else {
					hangman.clear();
					// lägg till i guessedChars om det är fel gissat och plussar på 1
					// gissningar
					hangman.println("Sorry! Du gissade FEL BOKSTAV");
					hangman.println("FÖRSÖK IGEN");
					hangman.println(" ");
					triedChar = triedChar + guessedChar + " ";
					guess = guess + 1;
				}
			}
			// liv - Antalgissninar
			int guessesleft = (antGissninar - guess);
			hangman.println(" ");
			hangman.print("Secret word: ");
			hangman.println(secretword_changed.replaceAll(".(?!$)", "$0 "));
			hangman.println(" ");
			hangman.println("Gissningar kvar:" + guessesleft);
			hangman.println(" ");
			hangman.println(triedChar);

			// kontrollera om du har förlorat
			if (guess >= antGissninar) {
				loserWords();
			}
			
		}
	}

	public static boolean checkingChar(String letter) {
		if (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
			hangman.println(" Endast en bokstav och Inga siffror");
			hangman.println(" ");
			return false;
		}
		return true;-
	}

	public static void welcomeWords() {
		hangman.println("Hänge gubbe nu köööööööööör vi änna");

	}

	public static void loserWords() {
		hangman.println("Näääe fan va sämst");

	}

	public static void winnerWords() {
		hangman.println("");
		hangman.println("Banne mig stark insats ju det ");
		hangman.println("trodde jag aldrig om dig din nolla");
	}

}
