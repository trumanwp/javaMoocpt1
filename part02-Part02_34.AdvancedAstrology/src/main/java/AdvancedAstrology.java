
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        System.out.print("*".repeat(number));
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        System.out.print(" ".repeat(number));
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i<= size; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // want to print stars + 2 every line, to the given height, 
        // and 2 stacks of 3 on bottom
        // width = *2 - 1

        int gap = height;

        for (int i = 1; i <= height; i ++){
            printSpaces(gap - 1);
            gap--;
            printStars(2* i - 1);
        }

        for (int x = 2; x > 0; x--){
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
