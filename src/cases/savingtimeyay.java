package cases;

import java.util.Scanner;

public class savingtimeyay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i1;
		int i2;
		String str;
		String e = System.getProperty("line.separator");
		
		System.out.println("Enter the first int;");
		i1 = scan.nextInt();
		
		System.out.println("Enter the last int;");
		i2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter the name of your string;");
		str = scan.nextLine();
		
		for (int i = i1; i<=i2; i++) {
			System.out.println("case " + i + ": " + str + " = " + e + "break;" + e);
			
		}
		scan.close();
	}
}
