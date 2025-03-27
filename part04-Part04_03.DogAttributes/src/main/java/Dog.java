public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String bark() {
        return name + " just barked at you!";
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " is a " + age + " years old " + breed + ".";
    }
}