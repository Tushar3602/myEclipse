public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this(name, 0); // Invoking another constructor using this keyword
    }

    public Person(String name, int age) {
        this.name = name; // Accessing instance variable using this keyword
        this.age = age; // Accessing instance variable using this keyword
    }

    public void printDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age); // Accessing instance variable using this keyword
    }

    public static void main(String[] args) {
        Person p1 = new Person("John");
        p1.printDetails(); // Calling a method on the object using this keyword

        Person p2 = new Person("Jane", 30);
        p2.printDetails(); // Calling a method on the object using this keyword
    }
}
