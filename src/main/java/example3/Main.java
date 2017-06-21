package example3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            int firstDigit = 14;
            int secondDigit = 3;
            int binaryFirstDigit, binarySecondDigit;
            binaryFirstDigit = toBinary(firstDigit);
            binarySecondDigit = toBinary(secondDigit);
            System.out.println( binaryFirstDigit + "    +    " + binarySecondDigit);
            System.out.println( toBinary(firstDigit / secondDigit));
            System.out.println(toBinary(-128));
            System.out.println(12 >>> 3);
            System.out.println(-1 >>> 4);
            System.out.println(toBinary(-1 >>> 5));
            System.out.println(-1 >>> 5);
            System.out.println(toBinary(-1 >> 5));


        }catch (NumberFormatException e)
        {
            System.out.println(e.getMessage() + "       " + Arrays.toString(e.getStackTrace()) + "         " + e.getCause());

        }


    }

    private static int toBinary(int digit){
        return Integer.parseInt(Integer.toBinaryString(digit));
    }
}
