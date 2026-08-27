public class task8 {
    public static void main(String[] args) {
        String text = "Hello";
        String reversed = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}
