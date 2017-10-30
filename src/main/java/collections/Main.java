package collections;

import java.util.*;

/**
 * Created by Denys_Pastushenko on 10/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new LickedHMExample<>(2);
        map.put(1, " 1");
        map.put(2, " 2");
        map.put(3, " 3");
        map.get(2);
        map.put(9, " 9");
        System.out.println(map);


        //////////////////////////////////////////

        Map<Data, String> dataStringMap = new WeakHashMap<>();

        Data data = new Data();

        dataStringMap.put(data, "information");

        data = null;
        System.gc();

        for (int i = 0; i < 1000; i++) {
            if (dataStringMap.isEmpty()) {
                System.out.println("Empty iteration number = " + i);
                break;
            } else System.out.println("Not empty iteration number = " + i);
        }

        /////////////////////////////////////////////////////////////////

        Object dataObject;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        while ((dataObject = queue.poll()) != null) {
            System.out.println(dataObject);


            Object dataObject1;
            Queue<Integer> queue1 = new PriorityQueue<>();
            queue1.add(5);
            queue1.add(4);
            queue1.add(3);
            queue1.add(2);
            queue1.add(1);

            while ((dataObject1 = queue1.poll()) != null) {
                System.out.println(dataObject1);
            }
        }
    }
}
