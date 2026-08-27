import java.util.Arrays;

public class task27 {
    public static void main(String[] args) {
        String[] numbers = {"3", "30", "34", "5", "9"};
        Arrays.sort(numbers, (first, second) -> (second + first).compareTo(first + second));
        System.out.println(String.join("", numbers));
    }
}
