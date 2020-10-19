package il.study.spring.animal_casting;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class AnimalFactory {
    private List<Supplier<Animal>> animals = List.of(Cat::new, Dog::new);
    private Random random=new Random();
    public Animal createRandomAnimal(){
        int i = random.nextInt(animals.size());
        return animals.get(i).get();
    }

    public static void main(String[] args) {
        AnimalFactory animalFactory=new AnimalFactory();
           for (int size = 0; size < 7; size++) {
               animalFactory.createRandomAnimal().makeVoice();
           }

    }
}