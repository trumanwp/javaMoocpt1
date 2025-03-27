
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = Integer.valueOf(scanner.nextLine());

        if (num < 0) {
            num = num * -1 ;
        }

        System.out.println("The absolute value of your number is " + num);
        

    }
}
