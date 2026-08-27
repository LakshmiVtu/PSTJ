import java.util.Arrays;

public class task29 {
    public static void main(String[] args) {
        String text = "tree";
        Character[] letters = new Character[text.length()];
        for (int index = 0; index < text.length(); index++) {
            letters[index] = text.charAt(index);
        }

        Arrays.sort(letters, (first, second) -> {
            int firstCount = count(text, first);
            int secondCount = count(text, second);
            if (firstCount != secondCount) {
                return secondCount - firstCount;
            }
            return first - second;
        });

        for (char letter : letters) {
            System.out.print(letter);
        }
    }

    public static int count(String text, char letter) {
        int total = 0;
        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == letter) {
                total++;
            }
        }
        return total;
    }
}
