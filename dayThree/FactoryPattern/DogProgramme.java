package dayThree.FactoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class DogProgramme {

    public static void main(String[] args)
    {
        Husky dog = (Husky)DogFactory.makeDog(DogBreed.HUSKY);
        dog.bark();
        dog.doubleCoat = true;
        //Husky husky1 = (Husky) dog;
        dog.speak();

        Dog dog2 = DogFactory.makeDog(DogBreed.HUSKY);

    }
}
