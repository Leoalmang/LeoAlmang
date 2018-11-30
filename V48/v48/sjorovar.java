import java.util.Scanner;
public class sjorovar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a;
		System.out.println("Skriv en mening");
		a = input.nextLine();
		System.out.println(sjorovare(a));
	}
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
            klartext = klartext + str.charAt(i) + add; 
        }
        return klartext;
    }

}
