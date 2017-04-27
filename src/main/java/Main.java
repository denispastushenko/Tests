import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        recursiveMethodExample();
    }

    private static void recursiveMethodExample() {
        System.out.println("Type your digit! It should be bigger than 0 : ");
        Scanner scanner = new Scanner(System.in);
        int example = scanner.nextInt();

        if (example <= 0) {
           recursiveMethodExample();
        } else System.out.println("Success");
    }
}
