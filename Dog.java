public class Dog extends Animal{
    public Dog(String name, int age, String breed) {
        super(name, age, "Dog", breed);
        species = "Dog";
    }
    @Override
    public String say() {
        return "Woof!";
    }
    @Override
    public String play() {
        return "I'm playing with a stick!";
    }
}
