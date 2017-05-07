package example4;

/**
 * Created by denys.pastushenko on 05/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        int var = 8;
        System.out.println(++var);//9
        System.out.println(var);//9
        System.out.println(++var);//10
        System.out.println(++var);//11
        System.out.println(var);//11
        System.out.println(++var);//12
        System.out.println(var++);//12

        if (((((true ^ false) | false) & ((~4 | 2) >= 5) && !false)) | (!(true & !false))) {//false
            System.out.println("1");

        } else if ((((++var == 5) || (false || true) && (!true)) ^ (!(!false & true))) && (var++ == 14)) {//false
            System.out.println("11");

        } else if ((true & false ^ !false && !true) & (false ^ true) || true){//true
            System.out.println("TRUE");
        }
        else System.out.println("Error");
    }
}
