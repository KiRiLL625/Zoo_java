public abstract class Animal {
    protected String name;
    protected int age;
    protected static String species;
    protected String breed;
    public abstract String say();
    public abstract String play();
    public Animal(String name, int age, String species, String breed){
        this.name = name;
        this.age = age;
        Animal.species = species;
        this.breed = breed;
    }
    public static String getSpecies() {
        return species;
    }
    @Override
    public String toString() {
        return "________________________\n" +
                say() + "\n" + play() + "\n" +
                "\tAnimal: " + species +
                "\n\tName: " + name +
                "\n\tAge: " + age +
                "\n\tBreed: " + breed +
                "\n________________________";
    }
}
