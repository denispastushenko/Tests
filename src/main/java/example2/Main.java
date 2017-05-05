package example2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int digit = 3;
        System.out.println(++digit);
        System.out.println(digit);
        System.out.println(digit++);

        System.out.println(digit--);
        System.out.println(digit);
        System.out.println(--digit);

        int res = 4;
        res >>>= 2;
        System.out.println(res);


        int digitDigit = 10, secondDigit;
        secondDigit = (digitDigit == 0) ? (digitDigit * 1) : (digitDigit * 2);
        System.out.println(secondDigit);


        BigInteger bigInteger = new BigInteger("2444444430497777777777777777777777777777777777777758934092777777777777777777777777777777777777777777777777777777777777777777" +
                "7777777777777777777777777777777777777777777777777777700000000000000000000000000000000000009999999999999999999999999999999999999999999999999999999999999999999999999" +
                "999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
                "999999999999999999999999999");
        boolean result = bigInteger instanceof BigInteger;
        System.out.println("It is a success           " + result + "          " + bigInteger);
        System.out.println(bigInteger.getLowestSetBit() + bigInteger.intValue());


        BigDecimal bigDecimal = new BigDecimal(24444477777777777777777777777777777777779909999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0);
        boolean result1 = bigDecimal instanceof BigDecimal;
        System.out.println("It is a success           " + result1 + "          " + bigDecimal);
        System.out.println(bigDecimal.intValue() * bigDecimal.intValue());

        System.out.println(-8 | 7);
    }
}
