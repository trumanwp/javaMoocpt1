
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        System.out.println("*".repeat(number));
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int x = size;

        while (x > 0){
            printStars(size);
            x--;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int x = height;

        while (x > 0){
            printStars(width);
            x--;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int x = 1;

        while (x <= size){
            printStars(x);
            x++;
        }
    }
}
