import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		
		double tal = 1;
		double summa = 0;
				
				Scanner input =new Scanner(System.in);
				System.out.print("plase type a number");
				while (tal == 0);
				
				while (tal != 0){
				//test
				
					tal = input.nextDouble();
					summa = summa + tal;
				}
				System.out.println(" The sum of all numbers is " + summa);
	}

}
