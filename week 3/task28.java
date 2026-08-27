import java.util.Arrays;
import java.util.Comparator;

public class task28 {
    public static void main(String[] args) {
        Integer[] numbers = {5, 1, 4, 2, 3};
        Arrays.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer first, Integer second) {
                return second - first;
            }
        });
        System.out.println(Arrays.toString(numbers));
    }
}
