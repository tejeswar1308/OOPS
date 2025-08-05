package Lab2;
import java.util.Scanner;
public class StringComparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the String 1: ");
		String str1 = scanner.nextLine();
		
		System.out.print("Enter the String 2: ");
		String str2 = scanner.nextLine();
		
        System.out.println("str1 == str2 : " + (str1 == str2));        
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); /* equals() this function checks
        if two strings have same characters or not */

		
		scanner.close();
	}
}
