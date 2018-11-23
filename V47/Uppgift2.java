import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args){
        System.out.println("Ett program som l�ser in textrader fr�n konsolen och avslutas n�r texten EXIT skrivs in.");
        System.out.println();
        System.out.println("Skriv in text: ");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //K�r s� l�nge running �r true
        while(running){
            //Tar in en string och g�r den till lower case
            String strIn = scanner.nextLine().toLowerCase();
            if(strIn.equals("exit")){
                // Om texten �r 'exit' s� avsluta loopen
                running = false;
                scanner.close();
            }
        }
    }
}