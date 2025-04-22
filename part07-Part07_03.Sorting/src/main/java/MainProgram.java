import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code her
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];

        for (int nums : array) {
            if (nums < smallest) {
                smallest = nums;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int pos = 0;
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                pos = i;
            }
        }

        return pos;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here

        int pos = startIndex;
        int min = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
                pos = i;
            }
        }

        return pos;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int num1 = array[index1];
        int num2 = array[index2];

        array[index1] = num2;
        array[index2] = num1;
    }

    public static void sort(int[] array) {

        // int pos = 0;
        // int min = array[0];

        for (int index = 0; index < array.length; index++) {
            swap(array, indexOfSmallestFrom(array, index), index);
        }

        System.out.println(Arrays.toString(array));

    }
}
