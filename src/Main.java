import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();

        for (Iterator<Integer> iterator = intList.iterator(); iterator.hasNext(); ) {
            int number = iterator.next();
            if (number > 0 && number % 2 == 0) {
                result.add(number);
            }
        }

        Collections.sort(result);

        for (int num : result) {
            System.out.println(num);
        }
    }
}