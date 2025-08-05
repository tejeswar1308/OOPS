package Lab2;
import java.util.Scanner; 
public class StringMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		
		System.out.println("First character: " + input.charAt(0));
		System.out.println("Third character: " + input.charAt(2));
		System.out.println("Fifth character: " + input.charAt(4));

		System.out.println("Length of the string: " + input.length());
		
		String upper = input.toUpperCase();
		System.out.println("Upper case: " + upper);
		
		String lower = input.toLowerCase();
		System.out.println("Lower Case: " + lower);
		
		System.out.println("Substring(1 to 8): " + input.substring(1,7)); /* prints the index characters from
		1 to 7 index */ 
		
		System.out.print("Enter the word to Check: ");
		String word = scanner.nextLine();
		if (input.contains(word)){
		System.out.println("The String contains: " + word);
		} else {
			System.out.println("Invalid Input");
		}
		
		scanner.close();
	}
}