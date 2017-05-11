package doWhileExample;

import java.security.SecureRandom;

/**
 * Created by denys.pastushenko on 08/05/2017.
 */
public class Main {
    public static void main(String[] args) {
      /*  int number = 7;                                           // 1 iteration constantly!!
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
        }*/
        Main main = new Main();
        System.out.println(main.generateRandomEmail(7));
    }

    private static SecureRandom rnd = new SecureRandom();

    public static final String CONSTANT_STRING_FOR_EMAIL_GENERATION = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private String generateRandomEmail(int length) {
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++)
            sb.append(CONSTANT_STRING_FOR_EMAIL_GENERATION
                    .charAt(rnd.nextInt(CONSTANT_STRING_FOR_EMAIL_GENERATION.length())));
        return sb.toString().concat("@gmail.com");

    }
}
