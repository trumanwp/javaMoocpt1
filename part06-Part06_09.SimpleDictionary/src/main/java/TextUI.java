import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String cmd = scanner.nextLine();

            if (cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (cmd.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();

                System.out.println("Translation:");
                String translate = scanner.nextLine();

                dictionary.add(word, translate);
            } else if (cmd.equals("search")) {
                System.out.println("To be translated:");
                String choice = scanner.nextLine();

                if (dictionary.translate(choice) == null) {
                    System.out.println("Word " + choice + " was not found");
                } else
                    System.out.println(dictionary.translate(choice));
            } else {
                System.out.println("Unknown command");
            }

        }
    }

}
