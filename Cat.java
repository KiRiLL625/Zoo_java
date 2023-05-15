public class Cat extends Animal{
    public Cat(String name, int age, String breed) {
        super(name, age, "Cat", breed);
        species = "Cat";
    }
    @Override
    public String say() {
        return "Meow!";
    }
    @Override
    public String play() {
        return "I'm playing with a ball!";
    }
}
