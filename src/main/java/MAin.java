import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        recursive();
    }


    private static void recursive() {
        System.out.println("Type your digit! It should be bigger than 0 : ");
        Scanner scanner = new Scanner(System.in);
        int example = scanner.nextInt();

        if (example <= 0) {
            recursive();
        } else System.out.println("Success");
    }
}
