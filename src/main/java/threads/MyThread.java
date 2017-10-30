package threads;

/**
 * Created by Denys_Pastushenko on 10/28/2017.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Other thread");
    }
}
