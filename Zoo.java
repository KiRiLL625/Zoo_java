import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private List<Animal> animals;
    private int cells;
    //private static final int INIT_CAPACITY = 5;
    public Zoo(String name, int cells) {
        this.name = name;
        this.cells = cells;
        animals = new ArrayList<>();
    }
    /*public Zoo(String name, List<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }
     */
    public Zoo(Zoo otherZoo){
        this.name = otherZoo.name;
        this.animals = otherZoo.animals;
        this.cells = otherZoo.cells;
    }
    public void put(Animal animal){
        if(animals.size() == cells){
            throw new IndexOutOfBoundsException("The zoo is full!");
        }
        animals.add(animal);
    }
    public Animal get(){
        if(animals.isEmpty()){
            throw new IndexOutOfBoundsException("The zoo is empty!");
        }
        Animal animal = animals.get(animals.size() - 1);
        animals.remove(animals.size() - 1);
        return animal;
    }
    public void printAnimals(){
        System.out.println("____________________________________________________________________________");
        System.out.println("____________________________________________________________________________");
        System.out.println("Zoo name: " + name);
        System.out.println("Animals in the zoo:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("Free cells: " + (cells - animals.size()));
        System.out.println("____________________________________________________________________________");
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Zoo otherZoo){
            for (Animal animal: animals) {
                if (!otherZoo.animals.contains(animal)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
