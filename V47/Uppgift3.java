import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args){
        System.out.println("Ett program som l�ser in en f�ljd av tal och multiplicerar ihop dem. \n" +
                "Inl�sningen ska avbrytas d� produktens belopp �verstigit 100 000 eller d� 10 st tal skrivits in.");
        System.out.println();
        System.out.print("Skriv in tal: ");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int sum = 0;
        int amountOfNumbers = 0;

        // Loop som k�r s� l�nge running �r true
        while(running){
            int inNum = scanner.nextInt();

            if(amountOfNumbers == 0){
                // Kollar om nummret �r f�rsta nummret. Is�fall, s�tt att summa blir det nummret. Annars blir suma alltid 0.
                sum = inNum;
                amountOfNumbers++;
            }else if(sum < 10000 && amountOfNumbers < 10){
                // Om det inte �r f�rsta nummret och summan �r mindre �n 10 000 och antalet nummer �r mindre �n 10, multiplicera summan med nya talet.
                sum = sum*inNum;
                amountOfNumbers++;
            }else{
                // Om summan �r mer �n 10 000 eller antalet nummer �r mer �n 10. Avsluta programmet och skriv ut nummret.                System.out.println("Result: " + sum);
                running = false;
                scanner.close();
            }
        }
    }
}