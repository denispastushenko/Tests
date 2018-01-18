package interviewTasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainTasks {

    public static void main(String[] args) {
        String string = "asdasfd";
        s(string);
        System.out.println(s(string));
    }

    private static char s(String string) {
        Map<Integer,Long> characters = string.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return (char)(int)characters.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("No unrepeated character"));
    }
}
