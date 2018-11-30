import java.util.Scanner;
public class IntCount {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		char c;
		String str;
		System.out.println("Skriv ett ord och en bokstav");
		str = input.nextLine();
		c = input.nextLine().charAt(0);
		System.out.println(count(str, c));

	}
	
	public static int count (String str, char c) 
	{
		int counter = 0;
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == c)
				counter++;
		}
		return counter;
	}

}
