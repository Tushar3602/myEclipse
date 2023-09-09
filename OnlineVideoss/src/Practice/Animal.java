package Practice;
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Fido");
        dog.makeSound();
        dog.eat();
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Woof!");
    }
}