package interviewTasks;

import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by denys.pastushenko on 31/10/2017.
 */
public class Tasks {

    public static void main(String[] args) {
        // Task 1;
        System.out.println(reverseString("example"));
        System.out.println(reverseString());
        System.out.println();

        //Task 2
        int arr[] = {1, 5, 78};
        System.out.println(max(arr));
        System.out.println();

        //Task 3
        List<Integer> integerList = Arrays.asList(45, 3, 1, 10, 2, 15, 45, 147);
        System.out.println(matchElements(integerList));
        System.out.println(matchElements(integerList, ""));

    }

    private static String reverseString(String string) {
        List<String> list = Arrays.stream(string.split("")).collect(Collectors.toList());
        Collections.reverse(list);
        return StringUtils.collectionToCommaDelimitedString(list).replace(",", "");
    }

    private static String reverseString() {
        StringBuilder stringBuilder = new
                StringBuilder("string");
        return stringBuilder.reverse().toString();
    }

    private static int max(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    private static Integer matchElements(List<Integer> integerList) {
        Set<Integer> noDuplicatesSet = new TreeSet<>();
        List<Integer> duplicates = new ArrayList<>();
        integerList.forEach(elem -> {
            if (!noDuplicatesSet.add(elem)) {
                duplicates.add(elem);
            }
        });
        return duplicates.stream().findFirst().get();
    }

    private static Integer matchElements(List<Integer> integerList, String comment) {
        List<Integer> collection = integerList.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).equals(collection.get(i + 1))) {
                return collection.get(i);
            }
        }
        return null;
    }
}
