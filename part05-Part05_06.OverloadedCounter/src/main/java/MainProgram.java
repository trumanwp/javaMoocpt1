
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter c1 = new Counter(5);
        Counter c2 = new Counter();

        c1.increase();
        c2.increase(10);

        System.out.println(c1.value());
        System.out.println(c2.value());
    }
}
