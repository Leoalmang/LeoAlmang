

import java.util.Scanner;

public class Homeworkv41 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Vilken m�ttenhet anv�nder du?");
		String x = input.nextLine();
		
		double volym = getVolume();
		System.out.println("Din sf�r har volymen " + volym + x);
		
	
	}
	
	public static double getVolume() {
		Scanner input = new Scanner(System.in);
		System.out.println("radien?");
		int r=input.nextInt();
		
		double answer;
	    answer = (r*r*r*Math.PI*4)/3;
		return answer;
		
	}

	
	
}
