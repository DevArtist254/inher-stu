public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal animal = new Animal("Generic Animal", "Huge", 400);

        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();

        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){

        animal.makesNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}