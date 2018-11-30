
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str = input.nextLine();
		String reversed = reverse(str);
		
	}
	
	public static String reverse(String str) {
		String reversed = "";
        
		
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reversed = reversed + str.charAt(i);
        }
        
        System.out.println("Reversed:");
        System.out.println(reversed);
		return reversed;
	}
}
