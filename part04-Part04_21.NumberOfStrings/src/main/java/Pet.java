public class Pet {
    public class Pet {
        private String name;
        private int age;

        public Pet(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Pet(String name) {
            this(name, 0);
        }

        public Pet(int age) {
            this("Bella", age);
        }

        @Override
        public String toString() {
            return name + " (" + age + " years)";
        }
    }
}
