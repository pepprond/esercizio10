public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animale generico");
        Lion lion = new Lion("leonardo");
        Cow cow = new Cow("Cocca");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}