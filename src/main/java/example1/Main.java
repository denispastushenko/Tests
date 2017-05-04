package example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer firstDigit = 2;
        int counter = -2;
        int amountOfIteration = 15;
        Integer result = 1;


        long start = System.nanoTime();
        for (int i = 0; i < amountOfIteration; i++, System.out.println(firstDigit << 2 + counter++)) {

        }

        long finish = System.nanoTime();
        long timeConsumedNano = finish - start;
        System.out.println("\n Execution time in nano seconds : " + timeConsumedNano);

        System.out.println("\n Another solution variant :  \n");

        long start1 = System.nanoTime();

        for (int i = 0; i < amountOfIteration; i++) {
            result *= firstDigit;
            System.out.println(result);
        }

        long finish1 = System.nanoTime();
        long timeConsumedNano1 = finish1 - start1;
        System.out.println("\n Execution time in nano seconds : " + timeConsumedNano1 + "\n Third variant : ");

        if (timeConsumedNano > timeConsumedNano1){
            long start3 = System.nanoTime();
            int amount = 1;
            for (int i = 0; i < amountOfIteration ; i++) {
                System.out.println(Math.pow(2, amount++));
            }
            long finish3 = System.nanoTime();
            long timeConsumedNano3 = finish3 - start3;
            System.out.println("\n Execution time in nano seconds : " + timeConsumedNano3);
        }
        System.out.println("     " + timeConsumedNano + "     " + timeConsumedNano1 + "     " );
        //recursive();
    }


    private static void recursive() {
        System.out.println("Type your digit! It should be bigger than 0 : ");
        Scanner scanner = new Scanner(System.in);
        int example = scanner.nextInt();

        if (example <= 0) {
            recursive();
        } else System.out.println("Success");
        scanner.close();
    }
}
