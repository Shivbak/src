package dayThree;

/**
 * Created by student on 29-Jun-16.
 */
public class ThreadDemo {

    public static void main(String [] args)
    {
        Thread t = Thread.currentThread();

        new ThreadTwo();

        try
        {
            for (int i = 1; i<11; i++)
            {
                System.out.println("Main Thread is Counting : " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted!");
        }

        System.out.println("Main Thread terminated!");
    }
}

class ThreadTwo implements Runnable
{
    Thread t;
    ThreadTwo()
    {
        t = new Thread(this,"Second Thread");
        System.out.println("Another Thread : " + t);
        t.start(); // run execute
    }
    @Override
    public void run() {

        try
        {
            for (int i= 5 ; i>0 ; i--)
            {
                System.out.println("Another Thread : " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Second Thread interrupted!");
        }
        System.out.println("Second Thread Terminated!");
    }
}