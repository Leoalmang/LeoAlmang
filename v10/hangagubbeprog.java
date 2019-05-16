import java.util.Scanner;
import hangman.HangmanConsoleWindow;

public class hangagubbeprog {

	static HangmanConsoleWindow hangman = new HangmanConsoleWindow();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String secretword = "Bert".toUpperCase();
		String triedChar = "Gissat p�: ";
		String secretword_changed = secretword.toLowerCase().replaceAll(".", "_");

		welcomeWords();
		hangman.print("Secret word: ");
		hangman.println(secretword_changed.replaceAll(".(?!$)", "$0 "));
		int guess = 0;
		int antGissninar = 7;
		String guessedChar = "";

		while (guess < antGissninar) {

			// kontrollera om man vann och i s� fall skriver ut att hen har vunnit
			if (!secretword_changed.contains("_")) {
				winnerWords();
				break;
			}

			hangman.println(" ");
			hangman.println("Gissa en bokstav !");
			// Bara ett bokstav och f�r inte vara ett tal.
			guessedChar = hangman.nextString().trim().toUpperCase();

			
			if (checkingChar(guessedChar)) {
				if (secretword.contains(guessedChar)) {
					hangman.clear();
					// Iterera �ver secretword och markera d�r bokstaven finns
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
					// l�gg till i guessedChars om det �r fel gissat och plussar p� 1
					// gissningar
					hangman.println("Sorry! Du gissade FEL BOKSTAV");
					hangman.println("F�RS�K IGEN");
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

			// kontrollera om du har f�rlorat
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
		hangman.println("H�nge gubbe nu k����������r vi �nna");

	}

	public static void loserWords() {
		hangman.println("N���e fan va s�mst");

	}

	public static void winnerWords() {
		hangman.println("");
		hangman.println("Banne mig stark insats ju det ");
		hangman.println("trodde jag aldrig om dig din nolla");
	}

}
