
public class Main {
    public static void main(String[] args) {
        int result = 1;
        int digitForPow = 2;

        for (int i = 0; i < 15; i++) {
            result *= digitForPow;
            System.out.println(result);
        }

        System.out.println("\n" + "Different way");

        for (int i = 0; i < 15; System.out.println(digitForPow << result++), i++) {
        }
    }



    private static boolean function1() {
        return true;
    }
}
