package example4;

/**
 * Created by denys.pastushenko on 05/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        if ((((true ^ false) | false) & ((~4 | 2) >= 5) && !false) | !(true & !false)) {
            System.out.println("1");
        } else System.out.println("0");
    }
}
