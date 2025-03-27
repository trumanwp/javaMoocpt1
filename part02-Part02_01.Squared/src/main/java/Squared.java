
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = Integer.valueOf(scanner.nextLine());
        

        int square =  num*num;
        System.out.println(square);


    }
}
