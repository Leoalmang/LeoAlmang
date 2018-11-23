import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args){
        System.out.println("Ett program som läser in textrader från konsolen och avslutas när texten EXIT skrivs in.");
        System.out.println();
        System.out.println("Skriv in text: ");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //Kör så länge running är true
        while(running){
            //Tar in en string och gör den till lower case
            String strIn = scanner.nextLine().toLowerCase();
            if(strIn.equals("exit")){
                // Om texten är 'exit' så avsluta loopen
                running = false;
                scanner.close();
            }
        }
    }
}