
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes
        // the NullPointerException -error

        String adam = null;
        String niamh = "niamh";

        System.out.println(adam);

        if (adam.equals(niamh)) {
            System.out.println("woo");
        }

    }
}
