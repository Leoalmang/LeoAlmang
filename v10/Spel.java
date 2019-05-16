import java.util.Random;
import java.util.Scanner;

class Spel {
     int m;
     int s;
     
     static Scanner input = new Scanner(System.in);

    //Kommer bli talet man letar efter
    int number = 0;
    //Antal försök
    int tries = 0;
    Spel(int min, int max) {
        m = min;
        s = max;

        //ger "number" ett random värde
        number = generateNewNumber();

        int guess;

        do {
            tries++;

            // medans guess är fel hämta användarens input
            guess = getUserInput();

        } while (!Userguess(guess));
    }

    // hämtar en int från användaren
    int getUserInput() {
        String userinput;
        do {
            System.out.print("Gissa på ett tal mellan 1 och 100: ");
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
            //ifall number = nummret true skriver den ut följande
            System.out.println("Woooow Grattis... " + number + " var mitt nummer du gissade rätt, efter " + tries + " försök .");
            restart();
            return true;
        } else {
            // ifall det blir false efter det kommer en av dessa returneras
            if (guess > number) {
                System.out.println("Mitt nummer är mindre än  " + guess + ".");
            } else {
                System.out.println("Mitt nummer är stärre än  " + guess + ".");
            }
        }
        return false;

    }
    
    public static void restart() {
    	int choice = 0;
        System.out.println("Vill du köra igen? 1 Ja, 2 Nej");
        choice = input.nextInt();
        if(choice == 1) {
        	new Spel(0, 100);
        }else if(choice == 2) {
        	System.out.println("Tack för att du spelat!");
        }
    }

    public static boolean isInteger(String s) { //ser till att det är en inte och inte en string annars return false och börjar om efterfrågar en int
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
