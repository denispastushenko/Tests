package doWhileExample;

/**
 * Created by denys.pastushenko on 08/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        int number = 7;                                           // 1 iteration constantly!!
        do {
            System.out.println("Iteration  ---  " + --number);
        } while (number < 5);

        System.out.println();
        System.out.println("Hello   --   " + ++number);             //just sout

        while (number < 5) {                                           // 0 Iterations because condition is false
            System.out.println("Iteration  ---  " + --number);

        }
        System.out.println();
        while (number > 5) {                                           // n Iterations "while " because condition is true
            System.out.println("Iteration  ---  " + --number);
        }
    }
}
