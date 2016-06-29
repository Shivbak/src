package dayThree;

/**
 * Created by student on 29-Jun-16.
 */

interface CallBack
{
    void callback(int param);
}

class Client implements CallBack
{
    @Override
    public void callback(int param)
    {
        System.out.println("Callback with a Limo");
    }
}
class AnotherClient implements CallBack
{
    public void callback(int param)
    {
        System.out.println("CallBack without a Limo");
    }
}

public class TestInterface {
}
