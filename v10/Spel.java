import java.util.Random;
import java.util.Scanner;

class Spel {
     int m;
     int s;
     
     static Scanner input = new Scanner(System.in);

    //Kommer bli talet man letar efter
    int number = 0;
    //Antal f�rs�k
    int tries = 0;
    Spel(int min, int max) {
        m = min;
        s = max;

        //ger "number" ett random v�rde
        number = generateNewNumber();

        int guess;

        do {
            tries++;

            // medans guess �r fel h�mta anv�ndarens input
            guess = getUserInput();

        } while (!Userguess(guess));
    }

    // h�mtar en int fr�n anv�ndaren
    int getUserInput() {
        String userinput;
        do {
            System.out.print("Gissa p� ett tal mellan 1 och 100: ");
            userinput = input.nextLine();
        } while (!isInteger(userinput)); 
        return Integer.parseInt(userinput);
    }

    //Randomisar ett tal mellan m och s
    int generateNewNumber() {
        Random random = new Random();
        return random.nextInt(s - m + 1) + m;
    }

    boolean Userguess(int guess) {
        if (guess == number) {
            //ifall number = nummret true skriver den ut f�ljande
            System.out.println("Woooow Grattis... " + number + " var mitt nummer du gissade r�tt, efter " + tries + " f�rs�k .");
            restart();
            return true;
        } else {
            // ifall det blir false efter det kommer en av dessa returneras
            if (guess > number) {
                System.out.println("Mitt nummer �r mindre �n  " + guess + ".");
            } else {
                System.out.println("Mitt nummer �r st�rre �n  " + guess + ".");
            }
        }
        return false;

    }
    
    public static void restart() {
    	int choice = 0;
        System.out.println("Vill du k�ra igen? 1 Ja, 2 Nej");
        choice = input.nextInt();
        if(choice == 1) {
        	new Spel(0, 100);
        }else if(choice == 2) {
        	System.out.println("Tack f�r att du spelat!");
        }
    }

    public static boolean isInteger(String s) { //ser till att det �r en inte och inte en string annars return false och b�rjar om efterfr�gar en int
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        new Spel(0, 100);
    }
}
