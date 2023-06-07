public class Main {
    public static void main(String[] args) {
    //Method Overriding = Declaring a method in sub-class,
    //                     which is already present in present class,
    //                     done so that a child class can give its ow implementation


        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}