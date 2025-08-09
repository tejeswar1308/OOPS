package Lab1;
import java.util.Scanner;

public class squareroot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("\nNumber\tSquare Root");
        for (int i = 1; i <= n; i++) {
            double sqrt = Math.sqrt(i);
            System.out.println(i + "\t" + sqrt);
        }

        sc.close();
    }
}
