package ArraysChallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentNames {
    public static void main(String[] args) {
        String[] names = {"Zara", "Brian", "Alice", "Daniel"};

        System.out.println("Sorted names:");
        Arrays.sort(names);
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Reversed names:");
        List<String> nameList = Arrays.asList(names);
        Collections.reverse(nameList);
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
