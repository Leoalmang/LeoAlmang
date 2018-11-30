package v48;

import java.util.Scanner;


public class v48laxa {

	public static void main(String[] args) {

			
			Scanner input=new Scanner(System.in);
			
			System.out.println("Vilken måttenhet använder du?");
			String x = input.nextLine();
			
			double volym = getVolume();
			System.out.println("Din sfär har volymen " + volym + x);
	
			char c;
			String str;
			System.out.println("Skriv ett ord och en bokstav");
			str = input.nextLine();
			c = input.nextLine().charAt(0);
			System.out.println(count(str, c));
			
			String a;
			System.out.println("Skriv en mening");
			a = input.nextLine();
			System.out.println(sjorovare(a));
			
			String jonas = input.nextLine();
			String reversed = reverse(jonas);

	}

	public static double getVolume() {
		Scanner input = new Scanner(System.in);
		System.out.println("radien?");
		int r=input.nextInt();
		
		double answer;
	    answer = (r*r*r*Math.PI*4)/3;
		return answer; }
		
		public static int count (String str, char c) 
		{
			int counter = 0;
			for (int i = 0; i<str.length(); i++) {
				if(str.charAt(i) == c)
					counter++;
			}
			return counter; }
			
		public static String sjorovare(String str) 
		    {
		        String klartext = "";
		        char kons[] = "bcdfghjklmnpqrstvwxz".toCharArray();
		        for (int i = 0; i < str.length(); i++) 
		        {
		            String add = "";
		            for(int y = 0; y < kons.length; y++) {
		                if(str.charAt(i) == kons[y]) {
		                    add = "o" + str.charAt(i);
		                    break;
		                }
		      }
				return klartext; 
				}
		    }
		
		        
		public static String reverse(String jonas) {
		    		String reversed = "";
				 for(int i = jonas.length() - 1; i >= 0; i--)
			        {
			            reversed = reversed + jonas.charAt(i);
			        }
			        
			        System.out.println("Reversed:");
			        System.out.println(reversed);
					return reversed;
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
