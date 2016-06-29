package dayThree.FactoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class Husky extends Dog implements Robotic {

    @Override
    public void remoteControl() {

        System.out.println();
    }

    @Override
    public void speak() {

        System.out.println("I am Husky.");
    }

    @Override
    public Object trackObject() {
        return null;
    }
}
