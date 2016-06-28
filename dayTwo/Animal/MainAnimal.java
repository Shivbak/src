package dayTwo.Animal;

import java.util.ArrayList;
import java.util.Collection;

import static dayTwo.Animal.AnimalCreation.*;

/**
 * Created by student on 28-Jun-16.
 */
public class MainAnimal {

    public static void main(String[] args)
    {
        Collection<Animal> animal = new ArrayList<>();

        animal.add(Cow);

        for (Animal a : animal)
        {
            System.out.println(a);
        }
    }
}
