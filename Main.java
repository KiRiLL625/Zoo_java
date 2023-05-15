public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 3, "British Shorthair");
        Animal dog = new Dog("Spike", 5, "German Shepherd");
        Zoo zoo = new Zoo("Zoo", 10);
        /*zoo.put(cat);
        zoo.put(dog);
        zoo.printAnimals();
        System.out.println("Getting last animal:");
        System.out.println(zoo.get());
        System.out.println("After get():");
        zoo.printAnimals();
         */
        Animal animal = new Animal("Tooth", 1, "Crocodile", "American Crocodile") {
            @Override
            public String say() {
                return "Roar!";
            }
            @Override
            public String play() {
                return "I'm playing with a human!";
            }
        };
        zoo.put(animal);
        zoo.put(cat);
        zoo.put(dog);
        zoo.printAnimals();
        System.out.println(zoo.get());
        zoo.printAnimals();
    }
}