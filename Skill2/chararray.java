package Skill2;
import java.util.Scanner;

public class chararray {
    public static void main(String[] args) {
        char[] charArray = { 'T', 'E', 'J', 'A' };

        String str1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str1 = sc.nextLine();

        System.out.println("Character Array as String: " + new String(charArray));

        System.out.println("Entered String: " + str1);

        String str2 = new String(charArray);

        System.out.println("String from Character Array: " + str2);

        sc.close();
    }
}
