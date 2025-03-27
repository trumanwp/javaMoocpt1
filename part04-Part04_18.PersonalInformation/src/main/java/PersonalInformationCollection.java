
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter a name");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Please enter a surname");
            String surname = scanner.nextLine();

            System.out.println("Please enter your identification number");
            String idnumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(name, surname, idnumber));
        }

        // for (PersonalInformation x : infoCollection) {
        // System.out.println(x);
        // }

        for (PersonalInformation x : infoCollection) {
            System.out.println(x.getFirstName() + " " + x.getLastName());
        }
    }
}
