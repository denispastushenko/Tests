package example3;

public class Main {
    public static void main(String[] args) {
        int firstDigit = 14;
        int secondDigit = 3;
        int binaryFirstDigit, binarySecondDigit;
        binaryFirstDigit = toBinary(firstDigit);
        binarySecondDigit = toBinary(secondDigit);
        System.out.println( binaryFirstDigit + "    +    " + binarySecondDigit);
        System.out.println( toBinary(firstDigit / secondDigit));


    }

    private static int toBinary(int digit){
        return Integer.parseInt(Integer.toBinaryString(digit));
    }
}
