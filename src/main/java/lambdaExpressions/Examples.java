package lambdaExpressions;

import java.util.Comparator;

public class Examples implements Comparator<String> {
    public static void main(String[] args) {

        // simple lE which equals to return
        MyFunctionaLInterface myFunctionaiInterface;
        myFunctionaiInterface= () -> 221.2;
        System.out.println(myFunctionaiInterface.getDataValue());
        myFunctionaiInterface = () -> Math.random() * 10;
        System.out.println(myFunctionaiInterface.getDataValue());
        //myFunctionaiInterface = (n) -> (n % 2.1);



    }

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}
