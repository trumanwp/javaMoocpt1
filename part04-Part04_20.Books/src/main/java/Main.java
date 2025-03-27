import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter book name");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("How many pages?");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("What year was it published");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, pages, year));
        }

        System.out.println("What is to be printed?");
        String choice = scanner.nextLine();

        for (Book x : books) {
            if (choice.equals("everything")) {
                System.out.println(x);
            } else if (choice.equals("name")) {
                System.out.println(x.getTitle());
            }
        }

    }
}
