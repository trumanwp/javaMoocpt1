
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Please enter your second number");
        int num2 = Integer.valueOf(scanner.nextLine());

        double sqrt = Math.sqrt(num1 + num2);
        System.out.println("The square root of your 2 numbers combined is " + sqrt);
    }
}
